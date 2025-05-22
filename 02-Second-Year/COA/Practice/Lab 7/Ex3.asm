.data

array: .word 13,5,4,9,2
msg_done: 
	.asciiz "bubble sort done\n"
new_line: 
	.asciiz "\n"
	

.text

.globl main

main:

la $s7 , array
li $s0 , 0 #i
li $s1, 0 #j
li $s4, 4 #N-1


loop:

sll $t7 , $s1 , 2
add $t7 , $t7, $s7 #A[j]
lw $t0, 0($t7)# t0 is A[j]
lw $t1, 4($t7) #A[j+1]
sub $t2 , $t0 , $t1
bltz $t2 , noSwap

#swap:

sw $t1 , 0($t7)
sw $t0 , 4($t7)

noSwap:

addi $s1, $s1, 1 #j++
sub $s5, $s4, $s0
bne $s5, $s1, loop

addi $s0, $s0 , 1
bne $s0, $s4, loop


.data

prompt: .asciiz "Enter the value of x: "
prompt2: .asciiz "Enter the value of y: "
result: .asciiz "Result: "


.text

.globl main

main:

li $v0 , 4
la $a0 , prompt
syscall

li $v0 , 5
syscall
move $a1, $v0

li $v0 , 4
la $a0 , prompt2
syscall

li $v0 , 5
syscall
move $a2, $v0

jal power
move $t1 , $v0

li $v0 , 4
la $a0 , result
syscall

li $v0 , 1
move $a0, $t1
syscall

li $v0, 10
syscall


power:
li $t1, 0
li $v0 , 1

loop:
beq $t1 , $a2 , end
mul $v0 , $v0 , $a1
addi $t1 , $t1 , 1
j loop


end:
jr $ra


.data

prompt: .asciiz " Please enter a number: " 
result: .asciiz " The result is: "
x: .word 0


.text

.globl main

main:


li $v0, 4
la $a0, prompt
syscall

li $v0, 5
syscall
sw $v0, x

lw $t0, x

mul $t1 , $t0, $t0
addi $t2, $zero, 2 
mul $t3, $t2,$t1
addi $t4, $t3, 1

li $v0, 4
la $a0, result
syscall
li $v0, 1
move $a0, $t4
syscall
li $v0, 10
syscall

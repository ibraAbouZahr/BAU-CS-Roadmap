.data

n: .word 0

.text

.globl main

main: 


li $v0, 5
syscall
sw $v0, n

lw $t0 , n


addi $t1, $t0, 5

li $v0, 1
move $a0, $t1

syscall

li $v0, 10
syscall
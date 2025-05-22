.data

value: 0,0
prompt: .asciiz "The product is: "

.text

.globl main

main: 
la $t0, value

li $v0, 5
syscall
sw $v0, 0($t0)

li $v0, 5
syscall
sw $v0, 4($t0)

lw $t1, 0($t0)		
lw $t2, 4($t0)
mul $t3, $t1,$t2

li $v0, 4
la $a0, prompt
syscall
li  $v0, 1
move $a0 , $t3

syscall

li $v0, 10

syscall 
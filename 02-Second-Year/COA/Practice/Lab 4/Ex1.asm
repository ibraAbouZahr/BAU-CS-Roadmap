.data


prompt: .asciiz "Enter a number: "
odd: .asciiz " This number is Odd "
even: .asciiz " This number is Even "


.text

.globl main

main: 

li $v0, 4
la $a0, prompt
syscall

li $v0, 5
syscall
move $a0, $v0


li $t0, 2

rem $t2, $a0, $t0


beq $t2, $zero , else
li $v0, 4
la $a0, odd
syscall

j exit
else:

li $v0, 4
la $a0, even

syscall

exit:
li $v0 , 10
syscall
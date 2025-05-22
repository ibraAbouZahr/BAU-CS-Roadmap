.data


Base: .asciiz "Base: "
Exponent: .asciiz "Exponent: "
Power: .asciiz "Power = "


.text

.globl main

main:

li $v0 , 4
la $a0, Base
syscall

li $v0, 5
syscall
move $t0 , $v0

li $v0 , 4
la $a0, Exponent
syscall

li $v0, 5
syscall
move $t1 , $v0

li $t2, 1
li $t3 , 1
loop:
mul $t2, $t2, $t0

addi $t3, $t3 , 1

ble $t3, $t1, loop

li $v0 , 4
la $a0, Power
syscall

li $v0, 1
move $a0, $t2
syscall

li $v0, 10
syscall




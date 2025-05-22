.data

prompt:.asciiz "Please enter the grade: "

Error: .asciiz "Error"
a: .asciiz "A "
b: .asciiz "B "
c: .asciiz "B "
d: .asciiz "B "
f: .asciiz "B "

.text

.globl main

main: 

li $v0 ,4
la $a0 , prompt
syscall

li $v0 , 5
syscall
move $t0 , $v0


blt $t0 , 0, error
bgt $t0, 100, error
bge $t0, 90, A
bge $t0, 80, B
bge $t0, 70, C
bge $t0, 60, D
j F

A:

li  $v0 , 4
la $a0, a
syscall

j exit

B:

li  $v0 , 4
la $a0, b
syscall

j exit

C:

li  $v0 , 4
la $a0, c
syscall

j exit

D:

li  $v0 , 4
la $a0, d
syscall

j exit

F:
li  $v0 , 4
la $a0, f
syscall

j exit

error:

li  $v0 , 4
la $a0, Error
syscall



exit:

li $v0 , 10
syscall
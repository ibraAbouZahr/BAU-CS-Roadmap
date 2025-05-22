.data

prompt: .asciiz "Name: "
prompt2: .asciiz "Major: "
prompt3: .asciiz "Age: "
Name: .space 48
Major: .space 48
age: .word 0


.text
.globl main

main: 

li $v0, 8
la $a0, Name
li $a1, 48
syscall

li $v0,8
la $a0, Major
li $a0, 48
syscall

li $v0, 5
syscall
move $t0, $v0

li  $v0, 4
la $a0 , prompt
syscall
li $v0, 4
la $a0, Name
syscall

li  $v0, 4
la $a0 , prompt2
syscall
li $v0, 4
la $a0, Major
syscall

li  $v0, 4
la $a0 , prompt3
syscall
li $v0, 5
syscall
move $a0, $t0
syscall
li $v0, 10
syscall




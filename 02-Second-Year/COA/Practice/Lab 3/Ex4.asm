.data


prompt1: .asciiz "Enter a: " 
prompt2: .asciiz "Enter b: " 
prompt3: .asciiz "Enter c: "

volume: .asciiz "Volume: "
surface: .asciiz "Surface Area: "

a: .word 0
b: .word 0
c: .word 0

vol: .word 0
sur: .word 0
 
.text

  
.globl main

main:

#get a
li $v0, 4
la $a0 , prompt1
syscall
li $v0, 5
syscall
sw $v0, a

#get b
li $v0, 4
la $a0 , prompt2
syscall
li $v0, 5
syscall
sw $v0, b
    
#get c    
li $v0, 4
la $a0 , prompt3
syscall 
li $v0, 5
syscall
sw $v0, c         
syscall


lw $t0 , a
lw $t1, b
lw $t2, c	

mul $t3, $t0, $t1
mul $t4, $t3, $t2

mul $t5, $t0, $t2
mul $t6, $t1, $t2
li $t7 , 2

mul $t8 , $t7 ,
li $v0, 4
la $a0 , volume
syscall
li ,$v0 , 1
move $a0 , $t4
syscall


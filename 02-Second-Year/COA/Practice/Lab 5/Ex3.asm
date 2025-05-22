.data


prompt: .asciiz "Enter your weight (in pounds): "
prompt2: .asciiz "Enter your height (in inches): "
BMI: .asciiz "Your BMI is: "
underweight: .asciiz "\nUnderweight "
Normal: .asciiz "\nNormal "

.text

.globl main

main: 

li $v0, 4
la $a0, prompt
syscall

li $v0 , 5
syscall
move $t0, $v0


li $v0, 4
la $a0, prompt2
syscall

li $v0 , 5
syscall
move $t1, $v0


mul $t2, $t1, $t1

div $t3, $t0, $t2 #BMI

li $v0, 4
la $a0, BMI
syscall
li $v0, 1
move $a0, $t3
syscall

li $t4, 21

blt $t3, $t4, UnderWeight

li  $v0, 4
la $a0, Normal
syscall
j exit

UnderWeight:
li  $v0, 4
la $a0, underweight
syscall

exit: 
li $v0, 10
syscall
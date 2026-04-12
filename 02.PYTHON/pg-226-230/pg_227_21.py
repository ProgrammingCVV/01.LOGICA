import math
print("")
print("**********************************************************************")
print("READ AN INTEGER NUMBER AND DETERMINE HOW MUCH THE SUM OF ITS DIGITS IS")
print("**********************************************************************")
print("")

num = int(input("Write an integer number: "))

if(num < 0):
    num = num * (-1)

sum = 0

while (num > 0):
    digits = num % 10
    sum += digits
    num //= 10

print("The sum of the digits is ", sum)
print("")
print("*************************************************************************")
print("READ TWO INTEGER NUMBERS AND DETERMINE WICH OF BOTH THEM HAVE MORE DIGITS")
print("*************************************************************************")
print("")


num1 = int(input("Write the first integer number: "))
num2 = int(input("Write the second integer number: "))

if(num1 < 0 ):
    num1 = num1 * (-1)

if(num2 < 0):
    num2 = num2 * (-1)


count1 = 0

while(num1 != 0):
    num1  = num1 // 10
    count1 += 1

count2 = 0

while(num2 != 0):
    num2 = num2 // 10
    count2 +=1


if(count1 > count2):
    print("The first number has more digits than second number.")

if(count2 > count1):
    print("The second number has more digits than first number.")

if(count1 == count2):
    print("Both numbers have the same number of digits.")

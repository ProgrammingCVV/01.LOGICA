print("")
print("***************************************************************************************")
print("READ TWO INTEGER NUMBERS AND DETERMINE IF THE DIFFERENCE BETWEEN BOTH IS AN EVEN NUMBER")
print("***************************************************************************************")
print("")

num1 = int(input("Write the first integer number: "))
num2 = int(input("Write the second integer number: "))
result1 = int(num1 - num2)
result2 = int(num2 - num1)

if(num1 < 0 or num2 < 0):
    num1 = num1 * (-1)
    num2 = num2 * (-1)

if(result1 % 2 == 0 or result2 % 2 == 0):
    print("The difference between both written numbers is an even number")
else:
    print("The difference between both written numbers is an odd number.")
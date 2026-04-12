print("")
print("*************************************************************************************************")
print("READ TWO INTEGER NUMBERS AND DETERMINE IF THE DIFFERENCE BETWEEN THEM IS A ONE DIGIT PRIME NUMBER")
print("*************************************************************************************************")
print("")

num1 = int(input("Write the first integer number: "))
num2 = int(input("Write the second integer number: "))

if(num1 < 0 or num2 < 0):
    num1 = num1 * (-1)
    num2 = num2 * (-1)

if(num1 - num2 == 2 or num1 - num2 == 3 or num1 - num2 == 5 or num1 - num2 == 7 or num2 - num1 == 2 or num2 - num1 == 3 or num2 - num1 == 5 or num2 - num1 == 7):
    print("The difference between both numbers is a prime number with one digit.")

else:
    print("The difference between both numbers isn't a prime number with one digit.")
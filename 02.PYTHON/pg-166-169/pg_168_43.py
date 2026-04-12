print("")
print("")
print("READ TWO INTEGER NUMBER AND DETERMINE IF THE DIFFERENCE BETWEEN THEM IS AN EXACT DIVISON OF EITHER OF THE TWO NUMBERS")
print("")
print("")

num1 = int(input("Write the first integer number: "))
num2 = int(input("Write the first integer number: "))

dif = num1 - num2

if(num1 < 0 or num2 < 0):
    num1 = num1 * (-1)
    num2 = num2 * (-1)

if(num1 % dif == 0 or num2 % dif == 0):
    print("The difference between the written numbers is an exact division of either of the tow numbers")
else:
    print("The difference between the written numbers isn't an exact division of either of the tow numbers")
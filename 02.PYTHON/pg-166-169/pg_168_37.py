print("")
print("****************************************************************")
print("READ TWO INTEGER NUMBER AND DETERMINE WICH IS A MULTIPLE OF WICH")
print("****************************************************************")
print("")

num1 = int(input("Write the first integer number: "))
num2 = int(input("Write the second integer number: "))

if(num1 < 0 ):
    num1 = num1 * (-1)
if(num2 < 0 ):
    num2 = num2 * (-1)


if(num1 % num2 == 0):
    print("the first number is multiple of second.")
else:
    print("The first number ist'n multiple of second.")

if(num2 % num1 == 0):
    print("the second number is multiple of first.")
else:
    print("The second number ist'n multiple of first.")


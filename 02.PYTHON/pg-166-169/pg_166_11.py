print("")
print("************************************************************")
print("READ TWO INTEGER NUMBERS AND DETERMINE WHICH IS THE GREATEST")
print("************************************************************")
print("")

num1 = int(input("Write the first integer number: "))
num2 = int(input("Wite the second integer number: "))

if(num1 > num2):
    print("The first number is greatest than second.")
elif(num2 >num1):
    print("The second number is greatest than first.")
else:
    print("the number is 0.")
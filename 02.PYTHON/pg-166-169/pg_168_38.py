print("")
print("********************************************************************************************")
print("READ THREE INTEGER NUMBERS AND DETERMINE IF THE LAST DIGIT OF THE THREE NUMBERS ARE THE SAME")
print("********************************************************************************************")
print("")

num1 = int(input("Write the first integer number: "))
num2 = int(input("Write the second integer number: "))
num3 = int(input("Write the third integer number: "))

if(num1 < 0 ):
    num1 = num1 * (-1)
if(num2 < 0 ):
    num2 = num2 * (-1)
if(num3 < 0 ):
    num3 = num3 * (-1)

num1 = num1 - (num1 // 10 * 10)
num2 = num2 - (num2 // 10 * 10)
num3 = num3 - (num3 // 10 * 10)

if(num1 == num2 and num2 == num3):
    print("The last digit of the three numbers are the same.")
else:
    print("The last digit of the trhee numbers aren't the same.")


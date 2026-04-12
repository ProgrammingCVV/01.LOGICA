print("")
print("**************************************************************************************************")
print("READ TWO INTEGER NUMBERS WITH TWO DIGITS AND DETERMINE IF THE SUM OF BOTH ORIGINATE AN EVEN NUMBER")
print("**************************************************************************************************")
print("")

num1 = int(input("Write the first number: "))
num2 = int(input("Write the second number: "))

if(num1 < 0):
    num1 = num1 * (-1)
if(num2 < 0):
    num2 = num2 * (-1)

if(num1 >= 10 and num1 <= 99):
    if(num2 >= 10 and num2 <= 99):

        result = num1 + num2

        if(result == result // 2 * 2):
            print("The result {} is an even number.".format(result))    
        else:
            print("The result {} is an odd number.".format(result))

    else:
        print("Some number does not have two digits. Try again please.")

else:
    print("Some number doesn't have two digits. Try again please.")
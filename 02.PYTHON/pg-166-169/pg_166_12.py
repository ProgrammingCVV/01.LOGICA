print("")
print("*******************************************************************************")
print("READ TWO INTEGER NUMBERS OF TWO DIGITS AND DETERMINE IF THEY HAVE COMMON DIGITS")
print("*******************************************************************************")
print("")

num1 = int(input("Write the first number with two digits: "))
num2 = int(input("Write the second number with two digits: "))

if(num1 < 0):
    num1 = num1 * (-1)
if(num2 < 0):
    num2 = num2 * (-1)

if(num1 >=10 and num1 <= 99):
    num1dig1 = (num1 // 10) % 10
    num1dig2 = num1 - (num1 // 10 * 10)

    if(num2 >= 10 and num2 <= 99):
        num2dig1 = (num2 // 10) % 10
        num2dig2 = num2 - (num2 // 10 * 10)

        if(num1dig1 == num2dig1 or num1dig1 == num2dig2 or num1dig2 == num2dig1 or num1dig2 == num2dig2):
            print("The written numbers do have common digits.")
        else:
            print("The written numbers don't have common digits.")
    else:
        print("The second number doesn't have two digits. Try again please.")
else:
    print("The first number doesn't have two digits. Try again please.")


print("")
print("************************************************************************************")
print("READ THREE INTEGER NUMBERS WITH TWO DIGITS AND DETERMINE WHERE THE GREATEST DIGIT IS")
print("************************************************************************************")
print("")

num1 = int(input("Write the first number with two digits: "))
num2 = int(input("Write the second number with two digits: "))
num3 = int(input("Write the third number with two digits: "))

if(num1 < 0):
    num1 = num1 * (-1)
if(num2 < 0):
    num2 = num2 * (-1)
if(num3 < 0):
    num3 = num3 * (-1)

if(num1 >= 10 and num1 <= 99):
    dig1 = (num1 / 10) % 10
    dig2 = num1 - (num1 / 10 * 10)

    if(num2 >= 10 and num2 <= 99):
        dig3 = (num2 / 10) % 10
        dig4 = num2 - (num2 / 10 * 10)

        if(num3 >= 10 and num3 <= 99):
            dig5 = (num3 / 10) % 10
            dig6 = num3 - (num3 / 10 * 10)

            if(dig1 > dig2 and dig1 > dig3 and dig1 > dig4 and dig1 > dig5 and dig1 > dig6):
                print("The greatest digit is in the written number ", num1)

            elif(dig2 > dig1 and dig2 > dig3 and dig2 > dig4 and dig2 > dig5 and dig2 > dig6):
                print("The greatest digit is in the written number ", num1)

            elif(dig3 > dig1 and dig3 > dig2 and dig3 > dig4 and dig3 > dig5 and dig3 > dig6):
                print("The greatest digit is in the written number ", num2)

            elif(dig4 > dig1 and dig4 > dig2 and dig4 > dig3 and dig4 > dig5 and dig4 > dig6):
                print("The greatest digit is in the written number ", num2)

            elif(dig5 > dig1 and dig5 > dig2 and dig5 > dig3 and dig5 > dig4 and dig5 > dig6):
                print("The greatest digit is in the written number ", num3)

            elif(dig6 > dig1 and dig6 > dig2 and dig6 > dig3 and dig6 > dig4 and dig6 > dig5):
                print("The greatest digit is in the written number ", num3)

        else:
            print("Some number does't have two digits. Try again please.")

    else:
        print("Some number does't have two digits. Try again please.")

else:
    print("Some number does't have two digits. Try again please.")
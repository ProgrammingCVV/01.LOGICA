print("")
print("****************************************************************************************************")
print("READ AN INTEGER NUMBER WITH THREE DIGITS AND DETERMINE IF THE FIRST DIGIT IS EQUAL TO THE LAST DIGIT")
print("****************************************************************************************************")
print("")

num1 = int(input("Write an integer number with three digits: "))

if(num1 < 0):
    num1 = num1 * (-1)

if(num1 >= 100 and num1 <= 999):

    firstDigit = (num1 // 100) % 10
    lastDigit = num1 - (num1 // 10 * 10)

    if(firstDigit == lastDigit):
        
        print("The first digit is equial than the last digit.")

    else:
        print("The first digit is different than the last digit.")

else:
    print("The written number doesn't have three digits. Try again please.")

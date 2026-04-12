print("")
print("*************************************************************************************")
print("READ AN INTEGER NUMBER WITH THREE DIGITS AND DETERMINE IF ANY IS MULTIPLE OF ANOTHERS")
print("*************************************************************************************")
print("")

num = int(input("Write an integer number with three digits: "))

if (num < 0):
    num = num * (-1)

if (num >= 100 and num <= 999):
    dig1 = (num // 100) & 10
    dig2 = (num //10) & 10
    dig3 = num - (num // 10 *10)

    if (dig1 % dig2 == 0 or dig1 % dig3 ==  0):
        print("The first digit is multiple of another.")
    elif(dig2 % dig1 == 0 or dig2 % dig3 == 0):
        print("The second digit is multiple of another.")
    elif(dig3 % dig1 == 0 or dig3 % dig2 == 0):
        print("The third digit is multiple of another.")
    else:
        print("No digit is multiple of another.")

else:
    print("The written number dosesn't three digits. Try again please")
print("")
print("***********************************************************************************************")
print("READ AN INTEGER NUMBER WITH THREE DIGITS AND DETERMINE IF AT LEAST TWO OF IT'S DIGITS ARE EQUAL")
print("***********************************************************************************************")
print("")

num = int(input("Write an intenger number with three numbers: "))

if(num < 0):
    num = num * (-1)

if(num >= 100 and num <= 999):
    dig1 = (num // 100) % 10
    dig2 = (num // 10) % 10
    dig3 = num - (num // 10 * 10)

    if(dig1 == dig2 or dig1 == dig3 or dig2 == dig3):
        print("At least two of the three digits are equal.")
    else:
        print("No mumber is equal to another.")

else:
    print("The written number doesn't three digits. Try again please.")
print("")
print("********************************************************************")
print("READ AN INTEGER NUMBER OF TWO DIGITS AND DETERMINE IF BOTH ARE EQUAL")
print("********************************************************************")
print("")

num = int(input("Write an integer number of two digits: "))

if(num < 0):
    num = num * (-1)

if(num >= 10 and num <= 99):

    lastDigit = num - (num // 10 * 10)
    penultimateDigit = (num // 10) % 10

    if(lastDigit == penultimateDigit):
        print("Both numbers are equial.")

    else:
        print("Both numbers are different.")

else:
    print("The written number isn't two digits. Try again.")
print("")
print("**************************************************************************************")
print("READ AN INTEGER NUMBER OF TWO DIGITS AND DETERMINE IF SOMEONE IS MULTIPLE OF THE OTHER")
print("**************************************************************************************")
print("")

count = 0
num = int(input("Write an integer number of two digits: "))

if(num < 0):
    num = num * (-1)

if (num >= 10 and num <= 99):
    lastDigit = num - (num // 10 * 10)
    penultimateDigit = (num // 10) % 10

    if(lastDigit % penultimateDigit == 0 or penultimateDigit % lastDigit == 0):
        print("Someone number is multiple of the other.")
    else:
        print("Any number isn't multiple of the other.")


else:
    print("The written number {} doesn't have two digits. Try again please.".format(num))
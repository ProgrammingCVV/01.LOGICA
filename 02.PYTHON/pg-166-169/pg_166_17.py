print("")
print("******************************************************************************")
print("READ AN INTEGER NUMBER AND DETERMINE WHAT IS THE POSITION OF THE GREATEST DIGIT")
print("******************************************************************************")
print("")

num = int(input("Write an integer number with three digits: "))

if (num < 0 ):
    num = num * (-1)

if(num >= 100 and num <= 999):
    dig1 = (num // 100) % 10
    dig2 = (num // 10) % 10
    dig3 = num - (num // 10 * 10)

    if(dig1 > dig2 and dig1 > dig3):
        print("The greatest number is the first ( {} ).".format(dig1))
    elif(dig2 > dig1 and dig2 > dig3):
        print("The greatest number is the second ( {} ).".format(dig2))
    else:
        print("The greatest number is the third ( {} ).".format(dig3))

else:
    print("The written number doesn't have three digits. Try again.")
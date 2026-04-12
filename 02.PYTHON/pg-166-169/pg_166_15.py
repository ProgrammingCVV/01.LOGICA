print("")
print("***********************************************************************************************")
print("READ AN INTEGER NUMBER WITH THREE DIGITS AND DETERMINE HOW MUCH THE SUM OF IT'S DIGITS IS EQUAL")
print("***********************************************************************************************")
print("")

num = int(input("Write an integer number whit three digits: "))

if(num < 0):
    num = num * (-1)

if(num >= 100 and num <=999):
    dig1 = (num // 100) % 10
    dig2 = (num // 10) % 10
    dig3 = num - (num // 10 * 10)

    result = dig1 + dig2 + dig3

    print("The result of the sum is: ", result)

else:
    print("The written number doesn't have three digits. Try again please.")
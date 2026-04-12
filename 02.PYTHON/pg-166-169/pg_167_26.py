print("")
print("**********************************************************************************************")
print("READ AN INTEGER NUMBER WITH FOUR DIGITS AND DETERMINE HOW MUCH THE SUM OF IT'S DIGITS IS EQUAL")
print("**********************************************************************************************")
print("")

num = int(input("Write an integer number with four digits: "))

if(num < 0):
    num = num * (-1)

if(num >= 1000 and num <= 9999):
    dig1 = (num // 1000) % 10
    dig2 = (num // 100) % 10
    dig3 = (num // 10) % 10
    dig4 = num - (num // 10 * 10)

    sum = dig1 + dig2 + dig3 + dig4

    print("The sum of the digits is ", sum)

else:
    print("The written number doesn't have four digits. Try again please.")
print("")
print("************************************************************************************")
print("WRITE AN INTEGER NUMBER WITH FOUR DIGITS AND DETERMINE HOW MANY EVEN DIGITS IT'S HAS")
print("************************************************************************************")
print("")

num = int(input("Write an integer number with four digits: "))

countEven1 = 0 
countEven2 = 0
countEven3 = 0
countEven4 = 0

if(num < 0):
    num = num * (-1)

if(num >= 1000 and num <= 9999):

    dig1 = (num // 1000) % 10
    dig2 = (num // 100) % 10
    dig3 = (num // 10) % 10
    dig4 = num - (num // 10 * 10)

    if(dig1 % 2 == 0):
        countEven1 += 1
    if(dig2 % 2 == 0):
        countEven2 += 1
    if(dig3 % 2 == 0):
        countEven3 += 1
    if(dig4 % 2 == 0):
        countEven4 += 1

    sum = countEven1 + countEven2 + countEven3 + countEven4

    if(sum > 0):
        print("There are ", sum, " even digits.")
    else:
        print("There aren't even digits.")

else:
    print("The written number doesn't have four digits. Try again please.")

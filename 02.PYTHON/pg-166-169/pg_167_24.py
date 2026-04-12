print("")
print("**********************************************************************************")
print("READ AN INTEGER NUMBER WITH THREE DIGITS AND DETERMINE HOW MANY EVEN DIGITS IT HAS")
print("**********************************************************************************")
print("")

count1 = 0
count2 = 0
count3 = 0


num = int(input("Write an integer number whith three digits: "))

if(num < 0):
    num = num * (-1)

if(num >= 100 and num <= 999):
    dig1 = (num // 100) % 10
    dig2 = (num // 10) % 10
    dig3 = num - (num // 10 * 10)

    if(dig1 % 2 == 0):
        count1 += 1
    if(dig2 % 2 == 0):
        count2 += 1
    if(dig3 % 2 == 0):
        count3 += 1

    sum = count1 + count2 + count3

    if(sum == 0):
        print("There aren't even digits.")

    else:
        print("There are ", sum , " even digits.")

else:
    print("The written number doesn't have three digts. Try again please.")
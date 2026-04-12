print("")
print("***************************************************************************")
print("WRITE AN INTEGER NUMBER LESS THAN 1000 AND DETERMINE HOW MANY DIGITS IT HAS")
print("***************************************************************************")
print("")

num = int(input("Write an integer number less than 1000: "))

if(num < 0):
    num = num * (-1)

if(num <= 999):
    dig1 = (num // 100) % 10
    dig2 = (num // 10) % 10
    dig3 = num - (num // 10 * 10)

    if(dig1 > 0):
        dig1 = 1
    if(dig2 > 0):
        dig2 = 1
    if(dig3 > 0):
        dig3 = 1

    result = dig1 + dig2 + dig3

    print("The written number has ", result, " digits.")

else:
    print("The written number isn´t less than 1000. Try again please.")

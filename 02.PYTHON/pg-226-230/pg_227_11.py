print("")
print("******************************************************************************")
print("READ AN INTEGER WITH TWO DIGITS AND DISPLAY ALL NUMBERS BETWEEN ITS TWO DIGITS")
print("******************************************************************************")
print("")

num = int(input("Write a two-digit integer: "))

if(num < 0):
    num = num * (-1)

if(num >= 10 and num <= 99):
    dig1 = num // 10
    dig2 = num % 10
    
    first = min(dig1, dig2)
    second = max(dig1, dig2)

    for first in range(first, second + 1, 1):
        print(first)

else:
    print("The written number doesn´t have two digits. Try again please.")
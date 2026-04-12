print("")
print("********************************************************************************")
print("READ AN INTEGER NUMBER WITH FIVE DIGITS AND DETERMINE IF IT IS A CAPICUA NUMBER")
print("********************************************************************************")
print("")

num = int(input("Write an integer number with five digits:"))

if(num < 0):
    num = num * (-1)

if(num >= 10000 and num <= 99999):
    dig1 = (num // 10000) % 10
    dig2 = (num // 1000) % 10
    dig3 = (num // 100) % 10
    dig4 = (num // 10) % 10
    dig5 = num - (num // 10 * 10)

    if(dig1 == dig5 and dig2 == dig4):
        print("The number is a CAPUCUA number.")
    else:
        print("The number isn't a CAPICUA number.")

else:
    print("The written number doesn't have five digits. Try again please.")


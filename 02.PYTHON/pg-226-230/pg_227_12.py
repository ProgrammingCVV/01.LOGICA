print("")
print("*****************************************************************")
print("READ AN INTEGER WITH 3 DIGITS AND DETERMINE IF IT HAS THE DIGIT 1")
print("*****************************************************************")
print("")

num = int(input("Write an integr with 3 digits: "))

if(num < 0 ):
    num = num * (-1)

if(num >= 100 and num <=999):

    dig1 = (num // 100) % 10
    dig2 = (num // 10) % 10
    dig3 = num % 10

    if(dig1 == 1 or dig2 == 1 or dig3 == 1):

        print("The written number has the digit ONE (1)")
    
    else:
        print("The written number doesn't have the digit ONE (1)")

else:
    print("The written number doesn't have three digits. Try again please.")
print("")
print("**********************************************************************************************")
print("READ AN INTEGER NUMBER WITH FOUR DIGITS AND DETERMINE IF IT HAS MORE EVEN DIGITS OR ODD DIGITS" )
print("**********************************************************************************************")
print("")

num = int(input("Write an integer number with four digits: "))

if(num < 0):
    num = num * (-1)

if(num >=1000 and num <= 9999):

    dig1 = (num // 1000) % 10
    dig2 = (num // 100) % 10
    dig3 = (num // 10) % 10
    dig4 = num - (num // 10 * 10)

    if(dig1 % 2 == 0):
        dig1 = 1
    else:
        dig1 = 0
    
    if(dig2 % 2 == 0):
        dig2 = 1
    else:
        dig2 = 0
    
    if(dig3 % 2 == 0):
        dig3 = 1
    else:
        dig3 = 0

    if(dig4 % 2 == 0):
        dig4 = 1
    else:
        dig4 = 0

    sum = dig1 + dig2 + dig3 + dig4

    if(sum == 2):
        print("The number has the same number of even and odd digits.")

    elif(sum >= 3):
        print("The written number has more even digits.")

    else:
        print("The written number has more odd digits.")


else:
    print("The written number doesn't have four digits. Try again please.")
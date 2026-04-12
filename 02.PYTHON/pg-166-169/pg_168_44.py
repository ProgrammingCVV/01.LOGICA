print("")
print("****************************************************************************************************************")
print("READ AN INTEGER NUMBER WITH FOUR DIGITS AN DETERMINE IF THE FIRST DIGIT IS MULTIPLE OF SOME OF THE OTHERS DIGITS")
print("****************************************************************************************************************")
print("")

num = int(input("Write an integer number with four digits: "))

if(num < 0):
    num = num * (-1)

if(num >= 1000 and num <= 9999):

    dig1 = (num // 1000) % 10
    dig2 = (num // 100) % 10
    dig3 = (num // 10) % 10
    dig4 = num - (num // 10 * 10)

    if(dig2 % dig1 == 0):
        print("The first digit is multiple of the second")

    elif(dig3 % dig1 == 0):
        print("The first digit is multiple of the third")

    elif(dig4 % dig1 == 0):
        print("The first digit is multiple of the fourth")
    
    elif(dig2 % dig1 != 0 and dig3 % dig1 != 0 and dig4 % dig1 != 0):
        print("The first digit isn't multiple of any number.")

else:
    print("The written number doesn't have four digits. Try again please.")
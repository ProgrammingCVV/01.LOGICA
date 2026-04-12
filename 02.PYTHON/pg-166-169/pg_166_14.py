print("")
print("*********************************************************************************")
print("READ AN INTEGER NUMBER WITH TWO DIGITS, AND DETERMINE IF IT IS PRIME AND NEGATIVE")
print("*********************************************************************************")
print("")

count = 0
num = int(input("Write an integer number whith two digits: "))

if(num < 0):
    num = num * (-1)
    print("The written number is negative.")
else:
    print("The written number is positive.")

if(num >= 10 and num <= 99):

    for i in range(2,num):
        modal = num % i

        if modal == 0:
            count +=1

    if count == 0:
        print("The number is prime.")
    else:
        print("The number isn't prime.")


else:
    print("The written number doesn't have two digits. Try again please.")
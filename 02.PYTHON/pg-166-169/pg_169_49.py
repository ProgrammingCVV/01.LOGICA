print("")
print("*********************************************************************************************")
print("READ AN INTEGER NUMBER AND, IF IT IS A MULTIPLE OF FOUR, DETERMINE IF IT'S LAST DIGIT IS PRIME")
print("*********************************************************************************************")
print("")

num = int(input("Write an integer number: "))

if(num < 0):
    num = num * (-1)

if(num % 4 == 0):
    ultdig = num - (num // 10 * 10)

    if(ultdig == 2 or ultdig == 3 or ultdig == 5 or ultdig == 7):
        print("The written number is multiple of 4 and it's last digit is a prime number.")

    else:
        print("The written number is multiple of 4, but it's last digit isn't a prime number")

else:
    print("The written number isn't multiple of 4.")
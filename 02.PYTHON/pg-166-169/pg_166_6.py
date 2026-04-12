print("")
print("***************************************************************************************")
print("READ AN INTEGER NUMBER OF TWO DIGITS LESS THAN 20 AND DETERMINE IF IT IS A PRIME NUMBER")
print("***************************************************************************************")
print("")

num = int(input("Write an integer number of two digits less than 20: "))

if(num < 0):
    num = num * (-1)

if(num >=10 and num < 20 ):

    print()

    #The next "for loop" deterine if a number is prime or not.

    cont = 0

    for i in range (2,num):

        modal = num % i

        if modal == 0:
            cont =+ 1

    if cont == 0:
        print("The number {} is PRIME".format(num))
        print("")

    else:
        print("The number {} isn't PRIME".format(num))
        print("")

else:
    print("The written number {} doesn't have 2 digits or isn't less than 20." .format(num))
    print("")
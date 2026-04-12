print("")
print("***************************************************************************")
print("READ AN INTEGER NUMBER OF TWO DIGTS AND DETERMINE IF IT'S DIGITS ARE PRIMES")
print("***************************************************************************")
print("")

count = 0
count2 = 0
num = int(input("Write an integer number of two digits: "))

if (num < 0):
    num = num * (-1)

if (num >= 10 and num <= 99):

    lastDigit = num - (num // 10 * 10)
    penultimateDigit = (num // 10) % 10

    for i in range (2,lastDigit):

        modal = lastDigit % i

        if modal == 0:
            count += 1

    if count == 0:
        print("The last digit {} is PRIME.".format(lastDigit))
    else:
        print("The last digit {} isn't PRIME.".format(lastDigit))

    
    for j in range (2,penultimateDigit):

        modal2 = penultimateDigit % j

        if modal2 == 0:
            count2 += 1

    if count2 == 0:
        print("The penultimate digit {} is PRIME.".format(penultimateDigit))
    else:
         print("The penultimate digit {} isn't PRIME.".format(penultimateDigit))
    
else:
    print("The number hasn't two digits.")
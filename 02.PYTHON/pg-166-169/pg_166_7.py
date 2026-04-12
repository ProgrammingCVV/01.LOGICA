print("")
print("***************************************************************************************")
print("READ AN INTEGER NUMBER OF TWO DIGITS AND DETERMINE IF IT IS A PRIME NUMBER AND NEGATIVE")
print("***************************************************************************************")
print("")

number = int(input("Write an integer number of two digits:  "))
count = 0

if(number < 0):

    number = number * (-1)
    print("The number is negative.")
else:
    print("The number is positive.")


if (number >= -99 and number <= -10 or number >= 10 and number <= 99 ):          # The number must to have 2 digits, be negative o positive (Integer Number)
    print("The number {} has two digits".format(number))

    #El siguiente ciclo for determina si un número es primo o no.

    for i in range(2, number):
        
        modal = number % i

        if modal == 0:
            count += 1
    
    if count == 0:
        print("The number {} is PRIME".format(number))
        print("")

    else:
        print("The number {} isn't PRIME".format(number))
        print("")

else:
    print("The number {} has not two digits".format(number))
print("")
print("**********************************************************************************")
print("READ AN INTEGER NUMBER OF TWO DIGITS AND DETERMINE IF BOTH DIGITS ARE EVEN NUMBERS")
print("**********************************************************************************")
print("")

number = int(input("Write an integer number of two digits: "))

if(number <= 0):
    number = number * (-1)

if(number >= 10 and number <= 99):
    lastDigit = number - (number // 10 * 10)
    penultimateDigit = (number // 10) % 10

    if(lastDigit == lastDigit // 2 * 2):
        print("The last digit is an even number.")
    else:
        print("The last digit is an odd number.")

    if(penultimateDigit == penultimateDigit // 2 * 2):
        print("The penultimate digit is an even number.")
    else:
        print("The penultimate digit is an odd number.")

    if(lastDigit == lastDigit // 2 * 2 and penultimateDigit == penultimateDigit // 2 * 2):
        print("WE CAN SAY THAT BOTH NUMBERS ARE EVEN NUMBERS.")
    else:
        print("WE CAN SAY THAT ONE OF TWO NUMBERS IS ODD, OR BOTH ARE.")
else:
    print("THE WRITTEN NUMBER DOESN'T CONTAIN TWO DIGITS. TRY AGAIN!")
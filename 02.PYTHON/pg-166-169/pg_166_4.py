print("")
print("***********************************************************************************************")
print("READ AN INTEGER NUMBER OF TWO DIGITS AND DETERMINE HOW MUCH THE SUM OF IT'S DIGITS IS EQUAL TO")
print("***********************************************************************************************")
print("")

number = int(input("Write an integer number of two digits:  "))

if(number <= 0):
            number = number * (-1)

if(number >= 10 and number <= 99):
    print("The written number has two digits")

    lastDigit = number - (number // 10 * 10)
    penultimateDigit = (number // 10 ) % 10
    
    print("The last digit is: ", lastDigit)
    print("The penutimate digit is:  ", penultimateDigit)
    print("The sum of these digits is: ", ( lastDigit + penultimateDigit))

else:
    print("The written number DOESN'T CONTAIN TWO DIGITS. Try again!")
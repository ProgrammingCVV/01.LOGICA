print("")
print("*************************************************************************************************************")
print("#1. READ AN INTEGER NUMBER WITH TWO DIGITS AND, IF IT IS AN EVEN NUMBER, SHOW THE SUM OF THE DIGITS ON SCREEN")
print("#2. IF   IT'S   A   PRIME   NUMBER   AND   LESS   THAN   TEN,   SHOW   THE   LAST   DIGIT   ON   THE   SCREEN")
print("#3. AND   IF  IT'S  MULTIPLE  OF  FIVE  AND   LESS   THAN  THIRTY,  SHOW  THE  FIRST  DIGIT  ON  THE   SCREEN")
print("*************************************************************************************************************")
print("")

num = int(input("Write an integer number with two digits: "))

if(num < 0):
    num = num * (-1)

if(num >= 10 and num <= 99):

    dig1 = (num // 10) % 10
    dig2 = num - (num // 10 * 10)

    sum = dig1 + dig2

    if(sum == 2 or sum == 3 or sum == 5 or sum == 7):
            print("#2. The sum of the digits is a prime number less than ten and the last digit of the written number is : ", dig2)
    else:
         print("#2. The sum of the digits isn't a prime number less than ten.")


    if(num % 2 == 0):
        print("#1. The sum of the digits of the even number is ", sum)
    else:
        print("#1. The written number isn't an even number.")


    if(num % 5 == 0 and num < 30):
         print("#3. The written number is multiple of 5, and it´s first digit is: ", dig1)
    else:
         print("#3. The written number isn´t multiple of 5, and less than 30.")


else:
    print("The written number doesn't have two digits. Try again please.")
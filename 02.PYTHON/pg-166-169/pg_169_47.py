print("")
print("*********************************************************************************************************************************")
print("#1. READ TWO INTEGER NUMBERS AND, IF THE DIFFERENCE BETWEEN THEM IS AN EVEN NUMBER, SHOW THE SUM OF THE ALL DIGITS ON THE SCREEN.")
print("#2.  IF  THE  DIFFERENCE  IS  A PRIME  LESS  THAN  10 NUMBER ,  SHOW  THE  PRODUCT OF  BOTH  INTEGER  NUMBERS  ON   THE  SCREEN. ")
print("#3. IF     THE     DIFFERENCE     ENDS     IN     4,     SHOW     ALL     THE     DIGITS     SEPARATELY     ON     THE    SCREEN.")
print("*********************************************************************************************************************************")
print("")

num1 = int(input("Write the first integer number: "))
num2 = int(input("Write the second integer number: "))

dif = num1 - num2

if(num1 < 0):
    num1 = num1 * (-1)
if(num2 < 0):
    num2 = num2 * (-1)
 
if(dif % 2 == 0):
    dig1 = (num1 // 10000000000) % 10
    dig2 = (num1 // 1000000000) % 10
    dig3 = (num1 // 100000000) % 10
    dig4 = (num1 // 10000000) % 10
    dig5 = (num1 // 1000000) % 10
    dig5 = (num1 // 100000) % 10
    dig6 = (num1 // 10000) % 10
    dig7 = (num1 // 1000) % 10
    dig8 = (num1 // 100) % 10
    dig9 = (num1 // 10) % 10
    dig10 = num1 - (num1 // 10 * 10)

    digi1 = (num2 // 10000000000) % 10
    digi2 = (num2 // 1000000000) % 10
    digi3 = (num2 // 100000000) % 10
    digi4 = (num2 // 10000000) % 10
    digi5 = (num2 // 1000000) % 10
    digi5 = (num2 // 100000) % 10
    digi6 = (num2 // 10000) % 10
    digi7 = (num2 // 1000) % 10
    digi8 = (num2 // 100) % 10
    digi9 = (num2 // 10) % 10
    digi10 = num2 - (num2 // 10 * 10)

    sum = dig1+dig2+dig3+dig4+dig5+dig6+dig7+dig8+dig9+dig10+digi1+digi2+digi3+digi4+digi5+digi6+digi7+digi8+digi9+digi10

    print("#1. The difference between both integer numbers is an even number. The sum of all digits of both integer numbers is: ", sum)

else:
    print("#1. The difference between both integer numbers isn't an even number.")

if(dif == 2 or dif == 3 or dif == 5 or dif == 7):
    print("#2. The difference between both integer numbers is a prime number. The product of the both iteger numbers is: ", num1 * num2)
else:
    print("#2. The difference between both integer numbers isn't a prime number.")

if(dif - (dif // 10 * 10) == 4):
    print("#3. The difference between both integer number ends in 4. All digits separately are: ", dig1,dig2,dig3,dig4,dig5,dig6,dig7,dig8,dig9,dig10," - ",digi1,digi2,digi3,digi4,digi5,digi6,digi7,digi8,digi9,digi10)
else:
    print("#3. The difference between both integer number doesn't end in 4.")
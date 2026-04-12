print("")
print("***************************************************************")
print("READ TWO INTEGERS AND DETERMINE WHICH ONE HAS MORE PRIME DIGITS")
print("***************************************************************")
print("")

num1 = int(input("Write the first number: "))
num2 = int(input("Write the second number: "))

if(num1 < 0):
    num1 = num1 * (-1)

if(num2 < 0):
    num2 = num2 * (-1)


dig1 = 0
count1 = 0

while(num1 != 0):
    dig1 = num1 % 10

    if(dig1 == 2 or dig1 == 3 or dig1 == 5 or dig1 == 7):
        count1 += 1

    num1 //= 10

dig2 = 0
count2 = 0

while(num2 != 0):
    dig2 = num2 % 10

    if(dig2 == 2 or dig2 == 3 or dig2 == 5 or dig2 == 7):
        count2 += 1

    num2 //= 10

if (count1 > count2):
    print("The first number has more prime digits:", count1)
elif count2 > count1:
    print("The second number has more prime digits:", count2)
else:
    print("Both numbers have the same amount of prime digits:", count1)
print("")
print("**********************************************************************")
print("READ AN INTEGER NUMBER AND DETERMINE HAW MANY TIMES IT HAS THE DIGIT 1")
print("**********************************************************************")
print("")

num = int(input("Write an integer number: "))


if(num < 0):
    num = num * (-1)

sum = 0
while(num > 0):
    dig = num % 10
    num //= 10
    

    if (dig == 1):
        sum += dig

print("there are ", sum , " digits 1")
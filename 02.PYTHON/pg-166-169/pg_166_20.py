print("")
print("****************************************************")
print("READ THREE INTEGER NUMBERS AND SHOW THEM ASCENDINGLY")
print("****************************************************")
print("")

num1 = int(input("Write the first integer number: "))
num2 = int(input("Write the second integer number: "))
num3 = int(input("Write the third integer number: "))

if (num1 < 0):
    num1 = num1 * (-1)
if (num2 < 0):
    num2 = num2 * (-1)
if (num3 < 0):
    num3 = num3 *(-1)

if(num1 < num2 and num2 < num3):
    print("#1. " , num1)
    print("#2. " , num2)
    print("#3. " , num3)
elif(num1 < num3 and num3 < num2):
    print("#1. " , num1)
    print("#2. " , num3)
    print("#3. " , num2)
elif(num2 < num1 and num1 < num3):
    print("#1. " , num2)
    print("#2. " , num1)
    print("#3. " , num3)
elif(num2 < num3 and num3 < num1):
    print("#1. " , num2)
    print("#2. " , num3)
    print("#3. " , num1)
elif(num3 < num1 and num1 < num2):
    print("#1. " , num3)
    print("#2. " , num1)
    print("#3. " , num2)
elif(num3 < num2 and num2 < num1):
    print("#1. " , num3)
    print("#2. " , num2)
    print("#3. " , num1)
else:
    print("")
print("")
print("*********************************************************************************************")
print("READ TWO INTEGER NUMBERS AND SHOW ALL NUMBERS BETWEEN THE LEAST AND THE GREATER ON THE SCREEN")
print("*********************************************************************************************")
print("")

num1 = int(input("Write the first integer number: "))
num2 = int(input("Write the second integer number: "))

print("The numbers are:")

if(num1 <0):
    num1 = num1 * (-1)

if(num2 < 0):
    num2 = num2 * (-1)

if (num1 < num2):
    aux = num1

    while (aux <= num2):
        print(aux)
        aux += 1

if (num2 < num1):
    aux = num2

    while (aux <= num1):
        print(aux)
        aux += 1

if(num1 == num2):
    print("The written numbers are equals.")
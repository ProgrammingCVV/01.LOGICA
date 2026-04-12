print("")
print("*******************************************************************************************************************************")
print("READ TWO NUMBERS AND DISPLAY ALL THE NUMBERS ENDING IN 4 THAT ARE BETWEEN THEM (Make sure the first number is the smaller one.)")
print("*******************************************************************************************************************************")
print("")


num1 = int(input("Write the first number: "))
num2 = int(input("Write the second number: "))

inicio = min(num1, num2)
fin = max(num1, num2)

if(num1 < 0):
    num1 = num1 * (-1)

if(num2 < 0):
    num2 = num2 * (-1)

for i in range(inicio, fin):
    if(i % 10 == 4):
        print(i)
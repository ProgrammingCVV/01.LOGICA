print("")
print("*****************************************************************************************************")
print("READ TWO INTEGER NUMBERS AND DISPLAY ALL THE MULTIPLES OF FIVE BETWEEN THE SMALLER AND THE LARGER ONE")
print("*****************************************************************************************************")
print("")

num1 = int(input("Write the first integer number: "))
num2 = int(input("Write the second integer number: "))

if(num1 < 0):
    num1 = num1 * (-1)
if(num2 < 0):
    num2 = num2 * (-1)

i = 0
smaller = min(num1, num2)
larger = max(num1, num2)

for i in range(smaller, larger+1, 1):
    if(i % 5 == 0):
        print(i)
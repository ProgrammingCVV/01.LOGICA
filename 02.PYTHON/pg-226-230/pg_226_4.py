print("")
print("*************************************************************")
print("READ TEO NUMBERS AND SHOW ALL INTEGERS COMPRENDS BETWEEN THEM")
print("*************************************************************")
print("")

num1 = int(input("Write the first number: "))
num2 = int(input("Write the second number: "))

if(num1 < 0 ):
    num1 = num1 * (-1)

if(num2 < 0):
    num2 = num2 * (-1)

i = 1
j = 1

while(i <= num1):
    print(i)
    i += 1

print("")

while(j <= num2):
    print(j)
    j +=1
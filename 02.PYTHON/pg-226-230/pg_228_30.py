print("")
print("*************************************************************************")
print("READ AN INTEGER AND SHOW ON THE SCREEN ALL NUMERIC COMPONENTS OF THIS ONE")
print("*************************************************************************")
print("")

num = int(input("Write an integer number: "))

if(num < 0):
    num = num * (-1)

print("The numeric components of the written number are: ")


for i in range(1, num + 1, 1):
    if(num % i == 0):
        print(i, end=", ")
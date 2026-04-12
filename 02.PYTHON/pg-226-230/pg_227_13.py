print("")
print("*****************************************************************************")
print("READ AN INTEGER AN DISPLAY ALL MULTIPLES OF 5 BETWEEN 1 AND THE READED NUMBER")
print("*****************************************************************************")
print("")

num = int(input("Write an integer: "))

if(num < 0):
    num = num * (-1)

i = 0

for i in range(1, num+1, 1):

    if(i % 5 == 0):
        print(i)
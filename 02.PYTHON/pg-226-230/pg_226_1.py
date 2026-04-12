print("")
print("*************************************************************************************************")
print("READ AN INTEGER NUMBER AND SHOW ON SCREEN ALL THE NUMBERS COMPRENDS BETWEEN 1 AND THE READ NUMBER")
print("*************************************************************************************************")
print("")

num = int(input("Write an integer number: "))
i = 0

if(num < 0):
    num = num * (-1)

while(i < num):
    print(i + 1)
    i += 1
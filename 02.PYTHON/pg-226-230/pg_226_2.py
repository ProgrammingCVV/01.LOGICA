print("")
print("**************************************************************************************************")
print("READ AN INTEGER NUMBER AND SHOW ON THE SCREEN ALL THE EVEN COMPRENDS BETWEEN 1 AND THE READ NUMBER")
print("**************************************************************************************************")
print("")

num = int(input("Write an integer number: "))

if(num < 0):
    num = num * (-1)

i = 0

while(i <= num):

    if(i % 2 == 0):
        print(i)

    i += 1
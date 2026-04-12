print("")
print("**********************************************************************************************************************")
print("READ AN INTEGER NUMBER AND SHOW ON THE SCREEN THE EXACT DIVISORS OF THE NUMBER COMPRENDS BETWEEN 1 AND THE READ NUMBER")
print("**********************************************************************************************************************")
print("")

num = int(input("Write an integer number: "))
i = 1

if(num < 0):
    num = num * (-1)

while(i < num):

    if(num % i == 0):
        print(i)

    i += 1
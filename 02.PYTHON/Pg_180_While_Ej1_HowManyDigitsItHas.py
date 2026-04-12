print("")
print("***********************************************************")
print("READ AN INTEGER NUMBER AND DETERMINE HOW MANY DIGITS IT HAS")
print("***********************************************************")
print("")

num = int(input("Write an integer number: "))

count = 0

if(num < 0):
    num = num * (-1)

while (num != 0):

    num = num // 10
    count += 1

    print("The written number has ", count, " digits")


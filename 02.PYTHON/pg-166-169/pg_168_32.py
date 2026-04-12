print("")
print("****************************************************************")
print("READ AN INTEGER NUMBER AN DETERMINE IF IT IS A MULTIPLE OF SEVEN")
print("****************************************************************")
print("")

num = int(input("Write an integer number: "))

if(num < 0):
    num = num * (-1)

if(num % 7 == 0):
    print("The written number ", num, " is multiple of 7.")
else:
    print("the written number ", num, " isn't multiple of 7.")
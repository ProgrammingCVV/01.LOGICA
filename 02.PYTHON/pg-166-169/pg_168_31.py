print("")
print("*********************************************************")
print("READ AN INTEGER NUMBER AND DETERMINE IF IT IS EQUAL TO 10")
print("*********************************************************")
print("")

num = int(input("Write an integer number: "))

if(num < 0):
    num = num * (-1)

if(num == 10):
    print("The written number is equal to 10.")
else:
    print("The written number is different to 10.")
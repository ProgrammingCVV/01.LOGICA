print("")
print("*********************************************")
print("READ AN INTEGER AND DETERMINE ITS FIRST DIGIT")
print("*********************************************")
print("")

num = int(input("Write an integer number: "))

if(num < 0):
    num = num * (-1)

dig = 0
while(num > 0):
    dig = num % 10
    num //= 10

print("The first digit of the written number is ", dig)


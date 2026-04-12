print("")
print("******************************************************")
print("READ AN INTEGER AN DETERMINE THE AVERAGE OF ITS DIGITS")
print("******************************************************")
print("")

num = int(input("Write an integer: "))

if(num < 0):
    num = num * (-1)

sum = 0
count = 0
aver = 0

while(num > 0):
    dig = num % 10
    num //= 10
    count += 1
    sum += dig

aver = sum / count  

print("The average of the written digits is ", aver)
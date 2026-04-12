print("")
print("*********************************************************")
print("WRITE AN INTEGER AND DETERMINE THE SUM OF ITS EVEN DIGITS")
print("*********************************************************")
print("")

num = int(input("Write an integer: "))

if (num < 0):
    num = num * (-1)

dig = 0
count = 0

while(num > 0):
    dig = num % 10
    num //= 10

    if(dig % 2 == 0):
        count += dig
        
print("The sum of the even digits is " , count)
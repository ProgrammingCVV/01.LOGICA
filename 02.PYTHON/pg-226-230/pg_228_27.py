print("")
print("*********************************************************")
print("READ TWO INTEGERS AND DETERMINE WHICH ONE HAS MORE DIGITS")
print("*********************************************************")
print("")

num1 = int(input("Write the first number: "))
num2 = int(input("Write the second number: "))

if(num1 < 0):
    num1 = num1 * (-1)
if(num2 < 0):
    num2 = num2 * (-1)


dig1 = 0
count1 = 0

while(num1 > 0):
    dig1 = num1 % 10
    count1 += 1
    num1 //= 10


dig2 = 0
count2 = 0

while(num2 > 0):
    dig2 = num2 % 10
    count2 += 1
    num2 //= 10

if(count1 > count2):
    print("The first number has more digits than the second one with ", count1, " digits.")

elif(count2 > count1):
    print("The second number has more digits than the first one with ", count2, "digits.")

else:
    print("Both numbers have the same number of ", count1 , " digits.")
print("")
print("")
print("AVERAGE THE FIRST X MULTIPLES OF TWO A DETERMINE IF THIS IS GREATER THAN THE AVERAGE OF THE FIRST Y MULTIPLES OF FIVE FOR GIVE VALUES X AND Y")
print("")
print("")

num = int(input("Write the first integer that average the first multiples of two: "))

if(num < 0):
    num = num * (-1)

i = 0
sum = 0
aver = 0

for i in range(1, num+1, 1):
    sum += i * 2
    aver = sum // i

print("The sum is: ", sum)
print("The average is: ", aver)
print("")

#===============================================================================================================================================

num2 = int(input("Write the second integer that average the first multiples of five: "))

if(num2 < 0):
    num2 = num2 * (-1)

j = 0
sum2 = 0
aver2 = 0

for j in range(1, num2+1, 1):
    sum2 += j * 5
    aver2 = sum2 // j

print("The sum is: ", sum2)
print("The average is: ", aver2)
print("")


#===============================================================================================================================================

if(aver > aver2):
    print("The average of the first multiples of two, IS greater than the first multiples of 5.")
    print("")

else:
    print("The average of the first multiples of two, IS NOT greater than the first multiples of 5.")
    print("")


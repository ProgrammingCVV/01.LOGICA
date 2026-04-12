print("")
print("***************************************************")
print("READ AN INTEGER NUMBER AND CALCULATE IT'S FACTORIAL")
print("***************************************************")
print("")

num = int(input("Write an integer number: "))
count = 1
fact = 1

if(num > 0):

      
    for count in range(1, num + 1, 1):
        fact = fact * count
        count += 1

    print("The factorial of ", num, " is ", fact)

else:
    print("The factorial isn't defined for negative numbers")


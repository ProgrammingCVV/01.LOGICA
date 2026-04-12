print("")
print("**************************************************")
print("READ AN INTEGER NUMBER AN CALCULATE IT'S FACTORIAL")
print("**************************************************")
print("")

num = int(input("Write an integer number: "))
count = 1
fact = 1

if(num > 0):

    while(count <= num):
        fact = fact * count
        count += 1

    print("The factorial of ", num, " is ", fact)
else:
    print("The factorial isn't defined for negative numbers")

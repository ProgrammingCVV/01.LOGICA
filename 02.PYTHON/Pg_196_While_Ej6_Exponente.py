print("")
print("*********************************************************************************")
print("READ A FIRST NUMBER BAS, READ A SECOND NUMBER EXP, RAISE THE BASE TO THE EXPONENT")
print("*********************************************************************************")
print("")

bas = int(input("Write the first number (bas): "))
exp = int(input("Write the second number (exp): "))

if(exp > 0):

    count = 1
    result = 1

    while(count <= exp):

        result = bas ** count
        count += 1

        print(count-1)

    print ("The result is: ", result)

else:
    print("The bas and the exp must be positive numbers.")
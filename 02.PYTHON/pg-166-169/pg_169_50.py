print("")
print("*******************************************************************************************************************")
print("#1. READ AN INTEGER NUMBER LESS THAN AND EQUAL TO 100 AND, IF IT IS MULTIPLE OF FOUR, SHOW IT'S HALF ON THE SCREEN.")
print("#2.     IF    IT    IS    MULTIPLE    OF   FIVE,     SHOW      IT'S     EXPONENT    IN    2    ON    THE    SCREEN.")
print("#3.     AND,    IF    IT    IS    MULTIPLE    OF    SIX,    SHOW    IT'S    FIRST    DIGIT    ON    THE    SCREEN  ")
print("*******************************************************************************************************************")
print("")

num = int(input("Write a integer number less than or equal to 100: "))

if(num < 0):
    num = num * (-1)

if(num <= 100):
    
    if(num % 4 == 0):
        print("#1. The half of the number is: ", num // 2)
    else:
        print("#1. The written number isn't multiple of 4.")


    if(num % 5 == 0):
        print("#2. The exponent in 2 of the number is : ", num ** 2)
    else:
        print("#2. The written number isn't multiple of 5.")


    if(num % 6 == 0):
        print("#3. The first digit of the number is: ", (num // 10) % 10)
    else:
        print("#3. The written number isn't multiple of 6.")

else: 
    print("The written number isn't less than 100.")
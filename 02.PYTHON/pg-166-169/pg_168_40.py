print("")
print("**************************************************************************************")
print("READ  TWO INTEGER NUMBERS  AND IF THE  DIFFERENCE BETWEEN BOTH  IS LESS THAN  10, THEN")
print("SHOW ON SCREEN ALL THE INTEGERS BETWEEN THE LEAST AND THE GREATEST OF THE NUMBERS READ")
print("**************************************************************************************")
print("")

num1 = int(input("Write the first integer number: "))
num2 = int(input("Write the second integer number: "))

if(num1 < 0  or num2 < 0):
    num1 = num1 * (-1)
    num2 = num2 * (-1)
        

if((num1 - num2) == 1):
    print(num2,  num1)

if((num1 - num2) == 2):
    print(num2, ", ", num2 + 1, ", ", num1)
    
if((num1 - num2) == 3):
    print(num2, ", ", num2 + 1, ", ", num2 + 1, ", ",  num1)
            
if((num1 - num2) == 4):
    print(num2, ", ", num2 + 1, ", ", num2 + 1, ", ", num2 + 1, ", ", num1)

if((num1 - num2) == 5):
     print(num2, ", ", num2 + 1, ", ", num2 + 1, ", ", num2 + 1, ", ", num2 + 1, ", ",  num1)
            
if((num1 - num2) == 6):
    print(num2, ", ", num2 + 1, ", ", num2 + 1, ", ", num2 + 1, ", ", num2 + 1, ", ", num2 + 1, ", ", num1)
            
if((num1 - num2) == 7):
    print(num2, ", ", num2 + 1, ", ", num2 + 1, ", ", num2 + 1,", ", num2 + 1, ", ", num2 + 1, ", ", num2 + 1, ", ", num1)

if((num1 - num2) == 8):
    print(num2, ", ", num2 + 1, ", ", num2 + 1, ", ", num2 + 1,", ", num2 + 1, ", ", num2 + 1, ", ", num2 + 1, ", ", num2 + 1, ", ", num1)

if((num1 - num2) == 9):
    print(num2, ", ", num2 + 1, ", ", num2 + 1, ", ", num2 + 1,", ", num2 + 1, ", ", num2 + 1, ", ", num2 + 1, ", ", num2 + 1, ", ", num2 + 1, ", ", num1)
            


if((num2 - num1) == 1):
    print(num1, ", ", num2)
                
if((num2 - num1) == 2):
    print(num1, ", ", num1 + 1, ", ", num2)
                
if((num2 - num1) == 3):
    print(num1, ", ", num1 + 1, ", ", num1 + 1, ", ",  num2)
                
if((num2 - num1) == 4):
    print(num1, ", ", num1 + 1, ", ", num1 + 1, ", ", num1 + 1, ", ", num2)

if((num2 - num1) == 5):
    print(num1, ", ", num1 + 1, ", ", num1 + 1, ", ", num1 + 1, ", ", num1 + 1, ", ", num2)

if((num2 - num1) == 6):
    print(num1, ", ", num1 + 1, ", ", num1 + 1, ", ", num1 + 1, ", ", num1 + 1, ", ", num1 + 1, ", ", num2)

if((num2 - num1) == 7):
    print(num1, ", ", num1 + 1, ", ", num1 + 1, ", ", num1 + 1, ", ", num1 + 1, ", ", num1 + 1, ", ", num1 + 1, ", ", num2)

if((num2 - num1) == 8):
    print(num1, ", ", num1 + 1, ", ", num1 + 1, ", ", num1 + 1, ", ", num1 + 1, ", ", num1 + 1, ", ", num1 + 1, ", ", num1 + 1, ", ", num2)

if((num2 - num1) == 9):
    print(num1, ", ", num1 + 1, ", ", num1 + 1, ", ", num1 + 1, ", ", num1 + 1, ", ", num1 + 1, ", ", num1 + 1, ", ", num1 + 1, ", ", num1 + 1, ", ", num2)

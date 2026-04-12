print("")
print("*********************************************************************************")
print("READ   AN INTEGER NUMBER WITH TWO DIGITS AND, IF IT FINISH IN 1, SHOW  ON  SCREEN")
print("IT´S  FIRST  DIGIT;  IF FIISH IN 2, SHOW ON THE SCREEN THE SUM  OF  IT´S  DIGITIS")
print("AND   IT  FINISH  IN   3,   SHOW  ON  THE  SCREEN  THE  PRODUCT  OF  IT'S  DIGITS")
print("*********************************************************************************")
print("")

num = int(input("Write an integer number with 2 digits: "))

if(num < 0):
    num = num * (-1)

if(num >= 10 and num <= 99):
    
    dig1 = (num // 10) % 10
    dig2 = num - (num // 10 * 10)
    
    if(dig2 == 1):
        print("The first digit of the written number is: ", dig1)
    
    if(dig2 == 2):
        print("The sum of the digits of the written number is: ", dig1 + dig2)

    if(dig2 == 3):
        print("The product of the digits of the written number is: ", dig1 * dig2)

else:
    print("The written number doesn't have two digits. Try again please.")
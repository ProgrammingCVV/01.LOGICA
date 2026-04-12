print()
print("**************************************************************************************************************")
print("READ AN INTEGER NUMBER WITH TWO DIGITS, SAVE EACH DIGIT IN A DIFFERENT VARIABLE AND LATER SHOW THEM IN CONSOLE")
print("**************************************************************************************************************")
print()

num = int(input("Write an integer number with two digits: "))

if(num < 0):
    num = num * (-1)

if(num >= 10 and num <= 99):

    dig1 = (num // 10) % 10
    dig2 = num - (num // 10 * 10)

    print("The first digit is: ", dig1)
    print("The second digit is: ", dig2)

else:
    print("The written number doesn't have two digits. Try again please.")
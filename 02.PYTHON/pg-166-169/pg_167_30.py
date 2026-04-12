print("")
print("*************************************************************************************************")
print("READ AN INTEGER NUMBER WITH FOUR DIGITS AN DETERMINE IF THE SECOND DIGIT IS EQUAL TO THE PENULTIM")
print("*************************************************************************************************")
print("")

num = int(input("Write an integer number with four digits: "))

if(num < 0):
    num= num * (-1)

if(num >= 1000 and num <= 9999):
    dig1 = (num // 1000) % 10
    dig2 = (num // 100) % 10
    dig3 = (num // 10) % 10
    dig4 = num - (num // 10 * 10)

    if(dig2 == dig3):
        print("The second digit is equal to the penultim.")
    else:
        print("The second digit is differnet to the penultim.")
else:
    print("The written number doesn't have four digits. Try again please.")
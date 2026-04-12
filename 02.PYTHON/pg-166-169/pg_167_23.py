print("")
print("***********************************************************************************")
print("READ AN INTEGER NUMBER WITH THREE DIGITS AND DETERMINE HOW MANY PRIME DIGITS IT HAS")
print("***********************************************************************************")
print("")

countPrime1 = 0
countPrime2 = 0
countPrime3 = 0


num = int(input("Write an integer number with three digits: "))

if(num >= 100 and num <= 999):

    dig1 = (num // 100) % 10
    dig2 = (num // 10) % 10
    dig3 = num - (num // 10 * 10)

    if(dig1 == 1 or dig1 == 2 or dig1 == 3 or dig1 == 5 or dig1 == 7):
        countPrime1 += 1
    if(dig2 == 1 or dig2 == 2 or dig2 == 3 or dig2 == 5 or dig2 == 7):
        countPrime2 += 1
    if(dig3 == 1 or dig3 == 2 or dig3 == 3 or dig3 == 5 or dig3 == 7):
        countPrime3 += 1

    suma = countPrime1 + countPrime2 + countPrime3
    
    if(suma == 0):
        print("There aren't prime digits.")
    else:
        print("There are ", suma, " prime digit(s)")
else:
    print("The written number doesn't have three digits. Try again please.")



    
        

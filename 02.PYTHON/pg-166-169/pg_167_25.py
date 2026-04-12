print()
print("*******************************************************************************************************")
print("READ AN INTEGER NUMBER WITH THREE DIGITS AND DETERMINE IF SOME IS EQUAL AT THE SUM OF THE OTHERS TWO")
print("*******************************************************************************************************")
print()

num = int(input("Write an integer number with three digits: "))

if(num < 0):
    num = num * (-1)

if(num >= 100 and num <= 999):
    dig1 = (num // 100) % 10
    dig2 = (num // 10) % 10
    dig3 = num - (num // 10 * 10)

    sum1 = dig1 + dig2
    sum2 = dig1 + dig3
    sum3 = dig2 + dig3

    if(dig1 == sum3):

        print(dig1, " is equal at the sum of to other digits")
    else:
        print(dig1, " isn't equal at the sum to the other digits")

 
    if(dig2 == sum2):

        print(dig2, " is equal at the sum to the other digits")
    else:
        print(dig2, " isn't equal at the sum to the other digits")
 
    
    if(dig3 == sum1):

        print(dig3, " is equal at the sum to the other digits")
    else:
        print(dig3, " isn't equal at the sum to the other digits")

 
else:
    print("The written number does't have three digits. Try again please.")

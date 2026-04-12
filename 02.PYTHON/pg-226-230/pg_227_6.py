print("")
print("*********************************************************************************************************************")
print("WRITE AN INTEGER NUMBER WITH THREE DIGITS AND SHOW ON SCREEN ALL THE WHOLE NUMBERS COMPRENDS BETWEEN 1 AND EACH DIGIT")
print("*********************************************************************************************************************")
print("")

num = (int(input("Write an integer number with three digits: ")))
dig1 = dig2 = dig3 = 1

if(num < 0):
    num = num * (-1)

if (num > 0):
    dig1 = (num // 100) % 10
    dig2 = (num // 10) % 10
    dig3 = num % 10

    i = j = k = 0

    for i in range (i, dig1, 1):
        print(i+1)
    print("")

    for j in range (j, dig2, 1):
        print(j+1)
    print("")

    for k in range (k, dig3, 1):
        print(k+1)
    print("")

else:
    print("The written numbre doesn't have 3 digits. Please try again.")
    
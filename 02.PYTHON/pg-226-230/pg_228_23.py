print("")
print("***********************************************************************************")
print("READ AN INTEGER NUMBER AND DETERINE IF THE SUM OF IT'S DIGITS IS A PRIME NUMBER TOO")
print("***********************************************************************************")
print("")

num = int(input("Write an integer number py: "))
count = 0

num = abs(num)

while(num > 0):
    dig = num % 10
    count += dig
    num //= 10

es_primo = True

if (count <= 1):
    es_primo = False
else:
    i = 2
    while (i * i <= count):
        if (count % i == 0):
            es_primo = False
            break
        i += 1

    if (es_primo):
        print("The sum of the digits is ", count, " and it's a prime number.")
        
    else:
        print("The sum of the digits is ", count, " and it isn´t a prime number.")
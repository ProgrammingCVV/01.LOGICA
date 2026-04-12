print("")
print("")
print("Display the integer average of the first n multiples of three for a given input number n")
print("")
print("")

i = sum = 0

num = int(input("Write an integer number: "))

if(num < 0):
    num = num * (-1)

for i in range(1, num+1, 1):
    sum += i * 3
    prom = sum // i
print(sum)
print(prom)
print("")
print("*********************************************************************************************************************************")
print("READ WHOLE NUMBERS UNTIL THEY DIGITE 0 AND DETERMINE HOW MUCH IS EQUAL TO THE AVERAGE OF THE NUMBERS READ THAT HAVE BEEN POSITIVE")
print("*********************************************************************************************************************************")
print("")

num = int(input("Write an integer number: "))

acum = 0
count = 0
prom = float (0)

if (num < 0):
    num = num * (-1)

while(num != 0):

    acum = acum + num
    num = num // 2
    count += 1

    print(acum)

prom = acum / count
print(prom)
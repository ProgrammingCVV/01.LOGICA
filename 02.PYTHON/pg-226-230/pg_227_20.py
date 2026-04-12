print("")
print("***********************************************************")
print("READ AN INTEGER NUMBER AND DETERMINE HOW MANY DIGITS IT HAS")
print("***********************************************************")
print("")

num = int(input("Write an integer number: "))

i = 0
digits = 0

if (num < 0):
    num = num * (-1)

# Caso especial: si es 0, tiene 1 dígito
if num == 0:
    digits = 1
    print(f"The written number has {digits} digit(s).")
else:
    for num in range (1, num + 1, 1):
        num = num // 10
        digits += 1

        if digits >= 10:
            print("The written number has 10 digits or more.")
        else:
            print(f"The written number has {digits} digit(s).")
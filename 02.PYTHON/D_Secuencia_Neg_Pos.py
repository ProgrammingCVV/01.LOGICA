print("")
print("DECISIONES ANIDADAS")
print("")

num = int(input("Escriba un número Entero:  "))

if(num > 0):
    print("El número es positivo, ")
elif(num < 0):
     num = num * (-1)
     print("El número es negativo, ")

if(num >=1 and num <=9):
    print("y tiene un dígito.")
elif(num >= 10 and num <= 99):
    print("y tiene 2 dígitos.")
elif(num >=100 and num <=999):
    print("y tiene 3 dígitos")
else:
    print("y tiene más de 3 dígitos")

      
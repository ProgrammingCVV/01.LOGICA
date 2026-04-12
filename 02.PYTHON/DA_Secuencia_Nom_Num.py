
print("")
num = int(input("Escriba un número Entero del uno al cinco:  "))
if(num < 0):
    num = num*(-1)

if(num == 1):
    print("El número es ", num, "(UNO)")
elif(num == 2):
    print("El número es ", num, "(DOS)")
elif(num == 3):
    print("El número es ", num, "(TRES)")
elif(num == 4):
    print("El número es ", num, "(CUATRO)")
elif(num == 5):
    print("El número es ", num, "(CINCO)")
else:
    print("El número es MAYOR QUE CINCO!")
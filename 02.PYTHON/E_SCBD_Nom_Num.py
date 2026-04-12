print("")
print("***********************************")
print("EMULADOR DE SWIT CASE BREAK DEFAULT")
print("***********************************")
print("")

numero = int(input("Escriba un número entero de 1 a 5 para traducir en letras: "))

if(numero < 0):
    numero = numero * (-1)

if(numero == 1):
    print("El número es UNO")
elif(numero == 2):
    print("El npumero es DOS")
elif(numero == 3):
    print("El número es TRES")
elif(numero == 4):
    print("El número es CUATRO")
elif(numero == 5):
    print("El núero es CINCCO")
else:
    print("EL NÚMERO NO CUMPLE LA SOLICITUD, INTENTE NUEVAMENTE.")
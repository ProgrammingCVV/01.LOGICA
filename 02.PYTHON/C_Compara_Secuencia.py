print("*********************************************************")
print("COMPARA SI EL NÚMERO ES POSITIVO, NEGATIVO O IGUAL A CERO")
print("*********************************************************")
print("")

num = int(input("Escriba un múmero entero:  "))

if num < 0:
    print("El número es NEGATIVO.")

elif num > 0:
    print("El número es POSITIVO.")
    
else:
    print("El número es cero.")
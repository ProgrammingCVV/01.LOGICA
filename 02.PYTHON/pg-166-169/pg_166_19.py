print("")
print("************************************************************************************")
print("READ THREE INTEGER NUMBERS AND DETERMINE WHICH IS GREATEST. (USE ONLY TWO VARIABLES.)")
print("************************************************************************************")
print("")

"""
 ESTE EJERCICIO SÓLO TENDRÁ SENTIDO SI AL USUARIO SE LE SOLICITA REEMPLAZAR 
 CUALQUIERA DE LOS NÚMEROS YA PEDIDOS DESPUÉS DE HABERLOS OPERADO, PUES ESTE "REEMPLLAZO"
 HARÁ LA VEZ DEL TERCER NÚMERO ENTERO QUE SE LEA.
"""

number1 = int(input("Write the first integer number: "))
number2 = int(input("Write the second integer number: "))

if(number1 > number2):
    print("The first number is greatest than second.")
else:
    print("The second number is greatest than first.")

number2 = int(input("Write again the second number: "))


if(number1 > number2):
    print("The first number is greatest than second.")
else:
    print("The second number is gretest than first.")
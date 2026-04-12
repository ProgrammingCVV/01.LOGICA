print("")
print("===================================================")
print("CUENTA CUÁNTOS DÍGITOS CONTIENE EL NÚMERO INGRESADO")
print("===================================================")
print("")

num = int(input("Escribe un número:  "))

if num < 0:
    num = num * (-1)

if num >= 0 and num <= 9:
    print("El número escrito tiene 1 dígito.")
elif num >= 10 and num <= 99:
    print("El número escrito tiene 2 dígitos.")
elif num >= 100 and num <= 999:
    print("El número escrito tiene 3 dígitos.")
elif(num >= 1000 and num <= 9999):
    print("El número escrito tiene 4 dígitos.")
else:
    print("El número escrito !TIENE MÁS DE 4 DÍGITOS!")
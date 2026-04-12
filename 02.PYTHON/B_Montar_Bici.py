print("")
lluvia = input("¿Está lloviendo? SI/NO:   ")
print("")

ele_seguridad = input("¿Están completos los elementos de seguridad?(Casco / Luces)  SI/NO:   ")
print("")

estado = input("¿La bici está en buen estado?(frenos, neumáticos, cadena, sillin, etc) SI/NO:  ")
print("")

if (lluvia == "no"):
    print("Hace buen clima para montar en bici. ")
elif(lluvia == "si"):
    print("Está lloviendo. Lo mejor será no montar bici hoy.")

if (ele_seguridad =="si"):
    print("Con los elementos de seguridad, podría salir con confianza.")
elif(ele_seguridad == "no"):
    print("Primero completo los elementos de seguridad antes de salir en bici.")

if (estado =="si"):
   print("La bici no tiene problemas! ")
elif(estado == "no"):
   print("Primero arregla lo que hace falta, para antes de salir.")

if (lluvia == "no" and ele_seguridad == "si" and estado == "si"):
    print("ENTONCES, ESTAMOS LISTOS 100% PARA MONTAR EN BICI.")
else:
    print("COMO ALGO ESTÁ MAL, ES MEJOR NO MONTAR EN BICI HOY.")
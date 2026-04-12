print("")
print("****************************************************************************")
print("COMPARAR 2 ÚLTIMOS DÍGITOS DE NÚMEROS DIFERENTES Y DECIR SI SON IGUALES O NO")
print("****************************************************************************")
print("")

num_1 = int(input("Digite el primer número entero de 3 cifras o más: "))
num_2 = int(input("Digite el segundo número entero de 3 cifras o más: "))

       
if num_1 < 0:
    num_1 = num_1 * (-1)
    ud1 = int(num_1 - num_1 // 10 * 10)
    print("El Ultimo Digito 1 es: ", ud1)
else:
    ud1 = int(num_1 - num_1 // 10 * 10)
    print("El Ultimo Digito 1 es: ", ud1)
              

if num_2 < 0:
    num_2 = num_2 * (-1)
    ud2 = int(num_2 - num_2 // 10 * 10)
    print("El Ultimo Digito 2 es: ", ud2)
else:
    ud2 = int(num_2 - num_2 // 10 * 10)
    print("El Ultimo Digito 2 es: ", ud2)
        

if ud1 == ud2:
    print("Los ultimos digitos son IGUALES")
else:
    print("Los ultimos digitos son DIFERENTES")

  
  

  




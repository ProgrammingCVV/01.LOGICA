print("")
print("******************************************")
print("EMULADOR SWITCH CASE BRAKE DEFAULT ANIDADO")
print("******************************************")
print("")

num = int(input("Escriba el primer dígito entero de 1 a 5: "))

if(num < 0):
    num = num * (-1)
        
if(num > 0):
        
    if(num == 1):
        print()
    elif(num == 2):
        print()
    elif(num == 3):
        print()
    elif(num == 4):
        print()
    elif(num == 5):
        print()
    else:
        print("El primer número digitado es MAYOR QUE CINCO. NO se podrá ejecutar la operación.")
                
num2 = int(input("Escriba el segundo entero de 1 a 5: "))

if(num2 < 0):
    num2 = num2 * (-1)
        
if (num > 0):
     
    if(num2 == 1):
        print("El número completo es ", num , num2 , ".")
    elif(num2 == 2):
        print("El número completo es ", num, num2, ".")
    elif(num2 == 3):
        print("El número completo es ", num , num2, ".")
    elif(num2 == 4):
        print("El número completo es ", num , num2, ".")
    elif(num2 == 5):
        print("El número completo es ", num , num2, ".")
    
    else:
        print("El segundo número digitado es MAYOR QUE CINCO. NO se podrá ejecutar la operación.")
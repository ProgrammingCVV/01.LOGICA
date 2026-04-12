print("")
print("*************************************************************************************************************************************")
print("READ AN INTEGER NUMBER AND DISPLAY ON THE SRCEEN ALL THE INTEGERS COMPRENDS BETEEWN 1 AND EACH ONE OF THE DIGITS FROM THE NUMBER READ")
print("*************************************************************************************************************************************")
print("")

num = int(input("Write an integer number: "))
dig = 0
aux = 1


if(num < 0):
    num = num * (-1)

while(num != 0):
    print(num, "Digited number")
    dig = num - (num // 10 * 10)

    for aux in range (aux, dig, 1):

        print(aux)

    print(dig)
    
    num = num // 10
        
        
        
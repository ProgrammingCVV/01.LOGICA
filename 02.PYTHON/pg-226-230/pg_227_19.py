print("")
print("*******************************************")
print("READ ONE NUMBER AND DETERMINE IF IT'S PRIME")
print("*******************************************")
print("")

num = int(input("Write an intenger number: "))

def es_primo(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):  # solo verificamos hasta la raíz cuadrada
        if n % i == 0:
            return False
    return True

# Verificar y mostrar resultado
if es_primo(num):
    print(f"{num} is a prime number.")
else:
    print(f"{num} isn't a prime number.")
print("")
print("**************************************************************************************")
print("READ AN INTEGER AND DETERMINE THE SUM OF ALL INTEGERS BETWEEN 1 AND THE NUMBER ENTERED")
print("**************************************************************************************")
print("")

num = int(input("Write an integer: "))

i = 1

for i in range(i, num, 1):
    i = num * (num + 1) // 2

print(i)

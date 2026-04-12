print("")
print("********************")
print("MULTIPLICATION TABLE")
print("********************")
print("")

m1 = 0
m2 = 1
result = 0

for m1 in range (0, 3+1, 1):

    print("")    
    print("TABLE OF ", m1)
    print("")

    for m2 in range(1, 10+1, 1):

        print(m1, " X ", m2, " = ", (m1 * m2))
    print("")

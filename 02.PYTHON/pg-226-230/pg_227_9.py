print("")
print("**********************************************************************************************")
print("SHOW ON THE SCREEN ALL THE NUMBERS ENDING IN SIX, BETWEEN TWENTY FIVE AND TWO HUNDRED AND FIVE")
print("**********************************************************************************************")
print("")

i = 25

for i in range(i, 206, 1):
    if(i % 10 == 6):
        print(i)
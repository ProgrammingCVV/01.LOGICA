print("")
print("**************************************************************************************")
print("READ AN INTEGER AND POSITIVE NUMBER LESS THAN 50 AND DETERMINE IF IT IS A PRIME NUMBER")
print("**************************************************************************************")
print("")

num = int(input("WRITE AN INTEGER AND POSITIVE NUMBER LESS THAN 50: "))

if(num > 0):
    if(num < 50):

        if(num == 1 or num == 2 or num == 3 or num == 5 or num == 7 or num == 11 or num == 13 or num == 17 or
        num == 19 or num == 23 or num == 29 or num == 31 or num == 37 or num == 41 or num == 43 or num == 47):
            
            print("The written number is Prime.") 

        else:
            print("The written number isn't PRIME")

    else:
        print("The number is greater than 50. Try again please.")
                
else:
     print("The written number is negative and invalid for the operation.")
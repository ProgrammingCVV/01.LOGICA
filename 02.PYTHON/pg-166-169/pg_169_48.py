print("")
print("**********************************************************************************")
print("READ AN INTEGER NUMBER AND, IF IT IS LESS THAN 100, DETERMINE IF IS A PRIME NUMBER")
print("**********************************************************************************")
print("")

num = int(input("Write an integer number: "))

if(num < 0):
    num = num * (-1)

if(num <= 99):

    if(num == 2 or num == 3 or num == 5 or num == 7 or num == 11 or num == 13 or num == 17 or num == 19 or num == 23 or 
       num == 29 or num == 31 or num == 37 or num == 41 or num == 43 or num == 47 or num == 53 or num == 59 or num == 61 or 
       num == 67 or num == 71 or num == 73 or num == 79 or num == 83 or num == 89 or num == 97):
        print("The written number is a prime number less than 100.")
    else:
        print("The written number isn't a prime number less than 100.")
    
else:
    print("The written number isn't less than 100.")

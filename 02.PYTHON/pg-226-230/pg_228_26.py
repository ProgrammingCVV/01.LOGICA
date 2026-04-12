print("")
print("************************************************")
print("READ AN INTEGER AND DETERMINE THE GREATEST DIGIT")
print("************************************************")
print("")

num = int(input("Wrie an integer number: "))

if(num < 0 ):
    num = num * (-1)    

dig = 0
greatest = 0

while(num != 0):
    dig = num % 10

    if(dig > greatest):
        greatest = dig
    
    num //= 10
    
    
print("The greatest digit is ", greatest)
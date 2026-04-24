print("");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPPYPYPYPYPYPYPYPPYPYPYPYPYPYPYPYPYPYPYPYPYPYP");
print("READ A TWO-DIGITS INTEGER LESS THAN 20 AND DETERMINE IF IT'S A PRIME NUMBER");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPPYPYPYPYPYPYPYPPYPYPYPYPYPYPYPYPYPYPYPYPYPYP");
print("");

num = int(input("Write a two-digits integer: "));
prime = True;

if(num > 0):
    num *= -1;

if(num >= 10 and num < 20):

    for i in range(2, num):
    
        if(num % i == 0):
            prime = False;
            break;

    if(prime):
    
        print("The written number is prime.");
    
    else:
    
        print("The written number isn't prime.");
    

elif(num <= 9 or num >= 100):

    print("The written number doesn't have two digits. Please Try again!");

else:

    print("The written number isn't less than 20.");

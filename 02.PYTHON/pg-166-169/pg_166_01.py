print("");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPY");
print("READ AN INTEGER AND DETERMINE IF IT'S LAST NUMBER IS 4");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPY");
print("");

num = int(input("Write an integer: "));
four = 4;

if(num < 0):
    num *= -1;

if(num % 10 == 4):
    print("The last digit of your number is ", four)
else:
    print("The last number of your number ISN'T ", four)
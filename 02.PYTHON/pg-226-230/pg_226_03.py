print("");
print("PYPYPPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYYPYPYPYPYPYPYPYYPYPYPY");
print("READ AN INTEGER AND DISPLAY ALL ITS EXACT DIVISORS BETWEEN 1 AND THE GIVEN NUMBER");
print("PYPYPPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYYPYPYPYPYPYPYPYYPYPYPY");
print("");

i = 1;
num = int(input("Write an integr: "));

if(num < 0):
    num *= -1;
"""
while(i <= num):

    if(num % i == 0):
        print(i);
    i += 1;
"""

for i in range(1, num+1, 1):
    if(num % i == 0):
        print(i);
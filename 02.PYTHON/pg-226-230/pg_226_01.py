print("");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPY");
print("READ AN INTEGER AND DISPLAY ALL NUMBERS BETWEEN 1 AND THE GIVEN NUMBER");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPY");
print("");

i = 1;
num = int(input("Write an integer: "))

if(num < 0):
    num*= -1;
"""
while(i <= num):
    print(i, ", ");
    i += 1;
"""

for i in range(i, num+1, 1):
    print(i, end="-");

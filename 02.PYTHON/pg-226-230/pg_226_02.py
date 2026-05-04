print("");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYP");
print("READ AN INTEGER AND DISPLAY ALL EVEN NUMBERS BETWEEN ONE AND THE GIVEN NUMBER");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYP");
print("");

num = int(input("Write an integer: "));
i = 1;

if(num < 0):
    num *= -1;
"""
for i in range(1, num, 1):
    if(i % 2 == 0):
        print(i, end =", ");
"""

while(i<=num):
    if(i % 2 == 0):
        print(i, end="- ")
    i+=1;

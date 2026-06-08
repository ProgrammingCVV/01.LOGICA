print("");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYP");
print("READ TWO INTEGERS AND DISPLAY ALL THE NUMBERS ENDED IN 4 COMPRENDED BETWEEN THEM.");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYP");
print("");


num1 = int(input("Write the first number: "));
num2 = int(input("Write the second number: "));

if(num1 < 0):
    num1 *= -1;

if(num2 < 0):
    num2 *= -1;
i = 1;
j = 1;
"""
while(i <= num1):
    if(i % 10 == 4):
        print(i, end=", ");
    i+=1;

print("");

while(j <= num2):
    if(j % 10 == 4):
        print(j, end=", ");
    j+=1;

"""

for i in range(i, num1+1, 1):
    if(i % 10 == 4):
        print(i, end=", ")

print("")

for j in range(j, num2+1, 1):
    if(j % 10 == 4):
        print(j, end=", ")
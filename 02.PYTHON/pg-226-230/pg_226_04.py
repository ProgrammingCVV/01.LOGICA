print("");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPY");
print("READ TWO INTEGERS AND DISPLAY ALL NUMBERS BETWEEN THEM");
print("PYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPYPY");
print("");

num1 = int(input("Write the first number: "));
num2 = int(input("Write the second number: "));

if(num1 < 0):
    num1 *= -1;

if(num2 < 0):
    num2 *= -1;

for i in range(1, num1+1, 1):
    print(i, end="-");

print("");

for j in range(1, num2+1, 1):
    print(j, end="-");
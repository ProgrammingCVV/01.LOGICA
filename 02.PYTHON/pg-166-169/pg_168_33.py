print("")
print("********************************************************")
print("READ AN INTEGER NUMBER AND DETERMINE IF IT ENDS IN SEVEN")
print("********************************************************")
print("")


num = int(input("Write an integer number: "))

if(num < 0):
    num = num * (-1)

if(num - (num // 10 * 10) == 7):
    print("The written number ends in seven.")
else:
    print("The written number doesn't end in seven.")
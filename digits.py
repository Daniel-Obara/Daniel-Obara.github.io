n= int(input("Enter a three digit number: "))

third = n%10
second = n//10
second = second%10
first = n//100

print("The first digit is: ",first)
print("The second digit is: ",second)
print("The third digit is: ",third)

num1=int(input("Enter 1st number: "))
num2=int(input("Enter 2nd number: "))
num3=int(input("Enter 3rd number: "))

def largest3(num1,num2,num3):
    if(num1>num2 and num1>num3):
        largest=num1
        return largest
    elif(num2>num3 and num2>num1):
        largest=num2
        return largest
    else:
        largest=num3
        return largest

    
result=largest3(num1,num2,num3)

print("Largest number is ", result)

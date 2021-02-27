n=int(input("Enter n : "))
num=0
for i in range(n,0,-1):
    k=0
for j in range(2,i//2):
    if(i%j==0):
        k=1
        break;
    if(k==0):
        num=i
        break
num1=0
dupN=n
while(True):
    k=0
    dupN=dupN+1
    for j in range(2,dupN//2):
        if(dupN%j==0):
            k=1
            break
    if(k==0):
        num1=dupN
        break
if((n-num)<=(num1-n)):
    print("The prime closest to ",n," is ",num)
else :
    print("The prime closest to ",n," is ",num1)

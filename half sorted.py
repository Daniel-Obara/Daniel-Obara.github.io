print("please eneter number of elements in list")
print("Enter the number of elements: ",end='')
n=int(input())
print(n)
l=[]
for i in range(n):
    print('Enter element: ',end='')
    d=int(input())
    l.append(d)
    print(d)
f=n//2
h=l[f:n]
h.sort()
print(l[0:f]+h)

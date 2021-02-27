n = int(input('Please enter n: '))
print('please enter the numbers')

total = 0
original_total = 1
for i in range(2, n+1):
    
    total += int(input('Please enter a number: '))
    original_total += i

missing = original_total - total
print('The missing number is: ' + str(missing))
    

a = [1,2,3,5,6,7,8,4,10]
sum2 = 0
sum1 = 0
for i in range(1,11):
    sum2 = sum2 + i
for j in a:
    sum1 = sum1 + j
print("missing number:",sum2 - sum1)
    

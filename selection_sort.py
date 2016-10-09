arr = [4,3,2,1]
for i in range(len(arr)):
    pos = i
    for j in range(i+1,len(arr)):
        if arr[j] < arr[i]:
            pos = j
    temp = arr[pos]
    arr[pos] = arr[i]
    arr[i] = temp
print(arr)
    

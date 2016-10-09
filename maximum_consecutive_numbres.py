arr = [1,2,1000,1001,999,998,995,95,93,94]
s = set(arr)
print(s)
c = 0
count = 0
maxi = 0
for i in s:
    if c == 0:
        c = 1
        prev = i
        continue
    else:
        if i - prev == 1:
            count = count + 1
            if count > maxi:
                maxi = count
        else:
            count = 0
        prev = i
print(maxi + 1)
        

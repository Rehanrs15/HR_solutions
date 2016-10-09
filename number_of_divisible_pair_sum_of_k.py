n,k = input().strip().split(' ')
n,k = [int(n),int(k)]
a = [int(a_temp) for a_temp in input().strip().split(' ')]
l = list()
c = 0
counter = 0
for i in range(n):
    num = k - i
    if num not in l:
        l.insert(c,i)
        c = c + 1
    else:
        counter = counter + 1
        print(num,i)
print(counter)

l = list(map(int,input().split(" ")))
max_so_far = l[0]
current_max = l[0]
for i in l[1:]:
    current_max = max(i,current_max + i)
    max_so_far = max(max_so_far,current_max)
print(max_so_far)

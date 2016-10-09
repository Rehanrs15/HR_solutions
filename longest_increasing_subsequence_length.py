l = list(map(int,input().split(" ")))
prev = l[0]
max_so_far = 1
current_max = 1
for i in l[1:]:
    if i > prev:
        current_max = current_max + 1
        prev = i
    else:
        current_max = 1
        prev = i

    if current_max > max_so_far:
        max_so_far = current_max
print(max_so_far)

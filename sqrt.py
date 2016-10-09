def sqrt(n):
    root = 1.00
    for i in range(n):
        root = 0.5*(root + n/root)
    return root

num = int(input())
print(sqrt(num))

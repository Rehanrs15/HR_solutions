def rotate(A,b):
    for i in range(b):
        val = A.pop(0)
        A.append(val)
    return A

A = list(map(int,input().split()))
b = int(input())
print(rotate(A,b))

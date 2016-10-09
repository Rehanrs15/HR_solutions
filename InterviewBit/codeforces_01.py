def convert(A):
    s = ""
    n = ""
    f = 0
    for i in A:
        if i == 'e':
            f = 1
            continue
        if f != 1 and i != 'e':
            s = s + i
        if f == 1:
            n = n + i

    val = 10**(int(n))
    return float(s) * val

I = input()
#for i in range(10):
print(convert(I))

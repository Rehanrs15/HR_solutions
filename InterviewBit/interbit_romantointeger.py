def lstwordlength(A):
    d = dict()
    d['X'] = 10
    d['M'] = 1000
    d['C'] = 100
    d['L'] = 50
    d['D'] = 500
    d['I'] = 1
    d['V'] = 5

    x = len(A) - 1
    num = 0
    prev = 0
    while x >= 0:
        temp = d.get(A[x])
        if temp < prev:
            num = num - temp
        else:
            num = num + temp
        prev = temp
        x = x - 1
    print(num)
i = input()
lstwordlength(i)

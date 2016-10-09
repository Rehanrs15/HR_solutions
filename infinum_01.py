'''def Factors(n):
    l = list()
    for i in range(1,n+1):
        if n%i == 0:
            l.append(i)
    return l
'''
def PrimeFactors(n):
    l = []
    for i in range(2,n+1):
        if n%i == 0:
            l.append(i)
            n = int(n / i)
            i = i - 1
            if n == 1:
                break
    return len(l)

n = int(input())
print(PrimeFactors(n))

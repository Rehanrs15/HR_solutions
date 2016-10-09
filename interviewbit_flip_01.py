import re
def flip(A = "010"):
    #A = "".join(M)
    l = len(A)
    gen = "1"*l
    d = dict()
    x = gen and A
    if x == gen:
        return []
    else:
        for i in range(0,(l-1)):
            for j in range(i,l):
                m = A[i]
                n = A[j]
                if m == '0':
                    m = '1'
                else:
                    m = '0'
                    
                if n == '0':
                    n = '1'
                else:
                    n = '0'
                if i > 0:
                    bef = "".join(A[:j])
                else:
                    bef = ""
                aff = "".join(A[j:])
                s = bef+m+n+aff
                d[(i+1,j+1)] = len(re.findall(r'1',s))
        max_01 = max(d.values())
        for i in d.keys():
            if d.get(i) == max_01:
                print(list(i))
A = list(input())
flip(A)
        
            

def lstwordlength(A):
    if A == '':
        print(0)
    else:
        L = A.split(" ")
        s = ""
        for i in L:
            if i != '':
                s = s+i+" "
        s = s.strip().split(" ")
        print(len(s[len(s)-1]))

i = input()
lstwordlength(i)

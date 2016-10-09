def strstr(A,B):
    st1=0
    st=0
    l = list()
    while st < len(A) and st1 < len(B):
        if A[st] == B[st1]:
            st=st+1
            st1 = st1+1
        else:
            st = st+1
            st1 = 0
        if st1 == len(B) - 1:
            l.append(st - st1)
            st1=0
    print(l)
    print(max(l))
    

i = input()
j = input()
strstr(i,j)
                

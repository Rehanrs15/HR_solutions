def reverse(A):
    L = A.split(" ")
    l = len(L)
    i = l-1
    s = ""
    while i >=0 :
        if L[i] != '':
            s = s + L[i].strip() +" "
        i = i -1
    print(s)

i = input()
reverse(i)

n1,n2,n3 = map(int,input().split(" "))
s1 = list(map(int,input().split(" ")))[::-1]
s2 = list(map(int,input().split(" ")))[::-1]
s3 = list(map(int,input().split(" ")))[::-1]
s1 = [sum(s1[:i]) for i in range(1,len(s1)+1)][::-1]
s2 = [sum(s2[:i]) for i in range(1,len(s2)+1)][::-1]
s3 = [sum(s3[:i]) for i in range(1,len(s3)+1)][::-1]
for j in s1:
    if j in s2 and j in s3:
        print(j)

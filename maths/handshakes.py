def handshakes(num):
    if num == 1:
        print(0)
    else:
        s = set()
        for i in range(1,num+1):
            for j in range(i+1,num+1):
                s.add((i,j))    #(1,2) ans (2,1) are same so use set()
        print(s)
        print(len(s))

num = int(input())
handshakes(num)

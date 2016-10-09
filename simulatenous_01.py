def simultaneous(a,b,c,m,n,d):
    #calculate y
    numerator = (a*d) - (m*c)
    denominator = (a*n) + (m*b)
    y = numerator/denominator

    #calculate x
    numerator_x = c - (b*y)
    denominator_x = a
    x = numerator_x/denominator_x

    print("x =",x)
    print("y =",y)

a,b,c = map(int,input().split())
m,n,d = map(int,input().split())
simultaneous(a,b,c,m,n,d)

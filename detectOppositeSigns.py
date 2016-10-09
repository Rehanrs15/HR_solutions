def detectOppositeSigns(n1, n2):
    x = n1 * -1
    x1 = n2 * -1
    if ((x1 < 0 and x < 0) or (x > 0 and x1 > 0)):
        print("false")
    else:
        print("true")
        

n1 = int(input())
n2 = int(input())
detectOppositeSigns(n1,n2)

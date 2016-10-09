def Transpose(M):
    Mt = list()
    for i in range(len(M)):
        l = list()
        for j in range(len(M)):
            l.insert(j,M[j][i])
        Mt.append(l)
    return Mt

def RotateRight(M):
    L = 0
    H = len(M) - 1
    for i in range(len(M)):
        temp = M[i][L]
        M[i][L] = M[i][H]
        M[i][H] = temp
    return M

def RotateLeft(M):
    L = 0
    H = len(M) - 1
    for i in range(len(M)):
        temp = M[L][i]
        M[L][i] = M[H][i]
        M[H][i] = temp
    return M
        


M = [[1,2,3],[4,5,6],[7,8,9]]
M = Transpose(M)

#rotateRight
#Right = RotateRight(M)
#print(Display(Right))

#rotateLeft
Left = RotateLeft(M)
for i in range(len(Left)):
        for j in range(len(Left)):
            print(Left[i][j],end=" ")
        print("")

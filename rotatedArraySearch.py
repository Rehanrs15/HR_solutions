def Binary(A,f,l,data):
    if f > l:
        return -1

    mid = (f + l)//2
    if A[mid] == data:
        return mid
    elif A[f] <= A[mid]:
        if data >= A[f] and data < A[mid]:
            return Binary(A,f,mid-1,data)
        else:
            return Binary(A,mid+1,l,data)
    else:
        if data > A[mid] and data <= A[l]:
            return Binary(A,mid+1,l,data)
        else:
            return Binary(A,f,mid-1,data)

A = [5,4,1,2,3]
print(Binary(A,0,len(A)-1,8))

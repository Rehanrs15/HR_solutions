l = [1,2,3,4,5,6]
num = int(input("enter the number to search "))
f = 0
for i in range(len(l)):
    if l[i] == num:
        f = 1
        print("found at position ",i)
        break
if f != 1:
    print("not found")
               

class Example:
    def reverse(self,l):
        for i in range(len(l)-1,-1,-1):
            print(l[i],end=" ")

x = Example()
l = input().split(" ")
x.reverse(l)

            

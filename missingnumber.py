#-------------------------------------------------------------------------------
# Name:        module1
# Purpose:
#
# Author:      rehan r
#
# Created:     31-01-2016
# Copyright:   (c) rehan r 2016
# Licence:     <your licence>
#-------------------------------------------------------------------------------

n = int(input())
ar1 = list()
ar2 = list()

x = input()
ar1 = list(map(int,x.split()))

m = int(input())
x1 = input()
ar2 = list(map(int,x1.split()))

ar1.sort()
ar2.sort()

c1 = 0
c2 = 0
store = list()

for i in range(0,n ):
    v = ar1[i]
    c1 = ar1.count(v)
    c2 = ar2.count(v)
    if c1 != c2:
        store.append(v)
        ar1[:] = [j for j in ar1 if j!=v]
        ar2[:] = [g for g in ar2 if g!=v]
        n = n - c1
print(store,ar2)

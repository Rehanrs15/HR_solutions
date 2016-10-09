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

test_cases = int(input())
for i in range(0,test_cases):
    N_and_M = input()
    N,M = map(int,N_and_M.split())
    array = list()
    ele = input()
    array = list(map(int,ele.split()))
    possibilities = list()
    for m in range(0,N):
        for n in range(m+1,N+1):
            possibilities.append(array[m:n])
    print(possibilities,sum(possibilities[0]))

    #maximum = abs(int(possibilities[0]) % M)
'''
    maximum = 0
    for l in range(0,len(possibilities)):
        val = sum(possibilities[l]) % M
        if val > maximum:
            maximum = val
    print(maximum)
'''
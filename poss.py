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

def calculate(k,d):
    weights = list()
    for i in d.keys():
        if i <= k:
            weights.append(d.get(i))
    return sum(weights)

queries = int(input())
store = dict() #this stores the first query items "time"->"weight".
for q in range(queries):
    q_no,weight,time = map(int,input().split())
    if q_no == 1:
        store[time] = weight
    elif q_no == 2:
        weights = calculate(weight,store)
        print(weights)
    

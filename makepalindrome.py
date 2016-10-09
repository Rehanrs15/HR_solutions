t = int(input())
final = list()
for i in range(0,t):
    string = input()
    l = list(string)
    l.reverse()
    reverse = "".join(l)
    flag = 0
    index = -1
    for j in range(len(string)):
        if string[j] != reverse[j]:
            flag = 1
            if string[j] == string[j+1]:
                index = (len(string)-1) - j
            else:
                index = j
            break
    if flag == 1:
        final.append(index)
    else:
        final.append(-1)

for i in final:
    print(i)

    

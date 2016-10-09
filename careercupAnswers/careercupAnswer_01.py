import re
L = list(map(str,input().split()))
k = int(input())
string = "".join(L)
getNoOfZeros = re.findall(str(k),string)
print(len(getNoOfZeros))

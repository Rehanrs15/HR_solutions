import re
from collections import Counter
s = input()
s = re.sub(r'\s','',s)
d = Counter(s)
m = max(d,key = d.get)
print(m,d[m])

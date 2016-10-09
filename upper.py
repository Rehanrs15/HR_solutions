s = "hello world"
l = list(s.split(" "))
final = ""
for i in l:
    a = i[0].upper()
    a = a+i[1:]
    final = final+a+" "
print(final)

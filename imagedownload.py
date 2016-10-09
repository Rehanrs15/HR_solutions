import re,urllib2
i = raw_input()
response = urllib2.urlopen(i)
x = re.findall(r'<img\s+[^>]*src="([^"]*)"[^>]*>',response.read())
print(x)

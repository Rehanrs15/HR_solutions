#-------------------------------------------------------------------------------
# Name:        module1
# Purpose:
#
# Author:      rehan r
#
# Created:     02-02-2016
# Copyright:   (c) rehan r 2016
# Licence:     <your licence>
#-------------------------------------------------------------------------------

s = "rehan"
store = list()
for i in range(len(s)):
    for j in range(i,len(s)+1):
        if s[i:j] not in store:
            store.append(s[i:j])

print(store.count("r"))
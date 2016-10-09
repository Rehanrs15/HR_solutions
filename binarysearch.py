l = [1,2,3,4,5]
num = int(input())
low   = 0
high = len(l) - 1
while(low <= high):
    mid = int((low + high)/2)
    if l[mid] == num:
        print("Found at position ",mid)
        break
    elif l[mid] < num:
        low = mid + 1
    elif num < l[mid]:
        high = mid -1
    if high < low:
        print("number not found")

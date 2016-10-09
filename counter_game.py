def checkIsPower(num):
    i = 1
    while i <= num:
        i = i * 2
    return i - num

t = int(input())
i = 0
for _ in range(t):
    counter = int(input())
    while True:
        x = checkIsPower(counter)
        if x == 0:
            counter = int(counter//2)
        elif x > 0:
            counter = counter - x
        if counter == 0:
            if i % 2 == 0:
                print("Louise")
                break
            else:
                print("Richard")
                break
        i = i + 1

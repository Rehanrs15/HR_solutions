def palindrome(A):
    s = ""
    for i in A:
        if i.isalphanum():
            s = s + i.lower()
    if s == s[::-1]:
        print("palindrome")

i = input()
palindrome(i)

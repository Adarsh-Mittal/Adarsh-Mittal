str1 = input("Enter string: ")
n = len(str1)
list1 = []
j = 0
max_len = 0
max_str = "hi"
for i in range(n):
    if str1[i] == " ":
        list1.append(str1[j:i])
        j = i + 1
    if i == n - 1:
        list1.append(str1[j:i + 1])
for j in list1:
    if len(j) > max_len:
        max_len = len(j)
        max_str = j
print("The longest word in string is", max_str, "and is of length", max_len)

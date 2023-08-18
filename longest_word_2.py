str1 = input("Enter string: ")
n = len(str1)
list1 = []
j = 0
super_str = "hi"
max_len = 0
max_str = []
repeat = 0
flag = 0
num = 0
for i in range(n):
    if str1[i] == " ":
        list1.append(str1[j:i])
        j = i + 1
    if i == n - 1:
        list1.append(str1[j:i + 1])
for j in list1:
    n = len(j)
    if n > max_len:
        max_len = n
        super_str = j
        n = 0
        flag = 0
    elif n == max_len:
        if super_str == j:
            repeat += 1
        else:
            if flag > 0:
                m = len(max_str)
                for i in range(m):
                    if max_str[i] != super_str:
                        num += 1
            if num == 0:
                max_str.append(super_str)
                max_str.append(j)
            else:
                max_str.append(j)
            repeat = 0
            flag += 1

if repeat == 0 and flag == 0:
    print("The longest word in string is", super_str, "and is of length", max_len)
elif repeat > 0 and flag == 0:
    print("The longest word appears more than once i.e", super_str, "and is of length", max_len)
elif flag > 0 and repeat == 0:
    print("There are more than one word in string having maximum length and those are", max_str, "and are of length",
          max_len)

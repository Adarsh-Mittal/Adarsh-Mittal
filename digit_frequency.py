list1 = list()
num1 = int(input("Enter number: "))
n = 0
num3 = num1
n2 = 1
m = 0
while num1 != 0:
    num1 = int(num1 / 10)
    n += 1
n1 = pow(10, n - 1)

while num3 != 0:
    list1.append(int(num3 / n1))
    num3 = (num3 % n1) * 10

for i in range(n):
    for j in range(i + 1, n):
        if list1[i] == list1[j]:
            n2 += 1
    for k in range(0, i):
        if list1[k] == list1[i]:
            m += 1
    if m == 0:
        print("The number ", list1[i], " appears: ", n2)
    else:
        m = 0
    n2 = 1

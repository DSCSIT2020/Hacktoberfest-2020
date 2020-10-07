# Finding the factorial of two number and printing the the largest common factor 
N = int(input("Enter number of testcase: "))
l = list()
j = list()
k = list()
for _ in range(N):
    x,y = map(int, input().split())
    for i in range(1,x+1):
        if x%i == 0:
            l.append(i)

    for o in range(1,y+1):
        if y%o == 0:
            j.append(o)

for _ in l:
    for p in j:
        if _ == p:
            k.append(_)

print(k[-1])

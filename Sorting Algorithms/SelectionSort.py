print("enter the no. of elements:")
n = int(input())
print("enter the elements one after other separated by space:")
a = list(map(int,input().split()))
for i in range(0,n-1):
    minimum = i
    for j in range(i,n):
        if a[minimum]>a[j]:
            minimum = j
    a[i],a[minimum] = a[minimum],a[i]
print("Sorted Array is",a)

print("enter the no. of elements:")
n = int(input())
print("enter the elements one after other separated by space:")
a = list(map(int,input().split()))
for i in range(0,n-1):
    for j in range(0,n-i-1):
        if a[j]>a[j+1]:
            a[j],a[j+1]=a[j+1],a[j]
print("Sorted Array is",a)

print("enter the no. of elements:")
n = int(input())
print("enter the elements one after other separated by space:")
a = list(map(int,input().split()))
for i in range(1,n):
    key = a[i]
    j = i-1
    while j>=0 and a[j]>key:
        a[j+1] = a[j]
        j = j-1
    a[j+1] = key    
print("Sorted Array is",a)

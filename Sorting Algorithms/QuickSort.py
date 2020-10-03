def quicksort(a):
    if len(a) <= 1:
        return a
    else:
        x = a[0]
        return quicksort([elem for elem in a if elem < x]) + [x] * a.count(x) + quicksort([elem for elem in a if elem > x])

print("enter the number of elements:")
n = int(input())
print("enter the elements, separated by comma:")
a = list(map(int,input().split(',')))
print("Sorted array is", quicksort(a))

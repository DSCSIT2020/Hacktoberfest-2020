def insertion_sort(array): 
    for i in range(1, len(array)): 
        key = array[i] 
        j = i-1
        while j >=0 and key < array[j] : 
                array[j+1] = array[j] 
                j -= 1
        array[j+1] = key 
  
numbers = [9,6,5,1,5,3,6,7]
insertion_sort(numbers)
print(numbers)
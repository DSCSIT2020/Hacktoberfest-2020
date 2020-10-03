#Linear Search
'''It will Search for a number if it is present in our list.'''
'''If it is present it'll return the index position of the element.'''
'''If not present, it'll return -1.'''

def lin_Search(array, key): 
  
    for i in range(len(array)): 
  
        if array[i] == key: 
            return i
  
    return -1   


arr = []  #creating an empty list
arr_len = int(input('Enter array length : '))
print('\nEnter array elements : ')


for i in range(0, arr_len):  #adding elements to arr
 element = int(input())   
 arr.append(element)

key_to_find = int(input("Enter key to find in  array : "))

print(lin_Search(arr, key_to_find))  #passing our arr and key to function lin_Search and printing the output

from datetime import datetime
def bubbleSort(input_list):

# Swap the elements to arrange in order
    for i in range(len(input_list)-1,0,-1):
        for j in range(i):
            if input_list[j]>input_list[j+1]:
                temp = input_list[j]
                input_list[j] = input_list[j+1]
                input_list[j+1] = temp
    return input_list

def mergeSort(input_list):
	# Check if input list contains only 1 or no elements
    if len(input_list) <= 1:
        return input_list
	# Find the middle point and devide it
    middle = len(input_list) // 2
    left_list = input_list[:middle]
    right_list = input_list[middle:]

    left_list = mergeSort(left_list)
    right_list = mergeSort(right_list)
    return list(merge(left_list, right_list))

def merge(left_part,right_part):

    resultant_list = []
    while len(left_part) != 0 and len(right_part) != 0:
        if left_part[0] < right_part[0]:
            resultant_list.append(left_part[0])
            left_part.remove(left_part[0])
        else:
            resultant_list.append(right_part[0])
            right_part.remove(right_part[0])
    if len(left_part) == 0:
        resultant_list = resultant_list + right_part
    else:
        resultant_list = resultant_list + left_part
    return resultant_list


### UNCOMMENT THESE IF YOU WANT TO ENTER YOUR INPUT ###

# print("Enter your input list:")
# input_list = list(map(int,input().split()))

# input list starting from 1000 (Change if you want) to 1 in decreasing order.
input_list = [value for value in range(1000,1,-1)]

# SORT INPUT LIST USING BUBBLE SORT AND MERGE SORT ALONG WITH TIME TAKEN BY BOTH OF THEM.
bs_start_time = datetime.now().microsecond
bs_output_list = bubbleSort(input_list)
bs_stop_time = datetime.now().microsecond
print("OUTPUT LIST")
print(bs_output_list)
print("TIME TAKEN FOR SORTING (BUBBLESORT) IN MICROSECOND'S",bs_stop_time-bs_start_time,"microsec")

ms_start_time = datetime.now().microsecond
ms_output_list = mergeSort(input_list)
ms_stop_time = datetime.now().microsecond
print("OUTPUT LIST")
print(ms_output_list)
print("TIME TAKEN FOR SORTING (MERGESORT) IN MICROSECOND'S",ms_stop_time-ms_start_time,"microsec")


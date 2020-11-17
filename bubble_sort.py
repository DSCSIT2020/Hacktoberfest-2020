# bubble sort algorithm in python

def bsort(input_list):

	for i in range(len(input_list)):
		for  j in range(0,len(input_list)-i-1):
			if input_list[j] > input_list[j+1]:
				input_list[j],input_list[j+1] = input_list[j+1],input_list[j]


a = [13,2,3,17,31,1]

bsort(a)
print(a)
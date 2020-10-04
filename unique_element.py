# Problem Statement: Find the most unique non repeating element from a list
# a = [1,2,2,4,4,3,3]
# Output: 1
# Using Numpy
# Initialization Part
import numpy as np
 
a = [1,2,1,2,3,4,4,5,6,6,5]
 
# Using numpy.unique() we'll find the elements and their frequency distribution aka counts
nums, counts = np.unique(a,return_counts=True)
 
# The minimum a number will repeat will be 1. It was given in the problem statement that the number will be only a single number that doesn't repeat. Else this method returns all numbers that don't repeat
# This gives us the position of all elements that do not repeat
pos = np.where(counts == 1)
 
# With the position(s) we can now print out the non repeating numbers
print(nums[pos])
# [3]

# Using Collections 
# Initialization Part
import collections
 
a = [1,2,1,2,3,4,4,5,6,6,5]
 
y = Counter(a)
# This gives a counter object like this
# Counter({1: 2, 2: 2, 3: 1, 4: 2, 5: 2, 6: 2})
 
# Doesn't this look like a dictionary, we can now use a for loop and find the non repeating element. But wait, collections has other things too.
 
y.most_common()
# So this gives us a very convenient list like this
# [(1, 2), (2, 2), (4, 2), (5, 2), (6, 2), (3, 1)]
 
# The last element here is the non repeating one, which we will access like this
 
y.most_common()[-1][0]
# 3
 
# The whole thing can be written in one line like this:
 
collections.Counter(a).most_common()[-1][0]
# 3

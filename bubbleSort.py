#Initializing the list
myList = list(map(int, input("Enter Your List:: ").split()))

#sorting Algo
for i in range(len(myList)):
    #Swap Toggle
    isSwapped = False
    for j in range(len(myList)-1):
        if(myList[j] > myList[j+1]):
            (myList[j], myList[j+1]) = (myList[j+1], myList[j])
            isSwapped = True
    if(not(isSwapped)):
        break
print(myList)
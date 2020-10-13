import random
door=[0]*3
goat_door=[0]*2
swap=0
dont_swap=0
j=0
while(j<10):
    x=random.randint(0,2)
    door[x]="BMW"
    for i in range(0,3):
        if(i==x):
            continue
        else:
            door[i]="Goat"
            goat_door.append(i)
    choice=int(input("Enter your choice: "))
    door_open=random.choice(goat_door)
    while(door_open==choice):
        door_open=random.choice(goat_door)
    ch=input("Do you want to swap? (Y/N)  ")
    if(ch=="Y"):
        if(door[choice]=="Goat"):
            print("Congratulations, Player Wins !!!")
            swap=swap+1
        else:
            print("Player losses the game. Better luck next time.")
    else:
        if(door[choice]=="Goat"):
            print("Player losses the game. Better luck next time.")
        else:
            print("Congratulations, Player Wins !!!")
            dont_swap=dont_swap+1
    j=j+1

print("Total Swap wins: ",swap)
print("Total don't Swap wins: ",dont_swap)

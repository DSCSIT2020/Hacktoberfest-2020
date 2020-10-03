import random
guess=random.randint(1,100)

print("Lets start the game")

while(True):
    val = int(input("Enter your value: "))
    if(val>guess):
        print("your number is greater than actual number")
    else:
        print("your number is less than actual number")
    if(val==guess):
        print("you guessed the number correctly")
        break
    print("Not able to guess.. try again")

input("congratulation you won")
    

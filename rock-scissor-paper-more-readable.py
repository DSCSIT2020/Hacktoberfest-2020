#impost random module
import random

#game rule
print("Game rule:\n\tRock vs Paper => Paper Win \n\tPaper vs Scissor => Scissor Win \n\tRock vs Scissor => Rock Win")

#For play again
while True:  
    print("\nChoices are: \n\t1.Rock \n\t2.paper \n\t3.Scissor")

    choice_names = ["Rock","Paper","Scissor"]

    #This will decide how a material wins agains other
    win = {'Rock':'Scissor','Scissor':'Paper','Paper':'Rock'}

    #Computer choice    
    print("\nComputer's turn")
    print("----------------------")
    print("Computer has done secretly. Obviously You're not able to see it now")
    computer_choice = random.randint(1,3)
    

    # Print user choice
    print("\nYour turn")
    print("--------------")
    user_choice = int(input("Enter your choice: "))
    while user_choice > 3 or user_choice < 1: 
        user_choice = int(input("enter valid input: ")) 
    
    computer_material = choice_names[computer_choice-1]
    user_material = choice_names[user_choice-1]

    print("\n" + computer_material + " vs " + user_material )

    if computer_material == user_material :
        print("\nDraw")
    elif win[user_material] == computer_material:
        print(user_material + " wins. You Win")
    else:
        print(computer_material + " wins. Computer win")

        print("\nDo you want to continue (Y/N)")
        answer = input()

        if (str(answer).lower() == "n"):
            break

print("Thanks for playing")
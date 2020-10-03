#import random module
import random

#game rule
print("Game rules:\n\tRock vs Paper => Paper Wins \n\tPaper vs Scissor => Scissor Wins \n\tRock vs Scissor => Rock Wins")
#array for the choices
choiceArray = ["Rock","Paper","Scissor"]
#To keep playing
while True:
    print("\nChoices are: \n\t1.Rock \n\t2.Paper \n\t3.Scissor")

    #Computer's choice
    print("\nComputer's turn")
    print("----------------------")
    print("Computer has done secretly. Obviously You're not able to see it now")
    computer_choice = random.randint(0,2)

    # Print user choice
    print("\nYour turn")
    print("--------------")
    user_choice = int(input("Enter your choice: "))-1
    while user_choice > 2 or user_choice < 0:
        user_choice = int(input("enter valid input: "))

    print("\n" + choiceArray[computer_choice] + " vs " + choiceArray[user_choice])

    if computer_choice == user_choice:
        print("\nDraw")
    elif ((computer_choice == 1 and user_choice == 2) or (computer_choice == 2 and user_choice == 3) or (computer_choice == 3 and user_choice == 1)):
        print(choiceArray[user_choice] + " wins. You Win")
    else:
        print(choiceArray[computer_choice] + " wins. Computer wins")

    print("\nDo you want to continue (Y/N)")
    answer=input()

    if (answer == "N" or answer == "n"):
        break

print("Thanks for playing")

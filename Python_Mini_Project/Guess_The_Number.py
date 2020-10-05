import random

player_name = input("Hello There, Enter your name\n")
print(f'\nWelcome {player_name}, to the Guessing Game')
while True:
    number = random.randint(1, 20)
    print(f'{player_name}, I\'m thinking a number between 1 to 20.\nYou have 6 chances to guess it right, Good Luck')

    for guessTaken in range(0, 6):
        print("Take a guess")
        guessed_number = int(input())
        if 5 <= number - guessed_number > 0:
            print("The number is too low.")
        elif 5 > number - guessed_number > 0:
            print("The number is a little low.")
        elif 5 > guessed_number - number > 0:
            print("The number is a little high.")
        elif 5 <= guessed_number - number > 0:
            print("The number is a too high.")
        else:
            break

    if number == guessed_number:
        print(f'Well Done, {player_name} You guessed correct in {guessTaken} guesses')
    else:
        print(f'The chance is over. The number I was thinking of is {number}')

    choice = input("Do you want to play again(y/n):")
    if choice != 'y':
        print("Thank You for playing!!")
        break

import random
scoreR = int(input("How many points should me or you have to win?"))
comp, player = 0, 0
while comp < scoreR and player < scoreR:
  choice = int(input("Rock(0), Paper(1), or Scissors(2) ?"))
  cpu = random.randint(0, 2)
  if cpu == 2 and choice == 0:print("You won, I chose Scissors")
  elif cpu == 1 and choice == 0:print("You lost, I chose Paper")
  elif cpu == 0 and choice == 1:print("You won, I chose Rock")
  elif cpu == 2 and choice == 1:print("You lost, I chose Scissors")
  elif cpu == 0 and choice == 2:print("You lost, I chose Rock")
  elif cpu == 1 and choice == 2:print("You won, I chose Paper")
  else:print("Draw")
if comp > player:
  print("You lost! :(")
else:
  print("You won! :)")

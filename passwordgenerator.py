import random
import string


def passwordGenerator(length):
    characters = string.ascii_letters + string.digits
    generated = "".join(random.choice(characters) for i in range(length))
    print("Your alphanumeric password is:", generated)

inputLength = int(input("Input length of your password: "))
passwordGenerator(inputLength)

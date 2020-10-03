import string
def remove_punctuation(word):
    return word.strip(string.punctuation)

print(remove_punctuation("pleaseremove! this!!!!!?@"))
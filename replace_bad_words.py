from functools import reduce
import re
def replace_forbidden_words(text):
    return reduce(lambda x,y : re.sub('\\b('+y[0]+')\\b',y[1],x),[
        ('hitler','sniffler'),('white', 'knight'),
        ('fuck', 'truck'),('did her', 'bid her'),
        ('bitch', 'quiche'),('nigg', 'pig'),
        (' ho ', 'toe '),(' hore ', ' chore '),
        ('ass', 'bass'),('shit', 'split')],text.lower())
print(replace_forbidden_words('fuck you hitler'))
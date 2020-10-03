import sys

# Print the number and the corresponding output
def printFizzBuzz(n = 100):
    for i in range(1, n + 1):
        output = ''
        if i % 3 == 0:
            output += 'Fizz'
        if i % 5 == 0:
            output += 'Buzz'
        print(i, output)


if __name__ == '__main__':
    # If there is number specified as commandline input, 
    # use that as the limit instead of 100
    limit = sys.argv[1] if len(sys.argv) == 2 else 100
    
    if not limit.isnumeric():
        print('Invalid limit!!!')
    else:
        printFizzBuzz(int(limit))

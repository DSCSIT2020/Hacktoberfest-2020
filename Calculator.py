def add(x,y):
    return x+y
def subtract(x,y):
    return x-y
def multiply(x,y):
    return x*y
def divide(x,y):
    return x/y
def power(x,y):
    return pow(x,y)
def percentage(x,y):
    return x*100/y

print("\nOperation: ")
print("\n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Power \n6. percentage")

choice=input("Enter your choice: ")
num1=int(input("Enter the first no: "))
num2=int(input("Enter the second no: "))

if choice=='1':
    print(num1, "+", num2, "=", add(num1,num2))
elif choice=='2':
    print(num1, "-", num2, "=", subtract(num1,num2))
elif choice=='3':
    print(num1, "*", num2, "=", multiply(num1,num2))
elif choice=='4':
    print(num1, "/", num2, "=", divide(num1,num2))
elif choice=='5':
    print(num1, "^", num2, "=", power(num1,num2))
elif choice=='6':
    print(num1, "*" , "100" , "/",num2,"=",percentage(num1,num2),"%")
else:
    print("Please choose the correct option.")

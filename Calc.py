# Python program to create a simple GUI
# calculator using Tkinter

# import everything from tkinter module
from tkinter import *
# globally declare the expression variable
expression = ""


# Function to update expressiom
# in the text entry box
def press(num):
    # point out the global expression variable
    global expression

    # concatenation of string
    expression = expression + str(num)

    # update the expression by using set method
    equation.set(expression)


# Function to evaluate the final expression
def equalpress():
    # Try and except statement is used
    # for handling the errors like zero
    # division error etc.

    # Put that code inside the try block
    # which may generate the error
    try:

        global expression

        # eval function evaluate the expression
        # and str function convert the result
        # into string
        total = str(eval(expression))

        equation.set(total)

        # initialze the expression variable
        # by empty string
        expression = ""

    # if error is generate then handle
    # by the except block
    except:

        equation.set(" ERROR ")
        expression = ""


# Function to clear the contents
# of text entry box
def clear():
    global expression
    expression = ""
    equation.set("")

# Driver code
if __name__ == "__main__":

    # create a GUI window
    gui = Tk()

        # set the background colour of GUI window
    gui.configure(background="light green")

        # set the title of GUI window
    gui.title("Calculator")

        # set the configuration of GUI window
        #gui.geometry("265x125")

        # StringVar() is the variable class
        # we create an instance of this class
    equation = StringVar()

        # create the text entry box for
        # showing the expression .
    expression_field = Entry(gui,font=('arial',20,'bold'), textvariable=equation,bd=30,insertwidth=4,bg="powder blue", justify='right').grid(columnspan=4)

        # grid method is used for placing
        # the widgets at respective positions
        # in table like structure .
        #expression_field.grid(columnspan=4, ipadx=70)


        # create a Buttons and place at a particular
        # location inside the root window .
        # when user press the button, the command or
        # function affiliated to that button is executed .
    button1 = Button(gui, padx=10, bd=8, font=('arial',20,'bold'), text=' 1 ', fg='black',
                        command=lambda: press(1), height=1, width=1)
    button1.grid(row=2, column=0)

    button2 = Button(gui, padx=10, bd=8, font=('arial',20,'bold'), text=' 2 ', fg='black',
                        command=lambda: press(2), height=1, width=1)
    button2.grid(row=2, column=1)

    button3 = Button(gui, padx=10, bd=8, font=('arial',20,'bold'), text=' 3 ', fg='black',
                        command=lambda: press(3), height=1, width=1)
    button3.grid(row=2, column=2)

    button4 = Button(gui, padx=10, bd=8, font=('arial',20,'bold'), text=' 4 ', fg='black',
                        command=lambda: press(4), height=1, width=1)
    button4.grid(row=3, column=0)

    button5 = Button(gui, padx=10, bd=8, font=('arial',20,'bold'), text=' 5 ', fg='black',
                        command=lambda: press(5), height=1, width=1)
    button5.grid(row=3, column=1)

    button6 = Button(gui, padx=10, bd=8, font=('arial',20,'bold'), text=' 6 ', fg='black',
                        command=lambda: press(6), height=1, width=1)
    button6.grid(row=3, column=2)

    button7 = Button(gui, padx=10, bd=8, font=('arial',20,'bold'), text=' 7 ', fg='black',
                        command=lambda: press(7), height=1, width=1)
    button7.grid(row=4, column=0)

    button8 = Button(gui, padx=10, bd=8, font=('arial',20,'bold'), text=' 8 ', fg='black',
                        command=lambda: press(8), height=1, width=1)
    button8.grid(row=4, column=1)

    button9 = Button(gui, padx=10, bd=8, font=('arial',20,'bold'), text=' 9 ', fg='black',
                        command=lambda: press(9), height=1, width=1)
    button9.grid(row=4, column=2)

    button0 = Button(gui, padx=10, bd=8, font=('arial',20,'bold'), text=' 0 ', fg='black',
                        command=lambda: press(0), height=1, width=1)
    button0.grid(row=5, column=1)

    plus = Button(gui, padx=15, bd=8, font=('arial',20,'bold'), text=' + ', fg='black',
                        command=lambda: press("+"), height=1, width=1)
    plus.grid(row=2, column=3)

    minus = Button(gui, padx=15, bd=8, font=('arial',20,'bold'), text=' - ', fg='black',
                        command=lambda: press("-"), height=1, width=1)
    minus.grid(row=3, column=3)

    multiply = Button(gui, padx=15, bd=8, font=('arial',20,'bold'), text=' * ', fg='black',
                        command=lambda: press("*"), height=1, width=1)
    multiply.grid(row=4, column=3)

    divide = Button(gui, padx=15, bd=8, font=('arial',20,'bold'), text=' / ', fg='black',
                        command=lambda: press("/"), height=1, width=1)
    divide.grid(row=5, column=3)

    equal = Button(gui, padx=15, bd=8, font=('arial',20,'bold'), text=' = ', fg='black',
                        command=equalpress, height=1, width=1)
    equal.grid(row=5, column=2)

    clear = Button(gui, padx=15, bd=8, font=('arial',20,'bold'), text=' C ', fg='black',
                        command=clear, height=1, width=1)
    clear.grid(row=5, column=0)

        # start the GUI
    gui.mainloop()
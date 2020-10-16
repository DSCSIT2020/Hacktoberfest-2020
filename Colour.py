import turtle
import time

def draw():
    colors=['blue','red','green','yellow','orange','brown']

    turtle.pensize(50)
    turtle.bgcolor('black')
    turtle.speed(1000)

    for x in range (360):
        turtle.pencolor(colors[x % len(colors)])
        turtle.pensize(x/50)
        turtle.forward(x)
        turtle.left(50)

draw()
time.sleep(5)

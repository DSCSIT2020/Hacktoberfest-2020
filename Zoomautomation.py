#imports all packages
import pyautogui 
import time
import os

#kills all zoom activity if running
os.system('killall zoom')

#takes input of meeting ID and password
meet_id = input('meeting ID: ')
password = input('password: ')

#opens zoom app
pyautogui.press('winleft',interval=1)
pyautogui.write('zoom')
time.sleep(0.5)
pyautogui.press('enter')

#waits for zoom app to launch
time.sleep(6)

#searches for join button on screen and clicks to join button
x = pyautogui.locateCenterOnScreen('./joinButton.png')
pyautogui.click(x)

#moves to text box for writing the meetind id
pyautogui.press('enter')
pyautogui.press('tab')
pyautogui.press('tab')

#writes down the entered meeting id in the input box and moves to enter the password
pyautogui.write(meet_id)
pyautogui.press('tab')
pyautogui.press('tab')
pyautogui.press('tab')
pyautogui.press('space')
pyautogui.press('tab')
pyautogui.press('tab')
pyautogui.press('enter',interval=1)

#checks for correct meeting id
try:
	time.sleep(3)
	# if the meeting id is wrong then it will leave the meeting by searching for leave button on screen
	y = pyautogui.locateCenterOnScreen('./leave.png')
	pyautogui.click(y)
	time.sleep(2)
	#due to some error it might show wrong meeting id so after exitting the prompt we are given to enter the password
	pyautogui.press('tab')
	pyautogui.press('tab')
	# enters the password if the meeting has any password
	pyautogui.write(password)
	pyautogui.press('enter',interval = 1)
except:
	time.sleep(2)
	#if no error it simply moves to enter the password
	pyautogui.press('tab')
	pyautogui.press('tab')
	pyautogui.write(password)
	pyautogui.press('enter',interval = 1)	
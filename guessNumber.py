import random

randNumber = random.randrange(1, 10)
userGeuss = int(input("enter the guess number between range 1 to 10 "))

if (randNumber == userGeuss):
  print("Congrats ypou are correct! number is ", randNumber)
else:
  print("not correct ! number is ", randNumber)

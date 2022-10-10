# Write a table of any number
n = int(input("Enter the number of which you want the table."))
print(" **** TABLE OF {} **** ".format(n))
for i in range(1,11):
  a = n*i
  print(" {} X {} = {} ".format(n,i,a))
  i = i+1

def mini(L):
  mini = L[0]
  for i in range(len(L)):
    if (L[i] < mini):
      mini = L[i]
  return mini    

def sort(L):
  if (L==[]) or (len(L)==1):
    return L
  m = mini(L)
  L.remove(m)
  return [m]+sort(L)

n = list(map(int,input().split(",")))

print(sort(n))
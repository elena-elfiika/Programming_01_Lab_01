from math import *
n, a, b = 10, 5, 3
while (n != 0):
  d = ceil(sqrt(a))
  for i in range (3, d+1, 1):
    if (a % i == 0):
        break
    else:
      if(i+2>d+1):
        if(b == a-2):
          print(b, a)
          #print("i =",i,"d=",d) 
          n -= 1
        b = a
  a += 2
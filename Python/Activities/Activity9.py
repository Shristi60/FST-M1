List1=[1,2,3,4,5,6,7,8]
List2=[1,2,3,4,5,6,7,8]
List3=[]
for num in List1:
    if num%2!=0:
     List3.append(num)

for num in List2:
   if num%2==0:
      List3.append(num)

print(List3)
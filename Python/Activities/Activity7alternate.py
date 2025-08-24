
# take input from user to make a lits and then add

numList= input("provide list of number separated by comma :").split(",")
#this will convert it into list
sum=0
for num in numList:
 sum +=int(num)
print("the sum of numbers in the list: ", sum)

name = input ("Enter username: ")
age = int(input("Enter your age: "))

#calculate when the person turns 100
year_turn_100= 2025 +(100-age)

print (name + " will turn 100 years old in :" + str(year_turn_100))
#or
print (name + " will turn 100 years old in :{}".format(year_turn_100))


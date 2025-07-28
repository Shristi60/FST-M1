# Taking input for user names
user1 = input("Input username 1: ")
user2 = input("Input username 2: ")

# Take input from users for their choices
choice1 = input(f"Enter choice of {user1} (rock/paper/scissors): ").lower()
choice2 = input(f"Enter choice of {user2} (rock/paper/scissors): ").lower()

if choice1 == choice2:
    print("It's a tie!")

elif choice1 == "rock" and choice2 == "scissors":
    print("Rock wins!")
elif choice1 == "paper" and choice2 == "rock":
    print("Paper wins!")
elif choice1 == "scissors" and choice2 == "paper":
    print("Scissors wins!")
else:
    print("Invalid input.")

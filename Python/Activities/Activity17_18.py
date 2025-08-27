import pandas as pd

#create dataset
data = {
    "Username": ["Admin", "Charles", "Deku"],
    "Passwords": ["password", "Charl13","AllMight"]
}

# convert the data into a DataFrame
df = pd.DataFrame(data)

# write the DataFrame to a CSV file
df.to_csv("./sample.csv", index=False)

#Read the CSV file
input_data= pd.read_csv("./sample.csv")

#Activity18
#print(input_data)
#new_row=pd.DataFrame({"Username": ["Shristi"], "Passwords": ["password123"]})
#input_data = pd.concat([input_data, new_row], ignore_index=True)
#print(input_data)

#Print the values only in the Usernames column
print(input_data["Username"])
#Print the username and password of the second row
print(input_data["Username"][1], input_data["Passwords"][1])
#Sort the Usernames column data in ascending order and print data
print(input_data.sort_values(by="Username"))
#Sort the Passwords column in descending order and print data   
print(input_data.sort_values(by="Passwords", ascending=False))
import pandas as pd
from pandas import ExcelWriter

#create a dataset
data = {'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727836730"]
}

#create a dataframe
df=pd.DataFrame(data)

#create an Excel writer object and write the DataFrame to an Excel file
writer=ExcelWriter("./sample.xlsx")

#write the dataframe to excel file
df.to_excel(writer,sheet_name="Sheet1",index=False)
#close the writer
writer.close()
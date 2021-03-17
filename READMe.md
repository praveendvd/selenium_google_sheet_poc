
# selenium_google_sheet_poc

Pre-Requisite

# Enable Google sheet API and create a project:

https://developers.google.com/sheets/api/quickstart/python

# Select Desktop client as 0Auth type:

download and save the client configuration as credential.json

 # Create a new sheet:

 https://docs.google.com/spreadsheets

 use below data for the new sheet


| name | age |
|--|--|
| user1|1  |
| user2|2  |
| user3|3  |

 copy the spreed sheet id from the url: (The highlighted part)

 namdocs.google.com/spreadsheets/d/**1iHY542xESJFBY1-jEtTtEY1sICQAD6b1z8HRRgwk**/edit#gid=0

# Now update sheet id and credential.json path in

src>util>SheetsQuickStart.java

#Execution

just do mvn test on the pom.xml

# After running the code you will be asked for authorization , click proceed

# Note
   Delete the Token folder if it has expired token.

   if you created web oauth type instead of desktop then Goto https://console.cloud.google.com/ and delete oatuth client and projects and start over again

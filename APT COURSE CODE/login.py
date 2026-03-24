#predifined credentials
correct_username = "adminKE" 
correct_password = "254Secure" 

#user input
username = input("Enter username: ") 
password = input("Enter password: ") 

#validation
if username == correct_username and password == correct_password: 
    print("Access Granted") 
else: 
    print("Invalid Credentials")
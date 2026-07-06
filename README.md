# PSU SWENG-888 Using SQLite

## Description
In this assignment, you will create an Android application that allows users to visualize a list of products that are available in the database (using SQLite). The MainActivity will show the list of products available. The user will select at least three products and click on the button "Next.” It will transition the SecondActivity and pass all three (or more) products as parameters. The second activity has a button at the top (above the List or RecyclerView) where the user can click to send the information about the selected product via email. Once all the information is successfully sent, the SecondActivity will show a Toast indicating the completion, and the list of products will be empty. The product class should have the following attributes: id, name, description, seller, price, and a picture of the product. 

**Requirements**
- Create a Product class with the following attributes: id, name, description, seller, price, and a picture of the product.
- Create a SQLite database to store the product information. The database should have a table named "products" with columns for each of the product attributes.
- Implement the MainActivity to show the list of products available in the SQLite database. Use RecyclerView to display the list.
- Implement a button on the MainActivity that will transition to the SecondActivity and pass all three (or more) selected products as a parameter.
- Implement the SecondActivity to show the list of selected products and provide a button at the top to send information about the selected products via email. Use an implicit intent to send the information to the following email: sweng888mobileapps@gmail.com
- Once all the information is successfully sent to the corresponding email, the Activity should show a Toast indicating the completion, and the list of products should be deleted. Note that the products will only be removed from the ListView or Recycler View shown in the Second Activity, and not deleted from the database.

**Deliverables**
- The source code for the Android app.
- A brief write-up explaining the key design decisions and challenges faced during the development process.
- A video demonstrating the app's functionality.
- Please, submit a single PDF file containing all the required information. For the source code portion, you should provide a link to the project GitHub and invite the instructor to collaborate.

**Screenshots**
- <img width="734" height="562" alt="Screenshot 2026-07-05 at 9 25 30 PM" src="https://github.com/user-attachments/assets/927d890d-78d7-4a9f-8574-fae3751f6615" />
- <img width="745" height="574" alt="Screenshot 2026-07-05 at 9 25 38 PM" src="https://github.com/user-attachments/assets/2ae687ee-b5e4-489d-bf09-f2e8e7038bb5" />
- <img width="738" height="572" alt="Screenshot 2026-07-05 at 9 25 45 PM" src="https://github.com/user-attachments/assets/239d6721-8a42-4797-939c-0ad4acbf929c" />
- <img width="747" height="572" alt="Screenshot 2026-07-05 at 9 25 53 PM" src="https://github.com/user-attachments/assets/3927b919-5994-49c2-8cfe-ab3081839c10" />




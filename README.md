Goal: The code implements a basic Online Shopping Assistant with user authentication, item viewing, purchasing, and order processing

What each class DO:
Customer (domain): Represents a customer with details like email and password for authentication.
Item (domain): Represents an item for sale with properties such as name, price, and description.
Order (domain): Represents an order, including order details like customer, items, and status.
ItemRepository (repository): Simulates database operations for storing and retrieving items.
OrderRepository (repository): Simulates database operations for storing and retrieving orders.
AuthenticationService (service): Handles user authentication (login) by verifying email and password.
PaymentService (service): Simulates payment processing when a customer completes an order.
ShoppingService (service): Manages the shopping process, allowing users to view items, select items, and complete orders.
ShoppingAssistant : Main class for interacting with users via the console, simulating login, viewing items, and completing orders.


IDE USED: NETBEANS

how to open this in netbeans?
1. Launch NetBeans: Open the NetBeans IDE on your computer.
2. Open Project: Go to File > Open Project.
3. Select Project Folder: Browse to the folder where your project is located (e.g., OnlineShoppingSystem).
4. Click Open Project: Select the project folder and click Open Project.
5. Run the Program: After the project is loaded, right-click the OnlineShoppingSystem class in the presentation package and select Run File to start the application.

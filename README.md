# shopwareDemoShopSelenium

Simple Selenium test suite on user account registration/login/logout/basic product addition to cart functionality. The test suite captures screenshots at the end of test case run (for logging purposes).

#Tech Requirements:

 1.Java JDK 8 or higher 
 
 2.Apache Maven 
 
 3.IntelliJ IDEA (or another IDE that supports Java and Maven)

#Setup

1. Clone this repository into IntelliJ(or other IDE) workspace folder (or wherever the project can be launched by IDE)
2. Open the IDE and open the project folder
3. Navigate to the pom.xml file and install all required dependencies for the test run
4. Run the test suite on the IDE

## Test Case List


1.	//Test 001 -> navigate to login & register dashboard page test

//valid user account creation tests

1.	//Test 002 -> valid user account creation test
2.	//Test 002a -> valid user account creation test (female)

//invalid user account creation tests

//no singular input

1.	//Test 002b -> invalid user account creation test - no first name
2.	//Test 002c -> invalid user account creation test - no last name
3.	//Test 002d -> invalid user account creation test - no email address
4.	//Test 002e -> invalid user account creation test - no password
5.	//Test 002f -> invalid user account creation test - no street address
6.	//Test 002g -> invalid user account creation test - no city
7.	//Test 002h -> invalid user account creation test - no postal code
8.	//Test 002i -> invalid user account creation test - no user country
9.	//Test 002j -> invalid user account creation test - no user state

//too short singular input

1.	//Test 002k -> invalid user account creation test - too short first name (1 char)
2.	//Test 002l -> invalid user account creation test - too short last name (3 chars)
3.	//Test 002m -> invalid user account creation test - too short email (1 char - name and domain)
4.	//Test 002n -> invalid user account creation test - too short password (7 chars)
5.	//Test 002o -> invalid user account creation test - too short address (1 char)
6.	//Test 002p -> invalid user account creation test - too short city (1 char)
7.	//Test 002q -> invalid user account creation test - too short postal code (2 digits)

//too long singular input

1.	//Test 002r -> invalid user account creation test - too long first name (100 chars)
2.	//Test 002s -> invalid user account creation test - too long last name (110 chars)
3.	//Test 002t -> invalid user account creation test - too long email (100 char - name)
4.	//Test 002u -> invalid user account creation test - too long password (75 chars)
5.	//Test 002v -> invalid user account creation test - too long address (100 chars)
6.	//Test 002w -> invalid user account creation test - too long city (100 chars)
7.	//Test 002x -> invalid user account creation test - too long postal code (50 digits)

//invalid singular input format

1.	//Test 002y -> invalid user account creation test - invalid first name format (numbers and special symbols)
2.	//Test 002z -> invalid user account creation test - invalid last name format (numbers and special symbols)
3.	//Test 002aa -> invalid user account creation test - invalid email address format (missing '@')
4.	//Test 002ab -> invalid user account creation test - existing email address (already used beforehand)
5.	//Test 002ac -> invalid user account creation test - invalid address format (special symbols only)
6.	//Test 002ad -> invalid user account creation test - invalid city format (special symbols only)
7.	//Test 002ae -> invalid user account creation test - invalid postal code format (special symbols only)

//valid login / logout tests

1.	//Test 003 -> valid user account logout test
2.	//Test 004 -> valid user account login test

//invalid logout tests

//no singular input

1.	//Test 004a -> invalid user account login test - no login email
2.	//Test 004b -> invalid user account login test - no login password

//invalid singular input

1.	//Test 004c -> invalid user account login test - invalid login email
2.	//Test 004d -> invalid user account login test - invalid login password

//singular product addition to cart tests

1.	//Test 005 -> add 'Free Time & Electronics' product to cart test (as a guest)
2.	//Test 005a -> remove 'Free Time & Electronics' product from aside shopping cart test (as a guest)
3.	//Test 005b -> add 'Free Time & Electronics' product to cart test (as a registered user)

// multiple products addition to cart tests

1.	//Test 005c -> add 'Clothing' products to cart test (as a guest)
2.	//Test 005d -> add 'Clothing' products to cart test (as a registered user)

//single product addition to check out tests

1.	//Test 006 -> add 'Free Time & Electronics' product to check out test (as a guest)
2.	//Test 006a -> remove 'Free Time & Electronics' product from shopping cart page test (as a guest)
3.	//Test 006b -> add 'Free Time & Electronics' product to check out test (as a registered user)

//multiple products addition to check out tests

1.	//Test 006c -> add 'Clothing' products to check out test (as a guest)
2.	//Test 006d -> add 'Clothing' products to check out test (as a registered user)

//single product check out tests (guest)

//positive valid tests

1.	//Test 007 -> valid 'Free Time & Electronics' product check out (shipping address) test (as a guest)

//negative checkout (shipping address input) tests

//no singular input

1.	//Test 007a -> invalid 'Free Time & Electronics' product check out (shipping address) test - no first name (as a guest)
2.	//Test 007b -> invalid 'Free Time & Electronics' product check out (shipping address) test - no last name (as a guest)
3.	//Test 007c -> invalid 'Free Time & Electronics' product check out (shipping address) test - no email address (as a guest)
4.	//Test 007d -> invalid 'Free Time & Electronics' product check out (shipping address) test - no guest address (as a guest)
5.	//Test 007e -> invalid 'Free Time & Electronics' product check out (shipping address) test - no guest city (as a guest)
6.	//Test 007f -> invalid 'Free Time & Electronics' product check out (shipping address) test - no guest postal code (as a guest)
7.	//Test 007g -> invalid 'Free Time & Electronics' product check out (shipping address) test - no guest country / state (as a guest)

//too short singular input

1.	//Test 007h -> invalid 'Free Time & Electronics' product check out (shipping address) test - too short first name (as a guest)
2.	//Test 007i -> invalid 'Free Time & Electronics' product check out (shipping address) test - too short last name (as a guest)
3.	//Test 007j -> invalid 'Free Time & Electronics' product check out (shipping address) test - too short email address (as a guest)
4.	//Test 007k -> invalid 'Free Time & Electronics' product check out (shipping address) test - too short street address (as a guest)
5.	//Test 007l -> invalid 'Free Time & Electronics' product check out (shipping address) test - too short city (as a guest)
6.	//Test 007m -> invalid 'Free Time & Electronics' product check out (shipping address) test - too short postal code (as a guest)

//too long singular input

1.	//Test 007n -> invalid 'Free Time & Electronics' product check out (shipping address) test - too long first name (as a guest)
2.	//Test 007o -> invalid 'Free Time & Electronics' product check out (shipping address) test - too long last name (as a guest)
3.	//Test 007p -> invalid 'Free Time & Electronics' product check out (shipping address) test - too long email (as a guest)
4.	//Test 007q -> invalid 'Free Time & Electronics' product check out (shipping address) test - too long street address (as a guest)
5.	//Test 007r -> invalid 'Free Time & Electronics' product check out (shipping address) test - too long city (as a guest)
6.	//Test 007s -> invalid 'Free Time & Electronics' product check out (shipping address) test - too long postal code (as a guest)

//invalid singular input format

1.	//Test 007t -> invalid 'Free Time & Electronics' product check out (shipping address) test - invalid first name format (as a guest)
2.	//Test 007u -> invalid 'Free Time & Electronics' product check out (shipping address) test - invalid last name format (as a guest)
3.	//Test 007v -> invalid 'Free Time & Electronics' product check out (shipping address) test - invalid email address format (as a guest)
4.	//Test 007w -> invalid 'Free Time & Electronics' product check out (shipping address) test - existing email address (as a guest)
5.	//Test 007x -> invalid 'Free Time & Electronics' product check out (shipping address) test - invalid street address format (as a guest)
6.	//Test 007y -> invalid 'Free Time & Electronics' product check out (shipping address) test - invalid city format (as a guest)
7.	//Test 007z -> invalid 'Free Time & Electronics' product check out (shipping address) test - invalid postal code format (as a guest)

//multiple product checkout tests

1.	//Test 008 -> valid 'Clothing' products to check out (shipping address) test (as a guest)

//single product check out submission confirmation tests (guest and registered user are on the same page after shopping cart)

//positive valid tests

1.	//Test 009 -> valid 'Free Time & Electronics' product check out submission confirmation test (as a guest)
2.	//Test 009a -> valid 'Free Time & Electronics' product check out submission confirmation test  (as a registered user)

//multiple products check out submission confirmation tests (guest and registered user are on the same page after shopping cart)

1.	//Test 009b -> valid 'Clothing' products check out submission confirmation test (as a guest)
2.	//Test 009c -> valid 'Clothing' products check out submission confirmation test (as a registered user)

//negative checkout confirmation test

1.	//Test 009d -> invalid 'Free Time & Electronics' product check out submission confirmation test - don't click 'Terms and Conditions' checkbox (as a guest)
2.	//Test 009e -> invalid 'Free Time & Electronics' product check out submission confirmation test - don't click 'Terms and Conditions' checkbox (as a guest)



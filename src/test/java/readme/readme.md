## Automation tests for www.eneba.com

#### Link to the page - [www.eneba.com](https://www.eneba.com/)

1. Popup test: `Homepage`
    - Click accept privacy confirmation button;
    - Click close Discount Timer Popup button;
    - Click close Newsletter Popup button;

   Expected result: PopUps should not be visible.

   <sub> *Some popups are hardcoded with a timer to appear. Tests are given 20 seconds for popups to appear. </sub>
   
2. Login positive test: `Login Page`
    - Enter email from Data provider to "email" input;
    - Enter password from Data provider to password input ;
    - Click "Login" button;

   Expected result: The logged in username should be the same as input email.

   <sub> *The website enables captcha security after multiple login attempts. For automated tests to succeed a cooldown period is required or manual captcha input</sub>

3. Login negative test: `Login Page`
    - Enter non-existing email to "email" input;
    - Enter non-existing password to password input ;
    - Click "Login" button;

   Expected result: Login error message should be displayed.

4. Filter products with single filter option: `Marketplace page`
    - Click "DLC" button in filter type checkbox;

   Expected result: The notification filter type should contain the name "DLC" of selected checkbox.

5. Filter products with Multiple filter option: `Marketplace page`
    - Click "DLC" button in filter type checkbox;
    - Click "Strategy" button in filter genre checkbox;

   Expected result: The notification filter type and genre should contain the names of selected checkboxes.

6. Shopping cart single item test: `Marketplace page`
    - Click on first item from product list;
    - Click "Add to cart" button;
    - Click "Continue shopping" button in popup window;
    - Navigate browser back to marketplace page;
    - Click on second item from product list;
    - Click "Add to cart" button;
    - Click "View cart" button in popup window;

   Expected result: The shopping cart notification should contain that we have "2 products" added.

7. Shopping cart remove all items test: `Marketplace page`
   - Click on first item from product list;
   - Click "Add to cart" button;
   - Click "Continue shopping" button in popup window;
   - Navigate browser back to marketplace page;
   - Click on second item from product list;
   - Click "Add to cart" button;
   - Click "View cart" button in popup window;
   - Click "Remove top cart item from cart" button;
   - Click "Remove top cart item from cart" button;

   Expected result: The shopping cart popup notification should contain "Your cart is empty" message.

8. Add items to wishlist: `Marketplace page`
    - Click on first item "Add to wishlist button";
    - Click on second item "Add to wishlist button";
    - Click on third item "Add to wishlist button";
    - Click on "Wish list" button;

   Expected result: The wishlisted list should contain the names of added item names.

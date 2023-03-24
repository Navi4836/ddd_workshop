DDD Workshop done in TW.

We can find the DDD Concepts based on Usecase

**Code Problem Thread**

### Code Problem 1

Add a “Apple Pencil” to a Cart
Note:
Please do not create User class.
Please do not create ProductCategory, Variant, Colour, etc classes.


### Code Problem 2

Add a “Sony Wireless headphone” to a Cart


### Code Problem 3

Add 2 quantity of “Apple Pencil” to a Cart.


### Code Problem 4

Remove already added Item “Apple Pencil” (with all its quantities) from Cart.


### Code Problem 5

As a business User, I would like to know which Products (Product’s name) were removed from Cart.
Note: Please do not create business User class. You could have a method on Cart class or some other class, which returns list of Products names which were removed from Cart.


### Code Problem 6

As a business User, I would like to differentiate between two Carts, even if they contain same Item ( both carts have Product “Sony Wireless headphone” with 1 quantity)
Note: 
Two carts where items are same, equality on Carts should return false
```
Cart cart1 = Cart();
Cart cart2 = Cart();
Item item1 = new Item(new Product(”Sony Wireless headphone"), 1);
Item item2 = new Item(new Product(”Sony Wireless headphone"), 1);
cart1.add(item1);
cart2.add(item2);
cart1.equals(cart2) => should return false
```

### Code Problem 7

Add Price to a Product . We need support for only one currency, say - USD.
--
Note:
For modelling currency - Please use java.util.Currency (Currency.getInstance("USD")) or what your programming language provides, if none just use String for now.
new Product("Apple Pencil", new Price(...));

### Code Problem 8

As a Business User, I would like to price my product 10% below competitor price (competitor price is available for product) .
--
Note – Assume that HashMap/Dictionary of Competitor Product Name and price is available. Competitor Product name matches 1 to 1 with our Product Name.
Please do not create pricing discount logic inside Product class. Pass discounted price while creating Product.
new Product( ”Apple Pencil", Price(discountedPrice, Currency.getInstance("USD")));
new Product( ”Apple Pencil", Price(125, Currency.getInstance("USD"))) – 125 is already discount price

### Code Problem 9

Create Order(with Products) when Cart is checked out. Also, Mark Cart as checked out .
--
Note –
While Creating Order please do not use Item class but use Product class. Flatten out products in Item, that means, if Cart has Item with Product “Apple Pencil” and Quantity two, then create two Product objects for “Apple Pencil” and add them to Order’s product list.

```Order order = new Order( List<Product> products)```

### Code Problem 10:
Customer and Bank Account. ( Not related to e-commerce domain)
When Customer’s Address is updated, update all her Bank Accounts addresses as well. ( This is invariant, or business rule or consistency rule given by business)
--
Note –
Customer is Entity. Account is Entity.
Customer has List of bank accounts.
Customer has Address. Account has Address has one attribute called city.
Address is Value Object

```customer.updateAddress(new Address(“Mumbai”))```

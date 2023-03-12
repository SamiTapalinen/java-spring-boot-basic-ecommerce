### Java spring boot basic ecommerce app

This app has basic CRUD operations for basic ecommerce simulation.

Users, Products, Quotes and Orders can be manipulated with CRUD operations using the REST API.

#### Some example requests

##### http://localhost:8090/users

Get all users

##### http://localhost:8090/user

POST user

```
{
    "name": "John Doe"
}
```

#### localhost:8090/products

Get all products

#### localhost:8090/products/{sku}

Get products by SKU

#### localhost:8090/product

POST product

```
{
    "sku": "TEST",
    "name": "Test Product",
    "price": 19.99
}
```

#### localhost:8090/quotes

Get all quotes

#### localhost:8090/quote

POST quote

```
{
  "products": [
    {
      "sku": "TEST",
      "name": "Test Product",
      "price": 19.99
    },
    {
      "sku": "TEST2",
      "name": "Test Product2",
      "price": 9.99
    }
  ]
}
```

#### localhost:8090/quote/{id}

PUT quote

```
{
  "products": [
    {
      "sku": "TEST",
      "name": "Test Product",
      "price": 29.99
    }
  ]
}
```

#### localhost:8090/orders

Get all orders

#### localhost:8090/order

POST order

```
{
     "user:": {
        "name": "Sami"
    },
    "products": [
        {
            "sku": "TEST",
            "name": "Test Product",
            "price": 9.99
        },
        {
            "sku": "TEST2",
            "name": "Test Product 2",
            "price": 10.00
        }
    ]
}
```
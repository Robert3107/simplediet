# Search ingredient information by id

## Endpoint

```
localhost:8080/ingredient/{id}/information
```

## Properties

| Name           | Type        | Example  | Required  |
|----------------|-------------|----------|-----------|
| **id**         | **Long**    | **9266** | **true**  |
| **amount**     | **Integer** | **1**    | **false** |
| **addChildren** | **boolean** | **true** | **false** |

## Sample request

```
localhost:8080/ingredient/9266/information
```

## Sample respons

``` json
{
    "id": 9266,
    "original": "Ananas",
    "originalName": "Ananas",
    "name": "Ananas",
    "possibleUnits": [
        "piece",
        "slice",
        "fruit",
        "g",
        "oz",
        "cup",
        "serving"
    ],
    "consistency": "solid",
    "shoppingListUnits": [
        "pieces"
    ],
    "aisle": "Produce",
    "image": "pineapple.jpg",
    "meta": [],
    "categoryPath": [
        "tropical fruit",
        "fruit"
    ]
}
```
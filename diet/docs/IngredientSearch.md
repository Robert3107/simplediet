# Search ingredient by name

## Endpoint

```
localhost:8080/ingredient/search
```

## Properties

| Name                | Type        | Example   | Required  |
|---------------------|-------------|-----------|-----------|
| **query**           | **String**  | **pizza** | **true**  |
| **addChildren**     | **boolean** | **true**  | **false** |
| **metaInformation** | **boolean** | **true**  | **false** |
| **sortDirection**   | **String**  | **desc**  | **false** |
| **number**          | **Integer** | **3**     | **false** |

## Sample request

```
localhost:8080/ingredient/search?query=pizza&addChildren=true&number=20
```

## Sample respons

``` json
{
    "results": [
        {
            "id": 98924,
            "name": "pizza dough mix",
            "aisle": null,
            "possibleUnits": null,
            "children": []
        },
        {
            "id": 93770,
            "name": "prepared pizza crust",
            "aisle": null,
            "possibleUnits": null,
            "children": []
        },
        {
            "id": 11549,
            "name": "canned tomato sauce",
            "aisle": null,
            "possibleUnits": null,
            "children": []
        }
    ],
    "offset": 0,
    "number": 3,
    "totalResults": 10
}
```
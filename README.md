# dms-crud

## Endpoints :

List of available endpoints:

- `GET /user`
- `GET /user/:id`
- `POST /user` 
- `PUT /user`
- `DELETE /user/:id`
&nbsp;

## 1. GET /user

_Response (200 - OK)_

```json
{
    "id": "integer",
    "name": "string",
    "gender": "string",
    "age": "integer"
}
```

&nbsp;

## 2. GET /user/:id
- params:
```json
{
  "id": "integer"
}
```
_Response (200 - OK)_

```json
{
    "id": "integer",
    "name": "string",
    "gender": "string",
    "age": "integer"
}
```

&nbsp;

## 3. POST /user

Request:

- body:

```json
{
    "name": "string",
    "gender": "string",
    "age": "integer"
}
```

_Response (200 - Ok)_

```json
{
    "id": "integer",
    "name": "string",
    "gender": "string",
    "age": "integer"
}
```
&nbsp;

## 4. PUT /user

Request:

- body:

```json
{
    "id": "integer",
    "name": "string",
    "gender": "string",
    "age": "integer"
}
```

_Response (200 - Ok)_

```json
{
    "id": "integer",
    "name": "string",
    "gender": "string",
    "age": "integer"
}
```
&nbsp;

## 5. DELETE /user/:id
- params:
```json
{
  "id": "integer"
}
```
_Response (200 - OK)_

```json

```
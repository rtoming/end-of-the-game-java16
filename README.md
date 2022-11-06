HTTP request and response
- request
  - method type: eg. GET, POST, etc.
  - url parameters: eg. /me?my-name=Mariusz&my-surname=P.
  - headers
  - body of the request
- response
  - response code
  - headers
  - cookies
  - body of the response
- response codes families
  - 1xx - accepted - processing in progress
  - 2xx - OK
  - 3xx - redirects
  - 4xx - client fault
  - 5xx - server fault

REST - hierarchical resources
- CRUD (eg. incomes)
  - Read all
    - url: /incomes
    - GET http method
    - return: list of incomes resources + 200 Http return code
  - Read one item
    - url: /incomes/{id}
    - GET http method
    - return:
      - existing income: single item + 200 Http return code
      - nonexistent income: error object + 404 Http return code
  - Create:
    - url: /incomes
    - POST http method
  - Delete:
    - url: /incomes/{id}
    - DELETE http method
    - return:
      - existing income: empty body + 204 Http return code
      - nonexistent income: error object + 404 Http return code
  - Update:
    - url: /incomes/{id}
    - PUT http method - full update - replace
    - PATCH http method - partial update

MVC (Model-View-Controller) pattern

View - presenter to user
Controller - manages views
Model - data management = Service + Repository

View
Controller - manages views
Service - application/business logic
Repository - manages repository of data (db, or other repository)

Controller depends on Service depends on Repository

Project plan
Topic: Home budget
Technologies:
- Java 17
- SpringBoot 2.7.x
- Angular
- UI Library - Angular Material
- H2 db for development purposes, mySQL for production

Business requirements
1. Gathering requirements
- calculate
- show time
- income and outcome
- personal information
- log in
- statistics & graphs
- categories
----------------------------
- connection to bank
- multiple users(family)
- balance
- filter by categories
- price comparison
- statistics for every family member
- picture from receipt to scan and input the cost to app
- saving, investing
- target for savings  basically
- spending statistics
- diagram

2. Clarifications of requirements
- OK - income and outcome
  - category of income
  - category of expense
  - currency: Euros,
  - person who made income/expense
  - each event timestamp - GMT
  - name of the place
- OK personal information
  - firstname
  - surname
  - age
  - gender
  - personal ID
  - position
  - e-mail
  - phone nr
  - 2nd phone nr
  - photo
  - country
- statistics & graphs
  - user tracking activities
    - log in time
    - ip address
    - charts:
      - daily, weekly, monthly, quaterly, yearly split
      - what type of payments does it support and which category do we put it in
      - piechart for income and outcame by family members
      - piechart for expense categories
- OK - log in
  - username
  - password
  - type of the account
  - registration of new user
  - captcha
  - remember me functionality
  - forgot password
- Need to be finished - calculate
  - calculate expenses from income f.e.
  - Calculate income outcome, statistics, prices
  - wages
  - taxes
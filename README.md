# MicroServicesApp-Proxy [Spring boot app made with netflix stack]

This microservice will be the proxy layer. It has been done using zuul

1. Import the project as maven project in STS/Eclipse or your favourite IDE.
2. Before running it be sure that Eureka microservice is running (you can download from this repository: https://github.com/arturogj92/MicroServicesApp-EurekaServer)

- Money info service API [The ZUUL endpoint will be MONEYSERVICE]
  - Get current money by email: http://localhost:8092/MONEYSERVICE/money/{email} [GET]
  - Get highest expense by email: http://localhost:8092/MONEYSERVICE/highestexpense/{email} [GET]
  - Get expenses sorted by email and category: http://localhost:8092/MONEYSERVICE/expensessorted/{email}/{category} [GET]
  - Get the highest expensed category by email: http://localhost:8092/MONEYSERVICE/highestexpensedcategory/{email} [GET]
  - Get amount expensed in anual subscriptions: http://localhost:8092/MONEYSERVICE/anualsubscriptions/{email}/{year} [GET]
  
  
- Repository service API [The ZUUL endpoint will be REPO]
  - Use this POSTMAN collection: https://documenter.getpostman.com/view/752988/RWaDVAqM
**It's still under development**

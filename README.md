# MicroServicesApp-Proxy [Spring boot app made with netflix stack]

This microservice will be the proxy layer. It has been done using zuul

1. Import the project as maven project in STS/Eclipse or your favourite IDE.
2. Before running it be sure that Eureka microservice is running (you can download from this repository: https://github.com/arturogj92/MicroServicesApp-EurekaServer)

- Money info service API
  - Get current money by email: http://localhost:8092/MONEYSERVICE/money/{email}
  - Get highest expense by email: http://localhost:8092/MONEYSERVICE/highestexpense/{email}
  - Get expenses sorted by email and category: http://localhost:8092/MONEYSERVICE/expensessorted/{email}/{category}
  - Get the highest expensed category by email: http://localhost:8092/MONEYSERVICE/highestexpensedcategory/{email}
  - Get amount expensed in anual subscriptions: http://localhost:8092/MONEYSERVICE/anualsubscriptions/{email}/{year}

**It's still under development**

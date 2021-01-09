Feature: Verifying the hotel details

  Scenario Outline: Verifying the hotel login details with valid credentials
    Given Customer is on Adactin home page
    When Customer logged in with valid "<userName>" and "<password>"
    Then Customer should select hotel by filling "<location>", "<hotels>", "<roomType>", "<noOfRooms>", "<checkInDate>", "<checkOutDate>", "<adultsPerRoom>", "<childrenPerRoom>"
    And Customer book a hotel by payment with filling "<fName>", "<lName>", "<billingAddr>"
      | CreditCardNo     | CreditCardType   | Month | Year | CVV |
      | 1234567887654321 | VISA             | July  | 2015 | 099 |
      | 1238495892038482 | Master Card      | May   | 2016 | 999 |
      | 1234568998654321 | Other            | June  | 2019 | 765 |
      | 1234568998654321 | Other            | June  | 2019 | 873 |
      | 2939484811938481 | American Express | June  | 2019 | 123 |
      | 1234568998654321 | Other            | June  | 2019 | 345 |
      | 1234568998654321 | American Express | May   | 2019 | 431 |
      | 1234568998654321 | Other            | June  | 2019 | 987 |

    Examples: 
      | userName  | password | location | hotels         | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom | fName   | lName | billingAddr |
      | Balasai31 | navodaya | Sydney   | Hotel Sunshine | Double   |         1 | 17/12/2020  | 19/12/2020   |             2 |               1 | Karthik | S     | Boston      |

Feature: Verification of Adaction Hotel Booking
 Scenario: Booking a hotel in Adaction
    Given Users enters "<Username>", "<password>" and hits Search
    And  Users selects a "<location>"
    |Sydney| 
    |Melbourne| 
    |Brisbane| 
    |Adelaide| 
    |London| 
    |New York| 
    |Los Angeles|
    |Paris| 
    And Users Selects a "<hotel>" and "<roomType>"
    |Hotel Creek|Standard|
    |Hotel Sunshine|Double|
    |Hotel Hervey|Deluxe|
    |Hotel cornice|Super Deluxe|
    Then User selects a "<Number of Rooms>"
     |1-One|
     |2-Two|
     |3-Three|
     |4-Four|
     |5-Five|
     |6-Six|
     |7-Seven|
     |8-Eight|
     |9-Nine|
     |10-Ten|
    Then selects "<CheckIn date>" and "<CheckOut date>"
    And Selects "<Adults>" and "<Childern>" per room
    Adults|Childern|
    |1-One|0-None|
    |2-Two|1-One|
    |3-Three|2-Two|
    |4-Four|3-Three|
    |				|4-Four|
    

    Examples: 
     |CheckIn date|CheckOut date|
     |29-01-2021|30-01-2021|
     |3-Three|
     
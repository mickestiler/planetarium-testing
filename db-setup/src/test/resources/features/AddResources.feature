Feature: Planet and Moon Adding
  As a user I want to add new planets and moons to the Planetarium so I can update my findings

  Background:
    Given the user is logged in

  Scenario Outline: User adds a valid planet to the database with the correct file type
    When the user provides a planet with name "<name>"
    And the user provides file type "<file type>"
    Then the planet or moon "<name>" should be created successfully in the database
    Examples:
    |name                           |file type|
    |a                              |null|
    |thisisthirtylettersthatisvalid |null|
    |eternal atake                  |null|
    |eternal atake                  |null|
    |a                              |jpg|
    |thisisthirtylettersthatisvalid |jpg|
    |eternal atake                  |jpg|
    |eternal atake                  |jpg|


  Scenario Outline: User provides a valid moon to the database with a valid orbited planet id
    When the user provides a moon with name "<name>"
    And the user provides file type "<file type>"
    And the user provides an orbited planet id "<id>"
    Then the moon "<name>" should be created successfully in the database
    Examples:
      |name                              |file type|
      |b                               |null|
      |thisisthirtylettersthatisvalid  |null|
      |eternal atake                 |null|
      |eternal atake                   |null|
      |b                               |jpg|
      |thisisthirtylettersthatisvalid  |jpg|
      |eternal atake                     |jpg|
      |eternal atake                   |jpg|




  Scenario Outline: User provides an invalid planet to the database
    When the user provides a planet with name "<name>"
    Then  the user should get a browser alert saying Invalid planet name
    Examples:
      |name|
      ||
      |thisisthirtylettersthatsinvalid|
      |!|
      |Earth|
      |thisisthirtylettersthatsinvalid|
      | |
      |?|
      |Titan|

  Scenario Outline: User provides an invalid moon to the database
    When the user provides a moon with name "<name>"
    And the user provides an orbited planet id "<id>"
    Then the user should get a browser alert saying "<alert>"
    Examples:
      |name                           |id | alert             |
      |thisisthirtylettersthatsinvalid|1  |"Invalid moon name"|
      |                               |1  |"Invalid moon name"|
      |?                              |1  |"Invalid moon name"|
      |Titan                          |1  |"Invalid moon name"|
      |thisisthirtylettersthatsinvalid|10  |"Invalid planet id"|
      |                               |10  |"Invalid planet id"|
      |?                              |10  |"Invalid planet id"|
      |Titan                          |10  |"Invalid planet id"|

  Scenario Outline: User provides a valid planet/moon with the incorrect file type
    When the user provides a valid name for <entity type>
    And the user provides an invalid file type
    Then  the user should get a browser alert saying Invalid file type
    Examples:
      |entity type  |
      |planet       |
      |moon         |
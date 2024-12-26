Feature: Planet and Moon Adding
  As a user I want to add new planets and moons to the Planetarium so I can update my findings

  Background:
    Given the user is logged in

  Scenario Outline: User adds a valid planet/moon to the database with the correct file type
    When the user provides a name "<name>" for <entity type>
    And the user provides a valid file type <file type>
    Then the <entity type> "<name>" should be created successfully in the database
    Examples:
    |name                           |entity type                          |file type|
    |a                              |planet	                              |null|
    |thisisthirtylettersthatisvalid |planet	                              |null|
    |eternal atake                  |planet	                              |null|
    |eternal atake                  |planet	                              |null|
    |b                              |moon	                              |null|
    |thisisthirtylettersthatisvalid |moon	                              |null|
      |eternal atake                  |moon                              |null|
    |eternal atake                  |moon	                              |null|
    |a                              |planet	                              |jpg|
    |thisisthirtylettersthatisvalid |planet	                              |jpg|
    |eternal atake                  |planet	                              |jpg|
    |eternal atake                  |planet	                              |jpg|
    |b                              |moon	                              |jpg|
    |thisisthirtylettersthatisvalid |moon	                              |jpg|
    |eternal atake                  |moon                                 |jpg|
    |eternal atake                  |moon	                              |jpg|

  Scenario Outline: User provides an invalid planet/moon to the database
    When the user provides a name "<name>" for <entity type>
    Then  the user should get a browser alert saying Invalid "<entity type>" "<name>"
    Examples:
      |entity type                        |name|
      |planet	                          ||
      |planet                              |thisisthirtylettersthatsinvalid|
      |planet	                          |!|
      |planet                            |Earth|
      |moon	                            |thisisthirtylettersthatsinvalid|
      |moon                              | |
      |moon	                            |?|
      |moon                             |Titan|

  Scenario Outline: User provides a valid planet/moon with the incorrect file type
    When the user provides a valid name for <entity type>
    And the user provides an invalid file type
    Then  the user should get a browser alert saying Invalid file type
    Examples:
      |entity type  |
      |planet       |
      |moon         |
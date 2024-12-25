Feature: Planet and Moon Adding
  As a user I want to add new planets and moons to the Planetarium so I can update my findings

  Background:
    Given the user is logged in

  Scenario Outline: User adds a valid planet/moon to the database with the correct file type
    When the user provides a valid data for <entity type>
    And the user provides a valid file type "<file type>"
    Then the planet should be created successfully in the database
    Examples:
      |entity type                        |file type|
      |planet	                          |jpg|
      |moon	                              |jpg|
      |planet	                          |null|
      |moon	                              |null|

  Scenario Outline: User provides an invalid planet/moon to the database
    When the user provides a "<name>" for <entity type>
    Then  the user should get a browser alert saying Invalid "<entity type>" "<name>"
    Examples:
      |entity type                        |name|
      |planet	                          |abcdefghijklmnopqrstuvwxyzabcde|
      |planet                              | |
      |planet	                          |!|
      |planet                            |Earth|
      |moon	                            |abcdefghijklmnopqrstuvwxyzabcdf|
      |moon                              | |
      |moon	                            |?|
      |moon                             |Titan|

  Scenario Outline: User provides a valid planet/moon with the incorrect file type
    When the user provides a valid data for <entity type>
    Then  the user should get a browser alert saying Invalid file type "<file type>"
    Examples:
      |entity type                        |file type|
      |planet	                          |mp4|
      |moon	                              |mp4|
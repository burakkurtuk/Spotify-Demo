Feature: Play a song

  Scenario: Navigate to site and play any song

    Given navigate to url
    And click log in
    And continue with facebook
    And type username or phone number
    And type password
    And sign in
    And close cookie
    And click search
    And type any song
    And click songs
    And play a song
    And add to library
    And click library
    When click liked songs
    Then verify song

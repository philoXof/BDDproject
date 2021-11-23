Feature: infection of a city

  Scenario: First infection
    Given Paris has not bean infected
    When Paris is infected
    Then Paris' infection level should be increase to 1
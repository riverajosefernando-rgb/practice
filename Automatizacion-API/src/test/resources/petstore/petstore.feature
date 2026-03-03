Feature: PetStore API Automation

  Background:
    * url baseUrl
    * def petId = java.lang.System.currentTimeMillis()

  Scenario: Full Pet lifecycle

    # Create pet
    Given path endpoints.PET
    And def createBody = read('classpath:data/createPet.json')
    And request createBody
    When method post
    Then status 200

    # Get pet by ID
    Given path endpoints.PET, petId
    When method get
    Then status 200
    And match response.name == 'Firulais'

    # Update pet
    Given path endpoints.PET
    And def updateBody = read('classpath:data/updatePet.json')
    And request updateBody
    When method put
    Then status 200

    # Get by status
    Given path endpoints.PET_BY_STATUS
    And param status = 'sold'
    When method get
    Then status 200
    And match each response[*].status == 'sold'
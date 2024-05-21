Feature: Tira Beauty E-commerce Order Journey
@Regression @Smoke 

  Scenario: User Order Creation and Cancellation Journey
    Given a user is on the Tira Beauty platform
    When the user logs in with <phone_number> and <password>
    And the user receives an OTP and verifies it with <otp_code>
    And the user searches for <product_name>
    And adds the product to the cart
    And verifies the cart
    And adds a shipping address with <address_details>
    And retrieves and selects the address
    And retrieves the payment options
    And retrieves payment aggregator details
    And reviews the order
    And checks out
    And retrieves the order details
    And deletes the address
    And logs out
    And initiates a cancellation of the order
    Then the order cancellation is verified

  Scenario: User Order Creation with Invalid Login Details
    Given a user is on the Tira Beauty platform
    When the user tries to log in with invalid <phone_number> or <password>
    Then the login attempt should fail

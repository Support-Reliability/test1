package stepDefinitions;

import io.cucumber.java.en.*;

public class StepDefinition {

    @Given("a user is on the Tira Beauty platform")
    public void aUserIsOnTheTiraBeautyPlatform() {
        System.out.println("Executing step: a user is on the Tira Beauty platform");
    }

    @When("the user logs in with <phone_number> and <password>")
    public void theUserLogsInWithAnd(String phone_number, String password) {
        System.out.println("Executing step: the user logs in with <phone_number> and <password>");
    }

    @And("the user receives an OTP and verifies it with <otp_code>")
    public void theUserReceivesAnOtpAndVerifiesItWith(String otp_code) {
        System.out.println("Executing step: the user receives an OTP and verifies it with <otp_code>");
    }

    @And("the user searches for <product_name>")
    public void theUserSearchesFor(String product_name) {
        System.out.println("Executing step: the user searches for <product_name>");
    }

    @And("adds the product to the cart")
    public void addsTheProductToTheCart() {
        System.out.println("Executing step: adds the product to the cart");
    }

    @And("verifies the cart")
    public void verifiesTheCart() {
        System.out.println("Executing step: verifies the cart");
    }

    @And("adds a shipping address with <address_details>")
    public void addsAShippingAddressWith(String address_details) {
        System.out.println("Executing step: adds a shipping address with <address_details>");
    }

    @And("retrieves and selects the address")
    public void retrievesAndSelectsTheAddress() {
        System.out.println("Executing step: retrieves and selects the address");
    }

    @And("retrieves the payment options")
    public void retrievesThePaymentOptions() {
        System.out.println("Executing step: retrieves the payment options");
    }

    @And("retrieves payment aggregator details")
    public void retrievesPaymentAggregatorDetails() {
        System.out.println("Executing step: retrieves payment aggregator details");
    }

    @And("reviews the order")
    public void reviewsTheOrder() {
        System.out.println("Executing step: reviews the order");
    }

    @And("checks out")
    public void checksOut() {
        System.out.println("Executing step: checks out");
    }

    @And("retrieves the order details")
    public void retrievesTheOrderDetails() {
        System.out.println("Executing step: retrieves the order details");
    }

    @And("deletes the address")
    public void deletesTheAddress() {
        System.out.println("Executing step: deletes the address");
    }

    @And("logs out")
    public void logsOut() {
        System.out.println("Executing step: logs out");
    }

    @And("initiates a cancellation of the order")
    public void initiatesACancellationOfTheOrder() {
        System.out.println("Executing step: initiates a cancellation of the order");
    }

    @Then("the order cancellation is verified")
    public void theOrderCancellationIsVerified() {
        System.out.println("Executing step: the order cancellation is verified");
    }

    @When("the user tries to log in with invalid <phone_number> or <password>")
    public void theUserTriesToLogInWithInvalidOr(String phone_number, String password) {
        System.out.println("Executing step: the user tries to log in with invalid <phone_number> or <password>");
    }

    @Then("the login attempt should fail")
    public void theLoginAttemptShouldFail() {
        System.out.println("Executing step: the login attempt should fail");
    }

}

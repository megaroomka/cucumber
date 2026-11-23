package cucumberCalculator;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalculatorFeature {
    Calculator calculator;
    int a;
    int b;
    double result;
    @Given("calculator is open")
    public void openCalculator(){
        calculator = new Calculator();
    }
    @When("I enter two numbers {int} and {int}")
    public void enterTwoNumbers(int a, int b){
        this.a = a;
        this.b = b;
    }
    @And("I click sum")
    public void IClickSum(){
        this.result = calculator.sum(this.a, this.b);
    }
    @And("I click div")
    public void IClickDiv(){this.result = calculator.div(this.a, this.b);}
    @Then("the result should be {double}")
    public void assertResultEqualTo(double a){
        System.out.println(this.result);

        Assert.assertEquals(this.result, a, .0);

    }


}

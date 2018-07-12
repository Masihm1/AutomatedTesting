package com.qa.StackExample;

import static junit.framework.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StackSteps {

	private StackExample myStack;
	private Object pushed;// add
	private Object popped; // remove


	@Given("^an empty stack$")
	public void an_empty_stack() {
		myStack = new StackExample();
	}

	@Given("^a full stack$")
	public void a_full_stack() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I pop from the stack$")
	public void I_pop_from_the_stack() {
		Object out = myStack.pop();
		popped = out;
	}

	@When("^I push another item into the stack$")
	public void I_push_another_item_into_the_stack() {
		I_push_an_item_into_the_stack();
	}

	@When("^I push an item into the stack$")
	public void I_push_an_item_into_the_stack() {
		pushed = new Object();
		myStack.push(pushed);
	}

	@Then("^I get the same item back$")
	public void I_get_the_same_item_back() {
		assertEquals(pushed, popped);
	}

	@Then("^the stack contains one item$")
	public void the_stack_contains_one_item() {
		assertEquals(1, myStack.size());
	}

	@Then("^the stack contains two items$")
	public void the_stack_contains_two_items() {
		assertEquals(2, myStack.size());
	}
	}
	


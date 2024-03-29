package com.magnifyb.stepdefinition;

import com.magnifyb.businessfunctions.MagnifybBusinessFunctions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BusinessAreasSteps extends MagnifybBusinessFunctions {

//	@Given("user navigates to url")
//	public void user_navigates_to_url() {
//		navigateUrl();
//	}

	@When("user click on bussiness areas and Click on Start Financial Management Questionnaire button in Financial Management page")
	public void user_click_on_bussiness_areas_and_click_on_start_financial_management_questionnaire_button_in_financial_management_page() {
		businessAreas();
	}

	@Then("user validate Management Information")
	public void user_validate_management_information() throws Exception {
		validateManagementInformation();
	}

	@When("user is able to click on next button clicking on all answers in Management Information")
	public void user_is_able_to_click_on_next_button_clicking_on_all_answers_in_management_information()
			throws Exception {
		managementInformation();
	}

	@Then("user validate Forecasting P&L and cashflow")
	public void user_validate_forecasting_p_l_and_cashflow() throws Exception {
		validateForeCasting();
	}

	@When("user is able to click on next button clicking on all answers in Forecasting P&L and cashflow")
	public void user_is_able_to_click_on_next_button_clicking_on_all_answers_in_forecasting_p_l_and_cashflow()
			throws Exception {
		forecasting();
	}

	@Then("user validate Debtor Management")
	public void user_validate_debtor_management() throws Exception {
		validateDebtorManagement();
	}

	@When("user is able to click on next button clicking on all answers in Debtor Management")
	public void user_is_able_to_click_on_next_button_clicking_on_all_answers_in_debtor_management() throws Exception {
		debtorManagement();
	}

	@Then("user validate Creditor Management")
	public void user_validate_creditor_management() throws Exception {
		validateCreditorManagement();
	}

	@When("user is able to click on next button clicking on all answers in Creditor Management")
	public void user_is_able_to_click_on_next_button_clicking_on_all_answers_in_creditor_management() throws Exception {
		creditorManagement();
	}

	@Then("user validate Payroll\\/HR\\/Staff Management")
	public void user_validate_payroll_hr_staff_management() {

	}

	@When("user is able to click on next button clicking on all answers in Payroll\\/HR\\/Staff Management")
	public void user_is_able_to_click_on_next_button_clicking_on_all_answers_in_payroll_hr_staff_management()
			throws Exception {
		payroll();
	}

	@Then("user validate Stock Management")
	public void user_validate_stock_management() throws Exception {
		stockManagement();
	}

	@When("user is able to click on next button clicking on all answers in Stock Management")
	public void user_is_able_to_click_on_next_button_clicking_on_all_answers_in_stock_management() throws Exception {
		stockManagement();
	}

	@Then("user validate HMRC-Payments")
	public void user_validate_hmrc_payments() throws Exception {
		hmrc();
	}

	@When("user is able to click on next button clicking on all answers in HMRC-Payments")
	public void user_is_able_to_click_on_next_button_clicking_on_all_answers_in_hmrc_payments() throws Exception {
		hmrc();
	}

	@Then("user validate Fixed Assets\\/Capital Expenditure")
	public void user_validate_fixed_assets_capital_expenditure() throws Exception {
		fixedAssets();
	}

	@When("user is able to click on next button clicking on all answers in Fixed Assets\\/Capital Expenditure")
	public void user_is_able_to_click_on_next_button_clicking_on_all_answers_in_fixed_assets_capital_expenditure()
			throws Exception {
		fixedAssets();
	}

	@Then("user validate Finance")
	public void user_validate_finance() throws Exception {
		finance();
	}

	@When("user is able to click on submit button clicking on all answers in Finance")
	public void user_is_able_to_click_on_submit_button_clicking_on_all_answers_in_finance() throws Exception {
		finance();
	}

	@Then("user validate Your Business Overview, using our AI-based Scoring values")
	public void user_validate_your_business_overview_using_our_ai_based_scoring_values() throws Exception {
		businessScore();
	}

//	@Then("user close the browser")
//	public void user_close_the_browser() {
//		driver.close();
//	}

}

require 'capybara'
require 'capybara/cucumber'
require "selenium-webdriver"




Given(/^that this$/) do
  
Capybara.default_driver = :selenium
Selenium::WebDriver::Firefox::Binary.path = "/usr/bin/firefox/firefox"
	visit('https://uk.finance.yahoo.com/')
end

When(/^I  do$/) do
	sleep(10)
byebug
  Yahoo.Pages.Homepage.click
end

Then(/^this happens$/) do
  pending # Write code here that turns the phrase above into concrete actions
end



# visit 'https://uk.finance.yahoo.com/'

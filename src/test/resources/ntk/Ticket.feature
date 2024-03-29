Feature: verify user can book tickets to travel

Scenario: verify user able to fully purchase tickets for travel
Given user navigates to url "https://www.dummyticket.com/dummy-ticket-for-visa-application/"
When user enters first given name "Ali"
And user enters last given name  "Kad"
And user enters date of birth "15/02/2024"
And user selects male "Male"
And user selects female "Female"
And user selects one way trip "one way"
And user selects round trip "Round Trip"
And user selects city "Charlottesville"
And user selects destination "Houston"
And user selects departure date "13/03/2024"
And user selects purpose of ticket "Visa extension"
And user selects appointment "20/02/2024"
And user selects email option "Email"
And user enters Billing name "Graphtone"
And user enters phone number "444-555"
And user enters email address "alishan334@gmail"
And user selects country "United States"
And user enters street address "123 abc rd"
And user enters the city "Reston"
And user selects the State "Virginia"
And user types postal code "22901"
And user click paypal option to pay "Paypal"
And user click proceed to pay 

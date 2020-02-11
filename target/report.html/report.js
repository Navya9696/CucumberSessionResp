$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/Demo1.feature");
formatter.feature({
  "name": "Testing the demo web shop page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User enters Email ID and Password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the login page is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.Demo_StepDef1.the_login_page_is_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters aravind.guggilla57@gmail.com as Email ID",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.Demo_StepDef1.user_enters_aravind_guggilla57_gmail_com_as_Email_ID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter aravind as Password",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.Demo_StepDef1.user_enter_aravind_as_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.Demo_StepDef1.user_will_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Demo Web Shop page will open successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.Demo_StepDef1.demo_Web_Shop_page_will_open_successfully()"
});
formatter.result({
  "status": "passed"
});
});
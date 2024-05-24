# Test Cases for SMS Application

## Overview

This repository contains test cases for various functionalities of an application. Each test case ensures specific features work as intended, including user registration, login, SMS functionalities, and more.

## Test Cases

### 1. TC_001: Register
**Short Description:** Successful creation of new subscribers.

**Scenario Description:** Verifies that a new user can register by filling in the required fields, submitting the form, and receiving a confirmation of successful registration.

### 2. TC_002: Login
**Short Description:** Successful login of registered users.

**Scenario Description:** Verifies that a registered user can log in by entering valid credentials and accessing the dashboard or homepage without errors.

### 3. TC_003: Login with Wrong Input
**Short Description:** Unsuccessful login attempt with incorrect credentials.

**Scenario Description:** Verifies that the application handles incorrect login attempts by displaying an appropriate error message and preventing access.

### 4. TC_004: Show Remaining Balance
**Short Description:** Display the remaining balance for a logged-in user.

**Scenario Description:** Verifies that a logged-in user can view their accurate and up-to-date remaining balance on the account dashboard.

### 5. TC_005: Send SMS
**Short Description:** Successful sending of an SMS message by a user.

**Scenario Description:** Verifies that a user can send an SMS by entering a valid recipient number and message, and that the recipient receives the SMS.

### 6. TC_006: User Logout
**Short Description:** Successful logout of a logged-in user.

**Scenario Description:** Verifies that a logged-in user can log out, ending the session and redirecting them to the login page.

### 7. TC_007: View SMS Inbox
**Short Description:** Successful viewing of the SMS inbox by a logged-in user.

**Scenario Description:** Verifies that a logged-in user can view their SMS inbox, seeing details of received messages in the correct order.

## Output Summary

- **Register:** New user successfully registers and receives confirmation.
- **Login:** User logs in and accesses the dashboard/homepage.
- **Login with Wrong Input:** User receives an error message for incorrect login attempts.
- **Show Remaining Balance:** User views accurate and up-to-date remaining balance.
- **Send SMS:** User sends an SMS and the recipient receives it.
- **User Logout:** User logs out, ending the session and redirecting to the login page.
- **View SMS Inbox:** User views the SMS inbox with detailed and correctly ordered messages.

## How to Run Tests

1. Ensure the application is up and running.
2. Follow the scenario description steps for each test case.
3. Verify the expected output for each scenario.



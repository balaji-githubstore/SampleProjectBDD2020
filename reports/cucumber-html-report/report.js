$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/Testcase.feature");
formatter.feature({
  "line": 2,
  "name": "Crossword Website",
  "description": "",
  "id": "crossword-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Crossword_WebPage_RaginiBoobalan"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "To check if the user is able to register and login with valid \u0026 invalid details",
  "description": "",
  "id": "crossword-website;to-check-if-the-user-is-able-to-register-and-login-with-valid-\u0026-invalid-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC01_Register_and_Login_with_ValidInvalid_details"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "The User launch the Chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the required details to register",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "The user login using \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" with vaild and invaild deatils",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "crossword-website;to-check-if-the-user-is-able-to-register-and-login-with-valid-\u0026-invalid-details;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "crossword-website;to-check-if-the-user-is-able-to-register-and-login-with-valid-\u0026-invalid-details;;1"
    },
    {
      "cells": [
        "raginiboobalan@gmail.com",
        "ragiboo@09"
      ],
      "line": 14,
      "id": "crossword-website;to-check-if-the-user-is-able-to-register-and-login-with-valid-\u0026-invalid-details;;2"
    },
    {
      "cells": [
        "chikum09@gmail.com",
        "chikum16"
      ],
      "line": 15,
      "id": "crossword-website;to-check-if-the-user-is-able-to-register-and-login-with-valid-\u0026-invalid-details;;3"
    },
    {
      "cells": [
        "Bro@gmail.com",
        "Bro123"
      ],
      "line": 16,
      "id": "crossword-website;to-check-if-the-user-is-able-to-register-and-login-with-valid-\u0026-invalid-details;;4"
    },
    {
      "cells": [
        "ar@gmail.com",
        "AR123"
      ],
      "line": 17,
      "id": "crossword-website;to-check-if-the-user-is-able-to-register-and-login-with-valid-\u0026-invalid-details;;5"
    },
    {
      "cells": [
        "ragi@gmail.com",
        "Ragi@123"
      ],
      "line": 18,
      "id": "crossword-website;to-check-if-the-user-is-able-to-register-and-login-with-valid-\u0026-invalid-details;;6"
    },
    {
      "cells": [
        "mine@gmail.com",
        "Mine#123"
      ],
      "line": 19,
      "id": "crossword-website;to-check-if-the-user-is-able-to-register-and-login-with-valid-\u0026-invalid-details;;7"
    },
    {
      "cells": [
        "cts@gmail.com",
        "cts123"
      ],
      "line": 20,
      "id": "crossword-website;to-check-if-the-user-is-able-to-register-and-login-with-valid-\u0026-invalid-details;;8"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "To check if the user is able to register and login with valid \u0026 invalid details",
  "description": "",
  "id": "crossword-website;to-check-if-the-user-is-able-to-register-and-login-with-valid-\u0026-invalid-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC01_Register_and_Login_with_ValidInvalid_details"
    },
    {
      "line": 1,
      "name": "@Crossword_WebPage_RaginiBoobalan"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "The User launch the Chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the required details to register",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "The user login using \"raginiboobalan@gmail.com\" and \"ragiboo@09\" with vaild and invaild deatils",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterLogin_Crossword_Step.the_User_launch_the_Chrome_application()"
});
formatter.result({
  "duration": 17471696000,
  "status": "passed"
});
formatter.match({
  "location": "RegisterLogin_Crossword_Step.enter_the_required_details_to_register()"
});
formatter.result({
  "duration": 6485932100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "raginiboobalan@gmail.com",
      "offset": 22
    },
    {
      "val": "ragiboo@09",
      "offset": 53
    }
  ],
  "location": "RegisterLogin_Crossword_Step.the_user_login_using_and_with_vaild_and_invaild_deatils(String,String)"
});
formatter.result({
  "duration": 7804817100,
  "status": "passed"
});
formatter.match({
  "location": "RegisterLogin_Crossword_Step.close_the_browser()"
});
formatter.result({
  "duration": 1136595700,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "To check if the user is able to register and login with valid \u0026 invalid details",
  "description": "",
  "id": "crossword-website;to-check-if-the-user-is-able-to-register-and-login-with-valid-\u0026-invalid-details;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC01_Register_and_Login_with_ValidInvalid_details"
    },
    {
      "line": 1,
      "name": "@Crossword_WebPage_RaginiBoobalan"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "The User launch the Chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the required details to register",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "The user login using \"chikum09@gmail.com\" and \"chikum16\" with vaild and invaild deatils",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterLogin_Crossword_Step.the_User_launch_the_Chrome_application()"
});
formatter.result({
  "duration": 15588525600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterLogin_Crossword_Step.enter_the_required_details_to_register()"
});
formatter.result({
  "duration": 6634921500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "chikum09@gmail.com",
      "offset": 22
    },
    {
      "val": "chikum16",
      "offset": 47
    }
  ],
  "location": "RegisterLogin_Crossword_Step.the_user_login_using_and_with_vaild_and_invaild_deatils(String,String)"
});
formatter.result({
  "duration": 6643461500,
  "status": "passed"
});
formatter.match({
  "location": "RegisterLogin_Crossword_Step.close_the_browser()"
});
formatter.result({
  "duration": 1130129600,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "To check if the user is able to register and login with valid \u0026 invalid details",
  "description": "",
  "id": "crossword-website;to-check-if-the-user-is-able-to-register-and-login-with-valid-\u0026-invalid-details;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC01_Register_and_Login_with_ValidInvalid_details"
    },
    {
      "line": 1,
      "name": "@Crossword_WebPage_RaginiBoobalan"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "The User launch the Chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the required details to register",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "The user login using \"Bro@gmail.com\" and \"Bro123\" with vaild and invaild deatils",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterLogin_Crossword_Step.the_User_launch_the_Chrome_application()"
});
formatter.result({
  "duration": 25412649000,
  "status": "passed"
});
formatter.match({
  "location": "RegisterLogin_Crossword_Step.enter_the_required_details_to_register()"
});
formatter.result({
  "duration": 4856343900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bro@gmail.com",
      "offset": 22
    },
    {
      "val": "Bro123",
      "offset": 42
    }
  ],
  "location": "RegisterLogin_Crossword_Step.the_user_login_using_and_with_vaild_and_invaild_deatils(String,String)"
});
formatter.result({
  "duration": 6688506100,
  "status": "passed"
});
formatter.match({
  "location": "RegisterLogin_Crossword_Step.close_the_browser()"
});
formatter.result({
  "duration": 1176477400,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "To check if the user is able to register and login with valid \u0026 invalid details",
  "description": "",
  "id": "crossword-website;to-check-if-the-user-is-able-to-register-and-login-with-valid-\u0026-invalid-details;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC01_Register_and_Login_with_ValidInvalid_details"
    },
    {
      "line": 1,
      "name": "@Crossword_WebPage_RaginiBoobalan"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "The User launch the Chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the required details to register",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "The user login using \"ar@gmail.com\" and \"AR123\" with vaild and invaild deatils",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterLogin_Crossword_Step.the_User_launch_the_Chrome_application()"
});
formatter.result({
  "duration": 16786861100,
  "status": "passed"
});
formatter.match({
  "location": "RegisterLogin_Crossword_Step.enter_the_required_details_to_register()"
});
formatter.result({
  "duration": 6685435800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ar@gmail.com",
      "offset": 22
    },
    {
      "val": "AR123",
      "offset": 41
    }
  ],
  "location": "RegisterLogin_Crossword_Step.the_user_login_using_and_with_vaild_and_invaild_deatils(String,String)"
});
formatter.result({
  "duration": 6706479000,
  "status": "passed"
});
formatter.match({
  "location": "RegisterLogin_Crossword_Step.close_the_browser()"
});
formatter.result({
  "duration": 1242111100,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "To check if the user is able to register and login with valid \u0026 invalid details",
  "description": "",
  "id": "crossword-website;to-check-if-the-user-is-able-to-register-and-login-with-valid-\u0026-invalid-details;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC01_Register_and_Login_with_ValidInvalid_details"
    },
    {
      "line": 1,
      "name": "@Crossword_WebPage_RaginiBoobalan"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "The User launch the Chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the required details to register",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "The user login using \"ragi@gmail.com\" and \"Ragi@123\" with vaild and invaild deatils",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterLogin_Crossword_Step.the_User_launch_the_Chrome_application()"
});
formatter.result({
  "duration": 20570856900,
  "status": "passed"
});
formatter.match({
  "location": "RegisterLogin_Crossword_Step.enter_the_required_details_to_register()"
});
formatter.result({
  "duration": 5225664200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ragi@gmail.com",
      "offset": 22
    },
    {
      "val": "Ragi@123",
      "offset": 43
    }
  ],
  "location": "RegisterLogin_Crossword_Step.the_user_login_using_and_with_vaild_and_invaild_deatils(String,String)"
});
formatter.result({
  "duration": 6739158600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterLogin_Crossword_Step.close_the_browser()"
});
formatter.result({
  "duration": 1115703700,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "To check if the user is able to register and login with valid \u0026 invalid details",
  "description": "",
  "id": "crossword-website;to-check-if-the-user-is-able-to-register-and-login-with-valid-\u0026-invalid-details;;7",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC01_Register_and_Login_with_ValidInvalid_details"
    },
    {
      "line": 1,
      "name": "@Crossword_WebPage_RaginiBoobalan"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "The User launch the Chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the required details to register",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "The user login using \"mine@gmail.com\" and \"Mine#123\" with vaild and invaild deatils",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterLogin_Crossword_Step.the_User_launch_the_Chrome_application()"
});
formatter.result({
  "duration": 19259711800,
  "status": "passed"
});
formatter.match({
  "location": "RegisterLogin_Crossword_Step.enter_the_required_details_to_register()"
});
formatter.result({
  "duration": 6717141000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mine@gmail.com",
      "offset": 22
    },
    {
      "val": "Mine#123",
      "offset": 43
    }
  ],
  "location": "RegisterLogin_Crossword_Step.the_user_login_using_and_with_vaild_and_invaild_deatils(String,String)"
});
formatter.result({
  "duration": 6742123100,
  "status": "passed"
});
formatter.match({
  "location": "RegisterLogin_Crossword_Step.close_the_browser()"
});
formatter.result({
  "duration": 1158120200,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "To check if the user is able to register and login with valid \u0026 invalid details",
  "description": "",
  "id": "crossword-website;to-check-if-the-user-is-able-to-register-and-login-with-valid-\u0026-invalid-details;;8",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC01_Register_and_Login_with_ValidInvalid_details"
    },
    {
      "line": 1,
      "name": "@Crossword_WebPage_RaginiBoobalan"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "The User launch the Chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the required details to register",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "The user login using \"cts@gmail.com\" and \"cts123\" with vaild and invaild deatils",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterLogin_Crossword_Step.the_User_launch_the_Chrome_application()"
});
formatter.result({
  "duration": 39926954700,
  "status": "passed"
});
formatter.match({
  "location": "RegisterLogin_Crossword_Step.enter_the_required_details_to_register()"
});
formatter.result({
  "duration": 6262398200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cts@gmail.com",
      "offset": 22
    },
    {
      "val": "cts123",
      "offset": 42
    }
  ],
  "location": "RegisterLogin_Crossword_Step.the_user_login_using_and_with_vaild_and_invaild_deatils(String,String)"
});
formatter.result({
  "duration": 6810418400,
  "status": "passed"
});
formatter.match({
  "location": "RegisterLogin_Crossword_Step.close_the_browser()"
});
formatter.result({
  "duration": 1111436900,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "To check if the user is able to search for books to add cart (Failed Condition)",
  "description": "",
  "id": "crossword-website;to-check-if-the-user-is-able-to-search-for-books-to-add-cart-(failed-condition)",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@TC02_Search_for_the_books_to_add_cart"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "User launch the Chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "Open the Crossword Home page and login",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Click bestseller icon, click book and buy the book",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "View the cart book",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Close the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCart_Crossword_Step.user_launch_the_Chrome_application()"
});
formatter.result({
  "duration": 9904648900,
  "status": "passed"
});
formatter.match({
  "location": "SearchCart_Crossword_Step.open_the_Crossword_Home_page_and_login()"
});
formatter.result({
  "duration": 10990991600,
  "status": "passed"
});
formatter.match({
  "location": "SearchCart_Crossword_Step.click_bestseller_icon_click_book_and_buy_the_book()"
});
formatter.result({
  "duration": 121287843300,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"content-slot\"]/div[4]/div/div/div/div[2]/div/a/img\"}\n  (Session info: chrome\u003d80.0.3987.149)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-IB96CGO\u0027, ip: \u0027192.168.1.10\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.149, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\user\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:53276}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 349001dd249e60900d048745331c87a8\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"content-slot\"]/div[4]/div/div/div/div[2]/div/a/img}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.Crossword.Pages.SearchCart_Crossword_Page.selectBook(SearchCart_Crossword_Page.java:61)\r\n\tat com.Crossword.StepDefinition.SearchCart_Crossword_Step.click_bestseller_icon_click_book_and_buy_the_book(SearchCart_Crossword_Step.java:32)\r\n\tat ✽.Then Click bestseller icon, click book and buy the book(src/main/resources/feature/Testcase.feature:26)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "SearchCart_Crossword_Step.view_the_cart_book()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SearchCart_Crossword_Step.close_the_Browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 31,
  "name": "To check if the user is able to handle window handling",
  "description": "",
  "id": "crossword-website;to-check-if-the-user-is-able-to-handle-window-handling",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@TC03_WindowHandling_Functionality"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "User Launch the Chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "Open the Crossword Home page and Login",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "User view the award details using window handling",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "close the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "WindowHandle_Crossword_Step.user_Launch_the_Chrome_application()"
});
formatter.result({
  "duration": 11125094000,
  "status": "passed"
});
formatter.match({
  "location": "WindowHandle_Crossword_Step.open_the_Crossword_Home_page_and_Login()"
});
formatter.result({
  "duration": 12084742700,
  "status": "passed"
});
formatter.match({
  "location": "WindowHandle_Crossword_Step.user_view_the_award_details_using_window_handling()"
});
formatter.result({
  "duration": 118704822600,
  "status": "passed"
});
formatter.match({
  "location": "WindowHandle_Crossword_Step.close_the_Browser()"
});
formatter.result({
  "duration": 2008798100,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "To check if the user is able to handle slider and scroll",
  "description": "",
  "id": "crossword-website;to-check-if-the-user-is-able-to-handle-slider-and-scroll",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 37,
      "name": "@TC04_Slider_and_Scrolling_functionality"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "User Launch the Chrome Application",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "Open the Crossword Home Page and Login",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "User slider the price range",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "User scroll the page",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "SliderScroll_Crossword_Step.user_Launch_the_Chrome_Application()"
});
formatter.result({
  "duration": 18604148100,
  "status": "passed"
});
formatter.match({
  "location": "SliderScroll_Crossword_Step.open_the_Crossword_Home_Page_and_Login()"
});
formatter.result({
  "duration": 12339904300,
  "status": "passed"
});
formatter.match({
  "location": "SliderScroll_Crossword_Step.user_slider_the_price_range()"
});
formatter.result({
  "duration": 7699824700,
  "status": "passed"
});
formatter.match({
  "location": "SliderScroll_Crossword_Step.user_scroll_the_page()"
});
formatter.result({
  "duration": 3949131200,
  "status": "passed"
});
formatter.match({
  "location": "SliderScroll_Crossword_Step.close_the_browser()"
});
formatter.result({
  "duration": 7055239700,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "To check if the user is able to update profile and add new address",
  "description": "",
  "id": "crossword-website;to-check-if-the-user-is-able-to-update-profile-and-add-new-address",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 45,
      "name": "@TC05_Update_profile_and_new_address"
    }
  ]
});
formatter.step({
  "line": 47,
  "name": "User launch the Chrome Application",
  "keyword": "Given "
});
formatter.step({
  "line": 48,
  "name": "Open the crossword Home Page and Login",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "User update the profile details",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "User add the new address",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "Close The Browser",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileAddress_Crossword_Step.user_launch_the_Chrome_Application()"
});
formatter.result({
  "duration": 10776180800,
  "status": "passed"
});
formatter.match({
  "location": "ProfileAddress_Crossword_Step.open_the_crossword_Home_Page_and_Login()"
});
formatter.result({
  "duration": 15311693000,
  "status": "passed"
});
formatter.match({
  "location": "ProfileAddress_Crossword_Step.user_update_the_profile_details()"
});
formatter.result({
  "duration": 10391940500,
  "status": "passed"
});
formatter.match({
  "location": "ProfileAddress_Crossword_Step.user_add_the_new_address()"
});
formatter.result({
  "duration": 14831547100,
  "status": "passed"
});
formatter.match({
  "location": "ProfileAddress_Crossword_Step.close_The_Browser()"
});
formatter.result({
  "duration": 7309512800,
  "status": "passed"
});
});
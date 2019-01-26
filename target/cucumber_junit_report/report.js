$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("flipkart.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Amit Dhanke"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Test Flipkart for E2E",
  "description": "",
  "id": "test-flipkart-for-e2e",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@FlipKart_TC1"
    }
  ]
});
formatter.scenarioOutline({
  "line": 23,
  "name": "Search for product and validte the price",
  "description": "",
  "id": "test-flipkart-for-e2e;search-for-product-and-validte-the-price",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@FlipKart_TC1"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "sing in flipkart with \"\u003cmobileNo\u003e\",\"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "enter \"\u003cproductCatagory\u003e\",\"\u003cproductName\u003e\" for search",
  "keyword": "When "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "test-flipkart-for-e2e;search-for-product-and-validte-the-price;",
  "rows": [
    {
      "cells": [
        "mobileNo",
        "password",
        "status",
        "productCatagory",
        "productName"
      ],
      "line": 28,
      "id": "test-flipkart-for-e2e;search-for-product-and-validte-the-price;;1"
    },
    {
      "cells": [
        "7387585699",
        "Dad.9822898593",
        "success",
        "mobiles",
        "Redmi Note 6 Pro (Blue, 64 GB) OnlyOnFlipkart"
      ],
      "line": 29,
      "id": "test-flipkart-for-e2e;search-for-product-and-validte-the-price;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 29,
  "name": "Search for product and validte the price",
  "description": "",
  "id": "test-flipkart-for-e2e;search-for-product-and-validte-the-price;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@FlipKart_TC1"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "sing in flipkart with \"7387585699\",\"Dad.9822898593\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "enter \"mobiles\",\"Redmi Note 6 Pro (Blue, 64 GB) OnlyOnFlipkart\" for search",
  "matchedColumns": [
    3,
    4
  ],
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "7387585699",
      "offset": 23
    },
    {
      "val": "Dad.9822898593",
      "offset": 36
    }
  ],
  "location": "FlipkartStepDefination.singInFlipKart(String,String)"
});
formatter.result({
  "duration": 921001956,
  "error_message": "java.lang.IllegalArgumentException: Can not set io.appium.java_client.android.AndroidElement field pages.LoginPage.prepopulatedMobileNumber to org.openqa.selenium.remote.RemoteWebElement$$EnhancerByCGLIB$$d27c0df4\r\n\tat sun.reflect.UnsafeFieldAccessorImpl.throwSetIllegalArgumentException(Unknown Source)\r\n\tat sun.reflect.UnsafeFieldAccessorImpl.throwSetIllegalArgumentException(Unknown Source)\r\n\tat sun.reflect.UnsafeObjectFieldAccessorImpl.set(Unknown Source)\r\n\tat java.lang.reflect.Field.set(Unknown Source)\r\n\tat org.openqa.selenium.support.PageFactory.proxyFields(PageFactory.java:117)\r\n\tat org.openqa.selenium.support.PageFactory.initElements(PageFactory.java:105)\r\n\tat pages.LoginPage.\u003cinit\u003e(LoginPage.java:21)\r\n\tat stepDefination.FlipkartStepDefination.\u003cinit\u003e(FlipkartStepDefination.java:10)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.picocontainer.injectors.AbstractInjector.newInstance(AbstractInjector.java:145)\r\n\tat org.picocontainer.injectors.ConstructorInjector$1.run(ConstructorInjector.java:342)\r\n\tat org.picocontainer.injectors.AbstractInjector$ThreadLocalCyclicDependencyGuard.observe(AbstractInjector.java:270)\r\n\tat org.picocontainer.injectors.ConstructorInjector.getComponentInstance(ConstructorInjector.java:364)\r\n\tat org.picocontainer.injectors.AbstractInjectionFactory$LifecycleAdapter.getComponentInstance(AbstractInjectionFactory.java:56)\r\n\tat org.picocontainer.behaviors.AbstractBehavior.getComponentInstance(AbstractBehavior.java:64)\r\n\tat org.picocontainer.behaviors.Stored.getComponentInstance(Stored.java:91)\r\n\tat org.picocontainer.DefaultPicoContainer.getInstance(DefaultPicoContainer.java:699)\r\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:647)\r\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:678)\r\n\tat cucumber.runtime.java.picocontainer.PicoFactory.getInstance(PicoFactory.java:40)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:678)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\r\n\tat ✽.Given sing in flipkart with \"7387585699\",\"Dad.9822898593\"(flipkart.feature:24)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "mobiles",
      "offset": 7
    },
    {
      "val": "Redmi Note 6 Pro (Blue, 64 GB) OnlyOnFlipkart",
      "offset": 17
    }
  ],
  "location": "FlipkartStepDefination.searchProducts(String,String)"
});
formatter.result({
  "status": "skipped"
});
});
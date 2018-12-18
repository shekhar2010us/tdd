## 1 Overview
We will walk through a simple BDD (Behavior Driven Development) using Cucumber.
 

## 2 Getting Started

#### Installation

##### 2.1 For unix

Use maven cucumber-archetype to create a blank cucumber project
```code
mvn archetype:generate  -DarchetypeGroupId=io.cucumber -DarchetypeArtifactId=cucumber-archetype -DarchetypeVersion=2.3.1.2 -DgroupId=hellocucumber -DartifactId=hellocucumber -Dpackage=hellocucumber -Dversion=1.0.0-SNAPSHOT  -DinteractiveMode=false                  
cd hellocucumber/
```

##### 2.2 For windows
https://docs.cucumber.io/installation/

##### 2.3 For use in IDE (eclipse or intellij)

> Install plugin

> Add maven dependency

```code
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java8</artifactId>
        <version>4.2.0</version>
        <scope>test</scope>
    </dependency>
```


## 3 Check cucumber installation
We will use (2.1) in this tutorial.

```code
cd hellocucumber/
mvn test
```

You will see cucumber related tests, though they are empty for now.


## 4 Cucumber

In Cucumber, an example is called a scenario.

Scenarios are defined in (.feature) files, which are stored in the src/test/resources/hellocucumber directory (or a subdirectory).

Create a file `src/test/resources/hellocucumber/is_it_friday_yet.feature` with the below content

```
Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario: Sunday isn't Friday
    Given today is Sunday
    When I ask whether it's Friday yet
    Then I should be told "Nope"
```


The first line of this file starts with the keyword **Feature**: followed by a name. It’s a good idea to use a name similar to the file name.

The second line is a brief description of the feature. Cucumber does not execute this line, it’s just documentation.

The fourth line, **Scenario**: Sunday is not Friday is a scenario, which is a concrete example illustrating how the software should behave.

The last three lines starting with **Given**, **When** and **Then** are the steps of our scenario. This is what Cucumber will execute.

```code
mvn test
```

When you will run `mvn test`, it will skip the test and would say that the scenario and steps are undefined


**Useful Links:**

https://docs.cucumber.io/gherkin/reference/
<br>
https://docs.cucumber.io/bdd/example-mapping/


## 5 Implement Scenario and Steps

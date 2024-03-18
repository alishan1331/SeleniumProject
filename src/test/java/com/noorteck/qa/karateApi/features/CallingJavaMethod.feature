Feature: Calling Java Methods

  # 1.  We need to create an object/variable using def
  # 2.  We need to set the object/variable equal to Java.type()
  # 3.  Inside Java.type() we need to pass the packageName.className as a parameter
  # 4a. if the method is STATIC then we need to simply call by ObjectName.staticMethodName()
  # 4b. If the method is NON-STATIC then we need to use new keyword and call by objectName.nonStaticMethodName()
  # 5.  We need to store returned value in a variable by create def variableName
  
  
  #1.  Call non-static Java method (non-void)
  @javamethod
  Scenario: Calling non-static java method
    * def javaClassObj = Java.type('com.noorteck.qa.karateApi.features.ApiUtils')
    * def result = new javaClassObj().convertToCaps('b11 loves karate api')
    * print result

  #2. Call static Java method ( non-void)
  @javamethod
  Scenario: Calling static java method
    * def javaClassObj = Java.type('com.noorteck.qa.karateApi.features.ApiUtils')
    * def result = javaClassObj.convertToLower('B11 LOVES KARATE API')
    * print result

  #3. Call non-static Java method (void)
  @javamethod
  Scenario: Calling non-static java method
    * def javaClassObj = Java.type('com.noorteck.qa.karateApi.features.ApiUtils')
    * def result = new javaClassObj().combineStr('Reston', 'VA')
    * print result

  # Call static Java method (void)
  @javamethod
  Scenario: Calling static java method
    * def javaClassObj = Java.type('com.noorteck.qa.karateApi.features.ApiUtils')
    * def result = javaClassObj.getFirstCharacter('Java')
    * print result

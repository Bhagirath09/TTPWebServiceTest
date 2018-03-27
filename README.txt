I have created framework in below Environment 

Selenium Webdriver - 3.8.1
IntelliJ IDEA 2017.3.3
Language - Java (1.8)
Build - Maven 4
Tools - TestNg 6.10
Windows 10 - 64Bit


In src/main/java there is a TTPWebServiceTest directory in which:

	- Test data is coming from property files located under test/Resources/Properties. 
	  In LoadProp class property file loading configuration is there.

In src/test/java there is a org.apache.axis2.getuklocationbycounty.UKLocationStub directory in which:

	- I have used Axis2 to automate this SOAP test. I have created Stub to be used as a client to generate the web service request.
	  I have named stub as UKLocationStub.

    - Since I have used Axis 2 to create stub class, it will require its library files which I have included in this project (in lib folder) for ready reference.

In src/test/java there is a TTPWebServiceTest directory in which:

	- There is a WebServiceTest class which which contains solution to Excersie 3 - Web Service Test.

	  
  



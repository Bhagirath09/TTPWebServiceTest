package TTPWebServiceTest;


import org.apache.axis2.getuklocationbycounty.UKLocationStub;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebServiceTest {

    //Automate the retrieval of a UK location from a county given as a parameter and
    //validate that the result matches a second string, also given as parameter.

    LoadProp loadProp = new LoadProp();

    @Test
    public void getUKLocationByCounty(){

        UKLocationStub stub;
        UKLocationStub.GetUKLocationByCounty county;
        UKLocationStub.GetUKLocationByCountyResponse response = null;
        
        try {

            //Create the stub object by passing the service end point url
            stub = new UKLocationStub(loadProp.getProperty("endpoint"));

            //GetUKLocationByCounty is the class which we have to use
            //county object will be the parameter for the operation
            county = new UKLocationStub.GetUKLocationByCounty();

            county.setCounty(loadProp.getProperty("county"));

            //Create the GetUKLocationByCountyResponse object, which is going to be used to catch the response
            //call the response service using the stub object
            response = stub.getUKLocationByCounty(county);

            //We can use the response object to retrieve the data of the response Service
            System.out.println("Kent County places : " + response.getGetUKLocationByCountyResult());

        } catch (Exception e) {
            e.printStackTrace();
        }

        //Validating result matches string i.e. Tunstall and ME9 passed through parameter
        String actual = response.getGetUKLocationByCountyResult();
        Assert.assertTrue(actual.contains(loadProp.getProperty("kentTown")), "Could not found any Kent town");
        Assert.assertTrue(actual.contains(loadProp.getProperty("kentPostcode")), "Could not found any Kent PostCode");

    }
}
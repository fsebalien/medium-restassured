package services.pet;

import helpers.PetStoreHelper;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class CreatePetTest {
    PetStoreHelper petStoreHelper = new PetStoreHelper();

    Random random = new Random();
    Integer petId = random.nextInt(10);
    String petName = "Pet ";
    String[] status = {"available", "pending", "sold"};

    @Test
    public void createPetHappyPath() {
        Response response = petStoreHelper.createPet(petId, petName, status[0]);
        assertEquals("Status Check Fail!", 200, response.getStatusCode());

        Assert.assertEquals((int) petId, response.jsonPath().getInt("id"));
        Assert.assertEquals(response.jsonPath().getString("name"), petName);
        Assert.assertEquals(response.jsonPath().getString("status"), status[0]);
    }
}

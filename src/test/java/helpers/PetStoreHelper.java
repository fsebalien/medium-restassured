package helpers;

import client.RestAssuredClient;
import config.APIConstants;
import io.restassured.response.Response;
import models.request.CreatePetRequest;
import models.response.CreatePetResponse;

public class PetStoreHelper extends RestAssuredClient {
    public PetStoreHelper() {
        super(APIConstants.PetStore.BASE_URL);
    }

    public CreatePetResponse createPetResponse(Integer id, String name, String status) {
        CreatePetRequest.Category category = CreatePetRequest.Category.newBuilder().build();
        CreatePetRequest.Tag tag = CreatePetRequest.Tag.newBuilder().build();
        CreatePetRequest createPetRequest = CreatePetRequest.newBuilder()
                .withId(id)
                .withCategory(category)
                .withName(name)
                .addTags(tag)
                .withStatus(status).build();
        Response response = post("pet", createPetRequest);
        return response.body().as(CreatePetResponse.class);
    }

    public Response createPet(Integer id, String name, String status) {
        CreatePetRequest.Category category = CreatePetRequest.Category.newBuilder().build();
        CreatePetRequest.Tag tag = CreatePetRequest.Tag.newBuilder().build();
        CreatePetRequest createPetRequest = CreatePetRequest.newBuilder()
                .withId(id)
                .withCategory(category)
                .withName(name)
                .addTags(tag)
                .withStatus(status).build();
        return post("pet", createPetRequest);
    }
}

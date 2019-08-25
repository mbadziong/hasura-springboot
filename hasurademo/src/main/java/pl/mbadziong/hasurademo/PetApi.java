package pl.mbadziong.hasurademo;

import graphql.pl.mbadziong.PetQueries;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PetApi {

    private static final String ENDPOINT = "http://graphql-engine:8080/v1/graphql";

    @GetMapping("/")
    public List<PetQueries.PetQuery.Result.pet> getAllPets() {
        var result = PetQueries.PetQuery.builder().build().request(ENDPOINT).post();
        return result.getPet();
    }

    @PostMapping("/")
    public PetQueries.PetMutation.Result.insert_pet addPet(String name) {
        var result = PetQueries.PetMutation.create(name).request(ENDPOINT).post();
        return result.getInsert_pet();
    }
}

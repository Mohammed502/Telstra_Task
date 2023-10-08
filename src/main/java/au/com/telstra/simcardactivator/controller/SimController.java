package au.com.telstra.simcardactivator.controller;


import org.springframework.http.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import au.com.telstra.simcardactivator.payload.ActivateSimRequest;
import au.com.telstra.simcardactivator.payload.ActivateSimRssponse;

@RestController
public class SimController {
private final RestTemplate restTemplate;

    public SimController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostMapping("/activateSimCard")
    ActivateSimRssponse simActivation(@RequestBody ActivateSimRequest request){
        String url="http://localhost:8444/actuate";

        ResponseEntity<ActivateSimRssponse> response=restTemplate.postForEntity(
                url,
                request,
                ActivateSimRssponse.class
        );

 return response.getBody();
    }

}

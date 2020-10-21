package com.ecom.transportserv.service;

import com.ecom.transportserv.domain.ClosureDateDTO;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class RestService {


    public void getRestJson() throws Exception {

        RestTemplate restTemplate = new RestTemplateBuilder().build();


        ClosureDateDTO cdDTO = restTemplate.getForObject("", ClosureDateDTO.class);


        if (cdDTO != null) {
            JsonNode jsonTree = new ObjectMapper().readTree(cdDTO.getAccountPreferenceDataLists().get(0).getPreference());
            System.out.println(cdDTO.getAccountPreferenceDataLists().get(0));
        }


    }

}
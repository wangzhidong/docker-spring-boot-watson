package com.ibm.dockerspringbootwatson.controller;

import com.ibm.dockerspringbootwatson.service.WatsonService;
import com.ibm.watson.developer_cloud.natural_language_classifier.v1.model.Classification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZhiDongWang on 9/13/2017.
 */
@RestController
public class WatsonController {

    @Autowired
    private WatsonService watsonService;

    @GetMapping("nlc/{inputText}")
    public Classification getClassification(@PathVariable String inputText){
        return watsonService.getClassification(inputText);
    }

}

package com.ibm.dockerspringbootwatson.service;

import com.ibm.watson.developer_cloud.natural_language_classifier.v1.NaturalLanguageClassifier;
import com.ibm.watson.developer_cloud.natural_language_classifier.v1.model.Classification;
import org.springframework.stereotype.Component;

/**
 * Created by ZhiDongWang on 9/13/2017.
 */
@Component
public class WatsonService {

    private static NaturalLanguageClassifier service = null;

    static {
        service = new NaturalLanguageClassifier();
        service.setUsernameAndPassword("f430b6b1-f0cb-4e14-a761-de671d5e9570", "6FPJBWqtWxT8");
    }

    public Classification getClassification(String text){
        Classification classification = null;
        String classifierId = this.getClassifierId();
        classification = service.classify(classifierId,  text).execute();
        return classification;
    }

    //read value from property file
    private String getClassifierId() {
        return "e63b37x209-nlc-63941";
    }

}

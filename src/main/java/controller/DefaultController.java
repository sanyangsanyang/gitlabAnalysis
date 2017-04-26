package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author:yangsanyang
 * Time:23/04/2017 7:49 PM.
 * Illustration:
 */
@Controller
public class DefaultController {
    
    @RequestMapping("/login")
    @ResponseBody
    public boolean login(@RequestParam String userName,@RequestParam String password){
        return !userName.equals("") && userName.equals(password);
    }
    
    private String[] names={"Homework02-Sum","Homework03-CurrencyExchange","Homework04-ResponseTime","Homework05-HeartRate","Homework06-CompareNumbers","Homework09-Stream","Homework10-CSVFile","Homework11-WeatherData","Homework12-Curriculum"};
    private String[] urls={"http://115.29.184.56:10080/kenny67nju/Homework02-Sum.git","http://115.29.184.56:10080/kenny67nju/Homework03-CurrencyExchange.git","http://115.29.184.56:10080/kenny67nju/Homework04-ResponseTime.git","http://115.29.184.56:10080/kenny67nju/Homework05-HeartRate.git","http://115.29.184.56:10080/kenny67nju/Homework06-CompareNumbers.git","http://115.29.184.56:10080/kenny67nju/Homework09-Stream.git","http://115.29.184.56:10080/kenny67nju/Homework10-CSVFile.git","http://115.29.184.56:10080/kenny67nju/Homework11-WeatherData.git","http://115.29.184.56:10080/kenny67nju/Homework12-Curriculum.git"};
    @RequestMapping("/questionList")
    @ResponseBody
    public List<Map<String,String>> getQuestionList(){
        List<Map<String,String>> list=new ArrayList<>();
        for(int i=0;i<names.length;i++){
            Map<String,String> map=new HashMap<>();
            map.put("name",names[i]);
            map.put("url",urls[i]);
            list.add(map);
        }
        return list;
    }
    
}

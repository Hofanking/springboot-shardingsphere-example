package com.scorpios.shardingsphere.controller;


import com.scorpios.shardingsphere.entity.Dict;
import com.scorpios.shardingsphere.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DictController {

    @Autowired
    DictService dictService;


    @PostMapping("/saveDict")
    public void saveDict(@RequestBody Dict dict){
        dictService.saveDict(dict);
    }

    @PostMapping("/getDictByDictId")
    public List<Dict> getDictByDictId(Long dictId){
       return dictService.getDictByDictId(dictId);
    }

    @PostMapping("/getAllDict")
    public List<Dict> getAllDict(){
        return dictService.getAllDict();
    }

}

package com.scorpios.shardingsphere.service;

import com.scorpios.shardingsphere.entity.Dict;

import java.util.List;

public interface DictService {


    public void saveDict(Dict dict);

    public List<Dict> getDictByDictId(Long dictId);

    List<Dict> getAllDict();
}

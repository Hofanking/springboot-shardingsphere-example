package com.scorpios.shardingsphere.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.scorpios.shardingsphere.entity.Dict;
import com.scorpios.shardingsphere.mapper.DictDao;
import com.scorpios.shardingsphere.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictServiceImpl implements DictService {


    @Autowired
    DictDao dictDao;

    @Override
    public void saveDict(Dict dict) {
        dictDao.insert(dict);
    }

    @Override
    public List<Dict> getDictByDictId(Long dictId) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("dictId",dictId);
        List<Dict> dicts = dictDao.selectList(queryWrapper);
        System.out.println(dicts);
        return dicts;
    }

    @Override
    public List<Dict> getAllDict() {
        List<Dict> dicts = dictDao.selectList(null);
        return dicts;
    }


}

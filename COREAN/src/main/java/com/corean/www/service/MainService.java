package com.corean.www.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corean.www.mapper.MainMapper;

@Service
public class MainService {
	
	@Autowired
	MainMapper mainMapper;
	
	public List<HashMap<String, Object>> oneSearch(HashMap<String, Object> params){
		
		List<HashMap<String, Object>> resultMap = mainMapper.oneSearch(params);
		
		System.out.println("뭐가 문제인거냐 ::: "+resultMap);
		
		return resultMap;
	}
	
}

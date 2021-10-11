package com.corean.www.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MainMapper {
	
	public List<HashMap<String, Object>> oneSearch(HashMap<String, Object> params);
	
}

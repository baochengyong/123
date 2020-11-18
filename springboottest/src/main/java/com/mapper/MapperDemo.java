package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * 特别注意：Mapper.java 接口文件必须与Mapper.xml 文件名相同 ，大小写没关系
 * @author Administrator
 *
 */
@Mapper
public interface MapperDemo {
	public List<Student> getData();
}

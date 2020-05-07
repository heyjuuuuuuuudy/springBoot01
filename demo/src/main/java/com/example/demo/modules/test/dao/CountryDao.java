package com.example.demo.modules.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Value;

import com.example.demo.modules.test.entity.Country;

@Mapper
public interface CountryDao {

	/*
	 * 通过countryid获得国家信息之后 提取出countryid在传入城市查询 最后将提取出来list<city> 最后存入cities
	 * @Many 表示多个 如果只有一个@one
	 * @Results重复 加一个id 再调用@ResultMap
	 */
	@Select("select * from m_country where country_id = #{countryId}")
	@Results(id="countryResult",value={
			@Result(column="country_id" , property="countryId"),
			@Result(column="country_id" , property="cities",
			javaType=List.class,
			many=@Many(select="com.example.demo.modules.test.dao.CityDao.getCitiesByCountryId"))
			})
	Country getCountryById(int countryId);
	
	@Select("select * from m_country where country_name = #{countryName}")
	@ResultMap(value="countryResult")
	Country getCountryByName (String countryName ) ;
}

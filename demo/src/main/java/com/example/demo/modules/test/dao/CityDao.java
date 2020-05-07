package com.example.demo.modules.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.example.demo.modules.test.entity.City;

/*
 * @Repository dao层的注解
 * @Mapper=@Repository+
 */

// @Repository
@Mapper
public interface CityDao {
	
	/*
	 * 传参数有两种方式
	 * 1.传重要信息 #{countryId}===="select * from m_city where country_id = ?"
	 * 2.传无关信息 orderby...${countryId}===="select * from m_city where country_id = 1 "
	 */
	@Select("select * from m_city where country_id = #{countryId} ")
	List<City> getCitiesByCountryId(int countryId);
	
	//采用mapper就不加注解了
	List<City> getCitiesByCountryId2(int countryId);

	@Select("select * from m_city where country_id = #{countryId} ")
	List<City> getCitiesByPage(int countryId);

	/*
	 * 插入一个
	 */
	@Insert("insert into m_city (city_name,local_city_ name,country_id,date_created)"
			+
			"values (#{cityName},#{localCityName},#{countryId},#{dateCreated})")
	@Options(useGeneratedKeys=true,keyColumn="city_id",keyProperty="cityId")
	void insertCity(City city);
}

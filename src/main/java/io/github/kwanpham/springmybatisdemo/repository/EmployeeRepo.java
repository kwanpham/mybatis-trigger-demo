package io.github.kwanpham.springmybatisdemo.repository;

/**
 * Created by https://github.com/kwanpham
 */
import io.github.kwanpham.springmybatisdemo.model.Employee;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface EmployeeRepo {

    @Select("Select *from employee")
    List<Employee> getAll();


    @Select("SELECT * FROM employee WHERE ID = #{id}")
    Employee getById(int id);


    @Insert("INSERT INTO employee (NAME, GENDER ,STATUS) VALUES (#{name}, #{gender}, #{status})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Employee customer);


    @Update("update employee set name = #{name} , gender = #{gender} , status = #{status} where id = #{id}")
    void update(Employee customer);

    // delete emp by id
    @Delete("DELETE from employee WHERE ID = #{id}")
    public void delete(int id);

}
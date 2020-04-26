package io.github.kwanpham.springmybatisdemo.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by https://github.com/kwanpham
 */
@Configuration
@EnableTransactionManagement
//@MapperScan("kwan.org.mybatistriggerdemo.mapper")   custom mapper if have add mapper from lib
public class MyBatisConfig {

//    @Autowired
//    public DataSource dataSource;
//
//    @Bean
//    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource);
//        sqlSessionFactoryBean.setTypeAliasesPackage("kwan.org.mybatistriggerdemo.model");
//        return sqlSessionFactoryBean;
//    }
}

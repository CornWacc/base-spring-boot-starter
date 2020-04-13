package com.base.common.autoconfiguration;


import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.util.ObjectUtils;

import java.io.IOException;
import java.sql.SQLException;


/**
 * @author yyc
 * @apiNote 数据源设置自动配置
 * */
@Configuration
@AutoConfigureAfter({DataSourcePropertiesAutoConfiguration.class})
public class DataSourceAutoConfiguration {

    private static final Logger log = LoggerFactory.getLogger(DataSourceAutoConfiguration.class);

    @Value("${mapping.path}")
    private String mappingPath;

    @Autowired
    private DruidDataSource dataSource;

    @Bean
    public SqlSessionFactoryBean createSqlSessionFactoryBean(){

        if(ObjectUtils.isEmpty(dataSource)){
            log.info("当前数据源为空:{}",dataSource);
        }

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        try {
            if(!ObjectUtils.isEmpty(dataSource.getConnection())){
                sqlSessionFactoryBean.setDataSource(dataSource);
                PathMatchingResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();

                //获取所有mybatis的mapper.xml映射
                sqlSessionFactoryBean.setMapperLocations(resourcePatternResolver.getResources(PathMatchingResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX+mappingPath));
            }
        } catch (SQLException e) {
            log.info("数据库连接失败！！,原因:{}",e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSessionFactoryBean;
    }

    public String getMappingPath() {
        return mappingPath;
    }

    public void setMappingPath(String mappingPath) {
        this.mappingPath = mappingPath;
    }
}


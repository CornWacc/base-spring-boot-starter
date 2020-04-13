package com.base.common.autoconfiguration;


import com.alibaba.druid.pool.DruidDataSource;
import com.base.common.error.BizError;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yyc
 * @apiNote 数据源基础配置自动配置
 * */
@Configuration
public class DataSourcePropertiesAutoConfiguration {

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String userName;

    @Value("${spring.datasource.password}")
    private String password;


    @Bean(name = "druidDataSource")
    public DruidDataSource createDruidDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        if (StringUtils.isBlank(driverClassName)) {
            throw new BizError("sql驱动不能为空");
        }
        dataSource.setDriverClassName(driverClassName);

        if (StringUtils.isBlank(url)) {

            throw new BizError("url不能为空");
        }
        dataSource.setUrl(url);

        if (StringUtils.isBlank(userName)) {
            throw new BizError("用户名不能为空");
        }
        dataSource.setUsername(userName);

        if (StringUtils.isBlank(password)) {
            throw new BizError("连接密码不能为空");
        }
        dataSource.setPassword(password);

        return dataSource;

    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

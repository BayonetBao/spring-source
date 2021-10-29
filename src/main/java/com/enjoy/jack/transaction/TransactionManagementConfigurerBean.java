package com.enjoy.jack.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;
import java.sql.DriverManager;

public class TransactionManagementConfigurerBean implements TransactionManagementConfigurer {
    @Autowired
    DataSource dataSource;
    @Override
    public TransactionManager annotationDrivenTransactionManager() {
        DataSourceTransactionManager dstm = new DataSourceTransactionManager();
        dstm.setDataSource(dataSource);
        return dstm;
    }
}

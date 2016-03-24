package com.hbuas.utils;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by dell on 2016/2/23.
 */
public class ConnectionPool {
    private static ConnectionPool pool = null;
    private static DataSource dataSource = null;
    private ConnectionPool() {
        try {
            InitialContext ic = new InitialContext();
            dataSource = (DataSource) ic.lookup("java:/comp/env/jdbc/weixin");
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static ConnectionPool getInstance(){
        if (pool == null){
            pool = new ConnectionPool();
        }
        return pool;
    }

    public Connection getConnection() {
        try  {
            return dataSource.getConnection();
        } catch (SQLException sqle)  {
            sqle.printStackTrace();
            return null;
        }
    }

    public void freeConnection(Connection c)     {
        try{
            c.close();
        } catch (SQLException sqle){
            sqle.printStackTrace();
        }
    }
}

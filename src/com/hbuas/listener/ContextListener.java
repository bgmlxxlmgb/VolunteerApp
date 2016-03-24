package com.hbuas.listener; /**
 * Created by bgm on 2015/11/29.
 */
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@WebListener()
public class ContextListener implements ServletContextListener, HttpSessionListener, HttpSessionAttributeListener {
    public ContextListener() {
    }
    public void contextInitialized(ServletContextEvent sce) {
        /*try{
            Class.forName("com.mysql.jdbc.Driver");
            ServletContext context = sce.getServletContext();
            String db_url = context.getInitParameter("db_url");
            String db_user = context.getInitParameter("db_user");
            String db_password = context.getInitParameter("db_password");
            Connection connection = DriverManager.getConnection(db_url, db_user, db_password);
            if (connection != null){
                context.setAttribute("connection",connection);
                System.out.println("数据库连接成功");
            }
        }catch (Exception e){
            System.out.println("数据库连接失败");
            e.printStackTrace();
        }*/
    }

    public void contextDestroyed(ServletContextEvent sce) {
       /* try{
            ServletContext  context = sce.getServletContext();
            Connection connection = (Connection)context.getAttribute("connection");
            connection.close();
            System.out.println("数据库已关闭");
        }catch (SQLException e){
            System.out.println("数据库关闭异常");
            e.printStackTrace();
        }*/
    }
    public void sessionCreated(HttpSessionEvent se) {
    }

    public void sessionDestroyed(HttpSessionEvent se) {
    }
    public void attributeAdded(HttpSessionBindingEvent sbe) {
    }

    public void attributeRemoved(HttpSessionBindingEvent sbe) {
    }

    public void attributeReplaced(HttpSessionBindingEvent sbe) {
    }
}

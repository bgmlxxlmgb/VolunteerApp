package com.hbuas.utils;

import com.hbuas.pojo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by dell on 2016/1/24.
 */
public class UserInfoOperation {
   /* PreparedStatement ps;
    ResultSet rs;
    public int mobileCheck(Connection connection , String mobileNumber){
        String sql = "select * from userinfo where mobileNumber='"+mobileNumber+"'";
        try{
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            while(rs.next()){
                return 1;
            }
            rs.close();
            ps.close();
        }catch(SQLException e1){e1.printStackTrace();}
        catch(Exception e2){e2.printStackTrace();}
        finally {
            try{
                connection.close();
            }catch(SQLException e3){e3.printStackTrace();}
            catch(Exception e4){
                e4.printStackTrace();}
        }
        return 0;
    }*/
    //查询是否存在已经注册的手机号
    public boolean mobileExit(String mobileNumber){
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        //String query = "select * from userinfo where mobileNumber='"+mobileNumber+"'";
        String query = "select * from userinfo where mobileNumber=?";//
        try{
            ps = connection.prepareStatement(query);
            ps.setString(1, mobileNumber);
            rs = ps.executeQuery();
            return rs.next();
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }finally{
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }

    public int insertRegisterInfo(User user){
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        String insertSQL = "insert into userinfo (name,sex,birth,certificateType,certificateNumber,password,mobileNumber,headPicPath) VALUES (?,?,?,?,?,?,?,?)";
        try {
            ps = connection.prepareStatement(insertSQL);
            ps.setString(1,user.getName());
            ps.setString(2,user.getSex());
            ps.setDate(3,user.getBirth());
            ps.setString(4,user.getCertificateType());
            ps.setString(5,user.getCertificateNumber());
            ps.setString(6,user.getPassword());
            ps.setString(7,user.getMobileNumber());
            ps.setString(8,user.getHeadPicPath());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();//插入失败时，应该跳转到提示页面
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }



}

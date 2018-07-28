/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thefood.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import thefood.dto.ItemDTO;
import thefood.dto.UserDTO;

/**
 *
 * @author root
 */
public class UserDAO {

    public static UserDTO addUser(UserDTO obj) throws SQLException {
        Connection con = MyCon.getConnection();
        Statement st = con.createStatement();

        String otp = genOTP();
        String q = "insert into user (mobileno,email,upass,otp,fullname,regdate) value ('" + obj.getMobileno() + "','" + obj.getEmail() + "','" + obj.getUpass() + "','" + otp + "','" + obj.getFullname() + "',now())";
        st.executeUpdate(q, Statement.RETURN_GENERATED_KEYS);

        ResultSet rs = st.getGeneratedKeys();
        rs.next();
        obj.setUid(rs.getInt(1));
        obj.setOtp(otp);

        return obj;
    }

    public static UserDTO chkLogin(String mobileno, String upass) throws SQLException {
        Connection con = MyCon.getConnection();
        Statement st = con.createStatement();

        String q = "select * from user where mobileno='" + mobileno + "' and upass='" + upass + "'";
        ResultSet rs = st.executeQuery(q);

        if (!rs.next()) {
            return null;
        }

        UserDTO obj = new UserDTO(rs.getInt(1), rs.getString(2), rs.getString(3), "", "", rs.getString(6), rs.getString(7), rs.getInt(8), null);
        obj.setAddlist(DeliveryAdressDAO.getDeliveryAddressList(obj));

        return obj;
    }

/*    public static UserDTO verifyOTP(String mobileno, String otp) throws SQLException {
        Connection con = MyCon.getConnection();
        Statement st = con.createStatement();

        String q = "select * from user where mobileno='" + mobileno + "' and otp='" + otp + "'";
        ResultSet rs = st.executeQuery(q);

        if (!rs.next()) {
            return null;
        }

        UserDTO obj = new UserDTO(rs.getInt(1), rs.getString(2), rs.getString(3), "", "", rs.getString(6), rs.getString(7), rs.getInt(8), null);
        return obj;
    }

    public static String getOTP(String mobileno) throws SQLException {
        Connection con = MyCon.getConnection();
        Statement st = con.createStatement();

        String q = "select otp from user where mobileno='" + mobileno + "'";
        ResultSet rs = st.executeQuery(q);

        if (!rs.next()) {
            return null;
        }

        return rs.getString(1);
    }
*/
    private static String genOTP() {
        String numbers = "0123456789";

        Random rndm_method = new Random();

        char[] password = new char[4];

        for (int i = 0; i < password.length; i++) {
            password[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
        }

        return new String(password);
    }

    public static void updateUser(UserDTO obj) throws SQLException {
        Connection con = MyCon.getConnection();
        Statement st = con.createStatement();

        String q = "update user set email='" + obj.getEmail() + "',fullname='" + obj.getFullname() + "' where uid=" + obj.getUid();
        st.executeUpdate(q);
    }

    public static void updateUserStatus(UserDTO obj) throws SQLException {
        Connection con = MyCon.getConnection();
        Statement st = con.createStatement();

        String q = "update user set status=" + obj.getStatus() + " where uid=" + obj.getUid();
        st.executeUpdate(q);
    }

    public static boolean changePassword(String mobileno, String oldpass, String newpass) throws SQLException {
        Connection con = MyCon.getConnection();
        Statement st = con.createStatement();

        String q = "update user set upass='" + newpass + "' where mobileno='" + mobileno + "' and upass='" + oldpass + "'";
        int count = st.executeUpdate(q);
        if (count > 0) {
            return true;
        }
        return false;
    }

}

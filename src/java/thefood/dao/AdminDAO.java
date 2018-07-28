//Change by student

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
import thefood.dto.AdminDTO;

/**
 *
 * @author root
 */
public class AdminDAO {
    public static AdminDTO chkLogin(AdminDTO obj) throws SQLException {
        Connection con = MyCon.getConnection();
        Statement st = con.createStatement();
        String q = "select * from admin where unm='"+obj.getUnm()+"' and upass='"+obj.getUpass()+"'";
        ResultSet rs = st.executeQuery(q);
        if(!rs.next()) 
            return null;
        obj.setUmob(rs.getString("umob"));
        return obj;
    }
    
    public static AdminDTO chkMobile(String umob) throws SQLException {
        Connection con = MyCon.getConnection();
        Statement st = con.createStatement();
        String q = "select * from admin where umob='"+umob+"'";
        ResultSet rs = st.executeQuery(q);
        if(!rs.next()) 
            return null;
        AdminDTO obj = new AdminDTO(rs.getString(1), rs.getString(2), umob);
        return obj;
    }
    
    public static void updateAdmin(AdminDTO obj) throws SQLException {
        Connection con = MyCon.getConnection();
        Statement st = con.createStatement();
        String q = "update admin set upass='"+obj.getUpass()+"', umob='"+obj.getUmob()+"' where unm="+obj.getUnm();
        st.executeUpdate(q);
    }
}

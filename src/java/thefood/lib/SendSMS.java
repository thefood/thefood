/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thefood.lib;

import java.io.IOException;
import java.net.*;

/**
 *
 * @author root
 */
public class SendSMS {

    public static String send(String to, String msg) throws MalformedURLException, IOException {
        //String url="http://api.mVaayoo.com/mvaayooapi/MessageCompose?user=thefoodindore@gmail.com:9893303390&senderID=TEST SMS&receipientno="+to+"&dcs=0&msgtxt="+msg+"&state=4";
        String url = "http://api.msg91.com/api/sendhttp.php?sender=MSGIND&route=4&mobiles="+to+"&authkey=227251ARFBaOnNgGRl5b52bd35&country=91&message="+msg;
        URL urlObj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) urlObj.openConnection();
        String res = con.getResponseMessage();
        con.disconnect();

        return res;
    }
}

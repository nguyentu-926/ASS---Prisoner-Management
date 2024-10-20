/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class userDAO {
    List<User> ls = new ArrayList<>();
    public userDAO(){
        ls.add(new User("NguyenTu", "123456", true));
        ls.add(new User("TranTrang", "123456", true));
        ls.add(new User("VanAnh", "123456", true));
        ls.add(new User("VuThai", "123456", true));
        ls.add(new User("PhamHa", "123456", true));
    }
public boolean checkLogin(String username, String password){
        for(User u : ls){
            if(u.getUsername().equals(username) && u.getPassword().equals(password)){
        return true;
            }
    }
        return false;
}
  
}
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
public class DangKyThamDAO {
    List<DangKyTham> h = new ArrayList<>();
    public int add(DangKyTham dk){
        h.add(dk);
        return 1;
    }
    public List<DangKyTham> getAllDangKyTham(){
        return h;
    }
}

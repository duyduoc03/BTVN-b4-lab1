package sesstion4.lab1;

import sesstion2.SinhVien;

import java.util.ArrayList;

public class PhoneNumber {
    public String name;
    public ArrayList<String> phone = new ArrayList<>();

    public PhoneNumber(String name, String phone){
        this.name = name;
        this.phone.add(phone);
    }
}

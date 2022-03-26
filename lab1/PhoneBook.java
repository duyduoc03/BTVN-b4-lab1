package sesstion4.lab1;

import java.util.ArrayList;

public class PhoneBook extends Phone{
    public ArrayList<PhoneNumber> PhoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        for(PhoneNumber p:PhoneList){
            if(p.name == name){
                for(String s:p.phone){
                    if(s == phone) return;
                }
                p.phone.add(phone);
                return;
            }
        }
        PhoneList.add(new PhoneNumber(name,phone));
    }

    @Override
    public void removePhone(String name) {
        for(PhoneNumber p:PhoneList){
            if(p.name == name){
                PhoneList.remove(p);
                return;
            }
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {
        for(PhoneNumber p:PhoneList){
            if(p.name == name){
                p.phone.removeAll(p.phone);// xoa het
                p.phone.add(newphone);
                return;
            }
        }
    }

    @Override
    public PhoneNumber searchPhone(String name) {
        for(PhoneNumber p:PhoneList){
            if(p.name == name){
                System.out.println("Có tên " + name + " trong danh sách\n");
                return p;
            }
        }
        System.out.println("Bạn chưa nhập tên hoặc không có tên trong danh sách\n");
        return null;
    }

    @Override
    public void sort() {
        String []arr = new String[10];
        int i = 0, count = 0;
        for(PhoneNumber p:PhoneList){
            arr[i] = p.name;
            i++;
            count++;
        }
        for (i = 0; i < count; i++){
            for (int j = i+1; j < count; j++){
                if (arr[i].compareTo(arr[j]) > 0){
                    String c = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;
                }
            }
        }
        for (i = 0; i < count; i++){
            System.out.println("\t" + arr[i]);
        }
    }
}
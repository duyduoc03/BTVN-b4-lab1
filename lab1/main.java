package sesstion4.lab1;

import java.util.Scanner;

public class main {
    public static void main(String args[]){
        PhoneBook pb = new PhoneBook();
        pb.insertPhone("Duoc","0342685757");
        pb.insertPhone("Thien","0123456789");
        pb.insertPhone("Thuong","0987654321");
        pb.insertPhone("ABC","0000000000");
        pb.insertPhone("abc","0000000000");

        //
        System.out.println("In:");
        for (PhoneNumber pn: pb.PhoneList){
            System.out.println("\t" + pn.name + ": " + pn.phone);
        }

        //xoá
        pb.removePhone("abc");
        System.out.println("Xoá abc khỏi mảng:");
        for (PhoneNumber pn: pb.PhoneList){
            System.out.println("\t" + pn.name + ": " + pn.phone);
        }

        //sửa
        pb.updatePhone("Duoc","9999999999");
        System.out.println("Update phone:");
        for (PhoneNumber pn: pb.PhoneList){
            System.out.println("\t" + pn.name + ": " + pn.phone);
        }

        //tìm
        pb.searchPhone("Duoc");

        //sắp xếp
        System.out.println("Sắp xếp theo tên người dùng:");
        pb.sort();
    }
}
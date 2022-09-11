import java.io.*;

public class AddressBookCapture {

    public static AddressBookPojo capture() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);
        AddressBookPojo pojo = new AddressBookPojo();

        String name;
        String email;
        String phone;
        String mobile;
        String notes;
        String birthday;

        System.out.println("What is the name (and surname) ?");
        name = reader.readLine();

        System.out.println("What is the email address ?");
        email = reader.readLine();

        System.out.println("What is the phone number ?");
        phone = reader.readLine();

        System.out.println("What is the  mobile phone number ?");
        mobile = reader.readLine();

        System.out.println("What is the birthday ?");
        birthday = reader.readLine();
        
        System.out.println("What notes do you want to add ?");
        notes = reader.readLine();
        
        pojo.setName(name);
        pojo.setEmail(email);
        pojo.setPhone(phone);
        pojo.setMobile(mobile);
        pojo.setBirthday(birthday);
        pojo.setNotes(notes);
        
        return pojo;
    }
}

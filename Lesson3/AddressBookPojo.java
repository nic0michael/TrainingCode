/**
 *
 * @author root
 */
public class AddressBookPojo {
    private String name;
    private String email;
    private String phone;
    private String mobile;
    private String notes;
    private String birthday;
    
    public String makeHeader(){
        String header ="";
        header +="name";
        header +=",";
        header +="email";
        header +=",";
        header +="phone";
        header +=",";
        header +="mobile";
        header +=",";
        header +="notes";
        header +=",";
        header +="birthday";
        
        return header;
    }
    
    String makeBody() {  
        String body ="";
        body += name;
        body += ",";
        body += email;
        body += ",";
        body += phone;
        body += ",";
        body += mobile;
        body += ",";
        body += notes;
        body += ",";
        body += birthday;
        
        return body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    

    
}

public class Email {

    public String firstName;
    public String lastName;
    public int idNum;
    public String domain;


    public Email(String first, String last, int id, String dom){
        firstName = first;
        lastName = last;
        idNum = id;
        domain = dom;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setIdNum(int idNum){
        this.idNum = idNum;
    }

    public void setDomain(String domain){
        this.domain = domain;
    }

    public String getDomain(){
        return domain;
    }

    public String generateEmail(){
        String id = String.valueOf(idNum);
        char firstIn = getFirstName().charAt(0);
        char lastIn = getLastName().charAt(0);


        String email = "";
        email += firstIn;
        email += lastIn;
        email += id;
        email += "@";
        email += getDomain();

        return email;

    }

}

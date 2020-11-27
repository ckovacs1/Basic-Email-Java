import java.util.Random;

public class Password {

    public int passLength;

    public Password(int passLen){
        passLength = passLen;
    }


    public void setPassLength(int passLength){
        this.passLength = passLength;
    }

    public String generatePassword(){
        Random rand = new Random();

        char pass[] = new char[passLength];

        for (int i = 0; i < passLength; i++){
            pass[i] = (char)(rand.nextInt(26) + 'a');
        }

        String password = "";

        for (int i = 0; i < pass.length; i++){
            password += pass[i];
        }

        return password;
    }

}

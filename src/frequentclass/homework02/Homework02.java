package frequentclass.homework02;

/**
 * @author 樊峻成
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        String username = "jack";
        String password = "123556";
        String e_mail = "123456@.com";
        try {
            login.loginProgram(username,password,e_mail);
            System.out.println("注册成功！");
        } catch (ErrorUserName e) {
            System.out.println("账号格式错误!");
        } catch (ErrorPassWord e) {
            System.out.println("密码格式错误!");
        } catch (ErrorEmail e) {
            System.out.println("邮箱格式错误!");
        }
    }
}

class login {
    public static void loginProgram(String user,String pass,String e) {
        if(!(user.length() >= 2 && user.length() <= 4)) {
            throw new ErrorUserName();
        }
        char[] chars = pass.toCharArray();
        if(!(pass.length() == 6)) {
            throw new ErrorPassWord();
        }
        for (int i = 0; i < chars.length; i++) {
            if(!(Character.isDigit(chars[i])))
                throw new ErrorPassWord();
        }
        int first = e.indexOf("@");
        int later = e.indexOf(".");
        if (!(first < later)) {
            throw new ErrorEmail();
        }
    }
}

class ErrorUserName extends RuntimeException {
}

class ErrorPassWord extends RuntimeException {
}

class ErrorEmail extends RuntimeException {
}
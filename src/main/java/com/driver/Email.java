package com.driver;

import java.io.CharConversionException;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character

        if(this.password != oldPassword){
            return;
        }
        if(newPassword.length() < 8){
            return;
        }
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialCharacter = false;

        char[] strChar = newPassword.toCharArray();
        for(char ch : strChar){
            if(Character.isUpperCase(ch)){
                hasUpperCase = true;
            }
            if(Character.isLowerCase(ch)){
                hasLowerCase = true;
            }
            if(Character.isDigit(ch)){
                hasDigit = true;
            }
            if(!Character.isLetterOrDigit(ch)){
                hasSpecialCharacter = true;
            }
        }
        if(!hasUpperCase || !hasLowerCase || !hasDigit || !hasSpecialCharacter){
            return;
        }
        this.password = newPassword;
    }
}

package com.volkov.workstations.model;

public class User {
    private int mId;
    private String mLogin;
    private String mPassword;
    private String mEmail;

    public User (){}

    public User (String _login, String _password){
        this.mLogin = _login;
        this.mPassword = _password;
    }

    public User (String _login, String _password, String _email){
        this.mLogin = _login;
        this.mPassword = _password;
        this.mEmail = _email;
    }

    public User (int _id, String _login, String _password, String _email){
        this.mId = _id;
        this.mLogin = _login;
        this.mPassword = _password;
        this.mEmail = _email;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + "{id = " + mId + ", login: "
                + mLogin + ", password: " + mPassword + ", email: " + mEmail + " }";
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int _id) {
        this.mId = _id;
    }

    public String getmLogin() {
        return mLogin;
    }

    public void setmLogin(String _login) {
        this.mLogin = _login;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String _password) {
        this.mPassword = _password;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String _email) {
        this.mEmail = _email;
    }
}

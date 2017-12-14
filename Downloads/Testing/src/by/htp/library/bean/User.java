package by.htp.library.bean;

public class User {
	private String login;
	private String name;
	private String surname;
	private String password;
	private String dob;
	private boolean vip;
	private boolean ban;

	public User() {
		login = null;
		name = null;
		password = null;
		surname = null;
		dob = null;
		vip=false;
		ban = false;
	}

	public User(String login, String name, String surname, String dob) {
		this.login = login;
		this.name = name;
		this.surname = surname;
		this.dob = dob;
		password = null;
		vip=false;
		ban=false;
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

    public String getDob() {
        return dob;
    }

    public void setDob(int day, int month, int year){
		dob = String.format("%2d:%2d:%4d",day,month,year).replace(" ", "0");
    }
    protected void setBan(boolean status){ ban=status;}
	public boolean getBan(){ return ban; }

    protected void setVip(boolean status){vip = status;}
    public boolean getVip(){return vip; }

	public void setPassword(String password) {
		this.password = password;
	}
}

package instagram.model;

public class User {
    private String userName;
    private String password;
    private String emailId;
    private  long phoneNumber;
    private  String gender;
    private  String bio;
    private  long noOfFollowers;
    private String profilePhotoUrl;
    private String role;
    public User(String userName, String password, String emailId, long phoneNumber, String role){
        this.userName=userName;
        this.password=password;
        this.emailId=emailId;
        this.phoneNumber=phoneNumber;
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public long getNoOfFollowers() {
        return noOfFollowers;
    }

    public void setNoOfFollowers(long noOfFollowers) {
        this.noOfFollowers = noOfFollowers;
    }

    public String getProfilePhotoUrl() {
        return profilePhotoUrl;
    }

    public void setProfilePhotoUrl(String profilePhotoUrl) {
        this.profilePhotoUrl = profilePhotoUrl;
    }
}

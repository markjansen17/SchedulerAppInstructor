package ph.edu.tip.schedulerappinstructor.model.data;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;


/**
 * @author pocholomia
 * @since 12/4/2016
 */
public class Admin extends RealmObject {



    @SerializedName("admin_id")
    @PrimaryKey
    private int admin_id;
    @SerializedName("admin_email")
    private String emailAddress;
    @SerializedName("admin_name")
    private String name;
    @SerializedName("admin_address")
    private String address;
    @SerializedName("admin_birthday")
    private String birthday;
    @SerializedName("birth_place")
    private String birthPlace;
    @SerializedName("cp_number")
    private String cpNumber;
    @SerializedName("admin_image")
    private String image;
    @SerializedName("company_id")
    private String companyId;

    @SerializedName("position")
    private String position;
    @SerializedName("description")
    private String description;



    public Admin() {
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }


    public int getAdminID() {
        return admin_id;
    }

    public void setAdminID(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getCpNumber() {
        return cpNumber;
    }

    public void setCpNumber(String cpNumber) {
        this.cpNumber = cpNumber;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }



}
package ph.edu.tip.schedulerappinstructor.model.response;


import com.google.gson.annotations.SerializedName;

import ph.edu.tip.schedulerappinstructor.app.Constants;
import ph.edu.tip.schedulerappinstructor.model.data.Admin;


/**
 * Created by Cholo Mia on 12/4/2016.
 */

public class LoginResponse extends BasicResponse {

    @SerializedName(Constants.DATA)
    private Admin admin;

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}

package entity;

import java.util.Date;

/**
 * Created by huqicheng on 2017/10/14.
 */

public class User {
    long userId;
    String username;
    String email;
    String password;
    String accountType;
    String facebook;
    long createdAt;
    long updateAt;
    String avatar;


    public long getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getFacebook() {
        return facebook;
    }


    public String getAvatar() {
        return avatar;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }


    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

	public long getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(long createdAt) {
		this.createdAt = createdAt;
	}

	public long getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(long updateAt) {
		this.updateAt = updateAt;
	}
    
    
}

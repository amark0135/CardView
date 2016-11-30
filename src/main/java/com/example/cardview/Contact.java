package com.example.cardview;

/**
 * Created by AmaRguRiyA on 27-11-2016.
 */

public class Contact {

    private int imgId;
    private String name,email,mob;

    public Contact(int imgId,String name,String email,String mob)
    {
        this.imgId=imgId;
        this.name=name;
        this.email=email;
        this.mob=mob;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }
}

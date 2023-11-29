package com.unsis.models.entity;

import java.sql.Date;

/**
 *
 * @author jared
 */
public class Account1 extends Employee1 {

    private String user;
    private String pass;
    private String profileImage;

    public Account1() {}

    public Account1(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }
    
    // Constructor privado
    private Account1(Builder builder) {
        super(builder.numEmploye, builder.number,  builder.dateEntry, builder.status, builder.area, builder.position,
              builder.name, builder.matherLastName, builder.fatherLastName, builder.birthday, builder.mail, builder.cell);
        this.user = builder.user;
        this.pass = builder.pass;
        this.profileImage = builder.profileImage;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
    
    // Clase Builder interna estática
    public static class Builder {
        private String user;
        private String pass;
        private String profileImage;
        // Atributos heredados
        private String number;
        private Date dateEntry;
        private boolean status;
        private String area;
        private String position;
        private String name;
        private String matherLastName;
        private String fatherLastName;
        private Date birthday;
        private String mail;
        private String cell;
        private int numEmploye;

        public Builder(String user, String pass) {
            this.user = user;
            this.pass = pass;
        }

        public Builder withNumber(String number) {
            this.number = number;
            return this;
        }
        
        public Builder withNumEmploye(int numEmploye) {
            this.numEmploye = numEmploye;
            return this;
        }

        public Builder withDateEntry(Date dateEntry) {
            this.dateEntry = dateEntry;
            return this;
        }

        public Builder withStatus(boolean status) {
            this.status = status;
            return this;
        }

        public Builder withArea(String area) {
            this.area = area;
            return this;
        }

        public Builder withPosition(String position) {
            this.position = position;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withMatherLastName(String matherLastName) {
            this.matherLastName = matherLastName;
            return this;
        }

        public Builder withFatherLastName(String fatherLastName) {
            this.fatherLastName = fatherLastName;
            return this;
        }

        public Builder withBirthday(Date birthday) {
            this.birthday = birthday;
            return this;
        }

        public Builder withMail(String mail) {
            this.mail = mail;
            return this;
        }

        public Builder withCell(String cell) {
            this.cell = cell;
            return this;
        }

        public Account1 build() {
            return new Account1(this);
        }
    }
}

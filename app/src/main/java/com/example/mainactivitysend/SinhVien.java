package com.example.mainactivitysend;

import java.io.Serializable;

public class SinhVien implements Serializable {
    private String ma;
    private String ten;

    public SinhVien(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}

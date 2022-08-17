package com.example.sw_02;

public class StarData {

    private String tv_name;
    private String tv_cate_1;
    private String tv_star;

    public StarData(String tv_name, String tv_cate, String tv_star) {
        this.tv_name = tv_name;
        this.tv_cate_1 = tv_cate;
        this.tv_star = tv_star;
    }

    public String getTv_name() {
        return tv_name;
    }

    public void setTv_name(String tv_name) {
        this.tv_name = tv_name;
    }

    public String getTv_cate_1() {
        return tv_cate_1;
    }

    public void setTv_cate_1(String tv_cate_1) {
        this.tv_cate_1 = tv_cate_1;
    }

    public String getTv_star() {
        return tv_star;
    }

    public void setTv_star(String tv_star) {
        this.tv_star = tv_star;
    }
}

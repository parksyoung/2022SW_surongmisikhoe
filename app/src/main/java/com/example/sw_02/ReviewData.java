package com.example.sw_02;

public class ReviewData {

    private String tv_name;
    private String tv_cate_1;
    private String tv_rate_num;

    public ReviewData(String tv_name, String tv_cate, String tv_review) {
        this.tv_name = tv_name;
        this.tv_cate_1 = tv_cate;
        this.tv_rate_num = tv_review;
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

    public String getTv_rate_num() {
        return tv_rate_num;
    }

    public void setTv_rate_num(String tv_rate_num) {
        this.tv_rate_num = tv_rate_num;
    }
}

package com.model;

public class Campaign {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column campaign.img_url
     *
     * @mbggenerated
     */
    private String imgUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column campaign.img_url
     *
     * @return the value of campaign.img_url
     *
     * @mbggenerated
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column campaign.img_url
     *
     * @param imgUrl the value for campaign.img_url
     *
     * @mbggenerated
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }
}
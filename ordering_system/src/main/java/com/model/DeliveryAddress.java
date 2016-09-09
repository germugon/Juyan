package com.model;

public class DeliveryAddress {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column delivery_address.address_id
     *
     * @mbggenerated
     */
    private Integer addressId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column delivery_address.consignee
     *
     * @mbggenerated
     */
    private String consignee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column delivery_address.delivery_phone
     *
     * @mbggenerated
     */
    private String deliveryPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column delivery_address.delivery_addr
     *
     * @mbggenerated
     */
    private String deliveryAddr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column delivery_address.merchant_no
     *
     * @mbggenerated
     */
    private String merchantNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column delivery_address.is_default
     *
     * @mbggenerated
     */
    private String isDefault;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column delivery_address.address_id
     *
     * @return the value of delivery_address.address_id
     *
     * @mbggenerated
     */
    public Integer getAddressId() {
        return addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column delivery_address.address_id
     *
     * @param addressId the value for delivery_address.address_id
     *
     * @mbggenerated
     */
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column delivery_address.consignee
     *
     * @return the value of delivery_address.consignee
     *
     * @mbggenerated
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column delivery_address.consignee
     *
     * @param consignee the value for delivery_address.consignee
     *
     * @mbggenerated
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column delivery_address.delivery_phone
     *
     * @return the value of delivery_address.delivery_phone
     *
     * @mbggenerated
     */
    public String getDeliveryPhone() {
        return deliveryPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column delivery_address.delivery_phone
     *
     * @param deliveryPhone the value for delivery_address.delivery_phone
     *
     * @mbggenerated
     */
    public void setDeliveryPhone(String deliveryPhone) {
        this.deliveryPhone = deliveryPhone == null ? null : deliveryPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column delivery_address.delivery_addr
     *
     * @return the value of delivery_address.delivery_addr
     *
     * @mbggenerated
     */
    public String getDeliveryAddr() {
        return deliveryAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column delivery_address.delivery_addr
     *
     * @param deliveryAddr the value for delivery_address.delivery_addr
     *
     * @mbggenerated
     */
    public void setDeliveryAddr(String deliveryAddr) {
        this.deliveryAddr = deliveryAddr == null ? null : deliveryAddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column delivery_address.merchant_no
     *
     * @return the value of delivery_address.merchant_no
     *
     * @mbggenerated
     */
    public String getMerchantNo() {
        return merchantNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column delivery_address.merchant_no
     *
     * @param merchantNo the value for delivery_address.merchant_no
     *
     * @mbggenerated
     */
    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo == null ? null : merchantNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column delivery_address.is_default
     *
     * @return the value of delivery_address.is_default
     *
     * @mbggenerated
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column delivery_address.is_default
     *
     * @param isDefault the value for delivery_address.is_default
     *
     * @mbggenerated
     */
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
    }
}
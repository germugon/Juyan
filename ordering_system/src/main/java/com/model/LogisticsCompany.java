package com.model;

public class LogisticsCompany {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics_company.company
     *
     * @mbggenerated
     */
    private Integer company;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics_company.company_name
     *
     * @mbggenerated
     */
    private String companyName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics_company.company
     *
     * @return the value of logistics_company.company
     *
     * @mbggenerated
     */
    public Integer getCompany() {
        return company;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_company.company
     *
     * @param company the value for logistics_company.company
     *
     * @mbggenerated
     */
    public void setCompany(Integer company) {
        this.company = company;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics_company.company_name
     *
     * @return the value of logistics_company.company_name
     *
     * @mbggenerated
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_company.company_name
     *
     * @param companyName the value for logistics_company.company_name
     *
     * @mbggenerated
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }
}
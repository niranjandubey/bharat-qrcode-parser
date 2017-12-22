package com.niranjan.modal;

import com.niranjan.main.Utility;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;

public class PayseTagData implements Serializable{

    private String PAYLOAD_FORMAT_INDICATOR;
    private String POINT_OF_INITIATION;
    private String MERCHANT_ACCOUNT_INFO;
    private String MERCHANT_CATEGORY_CODE;
    private String TRANSACTION_CURRENCY;
    private String TRANSACTION_AMOUNT;
    private String TRANSACTION_TIP;
    private String TRANSACTION_VALUE_OF_CONVENIENCE_FEE_FIXED;
    private String TRANSACTION_VALUE_OF_CONVENIENCE_FEE_PERCENTAGE;
    private String COUNTRY_CODE;
    private String MERCHANT_NAME;
    private String MERCHANT_CITY;
    private String POSTAL_CODE;
    private String ADDITION_DATA_TEMPLATE;
    private String MERCHANT_INFO_PAYSE;
    private String PAYSE_MERCHANT_ACCOUNT;
    private String PAYSE_MERCHANT_SIGNATURE;

    public String getPAYLOAD_FORMAT_INDICATOR() {
        return PAYLOAD_FORMAT_INDICATOR;
    }

    public void setPAYLOAD_FORMAT_INDICATOR(String PAYLOAD_FORMAT_INDICATOR) {
        this.PAYLOAD_FORMAT_INDICATOR = PAYLOAD_FORMAT_INDICATOR;
    }

    public String getPOINT_OF_INITIATION() {
        return POINT_OF_INITIATION;
    }

    public void setPOINT_OF_INITIATION(String POINT_OF_INITIATION) {
        this.POINT_OF_INITIATION = POINT_OF_INITIATION;
    }

    public String getMERCHANT_ACCOUNT_INFO() {
        return MERCHANT_ACCOUNT_INFO;
    }

    public void setMERCHANT_ACCOUNT_INFO(String MERCHANT_ACCOUNT_INFO) {
        this.MERCHANT_ACCOUNT_INFO = MERCHANT_ACCOUNT_INFO;
    }

    public String getMERCHANT_CATEGORY_CODE() {
        return MERCHANT_CATEGORY_CODE;
    }

    public void setMERCHANT_CATEGORY_CODE(String MERCHANT_CATEGORY_CODE) {
        this.MERCHANT_CATEGORY_CODE = MERCHANT_CATEGORY_CODE;
    }

    public String getTRANSACTION_CURRENCY() {
        return TRANSACTION_CURRENCY;
    }

    public void setTRANSACTION_CURRENCY(String TRANSACTION_CURRENCY) {
        this.TRANSACTION_CURRENCY = TRANSACTION_CURRENCY;
    }

    public String getTRANSACTION_AMOUNT() {
        return TRANSACTION_AMOUNT;
    }

    public void setTRANSACTION_AMOUNT(String TRANSACTION_AMOUNT) {
        this.TRANSACTION_AMOUNT = TRANSACTION_AMOUNT;
    }

    public String getTRANSACTION_TIP() {
        return TRANSACTION_TIP;
    }

    public void setTRANSACTION_TIP(String TRANSACTION_TIP) {
        this.TRANSACTION_TIP = TRANSACTION_TIP;
    }

    public String getTRANSACTION_VALUE_OF_CONVENIENCE_FEE_FIXED() {
        return TRANSACTION_VALUE_OF_CONVENIENCE_FEE_FIXED;
    }

    public void setTRANSACTION_VALUE_OF_CONVENIENCE_FEE_FIXED(String TRANSACTION_VALUE_OF_CONVENIENCE_FEE_FIXED) {
        this.TRANSACTION_VALUE_OF_CONVENIENCE_FEE_FIXED = TRANSACTION_VALUE_OF_CONVENIENCE_FEE_FIXED;
    }

    public String getTRANSACTION_VALUE_OF_CONVENIENCE_FEE_PERCENTAGE() {
        return TRANSACTION_VALUE_OF_CONVENIENCE_FEE_PERCENTAGE;
    }

    public void setTRANSACTION_VALUE_OF_CONVENIENCE_FEE_PERCENTAGE(String TRANSACTION_VALUE_OF_CONVENIENCE_FEE_PERCENTAGE) {
        this.TRANSACTION_VALUE_OF_CONVENIENCE_FEE_PERCENTAGE = TRANSACTION_VALUE_OF_CONVENIENCE_FEE_PERCENTAGE;
    }

    public String getCOUNTRY_CODE() {
        return COUNTRY_CODE;
    }

    public void setCOUNTRY_CODE(String COUNTRY_CODE) {
        this.COUNTRY_CODE = COUNTRY_CODE;
    }

    public String getMERCHANT_NAME() {
        return MERCHANT_NAME;
    }

    public void setMERCHANT_NAME(String MERCHANT_NAME) {
        this.MERCHANT_NAME = MERCHANT_NAME;
    }

    public String getMERCHANT_CITY() {
        return MERCHANT_CITY;
    }

    public void setMERCHANT_CITY(String MERCHANT_CITY) {
        this.MERCHANT_CITY = MERCHANT_CITY;
    }

    public String getPOSTAL_CODE() {
        return POSTAL_CODE;
    }

    public void setPOSTAL_CODE(String POSTAL_CODE) {
        this.POSTAL_CODE = POSTAL_CODE;
    }

    public String getADDITION_DATA_TEMPLATE() {
        return ADDITION_DATA_TEMPLATE;
    }

    public void setADDITION_DATA_TEMPLATE(String ADDITION_DATA_TEMPLATE) {
        this.ADDITION_DATA_TEMPLATE = ADDITION_DATA_TEMPLATE;
    }

    public String getMERCHANT_INFO_PAYSE() {
        return MERCHANT_INFO_PAYSE;
    }

    public void setMERCHANT_INFO_PAYSE(String MERCHANT_INFO_PAYSE) {
        this.MERCHANT_INFO_PAYSE = MERCHANT_INFO_PAYSE;
    }

    public String getPAYSE_MERCHANT_ACCOUNT() {
        return PAYSE_MERCHANT_ACCOUNT;
    }

    public void setPAYSE_MERCHANT_ACCOUNT(String PAYSE_MERCHANT_ACCOUNT) {
        this.PAYSE_MERCHANT_ACCOUNT = PAYSE_MERCHANT_ACCOUNT;
    }

    public String getPAYSE_MERCHANT_SIGNATURE() {
        return PAYSE_MERCHANT_SIGNATURE;
    }

    public void setPAYSE_MERCHANT_SIGNATURE(String PAYSE_MERCHANT_SIGNATURE) {
        this.PAYSE_MERCHANT_SIGNATURE = PAYSE_MERCHANT_SIGNATURE;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("{");
        if(!StringUtils.isEmpty(PAYLOAD_FORMAT_INDICATOR))
        stringBuilder.append(Utility.TagInfo.PAYLOAD_FORMAT_INDICATOR.getValue()+":'" + PAYLOAD_FORMAT_INDICATOR + '\'' );
        if(!StringUtils.isEmpty(POINT_OF_INITIATION))
        stringBuilder.append(","+ Utility.TagInfo.POINT_OF_INITIATION.getValue()+":'" + POINT_OF_INITIATION + '\'' );
        if(!StringUtils.isEmpty(MERCHANT_ACCOUNT_INFO))
        stringBuilder.append(","+ Utility.TagInfo.MERCHANT_ACCOUNT_INFO.getValue()+":'" + MERCHANT_ACCOUNT_INFO + '\'' );
        if(!StringUtils.isEmpty(MERCHANT_CATEGORY_CODE))
        stringBuilder.append(","+ Utility.TagInfo.MERCHANT_CATEGORY_CODE.getValue()+":'" + MERCHANT_CATEGORY_CODE + '\'' );
        if(!StringUtils.isEmpty(TRANSACTION_CURRENCY))
        stringBuilder.append(","+ Utility.TagInfo.TRANSACTION_CURRENCY.getValue()+":'" + TRANSACTION_CURRENCY + '\'' );
        if(!StringUtils.isEmpty(TRANSACTION_AMOUNT))
        stringBuilder.append(","+ Utility.TagInfo.TRANSACTION_AMOUNT.getValue()+":'" + TRANSACTION_AMOUNT + '\'' );
        if(!StringUtils.isEmpty(TRANSACTION_TIP))
        stringBuilder.append(","+ Utility.TagInfo.TRANSACTION_TIP.getValue()+":'" + TRANSACTION_TIP + '\'' );
        if(!StringUtils.isEmpty(TRANSACTION_VALUE_OF_CONVENIENCE_FEE_FIXED))
        stringBuilder.append(","+ Utility.TagInfo.TRANSACTION_VALUE_OF_CONVENIENCE_FEE_FIXED.getValue()+":'" + TRANSACTION_VALUE_OF_CONVENIENCE_FEE_FIXED + '\'' );
        if(!StringUtils.isEmpty(TRANSACTION_VALUE_OF_CONVENIENCE_FEE_PERCENTAGE))
        stringBuilder.append(","+ Utility.TagInfo.TRANSACTION_VALUE_OF_CONVENIENCE_FEE_PERCENTAGE.getValue()+":'" + TRANSACTION_VALUE_OF_CONVENIENCE_FEE_PERCENTAGE + '\'' );
        if(!StringUtils.isEmpty(COUNTRY_CODE))
        stringBuilder.append(","+ Utility.TagInfo.COUNTRY_CODE.getValue()+":'" + COUNTRY_CODE + '\'' );
        if(!StringUtils.isEmpty(MERCHANT_NAME))
        stringBuilder.append(","+ Utility.TagInfo.MERCHANT_NAME.getValue()+":'" + MERCHANT_NAME + '\'' );
        if(!StringUtils.isEmpty(MERCHANT_CITY))
        stringBuilder.append(","+ Utility.TagInfo.MERCHANT_CITY.getValue()+":'" + MERCHANT_CITY + '\'' );
        if(!StringUtils.isEmpty(POSTAL_CODE))
        stringBuilder.append(","+ Utility.TagInfo.POSTAL_CODE.getValue()+":'" + POSTAL_CODE + '\'' );
        if(!StringUtils.isEmpty(ADDITION_DATA_TEMPLATE))
        stringBuilder.append(","+ Utility.TagInfo.ADDITION_DATA_TEMPLATE.getValue()+":'" + ADDITION_DATA_TEMPLATE + '\'' );
        if(!StringUtils.isEmpty(MERCHANT_INFO_PAYSE))
        stringBuilder.append(","+ Utility.TagInfo.MERCHANT_INFO_PAYSE.getValue()+":'" + MERCHANT_INFO_PAYSE + '\'' );
        if(!StringUtils.isEmpty(PAYSE_MERCHANT_ACCOUNT))
        stringBuilder.append(","+ Utility.TagInfo.PAYSE_MERCHANT_ACCOUNT.getValue()+":'" + PAYSE_MERCHANT_ACCOUNT + '\'' );
        if(!StringUtils.isEmpty(PAYSE_MERCHANT_SIGNATURE))
        stringBuilder.append(","+ Utility.TagInfo.PAYSE_MERCHANT_SIGNATURE.getValue()+":'" + PAYSE_MERCHANT_SIGNATURE + '\'' );
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /**
     * Get QR Code data String from PayseTagData object to generate qr-code
     * @return string value
     */
    public String qrcodeDataString() throws UnsupportedEncodingException {
        StringBuilder stringBuilder=new StringBuilder();
        if(!StringUtils.isEmpty(PAYLOAD_FORMAT_INDICATOR))
            stringBuilder.append(Utility.TagInfo.PAYLOAD_FORMAT_INDICATOR.getValue()+(PAYLOAD_FORMAT_INDICATOR.length()>9?PAYLOAD_FORMAT_INDICATOR.length():"0"+PAYLOAD_FORMAT_INDICATOR.length()) + PAYLOAD_FORMAT_INDICATOR);
        if(!StringUtils.isEmpty(POINT_OF_INITIATION))
            stringBuilder.append( Utility.TagInfo.POINT_OF_INITIATION.getValue()+(POINT_OF_INITIATION.length()>9?POINT_OF_INITIATION.length():"0"+POINT_OF_INITIATION.length()) + POINT_OF_INITIATION  );
        if(!StringUtils.isEmpty(MERCHANT_ACCOUNT_INFO))
            stringBuilder.append( Utility.TagInfo.MERCHANT_ACCOUNT_INFO.getValue()+(MERCHANT_ACCOUNT_INFO.length()>9?MERCHANT_ACCOUNT_INFO.length():"0"+MERCHANT_ACCOUNT_INFO.length()) + MERCHANT_ACCOUNT_INFO  );
        if(!StringUtils.isEmpty(MERCHANT_CATEGORY_CODE))
            stringBuilder.append( Utility.TagInfo.MERCHANT_CATEGORY_CODE.getValue()+(MERCHANT_CATEGORY_CODE.length()>9?MERCHANT_CATEGORY_CODE.length():"0"+MERCHANT_CATEGORY_CODE.length()) + MERCHANT_CATEGORY_CODE  );
        if(!StringUtils.isEmpty(TRANSACTION_CURRENCY))
            stringBuilder.append( Utility.TagInfo.TRANSACTION_CURRENCY.getValue()+(TRANSACTION_CURRENCY.length()>9?TRANSACTION_CURRENCY.length():"0"+TRANSACTION_CURRENCY.length()) + TRANSACTION_CURRENCY  );
        if(!StringUtils.isEmpty(TRANSACTION_AMOUNT))
            stringBuilder.append( Utility.TagInfo.TRANSACTION_AMOUNT.getValue()+(TRANSACTION_AMOUNT.length()>9?TRANSACTION_AMOUNT.length():"0"+TRANSACTION_AMOUNT.length()) + TRANSACTION_AMOUNT  );
        if(!StringUtils.isEmpty(TRANSACTION_TIP))
            stringBuilder.append( Utility.TagInfo.TRANSACTION_TIP.getValue()+(TRANSACTION_TIP.length()>9?TRANSACTION_TIP.length():"0"+TRANSACTION_TIP.length()) + TRANSACTION_TIP  );
        if(!StringUtils.isEmpty(TRANSACTION_VALUE_OF_CONVENIENCE_FEE_FIXED))
            stringBuilder.append( Utility.TagInfo.TRANSACTION_VALUE_OF_CONVENIENCE_FEE_FIXED.getValue()+(TRANSACTION_VALUE_OF_CONVENIENCE_FEE_FIXED.length()>9?TRANSACTION_VALUE_OF_CONVENIENCE_FEE_FIXED.length():"0"+TRANSACTION_VALUE_OF_CONVENIENCE_FEE_FIXED.length()) + TRANSACTION_VALUE_OF_CONVENIENCE_FEE_FIXED );
        if(!StringUtils.isEmpty(TRANSACTION_VALUE_OF_CONVENIENCE_FEE_PERCENTAGE))
            stringBuilder.append( Utility.TagInfo.TRANSACTION_VALUE_OF_CONVENIENCE_FEE_PERCENTAGE.getValue()+(TRANSACTION_VALUE_OF_CONVENIENCE_FEE_PERCENTAGE.length()>9?TRANSACTION_VALUE_OF_CONVENIENCE_FEE_PERCENTAGE.length():"0"+TRANSACTION_VALUE_OF_CONVENIENCE_FEE_PERCENTAGE.length()) + TRANSACTION_VALUE_OF_CONVENIENCE_FEE_PERCENTAGE  );
        if(!StringUtils.isEmpty(COUNTRY_CODE))
            stringBuilder.append( Utility.TagInfo.COUNTRY_CODE.getValue()+(COUNTRY_CODE.length()>9?COUNTRY_CODE.length():"0"+COUNTRY_CODE.length()) + COUNTRY_CODE  );
        if(!StringUtils.isEmpty(MERCHANT_NAME))
            stringBuilder.append( Utility.TagInfo.MERCHANT_NAME.getValue()+(MERCHANT_NAME.length()>9?MERCHANT_NAME.length():"0"+MERCHANT_NAME.length()) + MERCHANT_NAME );
        if(!StringUtils.isEmpty(MERCHANT_CITY))
            stringBuilder.append( Utility.TagInfo.MERCHANT_CITY.getValue()+(MERCHANT_CITY.length()>9?MERCHANT_CITY.length():"0"+MERCHANT_CITY.length()) + MERCHANT_CITY );
        if(!StringUtils.isEmpty(POSTAL_CODE))
            stringBuilder.append( Utility.TagInfo.POSTAL_CODE.getValue()+(POSTAL_CODE.length()>9?POSTAL_CODE.length():"0"+POSTAL_CODE.length()) + POSTAL_CODE  );
        if(!StringUtils.isEmpty(ADDITION_DATA_TEMPLATE))
            stringBuilder.append( Utility.TagInfo.ADDITION_DATA_TEMPLATE.getValue()+(ADDITION_DATA_TEMPLATE.length()>9?ADDITION_DATA_TEMPLATE.length():"0"+ADDITION_DATA_TEMPLATE.length()) + ADDITION_DATA_TEMPLATE );
        if(!StringUtils.isEmpty(MERCHANT_INFO_PAYSE))
            stringBuilder.append( Utility.TagInfo.MERCHANT_INFO_PAYSE.getValue()+(MERCHANT_INFO_PAYSE.length()>9?MERCHANT_INFO_PAYSE.length():"0"+MERCHANT_INFO_PAYSE.length()) + MERCHANT_INFO_PAYSE  );
        if(!StringUtils.isEmpty(PAYSE_MERCHANT_ACCOUNT))
            stringBuilder.append( Utility.TagInfo.PAYSE_MERCHANT_ACCOUNT.getValue()+(PAYSE_MERCHANT_ACCOUNT.length()>9?PAYSE_MERCHANT_ACCOUNT.length():"0"+PAYSE_MERCHANT_ACCOUNT.length()) + PAYSE_MERCHANT_ACCOUNT  );
        if(!StringUtils.isEmpty(PAYSE_MERCHANT_SIGNATURE))
            stringBuilder.append( Utility.TagInfo.PAYSE_MERCHANT_SIGNATURE.getValue()+(PAYSE_MERCHANT_SIGNATURE.length()>9?PAYSE_MERCHANT_SIGNATURE.length():"0"+PAYSE_MERCHANT_SIGNATURE.length()) + PAYSE_MERCHANT_SIGNATURE  );
        stringBuilder.append(Utility.TagInfo.CYCLIC_REDUNDANCY_CHECK.getValue()+Constants.CRC_LENGHT);
        stringBuilder.append(Utility.generateCRCOnByteString(stringBuilder.toString().getBytes("ASCII")));
        return stringBuilder.toString();
    }
}

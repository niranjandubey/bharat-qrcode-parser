package com.niranjan.main;

import com.niranjan.modal.Constants;
import com.niranjan.modal.PayseTagData;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

public class Utility {

    public static String convertHexToString(String hex){
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for( int i=0; i<hex.length()-1; i+=2 ){
            String output = hex.substring(i, (i + 2));
            int decimal = Integer.parseInt(output, 16);
            sb.append((char)decimal);
            temp.append(decimal);
        }
        return sb.toString();
    }

    private static byte[] hexStringToByteArray(String str) {
        int ofs = 0;
        int len = str.length();
        if ((len % 2) != 0) {
            StringBuilder strBuilder = new StringBuilder(str);
            strBuilder.insert(0, "0");
            str = strBuilder.toString();
            len = str.length();
        }
        if (str.startsWith("0x")) {
            ofs += 2;
            len -= 2;
        }
        byte[] data = new byte[len / 2];
        for (; ofs < len; ofs += 2) {
            int dH = Character.digit(str.charAt(ofs), 16);
            int dL = Character.digit(str.charAt(ofs + 1), 16);
            if ((dH < 0) || (dL < 0)) {
                throw new NumberFormatException("Illegal digit");
            }
            data[ofs / 2] = (byte) ((dH << 4) + dL);
        }
        return data;
    }

    public static String toHex(String arg) throws UnsupportedEncodingException {
        return String.format("%040x", new BigInteger(1, arg.getBytes("UTF-8")));
    }

    /**
     * Contains Tag values mapped in qr-code value string
     */
   public enum TagInfo {
       PAYLOAD_FORMAT_INDICATOR("00"),
        POINT_OF_INITIATION("01"),
        CYCLIC_REDUNDANCY_CHECK("63"),
        MERCHANT_ACCOUNT_INFO("02"),
        MERCHANT_CATEGORY_CODE("52"),
        TRANSACTION_CURRENCY("53"),
        TRANSACTION_AMOUNT("54"),
        TRANSACTION_TIP("55"),
        TRANSACTION_VALUE_OF_CONVENIENCE_FEE_FIXED("56"),
        TRANSACTION_VALUE_OF_CONVENIENCE_FEE_PERCENTAGE("57"),
        COUNTRY_CODE("58"),
        MERCHANT_NAME("59"),
        MERCHANT_CITY("60"),
        POSTAL_CODE("61"),
        ADDITION_DATA_TEMPLATE("62"),
        MERCHANT_INFO_PAYSE("26"),
        PAYSE_MERCHANT_ACCOUNT("2601"),
        PAYSE_MERCHANT_SIGNATURE("2602");

        String value;
        TagInfo(String value) {
        this.value=value;
        }
        public String getValue(){
            return value;
        }
    }

    /**
     * This method is used to get PayseTagData object with default values for tag type.
     * @param  type mapped to qr code type i.e. static or dynamic
     * @return PayseTagData with default value. Use toString() method to get json string as required by apps to generate qr-code
     */
    public static PayseTagData createTagDataByType(String type){
        PayseTagData tagData=new PayseTagData();
        tagData.setPAYLOAD_FORMAT_INDICATOR("00");
        if(type.equalsIgnoreCase(Constants.QR_CODE_STATIC)){
            tagData.setPOINT_OF_INITIATION("11");
        } else if(type.equalsIgnoreCase(Constants.QR_CODE_DYNAMIC)){
            tagData.setPOINT_OF_INITIATION("12");
            tagData.setTRANSACTION_CURRENCY("356");
        }
        tagData.setCOUNTRY_CODE("IN");
        return tagData;
    }

    /**
     * This method is used to generate CRC as per ISO/IEC 13239 standard mentioned in document
     * @param bytes
     */
    public static String generateCRCOnByteString(byte[] bytes) {
            int crc = 0xFFFF;          // initial value
            int polynomial = 0x1021;   // 0001 0000 0010 0001  (0, 5, 12)
            for (byte b : bytes) {
                for (int i = 0; i < 4; i++) {
                    boolean bit = ((b   >> (7-i) & 1) == 1);
                    boolean c15 = ((crc >> 15    & 1) == 1);
                    crc <<= 1;
                    if (c15 ^ bit) crc ^= polynomial;
                }
            }
            crc &= 0xffff;
        return Integer.toHexString(crc);
    }
     public static void main(String[] args) throws UnsupportedEncodingException {
        PayseTagData tagData=Utility.createTagDataByType(Constants.QR_CODE_DYNAMIC);
        String tagStringFromObject=tagData.qrcodeDataString();
         System.out.println(tagStringFromObject);
         System.out.println(generateCRCOnByteString(tagStringFromObject.getBytes("ASCII")));
        //HashMap parsedDataMap=QrCodec.parseTagData(tagStringFromObject);
        //boolean tagDataValidationStatus=QrCodec.validateTagData(parsedDataMap);
       // System.out.println(tagDataValidationStatus);
    }
}

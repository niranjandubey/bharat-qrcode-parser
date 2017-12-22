package com.niranjan.main;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class QrCodec {

    public String parseQrCodeInputBytes(byte[] input){
        return null;
    }

    public String parseQrCodeInputString(String input){
        return null;
    }

    public static HashMap<String, byte[]> parseTLV(byte[] data) {
        HashMap<String, byte[]> result = new HashMap();
        int index = 0;
        int number = data[index++];
        for (int i = 0; i < number; i++) {
            byte tag = data[index++];
            byte length = data[index++];
            byte[] value = new byte[length];
            System.arraycopy(data, index, value, 0, length);
            index += length;
            result.put(String.format("%02x", tag), value);
        }
        return result;
    }

    /**
     * This method parses the qr-code data to map
     * @param data qr-code data string
     * @return map with tag and their values
     */
    public static HashMap<Integer, String> parseTagData(String data) {
        HashMap<Integer, String> result = new HashMap();
        int index = 0;
        int number = data.length();
        int counter=0;
        while(index<number) {
            int tag =  Integer.parseInt(data.charAt(index)+""+data.charAt(++index)+"");
            int length = Integer.parseInt(data.charAt(++index)+""+data.charAt(++index)+"");
            String value = String.copyValueOf(data.toCharArray(),++index,length);
            index=index+length;
            result.put( tag, value);
        }
        return result;
    }

    /**
     * This method is used to validate tag data
     * @param parsedData i.e. map of tag and values as parsed from qr-code
     * @return true or false depends upon if tag is correct or not
     */
    public static boolean validateTagData( HashMap<Integer, String> parsedData){
        boolean flag=false;
        if(parsedData.get(0)!=null && parsedData.get(52)!=null && parsedData.get(53)!=null && parsedData.get(58)!=null && parsedData.get(59)!=null
                && parsedData.get(60)!=null && parsedData.get(63)!=null){
            flag= true;
        }
        if(parsedData.get(2)!=null||parsedData.get(3)!=null||parsedData.get(4)!=null||parsedData.get(5)!=null||parsedData.get(6)!=null||parsedData.get(7)!=null||parsedData.get(8)!=null||parsedData.get(9)!=null||parsedData.get(10)!=null||
                parsedData.get(11)!=null||parsedData.get(12)!=null||parsedData.get(13)!=null||parsedData.get(14)!=null||parsedData.get(15)!=null||parsedData.get(16)!=null||parsedData.get(17)!=null||parsedData.get(18)!=null||parsedData.get(19)!=null||
                parsedData.get(20)!=null||parsedData.get(21)!=null||parsedData.get(22)!=null
                ||parsedData.get(23)!=null||parsedData.get(24)!=null||parsedData.get(25)!=null||parsedData.get(26)!=null||parsedData.get(27)!=null||parsedData.get(28)!=null||parsedData.get(29)!=null||
                parsedData.get(30)!=null||parsedData.get(31)!=null||parsedData.get(32)!=null||parsedData.get(33)!=null||parsedData.get(34)!=null||parsedData.get(35)!=null||parsedData.get(36)!=null||parsedData.get(37)!=null||parsedData.get(38)!=null||parsedData.get(39)!=null||
                parsedData.get(40)!=null||parsedData.get(41)!=null||parsedData.get(42)!=null||parsedData.get(43)!=null||parsedData.get(44)!=null||parsedData.get(45)!=null||parsedData.get(46)!=null||parsedData.get(47)!=null||parsedData.get(48)!=null||parsedData.get(49)!=null||parsedData.get(50)!=null||parsedData.get(51)!=null){
            flag=true;
        } else {
            flag=false;
        }
        return flag;
    }




    public static void main(String[] args) throws UnsupportedEncodingException {
        String tagString="000201010211021644038441210559050415522024041210559061661000304121055980827HDFC000000100000303500179145204939953033565802IN5925DELHI METRO RAIL CORPORAT6009NEW DELHI610611002362120708412105596304142D";
        //parseTagData(tagString);
        String converstedString="30303032303130313032313130323136343430333834343132313035353930353034313535323230323430343132313035353930363136363130303033303431323130353539383038323748444643303030303030313030303030333033353030313739313435323034393339393533303333353635383032494e3539323544454c4849204d4554524f205241494c20434f52504f524154363030394e45572044454c484936313036313130303233363231323037303834313231303535393633303431343244";
        String parsedString= Utility.convertHexToString(converstedString);
        HashMap<Integer, String> parseTagData=parseTagData(parsedString);
        System.out.println(validateTagData(parseTagData));
        //System.out.println(Utility.toHex(tagString));
    }
}
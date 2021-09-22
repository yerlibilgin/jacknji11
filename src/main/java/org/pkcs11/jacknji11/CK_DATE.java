package org.pkcs11.jacknji11;


public class CK_DATE {
  public byte[] year; //4
  public byte[] month; //2
  public byte[] day; //2

  public CK_DATE() {
  }

  public CK_DATE(byte[] year, byte[] month, byte[] day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public byte[] toByteArray(){
    byte []result = new byte[8];

    int i = 0, j = 0;

    result[i++] = year[j++];
    result[i++] = year[j++];
    result[i++] = year[j++];
    result[i++] = year[j++];
    j = 0;

    result[i++] = month[j++];
    result[i++] = month[j++];
    j = 0;

    result[i++] = day[j++];
    result[i++] = day[j++];

    return result;
  }
}

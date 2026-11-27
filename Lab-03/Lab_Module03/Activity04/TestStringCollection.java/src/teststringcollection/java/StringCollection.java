/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teststringcollection.java;
import java.util.ArrayList;

/**
 *NAMA: AISYAH SYAFIQAH BINTI MOHD ZAHIB
 *MATRIX: S74405 
 *TASK: :Implement enumeration concept for listing of subject.
 Using toString() method and ArrayList()class
 */
import java.util.ArrayList;

public class StringCollection {

    private String str1;
    private String str2;

    ArrayList<String> objStringCollection = new ArrayList<String>();

    public StringCollection(String str1, String str2) {
        setStr1(str1);
        setStr2(str2);

        objStringCollection.add(getStr1());
        objStringCollection.add(getStr2());
    }

    public String getStr1() {
        return this.str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr2() {
        return this.str2;
    }

    public void setStr2(String str) {
        this.str2 = str;
    }

    public String toString() {
        String result = "COLLECTION OF ARRAYLIST:\n";
        for (String s : objStringCollection) {
            result += "- " + s + "\n";
        }
        return result;
    }
}

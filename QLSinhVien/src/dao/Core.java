/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hieu
 */
public class Core {

    public static List<String> DocFileCSV(String FileName) throws IOException {
        List<String> lstValue = new ArrayList<String>();
        FileReader fr = new FileReader(FileName);
        String value = "";
        int ind = 1;
        while (true) {
            int i = fr.read();
            if (i == -1) {
                lstValue.add(value);
                break;
            }
            char ch = (char) i;
            if ((char) i == ',') {
                lstValue.add(value);
                value = "";
                ind++;
            } else if ((char) i == '\n') {
                lstValue.add(value);
                value = "";
                ind = 1;
            } else {
                value += (char) i;
            }
        }
        fr.close();
        return lstValue;
    }
}

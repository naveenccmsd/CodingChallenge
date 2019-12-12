package test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

       private int has = 0;
       
       
    
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + has;
        return result;
    }


    
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Test other = (Test) obj;
        if (has != other.has)
            return false;
        return true;
    }


    public static void main(String args[]) {
        List<String> s = new ArrayList<String>();
//        s.indexOf(o)
    }
}

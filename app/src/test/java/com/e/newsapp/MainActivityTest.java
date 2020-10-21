package com.e.newsapp;

import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

public class MainActivityTest {

    /**
     * Should return country lowercase name.
     *
     */

    @Test
    public void testGetCountry() {

        String country = MainActivity.getCountry();
        Assert.assertTrue(isStringLowerCase(country) == true);
    }

    private static boolean isStringLowerCase(String str){

        //convert String to char array
        char[] charArray = str.toCharArray();

        for(int i=0; i < charArray.length; i++){

            //if any character is not in lower case, return false
            if( !Character.isLowerCase( charArray[i] ))
                return false;
        }

        return true;

    }
}
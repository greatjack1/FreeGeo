package com.wyre.FreeGeoTests;

import org.junit.Test;
import com.wyre.FreeGeo.*;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * This is used to test the library
 * I hope to eventually add in dependency injection into the main library to be able to test each
 * part individually, but for now this will have to do
 * Created by yaakov on 9/25/17.
 */
public class FreeGeoTest {

    @Test
    /**
     * Just a Basic Dumb Method to test the free Geo Library for errors
     */
    public void TestFreeGeo(){
        try {
            FreeGeo geo = new FreeGeo("1010 East 4th street");
        } catch(Exception ex){
            System.out.println("Error:" + ex.toString());
        }
    }
}
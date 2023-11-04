package com.febri.junitfebri;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LuasPersegiPanjangTest {
    private LuasPersegiPanjang luasPersegiPanjang = new LuasPersegiPanjang();

    @Test
    public void Test(){
        //inisialisasi atau pemberian niai sisi
        int lebar = luasPersegiPanjang.luasPesegiPanjang(5,10);
        //eksesusi jawaban
        assertEquals(50,lebar);
    }
}

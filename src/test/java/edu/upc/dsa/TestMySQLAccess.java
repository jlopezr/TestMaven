package edu.upc.dsa;

import junit.framework.Assert;
import org.junit.Test;

public class TestMySQLAccess {

    @Test
    public void test() throws Exception {
        MySQLAccess dao = new MySQLAccess();
        dao.readDataBase();
    }
} 
package com.bn.opentext;

import org.testng.annotations.Test;

public class GroupWithIncludeExcludeOptionFile {

    @Test
    public void test1None() {
        System.out.println("inside ->test1, Neither smoke nor regression.");
    }

    @Test(groups = { "smoke", "19.4" })
    public void test2Smoke() {
        System.out.println("inside ->test2, Smoke and 19.4 only");
    }

    @Test(groups = { "smoke" })
    public void test3Smoke() {
        System.out.println("inside ->test3, Smoke and 19.4 only");
    }

    @Test(groups = { "regression", "19.4" })
    public void test4Regression() {
        System.out.println("inside ->test4, Regression only");
    }

    @Test(groups = { "regression", "19.4" })
    public void test5Regression() {
        System.out.println("inside ->test5, Regression only");
    }

    @Test(groups = { "smoke", "regression", "19.4" })
    public void test6SmokeRegression() {
        System.out.println("inside ->test6, Smoke, 19.4 and Regression ");
    }

    @Test(groups = { "smoke", "regression" })
    public void test7SmokeRegression() {
        System.out.println("inside ->test7, Smoke and Regression both");
    }
}

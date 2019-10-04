package com.bn.opentext;

import org.testng.annotations.Test;

public class GroupFile {

    @Test
    public void test1None() {
        System.out.println("inside GroupFile->test1, Neither smoke nor regression.");
    }

    @Test(description = "smoke test cases", groups = { "smoke" })
    public void test2Smoke() {
        System.out.println("inside GroupFile->test2, Smoke only");
    }

    @Test(description = "regression testcases", groups = { "regression" })
    public void test3Regression() {
        System.out.println("inside GroupFile->test3, Regression only");
    }

    @Test(description = "smoke and regression both", groups = { "smoke", "regression" })
    public void test4SmokeRegression() {
        System.out.println("inside GroupFile->test4, Smoke and Regression both");
    }
}

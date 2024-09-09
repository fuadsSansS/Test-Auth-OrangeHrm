package com.juaracoding.TestOrangeHrm.scenariomapping;

public enum LoginTesting {

    T1("TCLP001 Login Menggunakan Credential Valid"),
    T2("TCLN001 Login Menggunakan Username Dan Password Kosong"),
    T3("TCLN002 Login Menggunakan Username Valid Password Tidak Valid"),
    T4("TCLN003 Login Menggunakan Username Tidak Valid Password Valid"),
    T5("TCLN004 Login Menggunakan Username Kosong Password Valid"),
    T6("TCLN005 Login Menggunakan Username Kosong Password Tidak Valid"),
    T7("TCLN006 Login Menggunakan Username Valid Password Kosong"),
    T8("TCLN007 Login Menggunakan Username Tidak Valid Password Kosong");

    private String testName;

    private LoginTesting(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }
}
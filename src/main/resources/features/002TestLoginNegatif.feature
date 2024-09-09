Feature: Login Feature
  Scenario: TCLN001 Login Menggunakan Username Dan Password Kosong
    Given TCLN001 Mengakses Halaman Login
    And TCLN001 Validasi Halaman Login
    And TCLN001 Clear Input Username Dan Password
    And TCLN001 Input Username Empty String
    And TCLN001 Input Password Empty String
    And TCLN001 Tekan Tombol Login
    Then TCLN001 Validasi Setelah Tombol Di Tekan

  Scenario: TCLN002 Login Menggunakan Username Valid Password Tidak Valid
    Given TCLN002 Mengakses Halaman Login
    And TCLN002 Validasi Halaman Login
    And TCLN002 Clear Input Username Dan Password
    And TCLN002 Input Username Valid
    And TCLN002 Input Password Tidak Valid
    And TCLN002 Tekan Tombol Login
    Then TCLN002 Validasi Setelah Tombol Di Tekan

  Scenario: TCLN003 Login Menggunakan Username Tidak Valid Password Valid
    Given TCLN003 Mengakses Halaman Login
    And TCLN003 Validasi Halaman Login
    And TCLN003 Clear Input Username Dan Password
    And TCLN003 Input Username Tidak Valid
    And TCLN003 Input Password Valid
    And TCLN003 Tekan Tombol Login
    Then TCLN003 Validasi Setelah Tombol Di Tekan

  Scenario: TCLN004 Login Menggunakan Username Kosong Password Valid
    Given TCLN004 Mengakses Halaman Login
    And TCLN004 Validasi Halaman Login
    And TCLN004 Clear Input Username Dan Password
    And TCLN004 Input Username Kosong
    And TCLN004 Input Password Valid
    And TCLN004 Tekan Tombol Login
    Then TCLN004 Validasi Setelah Tombol Di Tekan

  Scenario: TCLN005 Login Menggunakan Username Kosong Password Tidak Valid
    Given TCLN005 Mengakses Halaman Login
    And TCLN005 Validasi Halaman Login
    And TCLN005 Clear Input Username Dan Password
    And TCLN005 Input Username Kosong
    And TCLN005 Input Password Tidak Valid
    And TCLN005 Tekan Tombol Login
    Then TCLN005 Validasi Setelah Tombol Di Tekan

  Scenario: TCLN006 Login Menggunakan Username Valid Password Kosong
    Given TCLN006 Mengakses Halaman Login
    And TCLN006 V6alidasi Halaman Login
    And TCLN006 Clear Input Username Dan Password
    And TCLN006 Input Username Valid
    And TCLN006 Input Password Kosong
    And TCLN006 Tekan Tombol Login
    Then TCLN006 Validasi Setelah Tombol Di Tekan

  Scenario: TCLN007 Login Menggunakan Username Tidak Valid Password Kosong
    Given TCLN007 Mengakses Halaman Login
    And TCLN007 Validasi Halaman Login
    And TCLN007 Clear Input Username Dan Password
    And TCLN007 Input Username Tidak Valid
    And TCLN007 Input Password Kosong
    And TCLN007 Tekan Tombol Login
    Then TCLN007 Validasi Setelah Tombol Di Tekan


Feature: Login Feature
  Scenario: TCLP001 Login Menggunakan Credential Valid
    Given TCLP001 Mengakses Halaman Login
    And TCLP001 Validasi Berada Di Halaman Login
    And TCLP001 Clear Input Username Dan Password
    And TCLP001 Input Username Di FIeld Username
    And TCLP001 Input Password Di Field Password
    And TCLP001 Tekan Tombol Login
    And TCLP001 Validasi Halaman Home
    And TCLP001 Tekan Dropdown Menuju Logout
    And TCLP001 Tekan Tombol Logout
    Then TCLP001 Validasi Berhasil Logout
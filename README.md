# Repository Tugas QA JLabs

## List Tugas (tugasqajlabs2022)
Tugas 1

Membuat input suatu array minimal 5 anggota dengan menggunakan treemap dan treeset.

```bash
src/main/java

com.javaprogram

Tugas1.java
```
Tugas 2

Membuat Kalkulator dengan 2 input.

Ketika menjalankan tugas2.java akan langsung otomatis mengeluarkan:
 
Penjumlahan 2 angka

Pengurangan 2 angka

Pembagian 2 angka

Perkalian 2 angka

Bila pengurangan 2 angka tersebut ada dibawah 0, maka akan mengeluarkan throw error.

Nb: Menggunakan Getter Setter


```bash
src/main/java

com.javaprogram

#Getter & Setter
Tugas2Kalkulator.java 

#Runner
Tugas2Runner.java
```

Tugas 3

Menambahkan assertion dan skenario untuk Apptest dan juga AppTestPageFactory. Skenario yang ditambahkan adalah, ketika sudah login, maka akan logout dan assert bahwa logout berhasil.

Given I open http://the-internet.herokuapp.com/login

When I input username tomsmith

And I input password SuperSecretPassword!

And I click login button

And I get login to secure area and got text You logged into a secure area!

And I click Logout Button

Then I go back to login Page


```bash
src/test/java

qaautomation.tugasqajlabs2022

#AppTest
AppTest.java

#AppTestPageFactory
AppTestPageFactory.java
```

Tugas 4

Open Yopmail, and input automationtest and then extract the first email using switch iframe.

Given I open yopmail.com

When I input username testautomation

And I click arrow button

Then I can print first email in that username


```bash
src/test/java

qaautomation.tugasqajlabs2022

SwitchPageTest.java
```

Tugas 5

Given I open https://kolakproject.herokuapp.com/register

When I input username,password,email, and phone number

And I send request POST

Then I register new username

Nb: Username, password, email, and phone number must be generated by faker.java

```bash
src/test/java

qaautomation.tugasqajlabs2022

APITest.java
```

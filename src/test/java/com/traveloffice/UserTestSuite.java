package com.traveloffice;

import org.junit.*;

public class UserTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests of class " + User.class);
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    private User generateUser() {
        User user = new User("email@server.com", "Carl",
                "Cox", "4 Longstreet, LA", "66587423");
        return user;
    }

    @Test
    public void testGetUserId() {
       //Given
        User user1 = generateUser();
       //When
        int id = user1.getUserId();
       //Then
        Assert.assertEquals(0,id);
    }

    @Test
    public void testSetUserId() {
        //Given
        User user1 = generateUser();
        int id = 3;
        //When
        user1.setUserId(id);
        //Then
        Assert.assertEquals(id,user1.getUserId());

    }

    @Test
    public void testGetEmail() {
        //Given
        User user1 = generateUser();
        //When
        String email = user1.getEmail();
        //Then
        Assert.assertEquals("email@server.com", email);
    }

    @Test
    public void testSetEmail() {
        //Given
        User user1 = generateUser();
        String email = "newmail@newserv.pl";
        //When
        user1.setEmail(email);
        //Then
        Assert.assertEquals(email, user1.getEmail());
    }

    @Test
    public void testGetName() {
        //Given
        User user1 = generateUser();
        //When
        String name = user1.getName();
        //Then
        Assert.assertEquals("Carl", name);
    }

    @Test
    public void testSetName() {
        //Given
        User user1 = generateUser();
        String newName = "Karol";
        //When
        user1.setName(newName);
        //Then
        Assert.assertEquals(newName, user1.getName());
    }

    @Test
    public void testGetSurame() {
        //Given
        User user1 = generateUser();
        //When
        String surname = user1.getSurname();
        //Then
        Assert.assertEquals("Cox", surname);
    }

    @Test
    public void testSetSurname() {
        //Given
        User user1 = generateUser();
        String newSurname = "Kowalski";
        //When
        user1.setSurname(newSurname);
        //Then
        Assert.assertEquals(newSurname, user1.getSurname());
    }

    @Test
    public void testGetAddress() {
        //Given
        User user1 = generateUser();
        //When
        String address = user1.getAddress();
        //Then
        Assert.assertEquals("4 Longstreet, LA", address);
    }

    @Test
    public void testSetAddress() {
        //Given
        User user1 = generateUser();
        String newAddress = "ul. Mokotowska 23, Warszawa";
        //When
        user1.setAddress(newAddress);
        //Then
        Assert.assertEquals(newAddress, user1.getAddress());
    }

    @Test
    public void testGetPhone() {
        //Given
        User user1 = generateUser();
        //When
        String phone = user1.getPhone();
        //Then
        Assert.assertEquals("66587423", phone);
    }

    @Test
    public void testSetPhone() {
        //Given
        User user1 = generateUser();
        String newPhone = "112";
        //When
        user1.setPhone(newPhone);
        //Then
        Assert.assertEquals(newPhone, user1.getPhone());
    }

}

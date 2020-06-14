package com.traveloffice;

import org.junit.*;

import java.util.HashSet;
import java.util.Set;

public class UserRepositoryTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests of class " + UserRepository.class);
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
    public void testAddUser() {
        //Given
        UserRepository userRepository = new UserRepository();
        User user = generateUser();
        //When
        userRepository.addUser(user);
        //Then
        Assert.assertTrue(userRepository.getAll().contains(user));
    }

    @Test
    public void testGetAll() {
        //Given
        UserRepository userRepository = new UserRepository();
        User user = generateUser();
        userRepository.addUser(user);
        Set<User> expectedSet = new HashSet<>();
        expectedSet.add(user);
        //When
        Set userSet = userRepository.getAll();
        //Then
        Assert.assertEquals(expectedSet, userSet);
    }

    @Test
    public void testGetUserById() {
        //Given
        UserRepository userRepository = new UserRepository();
        User user = generateUser();
        userRepository.addUser(user);
        //When
        User gainedUser = userRepository.getUserById(1);
        //Then
        Assert.assertEquals(user, gainedUser);
    }
}

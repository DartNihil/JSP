package by.tms.service;

import by.tms.entity.User;
import by.tms.storage.InMemoryUserDataStorage;

import javax.servlet.Registration;

public class RegistrationService {
    private final InMemoryUserDataStorage inMemoryUserDataStorage = new InMemoryUserDataStorage();

    public User getUserData(User user) {

        return user;
    }
}

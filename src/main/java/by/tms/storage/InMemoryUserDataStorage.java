package by.tms.storage;

import by.tms.entity.User;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserDataStorage {
    private static final List<User> userDataBases = new ArrayList<>();
    public void save(User user) {
        userDataBases.add(user);
    }
}

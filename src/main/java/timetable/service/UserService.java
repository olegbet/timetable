package timetable.service;

import timetable.entities.Event;
import timetable.entities.User;
import timetable.enums.EventStatus;
import timetable.enums.UserRole;

import java.util.Date;
import java.util.List;

public interface UserService {
    User getUserById(Integer id);
    void saveUser(User user);
    void deleteUserbyId(Integer id);
    void updateUser(int id, String name, UserRole role, String password);
    List<User> findAll();
}
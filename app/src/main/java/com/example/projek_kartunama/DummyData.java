package com.example.projek_kartunama;

import java.util.ArrayList;
import java.util.List;

public class DummyData {
    public static List<User> getDummyUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Andi Saputra", "Mobile Developer", "andi@example.com"));
        users.add(new User("Budi Santoso", "UI/UX Designer", "budi@example.com"));
        users.add(new User("Citra Ayu", "Project Manager", "citra@example.com"));
        users.add(new User("Dian Rahma", "Data Analyst", "dian@example.com"));
        users.add(new User("Eko Prasetyo", "QA Engineer", "eko@example.com"));
        return users;
    }
}

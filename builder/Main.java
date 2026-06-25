package org.thiru.builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder(1)
                .setName("thiru")
                .setEmail("abc@gmail.com")
                .build();

        System.out.println(user);
    }
}

package org.thiru.builder;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private String phone;
    private int age;

    public User(UserBuilder userBuilder) {
        this.id = userBuilder.id;
        this.name = userBuilder.name;
        this.age = userBuilder.age;
        this.email = userBuilder.email;
        this.password = userBuilder.password;
        this.phone = userBuilder.phone;
    }

    public static class UserBuilder {
        private int id;
        private String name;
        private String email;
        private String password;
        private String phone;
        private int age;

        public UserBuilder(int id) {
            this.id = id;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

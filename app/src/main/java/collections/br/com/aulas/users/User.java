package main.java.collections.br.com.aulas.users;
public class User {
    private String name;
    private String code;
    private int age;

    public User(String name, String code, int age) {
        this.name = name;
        this.code = code;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override 
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return code.equals(user.code);
    }

    @Override 
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", age=" + age +
                '}';
    }
}

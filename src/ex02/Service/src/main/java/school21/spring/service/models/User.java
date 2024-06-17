package school21.spring.service.models;

import java.util.Objects;

public class User {

    private long id;
    private String email;
    private String password = "";

    public User(long id, String email) {
        this.setId(id);
        this.setEmail(email);
        this.password = "";

    }

    public User() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        school21.spring.service.models.User user = (school21.spring.service.models.User) o;
        return getId() == user.getId() && Objects.equals(getEmail(), user.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getEmail());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() +
                ", email='" + getEmail() + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

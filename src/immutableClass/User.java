package immutableClass;

import java.util.*;
final class User {
    private final int id;
    private final List<String> roles;

    public User(int id, List<String> roles) {
        this.id = id;
        this.roles = new ArrayList<>(roles);
    }

    public List<String> getRoles() {
        return Collections.unmodifiableList(roles);
    }
}

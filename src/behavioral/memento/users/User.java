package behavioral.memento.users;

public class User {

    private String name;
    private String phone;
    private String role;


    public void setName(String name) {
        this.name = name;
        System.out.println("Name=" + name);
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
        System.out.println("Phone=" + phone);
    }

    public String getPhone() {
        return phone;
    }

    public void setRole(String role) {
        this.role = role;
        System.out.println("Role=" + role);
    }

    public String getRole() {
        return role;
    }

    public Memento saveMemento() {
        System.out.println("\nSaving the state\n");

        Memento m = new Memento();
        m.setName(name);
        m.setPhone(phone);
        m.setRole(role);

        return m;
    }

    public void restoreMemento(Memento memento) {
        System.out.println("\nRestoring the state\n");

        setName(memento.getName());
        setPhone(memento.getPhone());
        setRole(memento.getRole());
    }
}

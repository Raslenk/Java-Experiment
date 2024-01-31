public class User {
    private String firstName;
    private String lastName;
    private Membership membership;
    private int age;
    private Double balance;

    User(String name, int age, Membership membership){
        setName(name);
        setAge(age);
        setMembership(membership, age);
    }

    public enum Membership{
        Basic, Premium;
    }

    public void setName(String name) {
        String[] substrings = name.split(" ");
        this.firstName = substrings[0];
        this.lastName = substrings[1];
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public void setMembership(Membership membership, int age){
        if (age < 18) {
            this.membership = Membership.Basic;
            return;
        }
        this.membership = membership;
    }

    public Membership getMembership() {
        return this.membership;
    }
}

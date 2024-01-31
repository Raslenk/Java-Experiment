public class App {

    

    public static void main(String[] args) throws Exception {

        User user1, user2;
        user1 = new User("Raslen Kacem",20, User.Membership.Premium);
        user2 = new User("Farkh Zebi",17, User.Membership.Premium);
        
        System.out.println("Hello, " + user1.getName() + " " + user1.getAge()
        + " Status: " + user1.getMembership());
        System.out.println("Hello, " + user2.getName() + " " + user2.getAge()
        + " Status: " + user2.getMembership());
    }
}

public class App {

    public static void main(String[] args) throws Exception {

        User user1, user2, user3;
        user1 = new User("Raslen Kacem",20, User.Membership.Premium);
        user2 = new User("Omar Sebri",17, User.Membership.Premium);
        user3 = new User("Mahdi Chiboub",24, User.Membership.Premium);
        
        System.out.println("Hello, " + user1.getName() + " " + user1.getAge()
        + " Status: " + user1.getMembership());
        System.out.println("Hello, " + user2.getName() + " " + user2.getAge()
        + " Status: " + user2.getMembership());
        System.out.println("Hello, " + user3.getName() + " " + user3.getAge()
        + " Status: " + user3.getMembership());
    }
}

package tjdpc;

public class ClientMediator {
    public static void main(String[] args) {

        ChatMediator mediator = new ChatMediatorImpl();

        UserMediator user1 = new UserImpl(mediator, "Jason");
        UserMediator user2 = new UserImpl(mediator, "Jennifer");
        UserMediator user3 = new UserImpl(mediator, "Lucy");
        UserMediator user4 = new UserImpl(mediator, "Ian");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");
    }
}
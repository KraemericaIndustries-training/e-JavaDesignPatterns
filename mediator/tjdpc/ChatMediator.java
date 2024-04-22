package tjdpc;

import java.util.ArrayList;
import java.util.List;

interface ChatMediator {
    public void sendMessage(String msg, UserMediator user);
    void addUser(UserMediator user);
}

class ChatMediatorImpl implements ChatMediator {
    private List<UserMediator> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(UserMediator user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, UserMediator user) {
        for (UserMediator u:this.users) {
            // message should not be received by the user sending it
            if(u != user) {
                u.receive(msg);
            }
        }
    }
}
package tjdpc;

//  Duck is the target.  We are turning a Turkey into something that can be used like a duck
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    //  Turkeys do not quack, they gobble, so when asking the adaptee to quack, it gobbles instead
    public void quack() {
        turkey.gobble();
    }

    //  Turkeys fly shorter distances than ducks, so when the adaptee is made to fly, fly it 5 times, so it flies as far as a duck
    public void fly() {
        for(int i = 0; i < 5; i++)
            turkey.fly();
    }
}

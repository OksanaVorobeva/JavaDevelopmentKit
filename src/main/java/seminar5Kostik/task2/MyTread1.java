package seminar5Kostik.task2;

public class MyTread1 extends  Thread{
    private MyProgramState state;

    public MyTread1(MyProgramState state) {
        this.state = state;
    }

    @Override
    public void run() {
        while (!state.isFinish()){
            //поменяли флаг
            state.setSwitcher(!state.isSwitcher());
            if (!state.isSwitcher()){
                System.out.println("пауза");
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

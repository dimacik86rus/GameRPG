package InstallationInstalSetingsGme;

public class Time {

    public boolean timeOn = true;

    private int time = 0;

    public void timeSetting(boolean timeOnOf){
        this.timeOn = timeOnOf;
        if (timeOn == true){
            time = 1000;
        }
        else {
            time = 0;
        }
    }
    public void fightTime() throws InterruptedException {
            System.out.println("<------Бой начнется через 3 секунды------>");
            Thread.sleep(time);
            System.out.println("<------Бой начнется через 2 секунды------>");
            Thread.sleep(time);
            System.out.println("<------Бой начнется через 1 секунды------>");
            Thread.sleep(time);

    }

    public void runLocation4() throws InterruptedException {
            System.out.println("<------Отправился будет на месте через 4 секунды------>");
            Thread.sleep(time);
            System.out.println("<------Отправился будет на месте через 3 секунды------>");
            Thread.sleep(time);
            System.out.println("<------Отправился будет на месте через 2 секунды------>");
            Thread.sleep(time);
            System.out.println("<------Отправился будет на месте через 1 секунды------>");
            Thread.sleep(time);
    }

    public void runLocation7() throws InterruptedException {
            System.out.println("<------Отправился будет на месте через 7 секунды------>");
            Thread.sleep(time);
            System.out.println("<------Отправился будет на месте через 6 секунды------>");
            Thread.sleep(time);
            System.out.println("<------Отправился будет на месте через 5 секунды------>");
            Thread.sleep(time);
            System.out.println("<------Отправился будет на месте через 4 секунды------>");
            Thread.sleep(time);
            System.out.println("<------Отправился будет на месте через 3 секунды------>");
            Thread.sleep(time);
            System.out.println("<------Отправился будет на месте через 2 секунды------>");
            Thread.sleep(time);
            System.out.println("<------Отправился будет на месте через 1 секунды------>");
            Thread.sleep(time);

    }
    public void runLocation2() throws InterruptedException {
            System.out.println("<------Отправился будет на месте через 2 секунды------>");
            Thread.sleep(time);
            System.out.println("<------Отправился будет на месте через 1 секунды------>");
            Thread.sleep(time);
    }
}

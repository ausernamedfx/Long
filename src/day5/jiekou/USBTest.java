package day5.jiekou;

public class USBTest {
    public static void main(String[] args) {

        Computer computer = new Computer();
        Flash flash = new Flash();
        computer.transferData(flash);

        computer.transferData(new Printer());
        computer.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("anonymous");
            }

            @Override
            public void stop() {
                System.out.println("anonymous");
            }
        });
    }
}


class Computer{
    public void transferData(USB usb){
        usb.start();
        System.out.println("具体的阐述细节");

        usb.stop();
    }
}


interface USB {
    void start();
    void stop();
}


class Flash implements USB{

    @Override
    public void start() {
        System.out.println("flash work");
    }

    @Override
    public void stop() {
        System.out.println("flash stop work");
    }
}

class Printer implements USB{

    @Override
    public void start() {
        System.out.println("printer work");
    }

    @Override
    public void stop() {
        System.out.println("printer stop");
    }
}
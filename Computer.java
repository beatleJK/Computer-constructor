public class Computer {
    private final Processor processor;
    private final Ram ram;
    private final Winchester winchester;
    private final Monitor monitor;
    private final Keyboard keyboard;
    private final String vendor;
    private final String name;

    public Computer(Processor processor, Ram ram, Winchester winchester, Monitor monitor, Keyboard keyboard,String vendor,String name) {
        this.processor = processor;
        this.ram = ram;
        this.winchester = winchester;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
    }

    public void getProcessor() {
        System.out.println();
        System.out.println("���������: ");
        System.out.println("�������: " + processor.getFrequency() + " ���");
        System.out.println("���������� ����: " + processor.getCores());
        System.out.println("�������������: " + processor.getProducer());
        System.out.println("���: " + processor.getWeight() + " �");
    }

    public Computer setProcessor(Processor processor) {
        return new Computer(processor,ram,winchester,monitor,keyboard,vendor,name);
    }

    public void getRam() {
        System.out.println();
        System.out.println("����������� ������: ");
        System.out.println("���: " + ram.getType());
        System.out.println("����� ������: " + ram.getVolume());
        System.out.println("���: " + ram.getWeight() + " �");
    }

    public Computer setRam(Ram ram) {
        return new Computer(processor,ram,winchester,monitor,keyboard,vendor,name);
    }

    public void getWinchester() {
        System.out.println();
        System.out.println("������� ����: ");
        System.out.println("���: " + winchester.getType());
        System.out.println("����� ������: " + winchester.getVolume());
        System.out.println("���: " + winchester.getWeight() + " �");
    }

    public Computer setWinchester(Winchester winchester) {
        return new Computer(processor,ram,winchester,monitor,keyboard,vendor,name);
    }

    public void getMonitor() {
        System.out.println();
        System.out.println("�������: ");
        System.out.println("���������: " + monitor.getDiagonal());
        System.out.println("���: " + monitor.getType());
        System.out.println("���: " + monitor.getWeight() + " �");
    }

    public Computer setMonitor(Monitor monitor) {
        return new Computer(processor,ram,winchester,monitor,keyboard,vendor,name);
    }

    public void getKeyboard() {
        System.out.println();
        System.out.println("����������: ");
        System.out.println("���: " + keyboard.getType());
        String s = (keyboard.isIllumination()) == true ? "yes" : "No";
        System.out.println("������� ���������: " + s);
        System.out.println("���: " + keyboard.getWeight() + "�");
    }

    public Computer setKeyboard(Keyboard keyboard) {
        return new Computer(processor,ram,winchester,monitor,keyboard,vendor,name);
    }
    public double totalWeight(){
        return processor.getWeight() + ram.getWeight() + keyboard.getWeight() + monitor.getWeight() +
                + winchester.getWeight();
    }
    public void write(){
        System.out.println("��� ����������: " + name);
        System.out.println("�������������: " + vendor);
        System.out.println("�������������� ����������:");
        getProcessor();
        getRam();
        getWinchester();
        getMonitor();
        getKeyboard();
        System.out.println("����� ����� ����������: " + totalWeight() + " �");
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}



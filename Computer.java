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
        System.out.println("Процессор: ");
        System.out.println("Частота: " + processor.getFrequency() + " ГГц");
        System.out.println("Количество ядер: " + processor.getCores());
        System.out.println("Производитель: " + processor.getProducer());
        System.out.println("Вес: " + processor.getWeight() + " г");
    }

    public Computer setProcessor(Processor processor) {
        return new Computer(processor,ram,winchester,monitor,keyboard,vendor,name);
    }

    public void getRam() {
        System.out.println();
        System.out.println("Оперативная память: ");
        System.out.println("Тип: " + ram.getType());
        System.out.println("Объем памяти: " + ram.getVolume());
        System.out.println("Вес: " + ram.getWeight() + " г");
    }

    public Computer setRam(Ram ram) {
        return new Computer(processor,ram,winchester,monitor,keyboard,vendor,name);
    }

    public void getWinchester() {
        System.out.println();
        System.out.println("Жесткий диск: ");
        System.out.println("Тип: " + winchester.getType());
        System.out.println("Объем памяти: " + winchester.getVolume());
        System.out.println("Вес: " + winchester.getWeight() + " г");
    }

    public Computer setWinchester(Winchester winchester) {
        return new Computer(processor,ram,winchester,monitor,keyboard,vendor,name);
    }

    public void getMonitor() {
        System.out.println();
        System.out.println("Монитор: ");
        System.out.println("Диагональ: " + monitor.getDiagonal());
        System.out.println("Тип: " + monitor.getType());
        System.out.println("Вес: " + monitor.getWeight() + " г");
    }

    public Computer setMonitor(Monitor monitor) {
        return new Computer(processor,ram,winchester,monitor,keyboard,vendor,name);
    }

    public void getKeyboard() {
        System.out.println();
        System.out.println("Клавиатура: ");
        System.out.println("Тип: " + keyboard.getType());
        String s = (keyboard.isIllumination()) == true ? "yes" : "No";
        System.out.println("Наличие подсветки: " + s);
        System.out.println("Вес: " + keyboard.getWeight() + "г");
    }

    public Computer setKeyboard(Keyboard keyboard) {
        return new Computer(processor,ram,winchester,monitor,keyboard,vendor,name);
    }
    public double totalWeight(){
        return processor.getWeight() + ram.getWeight() + keyboard.getWeight() + monitor.getWeight() +
                + winchester.getWeight();
    }
    public void write(){
        System.out.println("Имя компьютера: " + name);
        System.out.println("Производитель: " + vendor);
        System.out.println("Характеристики компьютера:");
        getProcessor();
        getRam();
        getWinchester();
        getMonitor();
        getKeyboard();
        System.out.println("Общая масса компьютера: " + totalWeight() + " г");
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}



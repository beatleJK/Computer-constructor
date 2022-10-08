public class Main {
    public static void main(String[] args){
        //Первый компьютер
        Processor processorPersonal = new Processor(1.7,2,ProducerProcessor.AMD,50.2);
        Ram ramPersonal = new Ram(TypeRam.DRAM,4.0,50.1);
        Keyboard keyboardPersonal = new Keyboard(TypeKeyboard.WIRED,true,41.3);
        Monitor monitorPersonal = new Monitor(15.6,TypeMonitor.IPS,20.8);
        Winchester winchesterPersonal = new Winchester(TypeWinchester.SSD,1000.7,45);
        Computer personal = new Computer(processorPersonal,ramPersonal,winchesterPersonal,monitorPersonal,keyboardPersonal,"Dell Computer","PK");
        personal.write();
        //Замена производителя
        personal = personal.setProcessor(processorPersonal.setProducer(ProducerProcessor.Intel));
        personal.write();
        //--------------------------------------------------------------------------------------------------------------
        //Второй компьютер
        Processor processorStation = new Processor(4.7,4,ProducerProcessor.Intel,70.1);
        Ram ramStation = new Ram(TypeRam.SRAM,8.4,70.1);
        Keyboard keyboardStation = new Keyboard(TypeKeyboard.WIRELESS,false,30.3);
        Monitor monitorStation = new Monitor(19.3,TypeMonitor.TN,25.8);
        Winchester winchesterStation = new Winchester(TypeWinchester.HDD,5000.9,100.1);
        Computer station = new Computer(processorStation,ramStation,winchesterStation,monitorStation,keyboardStation,"Apple","AplC");
        station.write();
    }
}

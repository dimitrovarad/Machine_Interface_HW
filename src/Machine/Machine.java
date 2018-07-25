package Machine;

//Създайте нов проект:
//- интерфейс Machine който ще отговаря за пускането и спирането на каквато и да е машина:
//(методи turnOn и turnOff)
//- интерфейс MobileDevice ще отговаря за активирането на WiFi устройства
//- Абстрактен клас Functions, който ще имплементира гореизброените интерфейси
//- Два класа Printer и Tractor които са машините които extend-дват Functions
//и ползват turnOff и turnOn за всяка машина (например в които има System.out.println("Turning ON our TRACTOR TKZS")),
//но само за принтера ще се активира WiFi-a.
//На края създайте MachineDemo клас в който ще е main метода от който можете да
//инстанцирате Printer и Tractor и да ползвате техните им функции.


public interface Machine {
     void turnOn();
     void turnOff();
}



package ch06.sec15.test;

public class PrinterExample {
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println(true);
		printer.println(10);
		printer.println(5.5);
		printer.println("고지수");
	}
}


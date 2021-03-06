package fastcampuswork.car;

public abstract class Car {
//	public abstract void start();
//	public abstract void drive();
//	public abstract void stop();
//	public abstract void turnOff();
	
	String carName;
	public Car() {
		 carName = this.getClass().getSimpleName();
//		 System.out.println("carName" + carName);
	}
	
	public void start() {System.out.println(carName + "시동을 켭니다.");};
	public void drive() {System.out.println(carName + "달립니다.");};
	public void stop() {System.out.println(carName + "멈춥니다.");}
	public void turnOff() {System.out.println(carName + "시동을 끕니다.");};
	
	public void washCar()
	{
		System.out.println("세차를 합니다.");
	}

	public void run()
	{
		start();
		drive();
		stop();
		turnOff();
		//washCar();
	}
}

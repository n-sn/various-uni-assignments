package race;

public class Main {
	
	//create components
	static Tires[] tiresArray = {new Tires(5, 520), new Tires(3, 400), new Tires(6, 600), new Tires(10, 2000)};
	static Motor[] motorsArray = {new Motor(5, 2050), new Motor(3, 1420), new Motor(2, 1050),new Motor(8, 10050)};
	static Battery[] batteriesArray = {new Battery(4800, 350), new Battery(4000, 320), new Battery(5180, 480), new Battery(2180, 130)}; 
	

	//create enemy cars
	final static Car enemy1 = new Car("enemy1", new Tires(5, 520), new Motor(3, 1420), new Battery(4800, 350));
	final static Car enemy2 = new Car("enemy2", new Tires(3, 400), new Motor(2, 1050), new Battery(4000, 320));
	final static Car enemy3 = new Car("enemy3", new Tires(6, 600), new Motor(5, 2050), new Battery(5180, 480));


	//create track
	final static Track track = new Track(600);
	
	public static void main(String[] args){
		
		//create personalCar
		Car myCar = new Car("myCar");
		myCar.buildCar(track, tiresArray, motorsArray, batteriesArray);
		
		//create list of participating cars
		Car[] cars = {myCar,enemy1, enemy2, enemy3};
		
		System.out.println("#########################");
		System.out.println("## List of cars        ##");
		System.out.println("#########################");
		
		for (int i=0;i<cars.length;i++){
			System.out.println("name: " + cars[i].getName());
			System.out.println("Consumption = " + cars[i].calculateConsumption() + " mAh/s" );
			System.out.println("Speed = " + cars[i].calculateSpeed() + " m/s");
			System.out.println();
		}
		
		//create a new Race
		Race race = new Race(cars, track);
		
		//run the race and collect the results
		Result[] results =race.calculateResults();
		
		System.out.println("#########################");
		System.out.println("## Race results        ##");
		System.out.println("#########################");
		
		//print the results
		for (int i=0;i< cars.length;i++){
			System.out.println("place: " + results[i].getPlace());
			System.out.println("name: " + results[i].getCar().getName());
			System.out.println("has finished race: " + results[i].getTrackFinished());
			System.out.println("time: " + results[i].getTime());
			System.out.println();
		}
	}
}

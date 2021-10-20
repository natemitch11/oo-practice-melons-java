import java.util.ArrayList;
import java.util.List;

public class MelonType {

	public static void main(String[] args) {
		System.out.println("melon type defined");
	}

	public static void harvest(){
		List<MelonType> melonTypes = getMelonTypes();
		Melon melon1 = new Melon(melonTypes.get(3), 8, 7, 2, "Sheila");
		Melon melon2 = new Melon(melonTypes.get(3), 3, 4, 2, "Sheila");
		Melon melon3 = new Melon(melonTypes.get(1), 10, 6, 35, "Sheila");
		Melon melon4 = new Melon(melonTypes.get(2), 8, 9, 35, "Michael");
		Melon melon5 = new Melon(melonTypes.get(2), 8, 2, 35, "Michael");
		Melon melon6 = new Melon(melonTypes.get(0), 6, 7, 4, "Micheal");
		Melon melon7 = new Melon(melonTypes.get(3), 7, 10, 3, "Sheila");

		melonsHarvested.add(melon1);
		melonsHarvested.add(melon2);
		melonsHarvested.add(melon3);
		melonsHarvested.add(melon4);
		melonsHarvested.add(melon5);
		melonsHarvested.add(melon6);
		melonsHarvested.add(melon7);
	}
	private static List<Melon> melonsHarvested = new ArrayList<>();

	public static List<Melon> getMelonsHarvested(){
		return melonsHarvested;
	}

	private static List<MelonType> getMelonTypes(){
		List<MelonType> melonTypes = new ArrayList<>();

		MelonType muskmelon = new MelonType("musk", "Muskmelon", 1998, "green", true, true);
		MelonType casaba = new MelonType("cas", "Casaba", 2003, "orange", false, false);
		MelonType crenshaw = new MelonType("cren", "Crenshaw", 1996, "green", false, false);
		MelonType yellowWatermelon = new MelonType("yw", "Yellow Watermelon", 2013, "yellow", false, true);

		melonTypes.add(muskmelon);
		melonTypes.add(casaba);
		melonTypes.add(crenshaw);
		melonTypes.add(yellowWatermelon);

		return melonTypes;
	}

	String code;
	int firstHarvest;
	String color;
	boolean isSeedless;
	boolean isBestseller;
    String name;

	private MelonType (String code,
		String name,
		int firstHarvest,
		String color,
		boolean isSeedless,
		boolean isBestseller) {

		this.code = code;
	    this.firstHarvest = firstHarvest;
	    this.color = color;
	    this.isSeedless = isSeedless;
	    this.isBestseller = isBestseller;
	    this.name = name;
	}
}

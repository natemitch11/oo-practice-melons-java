import java.util.List;

public class Melon {

	public static void main(String[] args) {
		System.out.println("melon defined");
	}

	private static List<Melon> melonsHarvested = MelonType.getMelonsHarvested();

	public static void getSellabilityReport() {
		for (Melon melon: melonsHarvested){
			String sellable;
			if (melon.isSellable()){
				sellable = "(CAN BE SOLD)";
			} else{
				sellable = "(NOT SELLABLE)";
			}
			System.out.printf("Harvested by %s from Field %s %s%n", melon.harvester, melon.field, sellable);
		}
	}


    MelonType melonType;
    int shapeRating;
    int colorRating;
    int field;
    String harvester;

	public Melon (MelonType melonType,
		   int shapeRating,
		   int colorRating,
		   int field,
		   String harvester) {
		this.melonType = melonType;
		this.shapeRating = shapeRating;
		this.colorRating = colorRating;
		this.field = field;
		this.harvester = harvester;
	}
	public boolean isSellable(){
		return this.colorRating > 5 && this.field != 3;
	}

}


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	Map <String, VirtualPet> shelter = new HashMap<>();
	Map <String, OrganicPets> organic = new HashMap<>();
	Map <String, RoboticPets> robotic = new HashMap<>();
	
	public Map<String, OrganicPets> getOrganicPets(){
		return organic;
	}
	public Map<String, RoboticPets> getRoboticPets(){
		return robotic;
	}
	
	public void addPetToShelter (VirtualPet pet) {
		shelter.put(pet.petName, pet);
	}
	public Collection<VirtualPet> fetchAllVirtualPets() {
		return shelter.values();
	}
	public VirtualPet getPetNames(String petName) {
		return shelter.get(petName);
	}
	public void removePetFromShelter(String petName) {
		shelter.remove(petName);
	}
	public VirtualPet getAPet(String petName) {
		return shelter.get(petName);
	}
	public int numberOfPets() {
		return fetchAllVirtualPets().size();
	}
	public Collection<String> getNameandType(){
		Collection<String> status = new ArrayList<>();
		for (VirtualPet pet: fetchAllVirtualPets()) {
			status.add(pet.getPetName() + " | " + pet.getPetType());
		}
		return status;
	}

	public void feedOrganicPets() {
		fetchAllVirtualPets().forEach(shelter -> {
			if(shelter instanceof OrganicPets) {
				((OrganicPets) shelter).feedPet();
			}
		});
	}

	public void waterOrganicPets() {
		fetchAllVirtualPets().forEach(shelter -> {
			if(shelter instanceof OrganicPets) {
				((OrganicPets) shelter).waterPet();
			}
		});
	}

	public void playWithPets() {
		fetchAllVirtualPets().forEach(shelter -> {
			if(shelter instanceof OrganicPets) {
				((OrganicPets) shelter).playWithPet();
			}
		});
	}

	public void restWithPets() {
		fetchAllVirtualPets().forEach(shelter -> {
			if (shelter instanceof OrganicPets) {
				((OrganicPets) shelter).restPets();
			}
		});
	}

	public void oilRoboticPets() {
		fetchAllVirtualPets().forEach(shelter -> {
			if(shelter instanceof RoboticPets) {
				((RoboticPets) shelter).oil();
			}
		});
	}
	public void maintanceRoboticPets() {
		fetchAllVirtualPets().forEach(shelter -> {
			if(shelter instanceof RoboticPets) {
				((RoboticPets) shelter).maintance();
			}
		});
	}
	public void cleanWaste() {
		fetchAllVirtualPets().forEach(shelter ->{
			if (shelter instanceof OrganicPets) {
				((OrganicPets)shelter).poopBreak();
			}
		});
	}

	public int numberOfRobotPets() {
		int count = 0;
		for (VirtualPet pets : fetchAllVirtualPets()) {
			if (pets instanceof RoboticPets) {
				count++;
			}
		}
		return count;
	}
	public int numberOfOrganicPets() {
		int count = 0;
		for (VirtualPet pets : fetchAllVirtualPets()) {
			if (pets instanceof OrganicPets) {
				count++;
			}
		}
		return count;
	}

	public void gameTick() {
		fetchAllVirtualPets().forEach(shelter -> {
			if (shelter instanceof RoboticPets) {
				((RoboticPets) shelter).roboticTick();
			}
			if (shelter instanceof OrganicPets) {
				((OrganicPets) shelter).organicPetTick();
			}
		});
	}
	public String status() {
		String space = "\t|";
		String statusChanges = "Name\t|Type\t|Health\t|Boredom|Hunger\t|Thirst\t|Waste\t|Dryness|Dirtyness\n";
		for (VirtualPet pet : fetchAllVirtualPets()) {
			String skip = "";
			if (pet instanceof OrganicDogs) {
				skip = "OrgDog";
			} else if (pet instanceof OrganicCats) {
				skip = "OrgCat";
			} else if (pet instanceof RoboticDog) {
				skip = "RobDog";
			} else {
				skip = "RobCat";
			}
			if (pet instanceof OrganicPets) {
				OrganicPets organic = (OrganicPets) pet;
				statusChanges += organic.getPetName() + space + skip + space + organic.getPetHealth() + space + organic.getHappy() + space
						+ organic.getPetEnergy() + space + organic.getPetFluid() + space + organic.getPetWaste() + space + "N/A" + space
						+ organic.getPetWaste() + "\n";
			} else {
				RoboticPets robot = (RoboticPets) pet;
				statusChanges += robot.getPetName() + space + skip + space + robot.getPetHealth() + space + robot.getPetHappiness() + space
						+ robot.getOil() + space + robot.getMaintance()  + space + "N/A" + space + "N/A"+ space + "N/A" + "\n";
			}
		}
		return statusChanges;
}
	public void cleanDogCage() {
		for (VirtualPet pets : fetchAllVirtualPets()) {
			if (pets instanceof OrganicDogs) {
				((OrganicPets)pets).cleanCage();
			}
		}
	}
	public void cleanCatBox() {
		for (VirtualPet pets : fetchAllVirtualPets()) {
			if (pets instanceof OrganicCats) {
				((OrganicPets)pets).cleanCage();
			}
		}
	}
}



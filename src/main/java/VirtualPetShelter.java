import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	Map<String, OrganicPets> organicPets = new HashMap<>();
	Map<String, RoboticPets> roboticPets = new HashMap<>();
	
	public Map<String, OrganicPets> getOrganicPetsFromMap() {
		return organicPets;
	}
	public Map<String, RoboticPets> getRoboticPetsFromMap() {
		return roboticPets;
	}
	public void setVirtualPetsOrganic(Map<String, OrganicPets> organicPets) {
		this.organicPets = organicPets;
	}
	public void setVirtualPetsRobot(Map<String, RoboticPets> roboticPets) {
		this.roboticPets = roboticPets;
	}
	public Collection<OrganicPets> getOrganicPets(){
		return organicPets.values();
	}
	public Collection<RoboticPets> getRoboticPets(){
		return roboticPets.values();
	}
	//Organic Pets
	public String listOfOrganicPetsAndType() {
		String status = "";
		for (OrganicPets organicPets: getOrganicPets()) {
			status += organicPets.getOrganicPetType() + " " + organicPets.getPetName() +"\n";
		}
		return status;
	}
	public int getOrganicPetCount() {
		return organicPets.size();
	}
	public void addOrganicPet (OrganicPets organicPets) {
		organicPets.put(organicPets.getOrganicPetType(), organicPets);
	}
	
		public void feedAllPets() {
			for (VirtualPet pet : organicPets.values()) {
				pet.feedPet(pet);
				
			}
	}
	public void removeOrganicPet(String petName) {
		roboticPets.remove(petName);
	}
	
	//Robotic Pets
	public String listOfRoboticPetsAndType() {
		String status = "";
		for (RoboticPets roboticPets: getRoboticPets()) {
			status += roboticPets.getRoboticPetType() + " " + roboticPets.getPetName() +"\n";
		}
		return status;
	}
	public int getRoboticPetCount() {
		return roboticPets.size();
	}
	public void addRoboticPet (RoboticPets roboticPets) {
		roboticPets.put(roboticPets.getRoboticPetType(), roboticPets);
	}
	public void removeRoboticPet(String petName) {
		organicPets.remove(petName);
	}
	
	
}

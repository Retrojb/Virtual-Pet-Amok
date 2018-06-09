import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	Map<String, OrganicPets> organicPets = new HashMap<>();
	Map<String, RoboticPets> roboticPets = new HashMap<>();
//	private Collection<VirtualPet> virtualPets = new ArrayList<VirtualPet>();
	
	public Collection<OrganicPets> getOrganicPets(){
		return organicPets.values();
	}
	
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
	public void removeRoboticPet(String petName) {
		organicPets.remove(petName);
	}
	public Collection<OrganicPets> listOrganicPets() {
		return organicPets.values();
	}
	public Map<String, OrganicPets> getOrganicPetsFromMap() {
		return organicPets;
	}
	
	
	
	public Collection<RoboticPets> getRoboticPets(){
		return roboticPets.values();
	}
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
	public void removeOrganicPet(String petName) {
		roboticPets.remove(petName);
	}
	public Collection<RoboticPets> listOfRoboticPets(){
		return roboticPets.values();
	}
	public Map<String, RoboticPets> getRoboticPetsFromMap() {
		return roboticPets;
	}
	
	
}

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.mockito.internal.matchers.Or;
public class VirtualPetShelter {
	Map <String, VirtualPet> shelter = new HashMap<>();
	
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
			if(shelter instanceof OrganicPets) {
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
}



import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	Map <String, VirtualPet> shelter = new HashMap<>();
	
	public Collection<VirtualPet> fetchAllVirtualPets() {
		return shelter.values();
	}

	public VirtualPet getPetNames(String petName) {
		return shelter.get(petName);
	}
	
	public void addPetToShelter (VirtualPet pet) {
		shelter.put(pet.petName, pet);
	}
	
	public void removePetFromShelter(String petName) {
		shelter.remove(petName);
	}
	public VirtualPet findAPet(String petName) {
		return shelter.get(petName);
	}

	public void feedOrganicPets() {
		for (VirtualPet pets : fetchAllVirtualPets()) {
			if (pets instanceof OrganicPets) {
				((OrganicPets) pets).feedPet();
			}
		}
	}

	public void waterOrganicPets() {
		for (VirtualPet pets : fetchAllVirtualPets()) {
			if (pets instanceof OrganicPets) {
				((OrganicPets) pets).waterPet();
			}
		}
	}

public void playWithPets() {
	for (VirtualPet pets: fetchAllVirtualPets()) {
		playWithPets();
	}
//	public void walkAllDogs() {
//		for (VirtualPet pets : fetchAllVirtualPets()) {
//			if (pets instanceof DogWalking) {
//				DogWalking;
//			}
//		}
//	}
}
	
	
	
}

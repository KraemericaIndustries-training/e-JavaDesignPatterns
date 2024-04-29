package jdpSolid;

import java.time.LocalDate;

//This is our client which also works as "director"
public class ClientBuilder {

	public static void main(String[] args) {
		
		UserBuilder user = createUser();
		UserDTOBuilder builder = new UserWebDTOBuilder();
		
		UserDTO dto =  directBuild(builder, user);
		System.out.println(dto);
	}
	
	private static UserDTO directBuild(UserDTOBuilder builder, UserBuilder user) {
		
		return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
			   .withAddress(user.getAddress())
			   .withBirthday(user.getBirthday())
			   .build();
	}
	
	/**
	 * Returns a sample user. 
	 */
	public static UserBuilder createUser() {
		UserBuilder user = new UserBuilder();
		user.setBirthday(LocalDate.of(1960, 5, 6));
		user.setFirstName("Ron");
		user.setLastName("Swanson");
		Address address = new Address();
		address.setHouseNumber("100");
		address.setStreet("State Street");
		address.setCity("Pawnee");
		address.setState("Indiana");
		address.setZipcode("47998");
		user.setAddress(address);
		return user;
	}
}

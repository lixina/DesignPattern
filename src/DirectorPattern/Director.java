package DirectorPattern;
/**
 * 指挥者
 * @author Bywinkey
 *
 */
public class Director {

	private PersonBuilder personBuilder;

	// 用户告诉指挥者我需要什么样的小人
	public Director(PersonBuilder personBuilder)
	{
		this.personBuilder = personBuilder;
	}
	
	// 根据用户选择建造小人
	public void createPerson()
	{
		personBuilder.builderHead();
		personBuilder.builderBody();
		personBuilder.builderArm();
		personBuilder.builderFoot();
	}
}

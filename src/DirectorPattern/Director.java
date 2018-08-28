package DirectorPattern;
/**
 * ָ����
 * @author Bywinkey
 *
 */
public class Director {

	private PersonBuilder personBuilder;

	// �û�����ָ��������Ҫʲô����С��
	public Director(PersonBuilder personBuilder)
	{
		this.personBuilder = personBuilder;
	}
	
	// �����û�ѡ����С��
	public void createPerson()
	{
		personBuilder.builderHead();
		personBuilder.builderBody();
		personBuilder.builderArm();
		personBuilder.builderFoot();
	}
}

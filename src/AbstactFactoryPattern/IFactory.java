package AbstactFactoryPattern;


public interface IFactory {
	
	public IUser CreateUser();
	public IDepartment createDepartment();
	
}

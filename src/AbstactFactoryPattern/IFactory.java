package AbstactFactoryPattern;


public interface IFactory {
	
	IUser CreateUser();
	IDepartment createDepartment();
	
}

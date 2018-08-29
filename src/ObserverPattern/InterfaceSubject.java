package ObserverPattern;

public interface InterfaceSubject {

	void Attach();
	void Detach();
	void Notify();
	static void subjectState(){
		
	};
}

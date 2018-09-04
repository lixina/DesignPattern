package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class SonCompany extends AbstractCompany {

	private List<AbstractCompany> list = new ArrayList<AbstractCompany>();
	
	public SonCompany(String name) {
		super(name);
	}

	@Override
	public void dispaly() {
		System.out.println("--"+name);
		for (AbstractCompany abstractCompany : list) {
			abstractCompany.dispaly();
		}
	}

	@Override
	public void remove(AbstractCompany company) {
		list.remove(company);
	}

	@Override
	public void add(AbstractCompany company) {
		list.add(company);
	}

}

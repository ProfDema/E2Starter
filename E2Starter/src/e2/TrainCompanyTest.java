package e2;


import org.junit.Test;

public class TrainCompanyTest {

	// An example of how to verify that an exception is thrown
	@Test(expected=IllegalArgumentException.class)
	public void cannotCreateCompanyWithNullName() {
		new TrainCompany(null);
	}
	
}

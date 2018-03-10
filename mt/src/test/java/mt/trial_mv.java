package mt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class trial_mv {
	@Test
	public void to_pass()
	{
		Assert.assertEquals(1,1);
	}
	@Test
	public void to_fail()
	{
		Assert.assertEquals(1,2);
	}
}

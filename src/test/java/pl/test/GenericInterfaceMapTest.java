package pl.test;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.junit.Assert;
import org.junit.Test;

public class GenericInterfaceMapTest {

	@Test
	public void shouldCopyId() {
		//given
		final Mapper mapper = new DozerBeanMapper();
		final Sample sample = new Sample();
		sample.setId("id");
		sample.setName("name");
		
		//when
		Sample copy = mapper.map(sample, Sample.class);
		
		//then
		Assert.assertEquals("name", copy.getName());
		Assert.assertEquals("id", copy.getId()); //failure
	}
}

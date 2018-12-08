package com.kashegypt.microservice;

import static org.junit.Assert.fail;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class TestA {

	@Before
	public void setUp() throws Exception {
	}

	@Deployment
	public static WebArchive createDeployment() {
		return ShrinkWrap.create(WebArchive.class, "microservice-a.war")
				.addAsLibraries(Maven.resolver().loadPomFromFile("pom.xml").importCompileAndRuntimeDependencies()
						.resolve().withTransitivity().asFile());
	}

	@Test
	public final void testService() {
		fail("Not yet implemented");
	}

}

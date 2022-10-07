package com.example.demo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.anyString;

//@SpringBootTest
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = { SpringTestConfiguration.class })
class DemoApplicationTests {

	@Mock
	PersonBuilder personBuilder;

	@Spy
	CreatePerson createPerson;

	@BeforeAll
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void contextLoads() {
	}

	@Test
	void createTest(){
		//Arrange
		Person person = new Person (1,"fernando");
		//PersonBuilder personBuilder = Mockito.mock(PersonBuilder.class);
		when(personBuilder.build(anyInt(), anyString())).thenReturn(person);

		//Act
		Person personResult = createPerson.create();

		//Assert
		assertTrue(personResult.getName().equals("fernando"));

	}

}

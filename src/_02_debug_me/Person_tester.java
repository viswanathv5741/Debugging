package _02_debug_me;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Person_tester {

	@Test
	void test() {
		Person p = new Person("Vainavi", 16);
		assertEquals("Vainavi", p.getName());
		assertTrue(16 == p.getAge());
		//fail("Not yet implemented");
	}

}

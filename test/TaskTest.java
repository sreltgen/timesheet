package test;

import org.junit.*;


import play.mvc.*;
import play.test.*;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;
import static org.junit.Assert.*;


import models.*;

public class TaskTest {
	
    @Test(expected=java.lang.IllegalArgumentException.class)
    public void when_creating_new_task_duration_has_to_be_positive() {
        Task task = new Task(-1);
    }
	
    @Test(expected=java.lang.IllegalArgumentException.class)	
	public void when_updating_task_duration_has_to_be_positive() {
        Task task = new Task(10);
		task.duration(-1);
	}

	@Test
	public void	when_task_approved_then_readonly() {
		Task task = new Task(10);
		task.approve();
		assertTrue("An approved task should be read-only.",task.isReadonly());
	}
} 
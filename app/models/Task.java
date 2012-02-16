package models;

import java.util.*;

/**
 A task can be part of a todo-list, a calendar, or both
 A task in the future can be modified
 A task in the past can be modified as long as it is not approved
 */
public class Task {

	public Long id;
	public String label;
	private int duration;
	public Date dueDate;
	public Date doneDate;

	/** When a task is approved, it becomes readonly */
	private boolean readonly;

	public Task(int duration) {
		this.duration(duration);
	}

	public void duration(int newDuration) {
		if (newDuration < 0)
			throw new IllegalArgumentException("Duration has to be positive.");
		this.duration = newDuration;
	}

	public void approve() {
		this.readonly = true;
	}
	
	public boolean isReadonly() {
		return readonly;
	}

	public static List<Task> all() {
		return new ArrayList<Task>();
	}

	public static void create(Task task) {
	}

	public static void delete(Long id) {
	}

}
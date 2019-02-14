/**
 * 
 */
package br.com.selecaoneogrid.model;

import java.util.List;

/**
 * @author Paulo
 * Classe que representa uma Track com todos os eventos do dia
 */
public class Track {

	private String description;
	private List<Task> tasks;
	/**
	 * @param description
	 * @param tasks
	 */
	public Track(String description, List<Task> tasks) {
		super();
		this.description = description;
	    this.tasks = tasks;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the tasks
	 */
	public List<Task> getTasks() {
		return tasks;
	}
	/**
	 * @param tasks the tasks to set
	 */
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
	
}

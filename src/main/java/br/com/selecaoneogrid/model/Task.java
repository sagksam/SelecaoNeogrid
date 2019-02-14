/**
 * 
 */
package br.com.selecaoneogrid.model;

/**
 * @author Paulo
 * Classe que representa uma Task no evento
 */
public class Task{

	private String description; 
	private int time;
	/**
	 * @param description
	 * @param time
	 */
	public Task(String description, int time) {
		super();
		this.description = description;
		this.time = time;
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
	 * @return the time
	 */
	public int getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(int time) {
		this.time = time;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Task [description=" + description + ", time=" + time + "]";
	} 
	
}

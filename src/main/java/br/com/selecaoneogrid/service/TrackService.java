package br.com.selecaoneogrid.service;

import java.util.ArrayList;
import java.util.List;


import br.com.selecaoneogrid.model.Track;
import br.com.selecaoneogrid.model.Task;

/**
 * @author Paulo
 * Classe que configura as tracks e os horários das tasks do evento
 */

public class TrackService {

	private final static List<Task> trackOneTasks;
	private final static List<Task> trackTwoTasks;

   /*Definido previamente o tempo de cada Task nas Tracks*/ 
   static {
		trackOneTasks = new ArrayList<Task>();		
		trackOneTasks.add(new Task("", 60)); //EVENT'S BEGIN
		trackOneTasks.add(new Task("", 60));
		trackOneTasks.add(new Task("", 60));
		trackOneTasks.add(new Task("Lunch", 60));  //LUNCH
		trackOneTasks.add(new Task("", 60));
		trackOneTasks.add(new Task("", 45));
		trackOneTasks.add(new Task("", 45));
		trackOneTasks.add(new Task("", 45));
		trackOneTasks.add(new Task("", 30));
		trackOneTasks.add(new Task("", 5));
		trackOneTasks.add(new Task("Networking Event", 10)); //NETWORKING EVENT

		trackTwoTasks = new ArrayList<Task>();		
		trackTwoTasks.add(new Task("", 60)); 
		trackTwoTasks.add(new Task("", 45));
		trackTwoTasks.add(new Task("", 45));
		trackTwoTasks.add(new Task("", 30));
		trackTwoTasks.add(new Task("Lunch", 60)); //LUNCH
		trackTwoTasks.add(new Task("", 45));
		trackTwoTasks.add(new Task("", 30));
		trackTwoTasks.add(new Task("", 30));
		trackTwoTasks.add(new Task("", 30));
		trackTwoTasks.add(new Task("", 30));
		trackTwoTasks.add(new Task("", 30));
		trackTwoTasks.add(new Task("Networking Event", 30)); //NETWORKING EVENT
	}
   
    public Track getTrackOne() {
    	Track track = new Track("Track 1:", trackOneTasks);
    	return track;
    }
    
    public Track getTrackTwo() {
    	Track track = new Track("Track 2:", trackTwoTasks);
    	return track;
    }
	

}

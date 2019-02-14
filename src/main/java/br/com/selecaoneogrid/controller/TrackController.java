/**
 * 
 */
package br.com.selecaoneogrid.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.joda.time.LocalDateTime;

import br.com.selecaoneogrid.model.Task;
import br.com.selecaoneogrid.service.TrackService;
import br.com.selecaoneogrid.util.DateUtil;

/**
 * @author Paulo
 * Classe que controla a aplicação e exibe o resultado final 
 */
public class TrackController {

	private TrackService trackService;
	private List<Task> tasksTrackOne;
	private List<Task> tasksTrackTwo;
	
	public TrackController() {
		trackService = new TrackService();
		tasksTrackOne = trackService.getTrackOne().getTasks();
		tasksTrackTwo = trackService.getTrackTwo().getTasks();
	}	
   	 
	/* Método que lê o arquivo input.txt e insere o conteúdo em uma lista de tasks */
	public void readInput() {
		
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("input.txt").getFile());
		List<Task> tasks = new ArrayList<Task>();
		try{
			Scanner scanner = new Scanner(file);
			while(scanner.hasNext()) {
			  String taskString = scanner.nextLine();
			  String taskDurationTime = taskString.replaceAll("\\D+","");
			    if(taskDurationTime.equals("")) {
			    	taskDurationTime = "5";
			    }
			    tasks.add(createTask(taskString, taskDurationTime));
			    
			}
			scanner.close();
		}
		catch(IOException e) {
			
			System.err.println("Não foi possível ler o arquivo input.txt, verifique se o arquivo"
					+ "encontra-se no local indicado.");
		}
		arrangeTracks(tasks);
	}
	
	/* Método que cria uma task através de uma String */
	public Task createTask(String taskString, String taskDurationTime) {		
		return new Task(taskString, Integer.parseInt(taskDurationTime));		
	}
	
	/* Método que configura as tracks com as tasks e respectivos horários */
	public void arrangeTracks(List<Task> tasks) {
		
		for(int i = 0; i < tasks.size(); i++) {
		  for(int j= 0; j < tasksTrackOne.size(); j++) {	
			  if(tasks.get(i).getTime()==tasksTrackOne.get(j).getTime() && tasksTrackOne.get(j).getDescription().equals("")) {
				  tasksTrackOne.get(j).setDescription(tasks.get(i).getDescription()); 
				  tasks.get(i).setTime(0);
		      }
		  }
	    }
		for(int i = 0; i < tasks.size(); i++) {
			  for(int j=0; j < tasksTrackTwo.size(); j++) {	
				  if(tasks.get(i).getTime()==tasksTrackTwo.get(j).getTime() && tasksTrackTwo.get(j).getDescription().equals("")) {
					  tasksTrackTwo.get(j).setDescription(tasks.get(i).getDescription()); 
					  tasks.get(i).setTime(0);
			      }
			  }
			
		}
		printEventTracks();
	}
	
	/* Método que exibe as tracks com os eventos na tela */
	public void printEventTracks() {
		
		//Inicio do primeiro dia de evento
		LocalDateTime localDateTime = new LocalDateTime(2019, 2, 13, 9, 0);
		System.out.println(trackService.getTrackOne().getDescription());
		for(Task t: tasksTrackOne) {
			  System.out.println(DateUtil.dateToString(localDateTime) 
					  + " " + t.getDescription());
			  localDateTime = localDateTime.plusMinutes(t.getTime());
		}
		
		System.out.println();
		
		//Inicio do segundo dia de evento
		localDateTime = new LocalDateTime(2019, 2, 14, 9, 0);
		System.out.println(trackService.getTrackTwo().getDescription());
		for(Task t: tasksTrackTwo) {
			System.out.println(DateUtil.dateToString(localDateTime) 
					  + " " + t.getDescription());
			localDateTime = localDateTime.plusMinutes(t.getTime());
		}		  		  
	}
	
	
}

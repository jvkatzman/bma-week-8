package com.infinitysoftware.tasklist;
import java.util.ArrayList;
import java.util.Date;
import com.infinitysoftware.tasklistbasic.TaskListBasic;
import com.infinitysoftware.tasklistextended.TaskListExtended;
import com.infinitysoftware.tasklistdependents.TaskListDependents;
import com.infinitysoftware.taskfilter.TaskFilter;

public class Assignment {
	
	public static void main(String[] args)   {
		//The purpose of this assignment is to use generics
		
		ArrayList<TaskListBasic> tasks = new ArrayList<TaskListBasic>();
		 
		TaskListBasic task ;
		
		 task = new TaskListBasic();
		 tasks.add(task);
		 task = new TaskListBasic(new  Date(),"This is a basic task with date");
		 tasks.add(task);
		 task = new TaskListBasic("This is a basic task with description only");
		 tasks.add(task);
		 task = new TaskListExtended(new Date(), "Extended Task", "Muddy Waters", new Date(), new Date(), false, "New Songs", "Coming in a long time");	 
		 tasks.add(task);
		 task = new TaskListDependents(new Date(), "Extended Task", "Muddy Waters", new Date(), new Date(), false, "New Songs", "Coming in a long time","Need to be able to sing", true, false);
		 tasks.add(task);
		
		 
		 //show task list
		System.out.println("\nShow Basic Data  using generic default: \n" + tasks );
		 
		// show filter	 
		 TaskFilter taskFilter = new TaskFilter();
		 System.out.println("\n\n" );
		 taskFilter.PrintFilterDesc(tasks);
		 		 
		 
		}//main
	
	
}//Assignment

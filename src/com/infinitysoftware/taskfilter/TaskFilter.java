package com.infinitysoftware.taskfilter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.infinitysoftware.taskfilterinterface.TaskFilterInterface;
import com.infinitysoftware.tasklistbasic.TaskListBasic;


public class TaskFilter implements  TaskFilterInterface {

	@Override
	public ArrayList<TaskListBasic> FilterDesc(ArrayList<TaskListBasic> tasks) {
		ArrayList<TaskListBasic> taskout = new ArrayList<TaskListBasic>();
		
		for (TaskListBasic tsk : tasks){
			String strDescription = tsk.ShowDescription();
			
			if(strDescription.indexOf("basic task")>0){
				taskout.add(tsk);				
			}// description found
		}// for
		
		return taskout;

	}//filterDesc
	
	public void PrintFilterDesc( ArrayList<TaskListBasic> tasks) {
	
		 ArrayList<TaskListBasic> tasksFiltered = FilterDesc(tasks);
		
		 for (TaskListBasic tsk : tasksFiltered){
					 
				DateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
				String strDate;
				TaskListBasic task =tsk;// tasksFiltered[i];
				
				Date itemDate = task.ShowDate();
				if(itemDate != null){
					strDate = dateformat.format(itemDate);
					}else{
							strDate = "";
					}
					
				if (task.ShowDescription() !=""){
				
				System.out.println( task.toString());
				System.out.println("\n" +"Filtered TaskList is: \n" + " Description: " + task.ShowDescription() + "\n" + 
				 " Date: " + strDate );
				
				}// date not null
				
		
		}// for
		 
		 System.out.println("\n\n" );
		 System.out.println("\nShow filtered Data count using generic default from TaskFilter: \n" + tasksFiltered.size() );
		 
			// print default generic list

			 System.out.println("\n\n" );
			 System.out.println("\nShow filtered Data  using generic default from TaskFilter: \n" + tasksFiltered );

	}//PrintFilterDesc
	
}//TaskFilter

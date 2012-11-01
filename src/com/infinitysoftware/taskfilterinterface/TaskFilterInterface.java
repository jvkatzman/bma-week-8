package com.infinitysoftware.taskfilterinterface;

import java.util.ArrayList;

import com.infinitysoftware.tasklistbasic.TaskListBasic;

public interface TaskFilterInterface {
	
public ArrayList<TaskListBasic>  FilterDesc(ArrayList<TaskListBasic> tasks);

public void PrintFilterDesc(ArrayList<TaskListBasic> tasks);
}

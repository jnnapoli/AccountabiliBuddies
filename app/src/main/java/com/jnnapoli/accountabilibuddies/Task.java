package com.jnnapoli.accountabilibuddies;

/**
 * Created by Joey on 12/20/2017.
 */

public class Task {

    private String taskName;

    public Task() {}

    public Task(String taskString){
        this.taskName = taskString;
    }


    public String getTask() {
        return taskName;
    }

}

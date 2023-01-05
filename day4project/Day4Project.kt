package com.example.day4project

data class Task ( val id:Int , val name: String , val note:String , var isCompleted:Boolean = false)

class ToDo{
    var tasks = arrayListOf<Task>()
        private set

    fun getAllTasks() {
        println("#getAllTasks CALLED!")
        if(tasks.isEmpty()) {
            println("The list is empty!!\n")
            return
        }
        var count = 1
        for(task in tasks)
            println("TASK ${count++}:\n  $task")
        println("End of tasks.\n")
    }

    fun getTaskById(id:Int){
        println("#getTaskById CALLED!")
        for(task in tasks) {
            if(task.id == id) {
                println("$task\n")
                return
            }
        }
        println("Task NOT FOUND!!\n")
    }

    fun addTask(task:Task) {
        println("#addTask CALLED!")
        tasks.add(task)
        println("Task Added!!\n")
    }

    fun removeTask(task:Task) {
        println("#removeTask CALLED!")
        if(tasks.remove(task))
        {
            println("Task Removed!!\n")
            return
        }
        println("Task NOT removed!! ----> Task NOT FOUND!!\n")
    }

    fun changeTask(task:Task , id:Int) {
        println("#changeTask CALLED!")
        for(tempTask in tasks.indices){
            if(tasks[tempTask].id == id){
                tasks[tempTask] = task
                println("Task Changed!!\n")
                return
            }
        }
        println("Task NOT changed ----> Task NOT FOUND!!\n")
    }

    fun changeTaskStatus(task:Task){
        println("#changeTaskStatus CALLED!")
        for(tempTask in tasks){
            if(tempTask.id == task.id){
                tempTask.isCompleted = !tempTask.isCompleted
                println("Task status changed!!\n")
                return
            }
        }
        println("Task status NOT changed!! ----> Task NOT FOUND!!\n")
    }
}

fun main(){
    /*-----------initializing-----------*/
    var toDoList = ToDo()
    var task1 = Task(1,"Buy lunch","Don't forget")
    var task2 = Task(2,"Write code","Don't forget")
    var task3 = Task(3,"Learn kotlin","Don't forget")
    var task4 = Task(4,"Have fun","Don't forget")


    /*-----Testing getAllTasks with an empty list-----*/
    toDoList.getAllTasks()

    /*-----Testing addTask-----*/
    toDoList.addTask(task1)
    toDoList.addTask(task2)
    toDoList.addTask(task3)
    toDoList.getAllTasks()

    /*-----Testing getTaskById-----*/
    toDoList.getTaskById(2)
    toDoList.getTaskById(4)

    /*-----Testing changeTask-----*/
    toDoList.changeTask(task4,3)
    toDoList.getAllTasks()
    toDoList.changeTask(task4 ,3)
    toDoList.getAllTasks()

    /*-----Testing removeTask-----*/
    toDoList.removeTask(task4)
    toDoList.getAllTasks()
    toDoList.removeTask(task4)
    toDoList.getAllTasks()

    /*-----Testing changeTaskStatus-----*/
    toDoList.changeTaskStatus(task1)
    toDoList.getTaskById(1)
    toDoList.changeTaskStatus(task4)
    print("Task status will not change if it's not in the list: \n$task4\n")

    /*-----Testing making another list-----*/
    println("\n#### Testing Second list ####\n")
    var toDoList2 = ToDo()
    toDoList2.addTask(task1)
    toDoList2.addTask(task2)
    toDoList2.addTask(task3)
    toDoList2.addTask(task4)
    toDoList2.getAllTasks()
}
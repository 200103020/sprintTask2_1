package Classes;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Tasks> tasks = new ArrayList<>();

    private static long id = 4L;

    static {
        tasks.add(new Tasks(1L,"Создать Веб приложение", "Веб приложение","2024-02-27", true ));
        tasks.add(new Tasks(2L,"Убраться дома", "Закупить продукты","2024-02-20", true ));
        tasks.add(new Tasks(3L,"Выполнить домашку", "Сделать домашнюю работу","2024-01-17", false ));
    }

    public static void addTask(Tasks task){
        task.setId(id);
        tasks.add(task);
    }

    public static Tasks getTask(Long id){
        for (Tasks task : tasks){
            if(task.getId().equals(id)){
                return task;
            }
        }
        return null;
    }

    public static ArrayList<Tasks> getAllTasks(){
        return tasks;
    }

    public static void deleteTask(Long id){
        for(Tasks task : tasks){
            if(task.getId().equals(id)){
                tasks.remove(task);
                return;
            }
        }
    }
}

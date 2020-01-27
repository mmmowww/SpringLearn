package org.example.springcourse;

public class YiiTASK {
    public int id;
    public String username;
    public String nameTask ;
    public String manualTask;
    public int priority;
    public String ProjectStatus;
    public int idProject;
    /// \|/ - Конструктора для задач из YII
    /// Когда начнёться 'дебагинг' постораюсь свезать из вместе
    /// 2 YII'ая + JavaSpring
    public String getTaskId() {
        return this.id;
    }

    public void setTaskId(int id) {
        this.id = id;
    }

    public double getUserName() {
        return this.username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public int getnameTask() {
        return this.nameTask;
    }

    public void setnameTask(String nameTask) {
        this.nameTask = nameTask;
    }
    public String getmanualTask() {
        return this.manualTask;
    }

    public void setmanualTask(String manualTask) {
        this.manualTask = manualTask;
    }

    public double getpriority() {
        return this.priority;
    }

    public void setpriority(int priority) {
        this.priority = priority;
    }

    public int getProjectStatus() {
        return this.ProjectStatus;
    }

    public void setnameProjectStatus(String ProjectStatus) {
        this.ProjectStatus = ProjectStatus;
    }
    public void setnameidProject(int idProject) {
        this.idProject = idProject;
    }
    public int getidProject() {
        return this.idProject;
    }
}

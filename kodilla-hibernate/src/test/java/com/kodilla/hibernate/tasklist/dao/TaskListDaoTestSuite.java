package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "This is example description";
    private static final String LIST_NAME = "Example Task List";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LIST_NAME, DESCRIPTION);
        TaskList taskList2 = new TaskList(LIST_NAME, DESCRIPTION);
        taskListDao.save(taskList);
        taskListDao.save(taskList2);

        //When
        List<TaskList> readTasks = taskListDao.findByListName(LIST_NAME);

        //Then
        Assert.assertEquals(2, readTasks.size());

        //CleanUp
        int id1 = readTasks.get(0).getId();
        int id2 = readTasks.get(1).getId();
        taskListDao.delete(id1);
        taskListDao.delete(id2);
    }

    @Test
    public void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(LIST_NAME, "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        taskListDao.delete(id);

    }

}

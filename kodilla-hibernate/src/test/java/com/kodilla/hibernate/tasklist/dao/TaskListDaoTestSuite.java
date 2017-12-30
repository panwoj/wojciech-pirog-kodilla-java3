package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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

}

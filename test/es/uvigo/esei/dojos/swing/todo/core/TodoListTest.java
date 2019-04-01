/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uvigo.esei.dojos.swing.todo.core;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author comqsjb
 */
public class TodoListTest {
    
    public TodoListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of moveUp method, of class TodoList.
     */
    @Test
public void testMoveUp() 
{
    System.out.println("MoveUp");
     int i=0;
     String item;
     TodoList instance=new TodoList();
     item ="susheel";
     instance.add(item);
     item="avani";
     instance.add(item);
    instance.moveUp(i);
     System.out.println("entery is moved up");
}

@Test
public void testMoveDown() 
{
    

}

@Test
public void testAdd() 
{
    System.out.println("Added");
    String item="avani";
    TodoList instance= new TodoList() ;
    instance.add(item);
    System.out.println(item);
    int i= instance.size();
    assertTrue(i>0);
    System.out.println("Entery is added in TodoList");

}

@Test
public void testEditAt() 
{
    System.out.println("EditAt");
    String item="susheel";
    TodoList instance= new TodoList() ;
    instance.add(item);
    System.out.println(item);
    int i= instance.size();
    assertTrue(i>0);
    System.out.println("Entery is edited"); 

}

@Test
public void testRemoveAt() 
{
    
 System.out.println("RemoveAt");
    String item="avani";
    TodoList instance= new TodoList() ;
    instance.add(item);
    instance.removeAt(0);
    int i= instance.size();
    assertTrue(i==0);
    System.out.println("Entery is deleted");
}

@Test
public void testSize() 
{
    
    

}
    
}

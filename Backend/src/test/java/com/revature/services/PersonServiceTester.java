package com.revature.services;

import com.revature.beans.Person;
import com.revature.data.PersonDAO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTester {

    private Person testPerson;
    @Mock
    private PersonDAO testDAO;
    @InjectMocks
    private PersonServiceImpl ps;
    @Test
    public void testUpdateUsername(){
        testPerson = new Person();
        Person testPerson2 = new Person();
        testPerson.setId(1);
        testPerson.setUsername("Player1");
        testPerson.setPassword("pass");
        testPerson.setRank(1000);
        testPerson2.setId(1);
        testPerson2.setUsername("Player5");
        testPerson2.setPassword("pass");
        testPerson2.setRank(1000);
       
//        when(ps.updateUsername(testPerson, "Player5")).then(invocation -> {
//
//        });
//        when(ps.updateUsername(testPerson, "Player5")).thenReturn(testPerson);
//        assertEquals(testPerson2,ps.updateUsername(testPerson, "Player5"));
        

    }




}

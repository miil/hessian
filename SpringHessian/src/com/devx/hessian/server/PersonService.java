package com.devx.hessian.server;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.dexv.hessian.IPersonService;
import com.dexv.hessian.Person;


@Service("personService")
public class PersonService implements IPersonService {
  
  private static Map<Integer, Person> people = new ConcurrentHashMap<Integer, Person>();
  private static AtomicInteger keyGenerator = new AtomicInteger(0);
  
  
  @Override
  public Person add(Person person) {
    if (person.getId() == null) {
      Integer id = keyGenerator.addAndGet(1);
      person.setId(id);
      people.put(id, person);
      return person;
    } else {
      throw new RuntimeException("Person already exists!");
    }
    
  }
  
  
  @Override
  public void update(Person person) {
    if (person.getId() != null) {
      people.put(person.getId(), person);
    } else {
      throw new RuntimeException("Person must be saved first!");
    }
  }
  
  
  @Override
  public void delete(Integer personId) {
    people.remove(personId);
  }
  
      
  @Override
  public Person get(Integer id) {
    return people.get(id);
  }
  
}

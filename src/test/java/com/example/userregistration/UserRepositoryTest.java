package com.example.userregistration;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import com.example.userregistration.domain.User;
import com.example.userregistration.repository.UserRepository;

@RunWith(SpringRunner.class)

@DataJpaTest
public class UserRepositoryTest {
	
	@Autowired
    private TestEntityManager entityManager;
	
	@Autowired
	private UserRepository repository;
	
	@Test
    public void testFindByFirstName() {

        entityManager.persist(new User("Kanwar", "Pannu", "", "", ""));

        List<User> users = repository.findByFirstName("Kanwar").get();
        assertEquals(1, users.size());

        assertThat(users).extracting(User::getFirstName).containsOnly("Kanwar");

    }
	
	@Test
    public void testFindByLastName() {

        entityManager.persist(new User("Kanwar", "Pannu", "", "", ""));

        List<User> users = repository.findByLastName("Pannu").get();
        assertEquals(1, users.size());

        assertThat(users).extracting(User::getLastName).containsOnly("Pannu");

    }
	
	@Test
    public void testFindByEmail() {

        entityManager.persist(new User("Kanwar", "Pannu", "", "", "kanwar@gmail.com"));

        List<User> users = repository.findByEmail("kanwar@gmail.com").get();
        assertEquals(1, users.size());

        assertThat(users).extracting(User::getEmail).containsOnly("kanwar@gmail.com");

    }
}

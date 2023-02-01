package com.marizoo.user.repository;

import com.marizoo.user.entity.AnimalStore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback
class AnimalStoreRepositoryTest {

    @Autowired
    AnimalStoreRepository animalStoreRepository;

    @Test
    public void testStore(){

    }

}
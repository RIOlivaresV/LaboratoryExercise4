package com.example.LaboratoryExercise4;

import com.example.LaboratoryExercise4.Entities.Category;
import com.sun.org.apache.xml.internal.resolver.Catalog;
import org.junit.jupiter.api.Test;;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CategoryServiceTest {

    @Test
    void initialadd() {
    }

    @Test
    void retrieveTodos() {
    }

    @Test
    void addTodo() {
        CategoryService categoryService = mock(CategoryService.class);
        List<Category> catList = new ArrayList<Category>();
        catList.add(new Category("HL", "Holi"));
        when(categoryService.retrieveTodos()).thenReturn(catList);
        assertEquals(catList, categoryService.retrieveTodos());

    }

    @Test
    void deleteTodo() {
        CategoryService categoryService = mock(CategoryService.class);
        when(categoryService.sizeTodo()).thenReturn(0);
        assertEquals(0, categoryService.sizeTodo());
    }

    @Test
    void retrieve() {
    }

    @Test
    void update() {
    }
}
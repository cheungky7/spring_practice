package com.test.test1.test1;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TestRepository extends CrudRepository<Book, Integer> {


    //String sqlString="select * from book where author=\'"+str+"\'";
    @Query(value = "select * from book where author= :name",nativeQuery = true)
    List<Book> searchBookByAuthor(@Param("name")String name);
}

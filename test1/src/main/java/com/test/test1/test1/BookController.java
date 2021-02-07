package com.test.test1.test1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@RestController
public class BookController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private TestRepository testRepository;


    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewBook (@RequestParam String name
            , @RequestParam String author
            ,@RequestParam String isbn) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Book n = new Book(name,author,isbn);
       // n.setName(name);
       // n.setEmail(email);
        ObjectMapper Obj = new ObjectMapper();
        testRepository.save(n);
        return "Saved";
    }

    @PostMapping(path="/addjson") // Map ONLY POST Requests
    public @ResponseBody String addNewBookByJson (  @RequestBody String str)  {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        System.out.println("json body : " + str);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Book n=objectMapper.readValue(str,Book.class);
            testRepository.save(n);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        //Book n = new Book(name,author,isbn);
        // n.setName(name);
        // n.setEmail(email);

        return "Saved";
    }

    @PostMapping(path="/Book/all")
    public @ResponseBody String getAllBook( ) {
        List<Book> bookList= (List<Book>) testRepository.findAll();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String jsonString=objectMapper.writeValueAsString(bookList);
            return jsonString;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "error";
        }
    }

    @PostMapping(path="/Book/search/author")
    public @ResponseBody String searchByAuthor (  @RequestBody String str)  {

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Book n=objectMapper.readValue(str,Book.class);
            if(n.getAuthor()!=null) {
                List<Book> bookList = testRepository.searchBookByAuthor(n.getAuthor());
                String jsonString=objectMapper.writeValueAsString(bookList);
                return jsonString;
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();

        }

        return "error";

    }




}

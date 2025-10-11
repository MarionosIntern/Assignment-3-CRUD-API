package CSC._0.Assignment3;

import java.io.IOException;
import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CatService {

    @Autowired
    private CatRepository catRepository;

    public Object getAllCats() {
        return catRepository.findAll();
    }

    public Cat getCatById(@PathVariable Long catId) {
        return catRepository.findById(catId).orElse(null);
    }

    public Object getCatsByName(String name)
    {
        return catRepository.getCatsByName(name);
    }

    public Object getCatsBySex(String sex){
        return catRepository.getCatsBySex(sex);
    }

    public Object getCatsByBreed(String breed){
        return catRepository.getCatsByBreed(breed);
    }

    public Cat addCat(Cat cat) {
        return catRepository.save(cat);
    }

    public Cat updateCat(Long catId, Cat cat){
        return catRepository.save(cat);
    }

    public void deleteCat(Long catId){
        catRepository.deleteById(catId);
    }

    public String writeJson(Cat cat){
        ObjectMapper mapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("cat.json"), cat);
            return "Cat written to JSON file successfully";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error writing cat to JSON file";
        }
    }

    public Object readJson(){
        ObjectMapper mapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File("cat.json"), Cat.class);
        } catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }
}
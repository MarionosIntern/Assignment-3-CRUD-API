package CSC._0.Assignment3.Cat;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController{

    @Autowired
    private CatService catService;

    @GetMapping("/cats")
    public Object getAllCats(){
        return catService.getAllCats();
    }

    @GetMapping("/cats/{id}")
    public Cat getCatById(@PathVariable Long id){
        return catService.getCatById(id);
    }

    @GetMapping("/cats/name")
    public Object getCatsByName(@RequestParam String key){
        if(key != null){
            return catService.getCatsByName(key);
        } else {
            return catService.getAllCats();
        }
    }

    @GetMapping("/cats/sex")
    public Object getCatsBySex(@RequestParam String sex){
        return catService.getCatsBySex(sex);
    }

    @GetMapping("/cats/breed")
    public Object getCatsByBreed(@RequestParam String key){
        return catService.getCatsByBreed(key);
    }

    @PostMapping("/cats")
    public Object addCat(@RequestBody Cat cat){
        return catService.addCat(cat);
    }

    @PutMapping("/cats/{id}")
    public Cat updateCat(@PathVariable Long id, @RequestBody Cat cat){
        catService.updateCat(id, cat);
        return catService.getCatById(id);
    }

    @DeleteMapping("/cats/{id}")
    public Object deleteCat(@PathVariable Long id){
        catService.deleteCat(id);
        return catService.getAllCats();
    }

    @PostMapping("/cats/writeFile")
    public Object writeJson(@RequestBody Cat cat){
        return catService.writeJson(cat);
    }

    @GetMapping("/cats/readFile")
    public Object readJson(){
        return catService.readJson();
    }

}
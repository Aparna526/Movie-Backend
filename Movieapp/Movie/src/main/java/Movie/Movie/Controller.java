package Movie.Movie;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/movie")
public class Controller {

    @Autowired
    private final MovieService movieService;

    public Controller(MovieService movieService){
        this.movieService = movieService;
    }

    @PostMapping("saveMovies")
    public MovieApp savedata(@RequestBody MovieApp p){
        return movieService.savedata(p);
    }

    @PostMapping("saveBulk")
        public List<Movie>saveBulk(@RequestBody List<Movie>m){
            return movieService.saveBulk(m);
        }
    
    
}

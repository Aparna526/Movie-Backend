package Movie.Movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MovieService {


    @Autowired
    private MovieRepository m;

    
    public MovieApp savedata(MovieApp p) {
       return m.save(p);  
    }

    public List<Movie> saveBulk(List<Movie>m){
        return MovieRepository.saveAll(m);
    }
    

}

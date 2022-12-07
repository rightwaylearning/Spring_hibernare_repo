package production_movie_list;

import org.springframework.stereotype.Component;

public class ListOfMovies {
	public String[] list;
	
	public ListOfMovies(String[] list) {
		this.list =list;
	}

	public String[] getListOfMovies() {
	
		String[] list = {"DDLJ","kesari","rakshabandhan","happy new year"};
		return list;
	}
}

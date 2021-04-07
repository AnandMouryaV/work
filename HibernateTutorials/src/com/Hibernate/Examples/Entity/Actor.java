package com.Hibernate.Examples.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.sun.source.tree.CaseTree.CaseKind;

@Entity
public class Actor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ActorId;
	private String ActorName;
	@ManyToMany(mappedBy = "actors",cascade = CascadeType.ALL)
	private List<Movie> movies;
	public int getActorId() {
		return ActorId;
	}
	public void setActorId(int actorId) {
		ActorId = actorId;
	}
	public String getActorName() {
		return ActorName;
	}
	public void setActorName(String actorName) {
		ActorName = actorName;
	}
	public List<Movie> getMovies() {
		return movies;
	}
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	
	public void addActors(Movie m) {
		this.movies = new ArrayList<Movie>();
		this.movies.add(m);
	}
	
	
}

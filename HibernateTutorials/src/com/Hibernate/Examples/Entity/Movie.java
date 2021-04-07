package com.Hibernate.Examples.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.sun.source.tree.CaseTree.CaseKind;

@Entity
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Movieid;
	private String MovieName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="movie_actor",joinColumns= {@JoinColumn(name="actorId")},inverseJoinColumns = {@JoinColumn(name="MovieId")})
	private List<Actor> actors;

	public int getMovieid() {
		return Movieid;
	}

	public void setMovieid(int movieid) {
		Movieid = movieid;
	}

	public String getMovieName() {
		return MovieName;
	}

	public void setMovieName(String movieName) {
		MovieName = movieName;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}

	public void addActors(Actor actor) {
		this.actors = new ArrayList<Actor>();
		this.actors.add(actor);
	}
	
}

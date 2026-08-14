package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.comp.StreamingStrategy;

@Component
public class VideoPlayer {

	@Autowired
	@Qualifier("quality")
	private StreamingStrategy strategy;

	@Value("${u.name}")
	private String userName;

	@Value("${u.movie}")
	private String movieName;

	public void playVideo() {
		strategy.streamVideo(movieName);

	}

	public void streamingInfo() {
		System.out.println("User Name: " + this.userName + "\nMovie Name: " + this.movieName + "\nWith "
				+ this.strategy.getBandWithRequirement() + " BandWidth");
	}

}

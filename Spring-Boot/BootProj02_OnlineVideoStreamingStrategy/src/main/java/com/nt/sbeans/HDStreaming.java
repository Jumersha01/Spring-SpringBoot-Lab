package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.comp.StreamingStrategy;

@Component("hd")
public final class HDStreaming implements StreamingStrategy {

	@Value("${v.frameRate}")
	private int frameRate;
	
	@Value("${v.bandWidth}")
	private int bandWidth;
	

	@Override
	public void streamVideo(String movieName) {
		System.out.println(movieName + "movie is playing with " + this.frameRate+"Frame rate");
	}

	@Override
	public int getBandWithRequirement() {

		return this.bandWidth;
	}

}

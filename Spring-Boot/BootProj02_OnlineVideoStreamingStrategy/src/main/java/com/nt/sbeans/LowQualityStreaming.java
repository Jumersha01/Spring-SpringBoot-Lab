package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.comp.StreamingStrategy;

@Component("low")
public final class LowQualityStreaming implements StreamingStrategy {

	@Value("${v.resolution}")
	private int resolution;

	@Value("${v.bandWidth}")
	private int bandWith;

	@Override
	public void streamVideo(String movieName) {
		System.out.println(movieName + "movie is playing with " + this.resolution+" resolution");
	}

	@Override
	public int getBandWithRequirement() {
		return this.bandWith;
				
	}

}

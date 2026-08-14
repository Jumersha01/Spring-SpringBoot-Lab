package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.comp.StreamingStrategy;

@Component("ultra")
public final class UltraHdStreaming implements StreamingStrategy {
   
	@Value("${v.doulby}")
	private boolean doulbySupport;
	
	@Value("${v.bandWidth}")
	private int bandWidth;
	
	@Override
	public void streamVideo(String movieName) {
		System.out.println(movieName + "movie is playing with  doulby" + this.doulbySupport); 
	}

	@Override
	public int getBandWithRequirement() {
		
		return  this.bandWidth;
	}

}

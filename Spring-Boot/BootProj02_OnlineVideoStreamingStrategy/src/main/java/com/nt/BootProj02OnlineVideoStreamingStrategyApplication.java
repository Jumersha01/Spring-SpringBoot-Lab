package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.VideoPlayer;

@SpringBootApplication
@ImportResource("com/nt/comp/applicationc.xml")
public class BootProj02OnlineVideoStreamingStrategyApplication {

	public static void main(String[] args) {

		try (ConfigurableApplicationContext ctx = SpringApplication
				.run(BootProj02OnlineVideoStreamingStrategyApplication.class, args)) {

			VideoPlayer player = ctx.getBean(VideoPlayer.class);
			player.playVideo();
			player.streamingInfo();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

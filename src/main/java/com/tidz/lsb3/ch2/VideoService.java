package com.tidz.lsb3.ch2;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class VideoService {

	private List<Video> videos = List.of(new Video("VHS1"), new Video("Try not to Sleep"), new Video("The Dude!"));

	public List<Video> getVideos() {
		return videos;
	}

}

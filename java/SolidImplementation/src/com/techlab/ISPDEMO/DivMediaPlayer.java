package com.techlab.ISPDEMO;

public class DivMediaPlayer implements AudioMediaPlayer, VideoMediaPlayer {

	@Override
	public void playVideo() {
		System.out.println("Playing video through DivMediaPlayer\n");

	}

	@Override
	public void playAudio() {
		System.out.println("Playing audio through DivMediaPlayer\n");

	}

}

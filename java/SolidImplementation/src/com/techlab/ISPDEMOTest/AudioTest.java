package com.techlab.ISPDEMOTest;

import com.techlab.ISPDEMO.DivMediaPlayer;
import com.techlab.ISPDEMO.WinampMediaPlayer;

public class AudioTest {
	public static void main(String[] args) {
		DivMediaPlayer player = new DivMediaPlayer();
		player.playAudio();
		player.playVideo();
		WinampMediaPlayer player1 = new WinampMediaPlayer();
		player1.playAudio();

	}

}

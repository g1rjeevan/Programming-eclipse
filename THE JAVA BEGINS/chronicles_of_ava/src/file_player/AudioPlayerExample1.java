package file_player;


import java.io.*;
import java.io.IOException;

import javax.sound.sampled.*;


/**
 * This is an example program that demonstrates how to play back an audio file
 * using the Clip in Java Sound API.
 * @author www.codejava.net
 *
 */
public class AudioPlayerExample1 implements LineListener {
	
	/**
	 * this flag indicates whether the playback completes or not.
	 */
	boolean playCompleted;
	
	/**
	 * Play a given audio file.
	 * @param audioFilePath Path of the audio file.
	 */
	void play(String audioFilePath) {
		File audioFile = new File(audioFilePath);

		try {
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

			AudioFormat format = audioStream.getFormat();

			DataLine.Info info = new DataLine.Info(Clip.class, format);

			Clip audioClip = (Clip) AudioSystem.getLine(info);

			audioClip.addLineListener(this);

			audioClip.open(audioStream);
			
			audioClip.start();
			
			while (!playCompleted) {
				// wait for the playback completes
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			}
			
			audioClip.close();
			
		} catch (UnsupportedAudioFileException ex) {
			System.out.println("The specified audio file is not supported.");
			ex.printStackTrace();
		} catch (LineUnavailableException ex) {
			System.out.println("Audio line for playing back is unavailable.");
			ex.printStackTrace();
		} catch (IOException ex) {
			System.out.println("Error playing the audio file.");
			ex.printStackTrace();
		}
		
	}
	
	/**
	 * Listens to the START and STOP events of the audio line.
	 */
	@Override
	public void update(LineEvent event) {
		LineEvent.Type type = event.getType();
		
		if (type == LineEvent.Type.START) {
			System.out.println("Playback started.");
			
		} else if (type == LineEvent.Type.STOP) {
			playCompleted = true;
			System.out.println("Playback completed.");
		}

	}

	public static void main(String[] args) {
		String audioFilePath = "G:/Music/english songs/zedd/08. Zedd - Papercut (Feat. Troye Sivan) - AlbumJams.com.wav";
		AudioPlayerExample1 player = new AudioPlayerExample1();
		player.play(audioFilePath);
	}

}
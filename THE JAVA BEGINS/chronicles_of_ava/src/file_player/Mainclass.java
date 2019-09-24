package file_player;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Mainclass {
	public static void main(String[] args) {

		try {
			File file = new File(
					"G:/Music/english songs/zedd/08. Zedd - Papercut (Feat. Troye Sivan) - AlbumJams.com.mp3");
			System.out.println(file.toString());
			if (file != null) {
				AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
				System.out.println("inside play");
				Clip clip = AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			}
		} catch (Exception ex) {
		}

	}
}

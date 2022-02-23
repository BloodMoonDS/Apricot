package com.pixel.engine;
import org.lwjgl.system.windows.*;
import java.awt.event.*;
import java.awt.*;
import com.pixel.engine.MenuUI;
import javax.swing.*;
import org.lwjgl.*;
import org.lwjgl.system.*;
import org.lwjgl.system.windows.*;
import org.lwjgl.opengl.*;
public class PixelUI extends JFrame implements MenuUI {

	JButton b1;
	public void createWindow(String name,int resolutionx, int resolutiony) {
		JFrame window = new JFrame(name);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setSize(resolutionx, resolutiony);
		
		return;
	}
	
	
	public void play() {
		
	}
}
	
	


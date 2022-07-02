package GUI;
 
 import java.awt.*;
 import java.awt.event.*;
 import java.io.*;
 import javax.swing.*;
// import javax.media.*;

 public class VideoPlayer extends JFrame 
 {
//	 private Player player;
//	 private File file;
//
//	 public VideoPlayer()
//	 {
//		 super( "VideoPlayer" );
//
//		 setBounds(100, 100, 450, 300);
//		 show();
//	 }
//
//	 private void openFile()
//	 {
//		
//			 file = new File("Film.mp4") ;
//	 }
//
//	 private void createPlayer()
//	 {
//		 if ( file == null )
//			 return;
//
//		 removePreviousPlayer();
//
//		 try 
//		 {
//			 // create a new player and add listener
//			 player = Manager.createPlayer( file.toURL() );
//			 player.addControllerListener( new EventHandler() );
//			 player.start(); // start player
//		 }
//		 catch ( Exception e )
//		 {
//			 JOptionPane.showMessageDialog( this, "Invalid file or location", "Error loading file",
//			 JOptionPane.ERROR_MESSAGE );
//		 }
//	 }
//
//	 private void removePreviousPlayer()
//	 {
//		 if ( player == null )
//			 return;
//
//		 player.close();
//
//		 Component visual = player.getVisualComponent();
//		 Component control = player.getControlPanelComponent();
//
//		 Container c = getContentPane();
//
//		 if ( visual != null )
//			 c.remove( visual );
//
//		 if ( control != null )
//			 c.remove( control );
//	 }
//
//	 public static void main(String args[])
//	 {
//		 VideoPlayer app = new VideoPlayer();
//
//		
//	 }
//
//	 // inner class to handler events from media player
//	 private class EventHandler implements ControllerListener 
//	 {
//		 public void controllerUpdate( ControllerEvent e ) 
//		 {
//			 if ( e instanceof RealizeCompleteEvent ) 
//			 {
//				 Container c = getContentPane();
//
//				 // load Visual and Control components if they exist
//				 Component visualComponent = player.getVisualComponent();
//
//				 if ( visualComponent != null )
//					 c.add( visualComponent, BorderLayout.CENTER );
//
//				 Component controlsComponent = player.getControlPanelComponent();
//
//				 if ( controlsComponent != null )
//					 c.add( controlsComponent, BorderLayout.SOUTH );
//
//				 c.doLayout();
//			 }
//		 }
//	 }
 }
 

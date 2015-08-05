package test;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import com.dropbox.core.*;

import java.util.Locale;

public class main {
	
	public static void main(String args[]){
		
		final String APP_KEY = "h0jze8tw5xscshw";
        final String APP_SECRET = "hp7c8w4ykwoddfm";
        DbxAppInfo appInfo = new DbxAppInfo(APP_KEY, APP_SECRET);

        DbxRequestConfig config = new DbxRequestConfig(
            "JavaTutorial/1.0", Locale.getDefault().toString());
        DbxWebAuthNoRedirect webAuth = new DbxWebAuthNoRedirect(config, appInfo);
        String authorizeUrl = webAuth.start();

        System.out.println("1. Go to: " + authorizeUrl);
        System.out.println("2. Click \"Allow\" (you might have to log in first)");
        System.out.println("3. Copy the authorization code.");
       
        
        
		/*
		Frame frame;
		frame = new Frame("Window test");
		frame.setSize(240, 240);
		frame.setVisible(true);
		frame.addWindowListener(new frmListner());
	*/	
	}
}

class frmListner implements WindowListener{

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

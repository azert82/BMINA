
import javax.swing.JFrame;

public class View {
	SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			new Frame ("Lorann");
			}
		JFrame fenetre = new JFrame();
        {
        	 JPanel pan = new JPanel();
        	 JLabel jl = new JLabel();
        	 JPanel jp = new JPanel();
        	JButton bouton = new JButton("PLAY"); //Menu
        	bouton.setBackground(Color.RED);
        	JButton boutona = new JButton("OPTION");
        	boutona.setBackground(Color.RED);
        	JButton boutonat = new JButton("EXIT");
        	boutonat.setBackground(Color.RED);
        fenetre.setTitle("LoraNN");
        
        fenetre.setSize(400, 400);
      
        //jl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.PNG")));
        //jp.add(jl);
      
       
        
       
        
        
        
        
        
        
        
        
        fenetre.setLocationRelativeTo(null);
        pan.setBackground(Color.black);
        fenetre.setContentPane(pan);
        fenetre.setVisible(true);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setContentPane(new panneau());
      
        
        
        fenetre.setVisible(true);
        //--pan.add(bouton);
        // --bouton.setVisible(true);
        
        //--pan.add(bouton);
        // --bouton.setVisible(true);
        //--pan.add(bouton);
       // --bouton.setVisible(true);
        fenetre.getContentPane().add(bouton);
	    fenetre.setVisible(true); 
	    fenetre.getContentPane().add(boutona);
	    fenetre.setVisible(true); 
	    fenetre.getContentPane().add(boutonat);
	    fenetre.setVisible(true); 
	    
	       
	    
        {
    	    
	         bouton.addActionListener(new ActionListener()
	         {  
	        	 
	         public void actionPerformed(ActionEvent arg0){
	            Sfenetre();
                }
	         
	         private void Sfenetre(){
	        	 JFrame F = new JFrame ("Game");
	        	 F.setSize(600, 600);
	        	 F.setLocationRelativeTo(null);
	        	 F.setVisible(true);
	        	 F.setAlwaysOnTop(true);
	         }
                });
       
 
	     //////////////////////////////////////////////////////////////////    
	         
	         {
	     	    
	        	 boutonat.addActionListener(new ActionListener()
		         {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						 System.exit(0);
					
	                }
		         });
		         
		}};
	}
}
 


import javax.swing.JFrame;

public class Frame extends JFrame{
	
	private static final long serialversionVID = 1L;
	
	public Frame(string title)	{
		setTitle(title);
		setsize(700, 550);
		setDefaultCloseOperation(Jframe.Exit_ON_CLOSE);
		setResizable(True);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public class View extends JFrame {
    public static void main(String[] args) throws SQLException {
    	JFrame fenetre = new JFrame();
        {
        	JPanel pan = new JPanel();
        fenetre.setTitle("LoraNN");
        
        fenetre.setSize(400, 400);
       
        fenetre.setLocationRelativeTo(null);
        pan.setBackground(Color.black);
        fenetre.setContentPane(pan);
        fenetre.setVisible(true);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //fenetre.setContentPane(new panneau());
        fenetre.setVisible(true);
        
        
        }
        String databaseURL = "jdbc:mysql://localhost:3306/testmap1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user = "root";
        String password = "";
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(databaseURL, user, password);
            
            if (conn != null) {
                System.out.println("Connected to the database");
            }
        } 
        catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        } 
        finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) 
                {
                    ex.printStackTrace();
                }
            }
        }
      //APPEL DE LA PROCEDURE 
        String sql = "{call map1(?)}"; 
        java.sql.CallableStatement call = conn.prepareCall(sql); 
        call.executeQuery();
        ResultSet resultat1 = call.getResultSet(); 
        System.out.println(resultat1);
        }

}

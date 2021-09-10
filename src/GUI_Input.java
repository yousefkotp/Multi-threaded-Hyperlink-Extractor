import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Input extends JFrame {
    public JPanel mainPanel;
    public JTextField urlField;
    public JTextField threadsField;
    public JTextField depthField;
    public JButton enterButton;
    GUI_Input()throws NumberFormatException{

        this.setContentPane(this.mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);


        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    dispose();
                    long startTime = System.currentTimeMillis();
                    GlobalVariables.url= urlField.getText();
                    GlobalVariables.no_threads=Integer.parseInt(threadsField.getText());
                    GlobalVariables.no_depth= Integer.parseInt(depthField.getText());

                    JOptionPane.showMessageDialog(null,"Please wait, data is being processed now !");
                    Depth.depthLogic();


                    long endTime = System.currentTimeMillis();
                    float x =(float)(endTime-startTime)/1000 ;
                    dispose();
                    new GUI_Output();
                    JOptionPane.showMessageDialog(null,"Number of Valid links: "+GlobalVariables.validLinks.size());
                    JOptionPane.showMessageDialog(null,"Number of Invalid links: "+GlobalVariables.invalidLinks.size());
                    JOptionPane.showMessageDialog(null,"Time taken to Execute: "+x+ " Seconds");





                }catch (Exception f){
                    checkInputs();
                    dispose();
                    new GUI_Input();
                }









            }
        });
    }


    public void checkInputs(){
        if(!Validator.isURL(urlField.getText()))
            JOptionPane.showMessageDialog(null,"Can't connect to the link!");
        if(urlField.getText().isEmpty() || depthField.getText().isEmpty() || urlField.getText().isEmpty())
            JOptionPane.showMessageDialog(null,"Please enter data in the empty fields");

        if(!urlField.getText().contains("http"))
            JOptionPane.showMessageDialog(null,"Please enter correct url!");

        if(!threadsField.getText().matches("[0-9]+"))
            JOptionPane.showMessageDialog(null,"Please enter correct threads number!");

        if(threadsField.getText().contains("-"))
            JOptionPane.showMessageDialog(null,"Please enter Positive threads number!");

        if(depthField.getText().contains("-"))
            JOptionPane.showMessageDialog(null,"Please enter positive depth number!");

        if(!depthField.getText().matches("[0-9]+"))
            JOptionPane.showMessageDialog(null,"Please enter correct depth number!");

    }

}

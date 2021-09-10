import javax.swing.*;

public class GUI_Output extends JFrame {
    private JPanel mainPanel;
    private JList validList;
    private JList invalidList;

    GUI_Output(){
        this.setContentPane(this.mainPanel);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


        DefaultListModel validModel = new DefaultListModel();
        DefaultListModel invalidModel = new DefaultListModel();
        validList.setModel(validModel);
        invalidList.setModel(invalidModel);
        for(int i=0;i<GlobalVariables.validLinks.size();i++)
            validModel.addElement(GlobalVariables.validLinks.get(i));
        for(int i=0;i<GlobalVariables.invalidLinks.size();i++)
            invalidModel.addElement(GlobalVariables.invalidLinks.get(i));


    }
}

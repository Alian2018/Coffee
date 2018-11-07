import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import javax.swing.Timer;
import javax.swing.JOptionPane;
public class MorningRushTester
{
    
    
    private static final int DELAY = 1000;

    public MorningRushTester()
    {
        
    }

    public static void main(String[] args)
    {
        final int initialGulps = 5;
        class DrinkCoffee implements ActionListener
        {
            private int gulps;
            public DrinkCoffee(int ingulps)
            {
                gulps = ingulps;
            }
            public void actionPerformed(ActionEvent event)
            {
                if (gulps > 0)
                {
                    System.out.println(gulps);
                   
                }
                else if (gulps ==0)
                {
                    System.out.println("Go to school");
                    JOptionPane.showMessageDialog(null, "Make another?");
                    gulps = initialGulps;
                }
                --gulps;
            }
        }
        DrinkCoffee dc = new DrinkCoffee(5);
        Timer t = new Timer(DELAY,dc); // refractor-extract constant-DELAY- create private final
        t.start();
        
        
        //JOptionPane.showMessageDialog(null, "Make another?");
        System.exit(0);

    }

}

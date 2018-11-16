package choice.controller;

import choice.model.Cake;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class ChoiceController
{
	private Cake defaultCake;
	private Cake [] cakeArray;
	private ImageIcon [] icons;
	
	public ChoiceController()
	{
		defaultCake = new Cake(0, 10.0, "[Insert Text]");
		
		cakeArray = new Cake[3];
		
		icons = new ImageIcon[5];
		icons[0] = new ImageIcon(getClass().getResource("/choice/view/images/Cake1.jpg"));
		icons[1] = new ImageIcon(getClass().getResource("/choice/view/images/Cake2.jpg"));
		icons[2] = new ImageIcon(getClass().getResource("/choice/view/images/Cake3.jpg"));
		icons[3] = new ImageIcon(getClass().getResource("/choice/view/images/Cake4.jpg"));
		icons[4] = new ImageIcon(getClass().getResource("/choice/view/images/Cake5.jpg"));
		icons[5] = new ImageIcon(getClass().getResource("/choice/view/images/Cake6.jpg"));
		
	}
	
	public void start()
	{
		
	}
	
	private void arrayInit()
	{
		JOptionPane.showMessageDialog(null, "Look at this cake!", "Arrays", JOptionPane.INFORMATION_MESSAGE, icons[1]);
		JOptionPane.showMessageDialog(null, "Now, look at this cake!", "Arrays", JOptionPane.INFORMATION_MESSAGE, icons[2]);
		JOptionPane.showMessageDialog(null, "Now, look at THIS cake!", "Arrays", JOptionPane.INFORMATION_MESSAGE, icons[3]);
		
		for (int index = 0; index < cakeArray.length; index += 1)
		{
			if(index % 2 == 0)
			{
				cakeArray[index] = new Cake();
			}
			else
			{
				cakeArray[index] = new Cake(index * 30);
			}
		}
	}
}

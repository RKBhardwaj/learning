package awt;

import java.awt.*;

@SuppressWarnings("serial")
public class TestAwt2 extends Frame
{
    public TestAwt2()
    {
        Button btn=new Button("Hello World");
        add(btn); 		//adding a new Button.
        setSize(400, 500);        //setting size.
        setTitle("StudyTonight");  //setting title.
        setLayout(new FlowLayout());	 //set default layout for frame.
        setVisible(true);           //set frame visibilty true.
    }

    public static void main (String[] args)
    {
        TestAwt2 ta = new TestAwt2();   //creating a frame.
    }
}

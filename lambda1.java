import java.awt.*;

public class lambda1 {
    
    public static void main(String[] args)
    {
        Frame frame = new Frame("ActionListener Java8");
        Button b = new Button("Click here");

        b.setBounds(50, 100, 80, 50);
        b.addActionListener(e -> System.out.println("Hello World from Java Gui"));

        frame.add(b);
        frame.setSize(200,200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

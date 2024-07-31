import javax.swing.*;

public class Bird {
    public static void main(String[] args) throws Exception {
        int boardWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("Bird Bounce");
        //frame.setVisible(true);
		frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BirdBounce birdBounce = new BirdBounce();
        frame.add(birdBounce);
        frame.pack();
        birdBounce.requestFocus();
        frame.setVisible(true);
    }
}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class testJDBC extends JFrame {
    public testJDBC()) {
        super("OverlayLayout Test");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        final Container c = getContentPane();
        c.setLayout(new GridBagLayout());
        final JPanel p1 = new GridPanel();
        final OverlayLayout overlay = new OverlayLayout(p1);
        p1.setLayout(overlay);
        final JButton jb1 = new JButton("B1");
        final JButton jb2 = new JButton("B2");
        final JButton jb3 = new JButton("B3");
        Dimension b1 = new Dimension(60, 50);
        Dimension b2 = new Dimension(80, 40);
        Dimension b3 = new Dimension(100, 60);
        jb1.setMinimumSize(b1);
        jb1.setMaximumSize(b1);
        jb1.setPreferredSize(b1);
        jb2.setMinimumSize(b2);
        jb2.setMaximumSize(b2);
        jb2.setPreferredSize(b2);
        jb3.setMinimumSize(b3);
        jb3.setMaximumSize(b3);
        jb3.setPreferredSize(b3);
        SimpleReporter reporter = new SimpleReporter();
        jb1.addActionListener(reporter);
        jb2.addActionListener(reporter);
        jb3.addActionListener(reporter);
        p1.add(jb1);
        p1.add(jb2);
        p1.add(jb3);
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(2,6));
        p2.add(new JLabel("B1 X", JLabel.CENTER));
        p2.add(new JLabel("B1 Y", JLabel.CENTER));
        p2.add(new JLabel("B2 X", JLabel.CENTER));
        p2.add(new JLabel("B2 Y", JLabel.CENTER));
        p2.add(new JLabel("B3 X", JLabel.CENTER));
        p2.add(new JLabel("B3 Y", JLabel.CENTER));
        p2.add(new JLabel(""));
    }
}
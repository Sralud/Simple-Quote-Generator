import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class QuoteGenerator {
    public static void main(String[] args) {
        String[][] quotes = {
            {"Albert Einstein", "Life is like riding a bicycle. To keep your balance, you must keep moving."},
            {"Dr. Seuss", "Don't cry because it's over, smile because it happened."},
            {"Walt Disney", "The way to get started is to quit talking and begin doing."},
            {"Oprah Winfrey", "The more you praise and celebrate your life, the more there is in life to celebrate."},
            {"Steve Jobs", "Your work is going to fill a large part of your life, and the only way to be truly satisfied is to do what you believe is great work."}
        };

        JFrame frame = new JFrame("Random Quote Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());
        frame.setResizable(true);

        JPanel quotePanel = new JPanel();
        quotePanel.setLayout(new GridLayout(2, 1));
        frame.add(quotePanel, BorderLayout.CENTER);

        JLabel quoteLabel = new JLabel("Click the button to see a motivational quote!", JLabel.CENTER);
        quoteLabel.setFont(new Font("Arial", Font.ITALIC, 18));
        quoteLabel.setForeground(Color.DARK_GRAY);

        JLabel authorLabel = new JLabel("", JLabel.CENTER);
        authorLabel.setFont(new Font("Arial", Font.BOLD, 16));
        authorLabel.setForeground(Color.BLUE);

        quotePanel.add(quoteLabel);
        quotePanel.add(authorLabel);

        JButton generateButton = new JButton("New Quote");
        generateButton.setFont(new Font("Arial", Font.BOLD, 16));
        generateButton.setBackground(new Color(50, 205, 50));
        generateButton.setForeground(Color.WHITE);

        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                int index = random.nextInt(quotes.length);

                quoteLabel.setText("\"" + quotes[index][1] + "\"");
                authorLabel.setText("- " + quotes[index][0]);
            }
        });

        frame.add(generateButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
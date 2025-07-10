import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Four Season SMS");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 400);
            frame.setLocationRelativeTo(null);

            // Main content pane uses BorderLayout
            Container contentPane = frame.getContentPane();
            contentPane.setLayout(new BorderLayout());

             // Input panel with GridBagLayout for labels and text fields
            JPanel inputPanel = new JPanel(new GridBagLayout());
            inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 5, 5, 5);
            gbc.anchor = GridBagConstraints.WEST;
            gbc.fill = GridBagConstraints.HORIZONTAL;

            JLabel labelStart = new JLabel("Line Start:");
            gbc.gridx = 0;
            gbc.gridy = 0;
            inputPanel.add(labelStart, gbc);

            JTextField fieldStart = new JTextField(20);
            gbc.gridx = 1;
            inputPanel.add(fieldStart, gbc);

            JLabel labelTerminated = new JLabel("Line Terminated:");
            gbc.gridx = 0;
            gbc.gridy = 1;
            inputPanel.add(labelTerminated, gbc);

            JTextField fieldTerminate = new JTextField(20);
            gbc.gridx = 1;
            inputPanel.add(fieldTerminate, gbc);

            // Content field (large and scrollable)
            JLabel labelContent = new JLabel("Content:");
            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.anchor = GridBagConstraints.NORTHWEST;
            inputPanel.add(labelContent, gbc);

            JTextArea contentArea = new JTextArea(5, 20);
            contentArea.setText("您好，这里是四季超市，您团购的"+""+"已经到货了，麻烦您有时间来取一下，今天营业到"+GetDate.getDate()+"，谢谢。");
            contentArea.setLineWrap(true);
            contentArea.setWrapStyleWord(true);

            JScrollPane scrollPane = new JScrollPane(contentArea);
            gbc.gridx = 1;
            gbc.anchor = GridBagConstraints.WEST;
            gbc.weightx = 1.0;
            gbc.weighty = 1.0;
            gbc.fill = GridBagConstraints.BOTH;
            inputPanel.add(scrollPane, gbc);

            // Wrapper panel with FlowLayout aligned to LEFT to force top-left alignment
            JPanel wrapperPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
            wrapperPanel.add(inputPanel);

            contentPane.add(wrapperPanel, BorderLayout.NORTH);
            // Panel at the bottom with right-aligned button
            JPanel sendPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
            JButton sendButton = new JButton("SEND");
            sendPanel.add(sendButton);

            sendButton.addActionListener(e -> {
                String start = fieldStart.getText();
                String terminate = fieldTerminate.getText();
                // get the data within the range
                // invoke sending logic
            });

            contentPane.add(sendPanel, BorderLayout.SOUTH);

            frame.setVisible(true);
        });
    }
}

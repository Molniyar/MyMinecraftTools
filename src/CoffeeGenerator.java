import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public class CoffeeGenerator {
    public static void main(String[] args) {
        Color _1 = new Color(7231024);
        Color v = new Color(240, 240, 240);
        Color g = new Color(0, 255, 255);
        Color G = new Color(0, 184, 255);
        Color w = new Color(230, 153, 0);
        Color W = new Color(200, 100, 0);
        Color s = new Color(170, 100, 140);
        Color[] K = {new Color(240, 240, 240)};
        final Color[][][] colors = {{
                {v, v, v, v, v, v, v, v, v, v, v, v, v, v, v, v},
                {v, v, v, v, v, v, v, v, v, v, v, v, v, v, v, v},
                {v, v, v, v, v, v, v, w, w, W, v, v, v, v, v, v},
                {v, v, v, v, v, v, g, s, s, s, g, v, v, v, v, v},
                {v, v, v, v, v, v, g, W, W, W, g, v, v, v, v, v},
                {v, v, v, v, v, v, v, g, v, G, v, v, v, v, v, v},
                {v, v, v, v, v, v, v, g, v, G, v, v, v, v, v, v},
                {v, v, v, v, v, v, g, v, v, v, G, v, v, v, v, v},
                {v, v, v, v, v, g, K[0], g, K[0], K[0], K[0], G, v, v, v, v},
                {v, v, v, v, g, K[0], g, K[0], K[0], K[0], K[0], K[0], G, v, v, v},
                {v, v, v, v, g, K[0], g, K[0], K[0], K[0], K[0], K[0], G, v, v, v},
                {v, v, v, v, g, K[0], K[0], K[0], K[0], K[0], g, K[0], G, v, v, v},
                {v, v, v, v, G, K[0], K[0], K[0], K[0], K[0], g, K[0], G, v, v, v},
                {v, v, v, v, v, G, K[0], K[0], K[0], g, K[0], G, v, v, v, v},
                {v, v, v, v, v, v, G, G, G, G, G, v, v, v, v, v},
                {v, v, v, v, v, v, v, v, v, v, v, v, v, v, v, v}
        }};
        K[0] = new Color(0,255,0);

        JFrame frame = new JFrame("Coffee generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (int i = 0; i < 16; i++) {
                    for (int j = 0; j < 16; j++) {
                        g.setColor(colors[0][j][i]);
                        g.fillRect(i * 10, j * 10, 10, 10);
                    }
                }
            }
        };

        JTextField res = new JTextField();
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"эспрессо", "американо", "ристретто", "капучино", "латте", "флэт уайт", "кортадо", "мокачино","эндеритто","незритте"});
        AtomicBoolean isPoisoned = new AtomicBoolean(false);
        JButton poisoned = new JButton("безвреден");
        JButton button = new JButton("создать");

        comboBox.setPreferredSize(new Dimension(200, 30));
        res.setPreferredSize(new Dimension(600, 50));
        panel.setPreferredSize(new Dimension(160, 160));

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String effects;
                int color;
                switch (Objects.requireNonNull(comboBox.getSelectedItem()).toString()) {
                    case "американо" -> {
                        color = 7626036;
                        effects = "[{Id:1,Amplifier:1,Duration:300}";
                    }
                    case "ристретто" -> {
                        color = 8804637;
                        effects = "[{Id:3,Duration:300}";
                    }
                    case "капучино" -> {
                        color = 11110215;
                        effects = "{Id:1,Duration:200},{Id:5,Duration:300}";
                    }
                    case "латте" -> {
                        color = 12887928;
                        effects = "{Id:6,Duration:-1},{Id:8,Duration:200}";
                    }
                    case "флэт уайт" -> {
                        color = 8145954;
                        effects = "{Id:1,Duration:200},{Id:22,Duration:300}";
                    }
                    case "кортадо" -> {
                        color = 10711076;
                        effects = "{Id:1,Duration:200},{Id:8,Duration:60},{Id:16,Duration:340}";
                    }
                    case "мокачино" -> {
                        color = 9397785;
                        effects = "{Id:1,Duration:100},{Id:3,Duration:200},{Id:16,Duration:300},{Id:26,Duration:360}";
                    }
                    case "эндеритто" -> {
                        color = 7483728;
                        effects = "{Id:10,Duration:60},{Id:25,Duration:20},{Id:28,Duration:400}";
                    }
                    case "незритте" -> {
                        color = 13400376;
                        effects = "{Id:5,Amplifier:1,Duration:240},{Id:8,Amplifier:4,Duration:100},{Id:12,Duration:500}";
                    }
                    default -> {
                        color = 7231024;
                        effects = "{Id:1,Duration:200}";
                    }
                }
                String poison = "";
                if (isPoisoned.get()){poison = ",{Id:9,Duration:1200},{Id:19,Duration:1200}";}
                res.setText("minecraft:potion{CustomPotionEffects:[" + effects + poison + "],CustomPotionColor:" + color + ",display:{Name:\"\\\"Кофе\\\"\",Lore:[\"\\\"" + Objects.requireNonNull(comboBox.getSelectedItem()) + "\\\"\"]}}");
                K[0] = new Color(color);
                panel.repaint();
                colors[0] = new Color[][]{
                        {v, v, v, v, v, v, v, v, v, v, v, v, v, v, v, v},
                        {v, v, v, v, v, v, v, v, v, v, v, v, v, v, v, v},
                        {v, v, v, v, v, v, v, w, w, W, v, v, v, v, v, v},
                        {v, v, v, v, v, v, g, s, s, s, g, v, v, v, v, v},
                        {v, v, v, v, v, v, g, W, W, W, g, v, v, v, v, v},
                        {v, v, v, v, v, v, v, g, v, G, v, v, v, v, v, v},
                        {v, v, v, v, v, v, v, g, v, G, v, v, v, v, v, v},
                        {v, v, v, v, v, v, g, v, v, v, G, v, v, v, v, v},
                        {v, v, v, v, v, g, K[0], g, K[0], K[0], K[0], G, v, v, v, v},
                        {v, v, v, v, g, K[0], g, K[0], K[0], K[0], K[0], K[0], G, v, v, v},
                        {v, v, v, v, g, K[0], g, K[0], K[0], K[0], K[0], K[0], G, v, v, v},
                        {v, v, v, v, g, K[0], K[0], K[0], K[0], K[0], g, K[0], G, v, v, v},
                        {v, v, v, v, G, K[0], K[0], K[0], K[0], K[0], g, K[0], G, v, v, v},
                        {v, v, v, v, v, G, K[0], K[0], K[0], g, K[0], G, v, v, v, v},
                        {v, v, v, v, v, v, G, G, G, G, G, v, v, v, v, v},
                        {v, v, v, v, v, v, v, v, v, v, v, v, v, v, v, v}
                };
            }
        });

        poisoned.addActionListener(e -> {
            isPoisoned.set(!isPoisoned.get());
            if (isPoisoned.get()) {
                poisoned.setText("отравлен");
            } else {
                poisoned.setText("безвреден");
            }
        });

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        controlPanel.add(comboBox);
        controlPanel.add(button);
        controlPanel.add(poisoned);

        frame.add(controlPanel, BorderLayout.NORTH);
        frame.add(res, BorderLayout.SOUTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class ArmorGenerator extends JFrame {
    private JComboBox<String> armorTypeCombo;
    private JComboBox<String> enchantmentsCombo;
    private JComboBox<String> armorPieceCombo;
    private JTextField colorTextField;
    private JTextField nameTextField;
    private JComboBox<String> nameColorCombo;
    private JButton addEnchantmentButton;
    private JTextArea enchantmentTextArea;
    private JTextField commandTextField; // Добавлено поле commandTextField

    private String[] armorTypes = {"Leather", "Iron", "Gold", "Diamond", "Netherite", "Chainmail"};
    private String[] enchantments = {"fire_protection", "protection", "thorns", "water_breathing", "blast_protection", "projectile_protection", "respiration", "aqua_affinity"};
    private String[] armorPieces = {"helmet", "chestplate", "leggings", "boots"};
    private String[] nameColors = {"Black", "White", "Red", "Blue", "Green", "Yellow", "Purple", "Orange", "Gray", "Cyan", "Lime", "Pink"};

    private ArrayList<Enchantment> selectedEnchantments = new ArrayList<>();

    public ArmorGenerator() {
        setTitle("Minecraft Armor Generator");
        setSize(400, 500); // Увеличено для учета новых элементов
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(11, 2)); // Увеличено для учета новых элементов

        JLabel nameLabel = new JLabel("Name:");
        nameTextField = new JTextField();
        add(nameLabel);
        add(nameTextField);

        JLabel nameColorLabel = new JLabel("Name Color:");
        nameColorCombo = new JComboBox<>(nameColors);
        add(nameColorLabel);
        add(nameColorCombo);

        JLabel armorTypeLabel = new JLabel("Armor Type:");
        armorTypeCombo = new JComboBox<>(armorTypes);
        add(armorTypeLabel);
        add(armorTypeCombo);

        JLabel enchantmentsLabel = new JLabel("Enchantments:");
        enchantmentsCombo = new JComboBox<>(enchantments);
        add(enchantmentsLabel);
        add(enchantmentsCombo);

        addEnchantmentButton = new JButton("Add Enchantment");
        add(addEnchantmentButton);

        JLabel selectedEnchantmentsLabel = new JLabel("Selected Enchantments:");
        add(selectedEnchantmentsLabel);

        enchantmentTextArea = new JTextArea();
        enchantmentTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(enchantmentTextArea);
        add(scrollPane);

        JLabel armorPieceLabel = new JLabel("Armor Piece:");
        armorPieceCombo = new JComboBox<>(armorPieces);
        add(armorPieceLabel);
        add(armorPieceCombo);

        JLabel colorLabel = new JLabel("Color (only for Leather):");
        colorTextField = new JTextField();
        add(colorLabel);
        add(colorTextField);

        JLabel commandLabel = new JLabel("Command:");
        add(commandLabel);

        commandTextField = new JTextField();
        commandTextField.setEditable(false);
        add(commandTextField);

        JButton createButton = new JButton("Create");
        add(createButton);

        addEnchantmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addEnchantment();
            }
        });

        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createArmorCommand();
            }
        });
    }

    private void addEnchantment() {
        String enchantment = (String) enchantmentsCombo.getSelectedItem();
        int enchantmentLevel = 1;
        Enchantment newEnchantment = new Enchantment(enchantment, enchantmentLevel);
        selectedEnchantments.add(newEnchantment);
        updateEnchantmentTextArea();
    }

    private void updateEnchantmentTextArea() {
        StringBuilder sb = new StringBuilder();
        for (Enchantment enchantment : selectedEnchantments) {
            sb.append(enchantment.getName()).append(" (Level ").append(enchantment.getLevel()).append(")\n");
        }
        enchantmentTextArea.setText(sb.toString());
    }

    private void createArmorCommand() {
        String armorType = (String) armorTypeCombo.getSelectedItem();
        String armorPiece = (String) armorPieceCombo.getSelectedItem();
        String color = colorTextField.getText();
        String name = nameTextField.getText();
        String nameColor = ((String) nameColorCombo.getSelectedItem()).toLowerCase();

        StringBuilder commandBuilder = new StringBuilder("/give @p ");
        if (armorType.equals("Leather")) {
            commandBuilder.append("minecraft:leather_").append(armorPiece.toLowerCase()).append(" ");
            if (!color.isEmpty()) {
                commandBuilder.append("{display:{color:").append(color).append("},");
            }
        } else {
            commandBuilder.append("minecraft:").append(armorType.toLowerCase()).append("_").append(armorPiece.toLowerCase()).append(" ");
        }

        commandBuilder.append("{display:{Name:\"").append(name).append("\",color:").append(nameColor).append("},");

        // Добавление зачарований в команду
        if (!selectedEnchantments.isEmpty()) {
            commandBuilder.append("Enchantments:[");
            for (Enchantment enchantment : selectedEnchantments) {
                commandBuilder.append("{id:\"").append(enchantment.getName()).append("\",lvl:").append(enchantment.getLevel()).append("},");
            }
            commandBuilder.deleteCharAt(commandBuilder.length() - 1);
            commandBuilder.append("]");
        }

        commandBuilder.append("}");

        commandTextField.setText(commandBuilder.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ArmorGenerator().setVisible(true);
            }
        });
    }

    private class Enchantment {
        private String name;
        private int level;

        public Enchantment(String name, int level) {
            this.name = name;
            this.level = level;
        }

        public String getName() {
            return name;
        }

        public int getLevel() {
            return level;
        }
    }
}

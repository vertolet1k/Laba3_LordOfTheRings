/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author vika
 */

import builder.*;
import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
import java.util.*;
import java.util.List;

import model.Orc;
import model.OrcDirector;

public class OrcArmyGUI extends JFrame {
    private final List<Orc> army = new ArrayList<>();
    private final JTree armyTree;
    private final DefaultTreeModel treeModel;
    private final JTextArea infoPanel;
    private final Map<String, OrcDirector> directors;

    public OrcArmyGUI() {
        super("Армия Саурона");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new BorderLayout());

        // Инициализация директоров для каждого племени
        directors = new HashMap<>();
        directors.put("Мордор", new OrcDirector(new MordorOrcBuilder()));
        directors.put("Дол Гулдур", new OrcDirector(new DolGuldurOrcBuilder()));
        directors.put("Мглистые Горы", new OrcDirector(new MistyMountainsOrcBuilder()));

        // Создание дерева
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Армия Саурона");
        treeModel = new DefaultTreeModel(root);
        armyTree = new JTree(treeModel);
        
        // Создание информационной панели
        infoPanel = new JTextArea();
        infoPanel.setEditable(false);

        // Добавление компонентов на форму
        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.add(new JScrollPane(armyTree), BorderLayout.CENTER);
        leftPanel.add(createControlPanel(), BorderLayout.SOUTH);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
            leftPanel, new JScrollPane(infoPanel));
        splitPane.setDividerLocation(400);

        add(splitPane, BorderLayout.CENTER);

        // Обработчик выбора в дереве
        armyTree.addTreeSelectionListener(e -> {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode)
                armyTree.getLastSelectedPathComponent();
            if (node != null && node.getUserObject() instanceof Orc) {
                Orc orc = (Orc) node.getUserObject();
                displayOrcInfo(orc);
            }
        });
    }

    private JPanel createControlPanel() {
        JPanel panel = new JPanel();
        JButton addButton = new JButton("Добавить орка");
        
        String[] tribes = {"Мордор", "Дол Гулдур", "Мглистые Горы"};
        JComboBox<String> tribeCombo = new JComboBox<>(tribes);
        
        String[] types = {"Базовый", "Командир", "Разведчик"};
        JComboBox<String> typeCombo = new JComboBox<>(types);

        addButton.addActionListener(e -> {
            String selectedTribe = (String) tribeCombo.getSelectedItem();
            String selectedType = (String) typeCombo.getSelectedItem();
            OrcDirector director = directors.get(selectedTribe);
            
            Orc newOrc = switch (selectedType) {
                case "Командир" -> director.constructLeaderOrc();
                case "Разведчик" -> director.constructScoutOrc();
                default -> director.constructBasicOrc();
            };
            
            addOrcToTree(newOrc, selectedTribe);
        });

        panel.add(new JLabel("Племя:"));
        panel.add(tribeCombo);
//        panel.add(new JLabel("Тип:"));
        panel.add(typeCombo);
        panel.add(addButton);

        return panel;
    }

    private void addOrcToTree(Orc orc, String tribe) {
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) treeModel.getRoot();
        
        DefaultMutableTreeNode tribeNode = null;
        for (int i = 0; i < root.getChildCount(); i++) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) root.getChildAt(i);
            if (node.getUserObject().equals(tribe)) {
                tribeNode = node;
                break;
            }
        }
        
        if (tribeNode == null) {
            tribeNode = new DefaultMutableTreeNode(tribe);
            treeModel.insertNodeInto(tribeNode, root, root.getChildCount());
        }

        DefaultMutableTreeNode orcNode = new DefaultMutableTreeNode(orc);
        treeModel.insertNodeInto(orcNode, tribeNode, tribeNode.getChildCount());
        
        armyTree.expandPath(new TreePath(tribeNode.getPath()));
        army.add(orc);
    }

    private void displayOrcInfo(Orc orc) {
        StringBuilder info = new StringBuilder();
        info.append("Информация об орке:\n\n");
        info.append("Имя: ").append(orc.getName()).append("\n");
        info.append("Оружие: ").append(orc.getWeapon()).append("\n");
        info.append("Броня: ").append(orc.getArmor()).append("\n");
        if (orc.getBanner() != null) {
            info.append("Знамя: ").append(orc.getBanner()).append("\n");
        }
        info.append("\nХарактеристики:\n");
        info.append("Сила: ").append(orc.getStrength()).append("\n");
        info.append("Ловкость: ").append(orc.getAgility()).append("\n");
        info.append("Интеллект: ").append(orc.getIntelligence()).append("\n");
        info.append("Здоровье: ").append(orc.getHealth()).append("\n");

        infoPanel.setText(info.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            OrcArmyGUI gui = new OrcArmyGUI();
            gui.setVisible(true);
        });
    }
}
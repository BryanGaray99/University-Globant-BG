package org.bg.university;

import org.bg.university.data.DataInitializer;
import org.bg.university.model.University;
import org.bg.university.view.MainView;

/**
 * @version 1.2.0
 * @author Bryan Garay
 */
public class Main {
    public static void main(String[] args) {
        // Create an instance of University
        University bgUniversity = new University();

        // Initialize data
        DataInitializer.initializeData(bgUniversity);

        // Call the main menu
        MainView.showMainMenu(bgUniversity);
    }
}
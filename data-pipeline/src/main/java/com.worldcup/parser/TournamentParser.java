package com.worldcup.parser;

public class TournamentParser {

    public void parse(String fileContents) {

        // Split the downloaded file into individual lines
        String[] lines = fileContents.split("\n");

        System.out.println("--------------------------------");
        System.out.println("Total Lines : " + lines.length);
        System.out.println("--------------------------------");

        for (String line : lines) {

            // Remove unnecessary spaces
            line = line.trim();

            // Ignore blank lines
            if (line.isEmpty()) {
                continue;
            }

            // ***********
            // YOUR CODE
            // ***********

        }

    }

}
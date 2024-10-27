package com.map;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.function.BiConsumer;

import java.util.*;
import java.util.Map.Entry;

public class Speaker implements Comparable<Speaker> {

    public static void main(String[] args) {
        LinkedHashMap<String, String> speaker = new LinkedHashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        boolean boo = true;
        while (boo) {
            System.out.println("Enter 1 for AddSpeaker");
            System.out.println("Enter 2 for removeSpeaker");
            System.out.println("Enter 3 for retriveSpeaker");
            System.out.println("Enter 4 for sorted");
            System.out.println("Enter 5 to exit");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    addSpeaker(speaker);
                    break;
                case 2:
                    removeSpeaker(speaker);
                    break;
                case 3:
                    retriveSpeaker(speaker);
                    break;
                case 4:
                    Sorted(speaker);
                    break;
                case 5:
                    boo = false;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
        sc.close();
    }

    private static void Sorted(LinkedHashMap<String, String> speaker) {
        List<Entry<String, String>> entryList = new ArrayList<>(speaker.entrySet());
        entryList.sort(Entry.comparingByValue());

        System.out.println("Speakers sorted by topic:");
        for (Entry<String, String> entry : entryList) {
            System.out.println("Speaker: " + entry.getKey() + ", Topic: " + entry.getValue());
        }
    }

    private static void retriveSpeaker(LinkedHashMap<String, String> speaker) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter topic name which topic entry you want:");
        String retriveTopic = sc.nextLine();
        boolean found = false;
        for (Entry<String, String> entry : speaker.entrySet()) {
            if (entry.getValue().equals(retriveTopic)) {
                System.out.println("Speaker: " + entry.getKey() + ", Topic: " + entry.getValue());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not available");
        }
    }

    private static void removeSpeaker(LinkedHashMap<String, String> speaker) {
        if (speaker.isEmpty()) {
            System.out.println("This entry is not there in the grade book");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter speaker name whose topic you want to delete: ");
            String topic = sc.nextLine();
            if (speaker.remove(topic) != null) {
                System.out.println(topic + " is successfully removed");
            } else {
                System.out.println("Speaker not found");
            }
        }
    }

    private static void addSpeaker(LinkedHashMap<String, String> speaker) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter speaker name: ");
        String name = sc.nextLine();
        System.out.println("Enter speaker topic: ");
        String topic = sc.nextLine();
        if (speaker.containsKey(name)) {
            System.out.println("Already available this " + name + " entry");
        } else {
            speaker.put(name, topic);
            System.out.println(name + " and " + topic + " successfully added");
            System.out.println(speaker);
        }
    }

    @Override
    public int compareTo(Speaker o) {
        return 0; // Not used in this context
    }
}

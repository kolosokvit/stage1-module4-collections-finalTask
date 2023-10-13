package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> developerProjects = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) {
                developerProjects.add(entry.getKey());
            }
        }
        developerProjects.sort(new ProjectComparator());
        return developerProjects;
    }

    static class ProjectComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            if (o1.length() - o2.length() != 0) {
                return -1 * (o1.length() - o2.length());
            } else {
                return -1 * (o1.compareTo(o2));
            }
        }
    }
}

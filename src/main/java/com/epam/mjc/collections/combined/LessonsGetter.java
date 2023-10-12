package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> lessons = new HashSet<>();
        for (Map.Entry<String, List<String>> day : timetable.entrySet()) {
            for (String lesson : day.getValue()) {
                if (!lessons.contains(lesson)) {
                    lessons.add(lesson);
                }
            }
        }
        return lessons;
    }
}

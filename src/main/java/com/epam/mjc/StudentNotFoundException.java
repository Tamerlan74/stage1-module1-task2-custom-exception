package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException {
    public StudentNotFoundException(Long studentId) {
        super("Could not find student with ID " + studentId);
    }
}

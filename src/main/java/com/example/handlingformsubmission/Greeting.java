

package com.example.handlingformsubmission;

import java.time.LocalDate;

/**
 * The Greeting class represents a greeting message with the student ID, date,
 * and a message. It also displays the date as both individual year, month, and day fields and
 * as a LocalDate object.
 */
public class Greeting {

    private long id;
    private String content;
    private LocalDate date;
    private int month;
    private int day;
    private int year;

    // seters and getters of all fields

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public LocalDate getDate() {
        return date;
    }



    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * Updates the LocalDate field from the year, month, and day fields,
     * This ensures the date is valid before setting it.
     */
    public void updateDateFromFields() {
        // Check if year, month, and day are valid
        if (year > 0 && month > 0 && day > 0) {
            // Create a new LocalDate from the separate year, month, and day fields
            this.date = LocalDate.of(year, month, day);
        }
        // If any of the date components are invalid or zero, do not update date
    }
}

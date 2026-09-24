package org.champlain.oop2.oop2a1f26;

import java.time.LocalDate;
/**
 * Represents a person with a name, date of birth, email address,
 * and parking pass status.
 */
public class Person {
    private final String Name;
    private final LocalDate DOB;
    private final String EmailAddress;
    private boolean PurchasedPass;
    /**
     * Creates a new Person with the given name, date of birth, and email address.
     * A new person does not have a parking pass by default.
     *
     * @param Name The person's name.
     * @param DOB The person's date of birth.
     * @param EmailAddress The person's email address.
     */

    public Person(String Name, LocalDate DOB, String EmailAddress) {
        if (Name == null || Name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        if (DOB == null) {
            throw new IllegalArgumentException("Date of birth cannot be empty.");
        }

        if (EmailAddress == null || EmailAddress.isEmpty()) {
            throw new IllegalArgumentException("Email address cannot be empty.");
        }

        this.Name = Name;
        this.DOB = DOB;
        this.EmailAddress = EmailAddress;
    }

    /**
     * Gets the person's name.
     *
     * @return The person's name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Gets the person's date of birth.
     *
     * @return The person's date of birth.
     */
    public LocalDate getDOB() {
        return this.DOB;
    }

    /**
     * Gets the person's email address.
     *
     * @return The person's email address.
     */
    public String getEmailAddress() {
        return this.EmailAddress;
    }

    /**
     * Attempts to purchase a parking pass for the person.
     * If the person already has a parking pass, the purchase is not made.
     *
     * @return true if the parking pass was successfully purchased,
     * false if the person already had a parking pass.
     */
    public Boolean purchaseParkingPass() {
        if (this.PurchasedPass) {
            return false;
        }

        this.PurchasedPass = true;
        return true;
    }

    /**
     * Checks whether the person has purchased a parking pass.
     *
     * @return true if the person has a parking pass, false otherwise.
     */
    public Boolean isPurchasedParkingPass() {
        return this.PurchasedPass;
    }
}

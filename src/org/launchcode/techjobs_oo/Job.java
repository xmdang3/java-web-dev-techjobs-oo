package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {
        this();
        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;
    }



    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        String message = "\nID: " + this.id + "\n";
        String empty= "Data not available.";

        if (this.name.isEmpty()) {
            message += "Name: " + empty + "\n";
        } else {
            message += "Name: " + this.name + "\n";
        }
        if (this.employer.getValue().isEmpty()){
            message += "Employer: " + empty + "\n";
        } else {
            message += "Employer: " + this.employer + "\n";
        }
        if (this.location.getValue().isEmpty()) {
            message += "Location: " + empty + "\n";
        } else {
            message += "Location: " + this.location + "\n";
        }
        if (this.positionType.getValue().isEmpty()) {
            message += "Position Type: " + empty + "\n";
        } else {
            message += "Position Type: " + this.positionType + "\n";
        }
        if (this.coreCompetency.getValue().isEmpty()) {
            message += "Core Competency: " + empty + "\n";
        } else {
            message += "Core Competency: " + this.coreCompetency + "\n";
        }

        return message;
        //return "\nName: " + this.name + "\nEmployer: " +this.employer + "\nLocation: " + this.location +"\nPosition Type: " + this.positionType +"\nCore Competency: " + this.coreCompetency +"\n";
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}

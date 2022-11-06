package edu.parinya.softarchdesign.structural;

import java.util.*;

public class HealthcareWorkerTeam implements HealthcareServiceable{
    private Set<HealthcareServiceable> members = new HashSet<HealthcareServiceable>();

    public HealthcareWorkerTeam(){}

    public void addMember(HealthcareServiceable healthcareServiceable){
        this.members.add(healthcareServiceable);
    }

    public void removeMember(HealthcareServiceable healthcareServiceable){
        this.members.remove(healthcareServiceable);
    }

    @Override
    public void service(){
        for (HealthcareServiceable healthcareServiceable: this.members) {
            healthcareServiceable.service();
        }
    }

    @Override
    public double getPrice(){
        double sum = 0;

        for (HealthcareServiceable healthcareServiceable: this.members) {
            sum += healthcareServiceable.getPrice();
        }

        return sum;
    }
}

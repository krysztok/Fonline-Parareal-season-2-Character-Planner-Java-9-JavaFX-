package sample.Perks.MiscBooks;

import sample.Perks.Perk;
import sample.Stats;

public class EnergyWeaponsBooks implements Perk {
    @Override
    public void onPick(Stats stats) {
        stats.getBooks().setPerkFlag(getName(), 1);

        for(int i = 0; i < 10; i++){
            stats.getSkills().getSkill("Energy Weapons").putSkillPoints(6);
        }
    }

    @Override
    public boolean checkRequirements(Stats stats) {
        if(stats.getBooks().getPerkFlag(getName()) > 0){
            return false;
        }

        return true;
    }

    @Override
    public String getName() {
        return "10x Energy Weapons Books";
    }
}

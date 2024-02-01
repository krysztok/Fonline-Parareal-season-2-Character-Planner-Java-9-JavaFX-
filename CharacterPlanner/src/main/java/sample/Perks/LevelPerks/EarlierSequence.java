package sample.Perks.LevelPerks;

import sample.Perks.Perk;
import sample.Stats;

public class EarlierSequence implements Perk {
    @Override
    public void onPick(Stats stats) {
        stats.getPerks().setPerkFlag(getName(), 1);
    }

    @Override
    public boolean checkRequirements(Stats stats){
        if(stats.getPerks().getPerkFlag(getName()) > 0){
            return false;
        }

        if(stats.getLevel() < 3){
            return false;
        }

        if(stats.getSpecialWithImpsAndPerks("Perception") < 5){
            return false;
        }

        return true;
    }

    @Override
    public String getName() {
        return "Earlier Sequence";
    }
}
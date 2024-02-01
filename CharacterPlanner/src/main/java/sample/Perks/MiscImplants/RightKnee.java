package sample.Perks.MiscImplants;

import sample.Perks.Perk;
import sample.Stats;

public class RightKnee implements Perk {
    @Override
    public void onPick(Stats stats) {
        stats.getImplants().setPerkFlag(getName(), 1);
    }

    @Override
    public boolean checkRequirements(Stats stats) {
        if(stats.getImplants().getPerkFlag("Left Knee") > 0 || stats.getImplants().getPerkFlag("Right Knee") > 0){
            return false;
        }

        if(stats.getPerks().getPerkFlag("Tree Trunk Thighs") == 1){
            return false;
        }

        if(stats.getLevel() < 30){
            return false;
        }

        return true;
    }

    @Override
    public String getName() {
        return "Right Knee";
    }
}

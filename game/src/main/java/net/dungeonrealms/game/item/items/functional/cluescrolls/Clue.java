package net.dungeonrealms.game.item.items.functional.cluescrolls;

import lombok.Getter;

/**
 * Created by Rar349 on 6/13/2017.
 */
@Getter
public enum Clue {

    //Fishing
    PUFFER_FISH("Fish <range> fish","<progress> fish remaining",0,ClueDifficulty.EASY,true, 5, 25),
    UNDER_WATER_ORB("Use an orb of alteration under water",null,-1,ClueDifficulty.MEDIUM,true),
    SPAWN_GUARDIAN_UNDER_WATER("Spawn a Guardian pet while under water",null,-1, ClueDifficulty.HARD, true),
    FISH_GEAR("Fish up a piece of Tier <range> gear from Treasure Find",null,-1, ClueDifficulty.MEDIUM, true, 1,5),
    USE_FISHING_ENCHANT("Apply a fishing enchantment scroll to your fishing rod",null,-1, ClueDifficulty.EASY, true),

    //Mining
    KILL_WITH_PICK("Kill a tier <range> monster with a tier <range> pickaxe",null,-1, ClueDifficulty.MEDIUM, false, new int[] {1,1}, new int[] {5,5}),
    MINE_ORE("Mine <range> tier <range> ore", "<progress> ore remaining",0,ClueDifficulty.EASY, false, new int[] {5,1}, new int[] {30,5}),
    TREASURE_FIND("Treasure find on tier <range> ore <range> times","<progress> more treasure finds",1, ClueDifficulty.HARD, false, new int[] {1, 10}, new int[] {5,30}),
    HIT_A_RABBIT("Hit a rabbit pet with a tier <range> pickaxe",null,-1, ClueDifficulty.MEDIUM, true, new int[] {1}, new int[] {5}),
    MINE_ON_HORSE("Mine a tier <range> ore while on a horse", null,-1,ClueDifficulty.EASY, true, new int[] {1},new int[] {5}),
    USE_PICK_ENCHANT("Apple a pickaxe enchantment scroll to your pickaxe", null,-1,ClueDifficulty.EASY, true);


    private String hint;
    private String progressString;
    private int progressRangeIndex;
    private ClueDifficulty defaultDifficulty;
    private boolean canHaveArmorRequirements;
    private int[] minRanges;
    private int[] maxRanges;

    Clue(String hintPrefix,String progressString, int progressRangeIndex,ClueDifficulty defaultDifficulty) {
        this(hintPrefix, progressString,progressRangeIndex,defaultDifficulty, true);
    }

    Clue(String hintPrefix,String progressString,int progressRangeIndex,ClueDifficulty defaultDifficulty, boolean canHaveArmorRequirements) {
        this(hintPrefix, progressString,progressRangeIndex,defaultDifficulty, canHaveArmorRequirements,null ,null);
    }

    Clue(String hintPrefix,String progressString,int progressRangeIndex,ClueDifficulty defaultDifficulty, boolean canHaveArmorRequirements, int min, int max) {
        this(hintPrefix, progressString,progressRangeIndex,defaultDifficulty, canHaveArmorRequirements,new int[min] ,new int[max]);
    }

    Clue(String hintPrefix,String progressString,int progressRangeIndex,ClueDifficulty defaultDifficulty, boolean canHaveArmorRequirements,int[] minNumber, int[] maxNumber) {
        this.hint = hintPrefix;
        this.progressString = progressString;
        this.progressRangeIndex = progressRangeIndex;
        this.defaultDifficulty = defaultDifficulty;
        this.canHaveArmorRequirements = canHaveArmorRequirements;
        this.minRanges = minNumber;
        this.maxRanges = maxNumber;
    }

    public boolean hasRangeStat() {
        return minRanges != null && maxRanges != null;
    }

    public String getFormattedHint(int[] rolledStats) {
        String hint = this.hint;
        for(int stat : rolledStats) {
            hint = hint.replaceFirst("<range>", String.valueOf(stat));
        }
        return hint;
    }
}

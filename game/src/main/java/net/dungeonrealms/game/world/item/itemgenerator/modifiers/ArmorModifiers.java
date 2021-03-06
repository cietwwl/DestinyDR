package net.dungeonrealms.game.world.item.itemgenerator.modifiers;

import net.dungeonrealms.game.item.ItemType;
import net.dungeonrealms.game.item.items.core.ItemArmor;
import net.dungeonrealms.game.world.item.Item.ArmorAttributeType;
import net.dungeonrealms.game.world.item.Item.ItemRarity;
import net.dungeonrealms.game.world.item.Item.ItemTier;
import net.dungeonrealms.game.world.item.itemgenerator.engine.ItemModifier;
import net.dungeonrealms.game.world.item.itemgenerator.engine.ModifierCondition;
import net.dungeonrealms.game.world.item.itemgenerator.engine.ModifierRange;
import net.dungeonrealms.game.world.item.itemgenerator.engine.ModifierType;

public class ArmorModifiers {

    public class HPRegen extends ItemModifier {

        public HPRegen() {
            super(ArmorAttributeType.HEALTH_REGEN, ItemArmor.ARMOR);
            addCondition(new ModifierCondition(ItemTier.TIER_1, null, new ModifierRange(ModifierType.STATIC, 5, 20)).setCantContain(ArmorModifiers.EnergyRegen.class));
            addCondition(new ModifierCondition(ItemTier.TIER_2, null, new ModifierRange(ModifierType.STATIC, 20, 40)).setCantContain(ArmorModifiers.EnergyRegen.class));
            addCondition(new ModifierCondition(ItemTier.TIER_3, null, new ModifierRange(ModifierType.STATIC, 45, 70)).setCantContain(ArmorModifiers.EnergyRegen.class));
            addCondition(new ModifierCondition(ItemTier.TIER_4, null, new ModifierRange(ModifierType.STATIC, 70, 130)).setCantContain(ArmorModifiers.EnergyRegen.class));
            addCondition(new ModifierCondition(ItemTier.TIER_5, null, new ModifierRange(ModifierType.STATIC, 130, 200)).setCantContain(ArmorModifiers.EnergyRegen.class));
        }

    }

    public class MainArmor extends ItemModifier {

        public MainArmor() {
            super(ArmorAttributeType.ARMOR, ItemType.CHESTPLATE); // 50% chance for DPS, 50% for armor

            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 2, 2, 2, 2)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 2, 2, 4, 4)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 4, 4, 4, 4)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 6, 6, 6, 6)).setCantContain(MainDPS.class));

            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 4, 4, 4, 4)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 4, 4, 6, 6)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 6, 6, 6, 6)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 8, 8, 8, 8)).setCantContain(MainDPS.class));

            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 6, 6, 6, 6)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 6, 6, 8, 8)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 8, 8, 8, 8)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 10, 10, 10, 10)).setCantContain(MainDPS.class));

            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 8, 8, 8, 10)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 10, 10, 10, 12)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 12, 12, 12, 14)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 14, 14, 14, 16)).setCantContain(MainDPS.class));

            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 12, 12, 12, 14)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 14, 14, 14, 16)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 16, 16, 16, 18)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 18, 18, 18, 20)).setCantContain(MainDPS.class));
        }

    }

    public class LeggingArmor extends ItemModifier {

        public LeggingArmor() {
            super(ArmorAttributeType.ARMOR, ItemType.LEGGINGS); // 50% chance for DPS, 50% for armor

            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 2, 2, 2, 2)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 2, 2, 4, 4)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 4, 4, 4, 4)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 6, 6, 6, 6)).setCantContain(MainDPS.class));

            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 4, 4, 4, 4)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 4, 4, 6, 6)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 6, 6, 6, 6)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 8, 8, 8, 8)).setCantContain(MainDPS.class));

            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 6, 6, 6, 6)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 6, 6, 8, 8)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 8, 8, 8, 8)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 10, 10, 10, 10)).setCantContain(MainDPS.class));

            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 8, 8, 8, 10)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 10, 10, 10, 12)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 12, 12, 12, 14)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 14, 14, 14, 16)).setCantContain(MainDPS.class));

            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 12, 12, 12, 14)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 14, 14, 14, 16)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 16, 16, 16, 18)).setCantContain(MainDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 18, 18, 18, 20)).setCantContain(MainDPS.class));
        }

    }

    public class HelmetsArmor extends ItemModifier {

        public HelmetsArmor() {
            super(ArmorAttributeType.ARMOR, ItemType.HELMET); // 50% chance for DPS, 50% for armor

            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 1, 1, 1, 1)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 1, 1, 2, 2)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 2, 2, 2, 2)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 3, 3, 3, 3)).setCantContain(OtherDPS.class));

            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 2, 2, 2, 2)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 2, 2, 3, 3)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 3, 3, 3, 3)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 3, 3, 4, 4)).setCantContain(OtherDPS.class));

            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 3, 3, 3, 3)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 3, 3, 4, 4)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 4, 4, 4, 4)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 4, 4, 5, 5)).setCantContain(OtherDPS.class));

            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 4, 4, 4, 5)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 5, 5, 5, 6)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 6, 6, 6, 7)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 7, 7, 7, 8)).setCantContain(OtherDPS.class));

            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 6, 6, 6, 7)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 7, 7, 7, 8)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 8, 8, 8, 9)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 9, 9, 9, 10)).setCantContain(OtherDPS.class));
        }

    }

    public class BootsArmor extends ItemModifier {

        public BootsArmor() {
            super(ArmorAttributeType.ARMOR, ItemType.BOOTS); // 50% chance for DPS, 50% for armor

            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 1, 1, 1, 1)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 1, 1, 2, 2)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 2, 2, 2, 2)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 3, 3, 3, 3)).setCantContain(OtherDPS.class));

            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 2, 2, 2, 2)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 2, 2, 3, 3)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 3, 3, 3, 3)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 3, 3, 4, 4)).setCantContain(OtherDPS.class));

            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 3, 3, 3, 3)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 3, 3, 4, 4)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 4, 4, 4, 4)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 4, 4, 5, 5)).setCantContain(OtherDPS.class));

            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 4, 4, 4, 5)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 5, 5, 5, 6)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 6, 6, 6, 7)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 7, 7, 7, 8)).setCantContain(OtherDPS.class));

            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 6, 6, 6, 7)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 7, 7, 7, 8)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 8, 8, 8, 9)).setCantContain(OtherDPS.class));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 9, 9, 9, 10)).setCantContain(OtherDPS.class));
        }

    }
    public class MainDPS extends ItemModifier {

        public MainDPS() {
            super(ArmorAttributeType.DAMAGE, ItemType.LEGGINGS, ItemType.CHESTPLATE); // 50% chance for DPS, 50% for armor

            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 2, 2, 2, 2)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 2, 2, 4, 4)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 4, 4, 4, 4)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 6, 6, 6, 6)));

            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 4, 4, 4, 4)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 4, 4, 6, 6)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 6, 6, 6, 6)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 8, 8, 8, 8)));

            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 6, 6, 6, 6)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 6, 6, 8, 8)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 8, 8, 8, 8)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 10, 10, 10, 10)));

            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 8, 8, 8, 10)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 10, 10, 10, 12)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 12, 12, 12, 14)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 14, 14, 14, 16)));

            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 12, 12, 12, 14)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 14, 14, 14, 16)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 16, 16, 16, 18)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 18, 18, 18, 20)));
        }
    }

    public class MainDPS1 extends ItemModifier {

        public MainDPS1() {
            super(ArmorAttributeType.DAMAGE, ItemType.CHESTPLATE); // 50% chance for DPS, 50% for armor

            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 2, 2, 2, 2)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 2, 2, 4, 4)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 4, 4, 4, 4)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 6, 6, 6, 6)));

            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 4, 4, 4, 4)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 4, 4, 6, 6)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 6, 6, 6, 6)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 8, 8, 8, 8)));

            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 6, 6, 6, 6)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 6, 6, 8, 8)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 8, 8, 8, 8)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 10, 10, 10, 10)));

            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 8, 8, 8, 10)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 10, 10, 10, 12)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 12, 12, 12, 14)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 14, 14, 14, 16)));

            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 12, 12, 12, 14)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 14, 14, 14, 16)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 16, 16, 16, 18)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 18, 18, 18, 20)));
        }

    }

    public class OtherDPS extends ItemModifier {

        public OtherDPS() {
            super(ArmorAttributeType.DAMAGE, ItemType.HELMET, ItemType.BOOTS); // 50% chance for DPS, 50% for armor

            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 1, 1, 1, 1)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 1, 1, 2, 2)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 2, 2, 2, 2)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 3, 3, 3, 3)));

            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 2, 2, 2, 2)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 2, 2, 3, 3)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 3, 3, 3, 3)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 3, 3, 4, 4)));

            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 3, 3, 3, 3)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 3, 3, 4, 4)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 4, 4, 4, 4)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 4, 4, 5, 5)));

            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 4, 4, 4, 5)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 5, 5, 5, 6)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 6, 6, 6, 7)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 7, 7, 7, 8)));

            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 6, 6, 6, 7)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 7, 7, 7, 8)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 8, 8, 8, 9)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 9, 9, 9, 10)));
        }

    }

    public class OtherDPS1 extends ItemModifier {

        public OtherDPS1() {
            super(ArmorAttributeType.DAMAGE, ItemType.BOOTS); // 50% chance for DPS, 50% for armor

            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 1, 1, 1, 1)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 1, 1, 2, 2)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 2, 2, 2, 2)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 3, 3, 3, 3)));

            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 2, 2, 2, 2)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 2, 2, 3, 3)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 3, 3, 3, 3)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 3, 3, 4, 4)));

            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 3, 3, 3, 3)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 3, 3, 4, 4)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 4, 4, 4, 4)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 4, 4, 5, 5)));

            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 4, 4, 4, 5)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 5, 5, 5, 6)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 6, 6, 6, 7)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 7, 7, 7, 8)));

            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.COMMON, new ModifierRange(ModifierType.QUAD, 6, 6, 6, 7)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.QUAD, 7, 7, 7, 8)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.RARE, new ModifierRange(ModifierType.QUAD, 8, 8, 8, 9)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNIQUE, new ModifierRange(ModifierType.QUAD, 9, 9, 9, 10)));
        }

    }

    public class ChestplateHP extends ItemModifier {

        public ChestplateHP() {
            super(ArmorAttributeType.HEALTH_POINTS, ItemType.CHESTPLATE);

            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 2, 20)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 21, 50)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 51, 100)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 101, 150)));

            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 51, 100)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 101, 200)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 201, 300)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 301, 400)));

            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 201, 300)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 301, 600)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 601, 900)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 901, 1100)));

//			addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 650, 960)));
//			addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 961, 1450)));
//			addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 1451, 2300)));
//			addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 2301, 2800)));

            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 801, 1100)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 1101, 1600)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 1601, 2400)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 2401, 3000)));

			/*addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 1450, 2500)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 2501, 3800)));
			addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 3801, 5500)));
			addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 5501, 6000)));*/

            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 2001, 2700)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 2701, 4000)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 4001, 5300)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 5301, 6500)));
        }

    }

    public class LeggingsHP extends ItemModifier {

        public LeggingsHP() {
            super(ArmorAttributeType.HEALTH_POINTS, ItemType.LEGGINGS);

            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 2, 20)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 21, 50)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 51, 100)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 101, 150)));

            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 51, 100)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 101, 200)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 201, 300)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 301, 400)));

            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 201, 300)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 301, 600)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 601, 900)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 901, 1100)));

//			addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 650, 960)));
//			addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 961, 1450)));
//			addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 1451, 2300)));
//			addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 2301, 2800)));

            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 801, 1100)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 1101, 1600)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 1601, 2400)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 2401, 3000)));

			/*addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 1450, 2500)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 2501, 3800)));
			addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 3801, 5500)));
			addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 5501, 6000)));*/

            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 2001, 2700)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 2701, 4000)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 4001, 5300)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 5301, 6500)));
        }

    }

    public class BootsHP extends ItemModifier {

        public BootsHP() {
            super(ArmorAttributeType.HEALTH_POINTS, ItemType.BOOTS);

            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 1, 10)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 11, 25)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 26, 50)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 51, 75)));

            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 26, 50)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 51, 100)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 101, 150)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 151, 200)));

            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 101, 150)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 151, 300)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 301, 450)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 451, 550)));

//          addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 300, 450)));
//          addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 451, 700)));
//          addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 701, 999)));
//          addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 1000, 1300)));

            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 401, 550)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 551, 800)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 801, 1200)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 1201, 1500)));

            /*addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 900, 1200)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 1201, 2000)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 2001, 2600)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 2601, 3000)));*/

            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 1001, 1350)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 1351, 2000)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 2001, 2600)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 2601, 3300)));
        }
    }

    public class HelmetHP extends ItemModifier {

        public HelmetHP() {
            super(ArmorAttributeType.HEALTH_POINTS, ItemType.HELMET);

            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 1, 10)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 11, 25)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 26, 50)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 51, 75)));

            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 26, 50)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 51, 100)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 101, 150)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 151, 200)));

            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 101, 150)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 151, 300)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 301, 450)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 451, 550)));

//          addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 300, 450)));
//          addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 451, 700)));
//          addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 701, 999)));
//          addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 1000, 1300)));

            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 401, 550)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 551, 800)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 801, 1200)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 1201, 1500)));

            /*addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 900, 1200)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 1201, 2000)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 2001, 2600)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 2601, 3000)));*/

            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 1001, 1350)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 1351, 2000)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 2001, 2600)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 2601, 3300)));
        }

    }

    public class ShieldHP extends ItemModifier {

        public ShieldHP() {
            super(ArmorAttributeType.HEALTH_POINTS, ItemType.SHIELD);

            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 5, 12)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 13, 27)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 28, 45)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 46, 65)));

            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 30, 67)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 68, 105)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 106, 153)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 154, 215)));

            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 110, 200)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 201, 300)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 301, 400)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 401, 540)));

            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 300, 550)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 551, 750)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 751, 1000)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 1001, 1400)));

            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 800, 1400)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 1401, 2000)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 2001, 2600)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 2601, 3200)));
        }

    }

    public class ShieldAbsorb extends ItemModifier {

        public ShieldAbsorb() {
            super(new ArmorAttributeType[]{ArmorAttributeType.MELEE_ABSORBTION, ArmorAttributeType.RANGE_ABSORBTION}, ItemType.SHIELD);

            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 1, 2)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 2, 3)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 3, 4)));
            addCondition(new ModifierCondition(ItemTier.TIER_1, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 4, 5)));

            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 5, 6)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 6, 7)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 8, 9)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 9, 10)));

            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 11, 12)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 13, 14)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 15, 16)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 17, 18)));

            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 19, 20)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 21, 22)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 23, 24)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 25, 26)));

            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 27, 28)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 29, 30)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 31, 33)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 34, 35)));
        }

    }

    public class Potency extends ItemModifier {
        public Potency() {
            super(ArmorAttributeType.POTENCY, ItemArmor.ARMOR);

            addCondition(new ModifierCondition(ItemTier.TIER_1, null, new ModifierRange(ModifierType.STATIC, 1, 2), 3));
            addCondition(new ModifierCondition(ItemTier.TIER_2, null, new ModifierRange(ModifierType.STATIC, 2, 3), 3));
            addCondition(new ModifierCondition(ItemTier.TIER_3, null, new ModifierRange(ModifierType.STATIC, 1, 10), 5));
            addCondition(new ModifierCondition(ItemTier.TIER_4, null, new ModifierRange(ModifierType.STATIC, 1, 20), 7));
            addCondition(new ModifierCondition(ItemTier.TIER_5, null, new ModifierRange(ModifierType.STATIC, 1, 25), 7));
        }
    }

    public class Luck extends ItemModifier {
        public Luck() {
            super(ArmorAttributeType.LUCK, ItemArmor.ARMOR);
            addCondition(new ModifierCondition(ItemTier.TIER_1, null, new ModifierRange(ModifierType.STATIC, 1, 1), 3));
            addCondition(new ModifierCondition(ItemTier.TIER_2, null, new ModifierRange(ModifierType.STATIC, 1, 1), 3));
            addCondition(new ModifierCondition(ItemTier.TIER_3, null, new ModifierRange(ModifierType.STATIC, 1, 1), 5));
            addCondition(new ModifierCondition(ItemTier.TIER_4, null, new ModifierRange(ModifierType.STATIC, 1, 2), 7));
            addCondition(new ModifierCondition(ItemTier.TIER_5, null, new ModifierRange(ModifierType.STATIC, 1, 2), 7));
        }
    }

    public class LastStand extends ItemModifier {
        public LastStand() {
            super(ArmorAttributeType.LAST_STAND, ItemArmor.ARMOR);
            addCondition(new ModifierCondition(ItemTier.TIER_1, null, new ModifierRange(ModifierType.STATIC, 1, 1), 3));
            addCondition(new ModifierCondition(ItemTier.TIER_2, null, new ModifierRange(ModifierType.STATIC, 1, 1), 3));
            addCondition(new ModifierCondition(ItemTier.TIER_3, null, new ModifierRange(ModifierType.STATIC, 1, 1), 5));
            addCondition(new ModifierCondition(ItemTier.TIER_4, null, new ModifierRange(ModifierType.STATIC, 1, 2), 7));
            addCondition(new ModifierCondition(ItemTier.TIER_5, null, new ModifierRange(ModifierType.STATIC, 1, 3), 7));
        }
    }
    public class StrDexVitInt extends ItemModifier {

        public StrDexVitInt() {
            super(new ArmorAttributeType[]{ArmorAttributeType.STRENGTH, ArmorAttributeType.DEXTERITY, ArmorAttributeType.VITALITY, ArmorAttributeType.INTELLECT}, ItemArmor.ARMOR);
            addCondition(new ModifierCondition(ItemTier.TIER_1, null, new ModifierRange(ModifierType.STATIC, 1, 15), 25));
            addCondition(new ModifierCondition(ItemTier.TIER_2, null, new ModifierRange(ModifierType.STATIC, 1, 35), 20).setBonus(new ModifierCondition(ItemTier.TIER_2, null, new ModifierRange(ModifierType.STATIC, 1, 35), 5)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, null, new ModifierRange(ModifierType.STATIC, 1, 75), 15).setBonus(new ModifierCondition(ItemTier.TIER_3, null, new ModifierRange(ModifierType.STATIC, 1, 75), 5).setBonus(new ModifierCondition(ItemTier.TIER_3, null, new ModifierRange(ModifierType.STATIC, 1, 75), 1))));
            addCondition(new ModifierCondition(ItemTier.TIER_4, null, new ModifierRange(ModifierType.STATIC, 1, 115), 15).setBonus(new ModifierCondition(ItemTier.TIER_4, null, new ModifierRange(ModifierType.STATIC, 1, 115), 9).setBonus(new ModifierCondition(ItemTier.TIER_4, null, new ModifierRange(ModifierType.STATIC, 1, 115), 4))));
            addCondition(new ModifierCondition(ItemTier.TIER_5, null, new ModifierRange(ModifierType.STATIC, 1, 315), 20).setBonus(new ModifierCondition(ItemTier.TIER_5, null, new ModifierRange(ModifierType.STATIC, 1, 315), 10).setBonus(new ModifierCondition(ItemTier.TIER_5, null, new ModifierRange(ModifierType.STATIC, 1, 315), 5))));
        }
    }

    public class EnergyRegen extends ItemModifier {

        public EnergyRegen() {
            super(ArmorAttributeType.ENERGY_REGEN, ItemArmor.ARMOR);
            addCondition(new ModifierCondition(ItemTier.TIER_1, null, new ModifierRange(ModifierType.STATIC, 1, 5, true)));
            addCondition(new ModifierCondition(ItemTier.TIER_2, null, new ModifierRange(ModifierType.STATIC, 3, 7, true)));
            addCondition(new ModifierCondition(ItemTier.TIER_3, null, new ModifierRange(ModifierType.STATIC, 5, 9, true)));
            addCondition(new ModifierCondition(ItemTier.TIER_4, null, new ModifierRange(ModifierType.STATIC, 7, 12, true)));
            addCondition(new ModifierCondition(ItemTier.TIER_5, null, new ModifierRange(ModifierType.STATIC, 8, 12, true)));
        }

    }

    public class Thorns extends ItemModifier {

        public Thorns() {
            super(ArmorAttributeType.THORNS, ItemArmor.ARMOR_SHIELD);
            addCondition(new ModifierCondition(ItemTier.TIER_1, null, new ModifierRange(ModifierType.STATIC, 1, 2), 3));
            addCondition(new ModifierCondition(ItemTier.TIER_2, null, new ModifierRange(ModifierType.STATIC, 1, 3), 3));
            addCondition(new ModifierCondition(ItemTier.TIER_3, null, new ModifierRange(ModifierType.STATIC, 1, 5), 5));
            addCondition(new ModifierCondition(ItemTier.TIER_4, null, new ModifierRange(ModifierType.STATIC, 1, 9), 7));
            addCondition(new ModifierCondition(ItemTier.TIER_5, null, new ModifierRange(ModifierType.STATIC, 1, 9), 7));
        }

    }

    public class Dodge extends ItemModifier {

        public Dodge() {
            super(ArmorAttributeType.DODGE, ItemArmor.ARMOR);
            addCondition(new ModifierCondition(ItemTier.TIER_1, null, new ModifierRange(ModifierType.STATIC, 1, 5), 5));
            addCondition(new ModifierCondition(ItemTier.TIER_2, null, new ModifierRange(ModifierType.STATIC, 1, 8), 9));
            addCondition(new ModifierCondition(ItemTier.TIER_3, null, new ModifierRange(ModifierType.STATIC, 1, 10), 15));
            addCondition(new ModifierCondition(ItemTier.TIER_4, null, new ModifierRange(ModifierType.STATIC, 1, 12), 25));
            addCondition(new ModifierCondition(ItemTier.TIER_5, null, new ModifierRange(ModifierType.STATIC, 1, 12), 30));
        }

    }

    public class Block extends ItemModifier {

        public Block() {
            super(ArmorAttributeType.BLOCK, ItemArmor.ARMOR);
            addCondition(new ModifierCondition(ItemTier.TIER_1, null, new ModifierRange(ModifierType.STATIC, 1, 5), 5));
            addCondition(new ModifierCondition(ItemTier.TIER_2, null, new ModifierRange(ModifierType.STATIC, 1, 8), 9));
            addCondition(new ModifierCondition(ItemTier.TIER_3, null, new ModifierRange(ModifierType.STATIC, 1, 10), 15));
            addCondition(new ModifierCondition(ItemTier.TIER_4, null, new ModifierRange(ModifierType.STATIC, 1, 12), 25));
            addCondition(new ModifierCondition(ItemTier.TIER_5, null, new ModifierRange(ModifierType.STATIC, 1, 12), 30));
        }

    }

    public class Resistances extends ItemModifier {

        public Resistances() {
            super(new ArmorAttributeType[]{ArmorAttributeType.FIRE_RESISTANCE, ArmorAttributeType.ICE_RESISTANCE, ArmorAttributeType.POISON_RESISTANCE}, ItemArmor.ARMOR_SHIELD);
            addCondition(new ModifierCondition(ItemTier.TIER_1, null, new ModifierRange(ModifierType.STATIC, 1, 5), 15));
            addCondition(new ModifierCondition(ItemTier.TIER_2, null, new ModifierRange(ModifierType.STATIC, 1, 7), 15));
            addCondition(new ModifierCondition(ItemTier.TIER_3, null, new ModifierRange(ModifierType.STATIC, 1, 20), 25));
            addCondition(new ModifierCondition(ItemTier.TIER_4, null, new ModifierRange(ModifierType.STATIC, 1, 32), 20));
            addCondition(new ModifierCondition(ItemTier.TIER_5, null, new ModifierRange(ModifierType.STATIC, 1, 45), 30));
        }
    }

    public class Reflection extends ItemModifier {

        public Reflection() {
            super(ArmorAttributeType.REFLECTION, ItemArmor.ARMOR_SHIELD);
            addCondition(new ModifierCondition(ItemTier.TIER_1, null, new ModifierRange(ModifierType.STATIC, 1, 1), 3));
            addCondition(new ModifierCondition(ItemTier.TIER_2, null, new ModifierRange(ModifierType.STATIC, 1, 2), 5));
            addCondition(new ModifierCondition(ItemTier.TIER_3, null, new ModifierRange(ModifierType.STATIC, 1, 4), 10));
            addCondition(new ModifierCondition(ItemTier.TIER_4, null, new ModifierRange(ModifierType.STATIC, 1, 5), 13));
            addCondition(new ModifierCondition(ItemTier.TIER_5, null, new ModifierRange(ModifierType.STATIC, 1, 5), 15));
        }

    }

    public class GemFind extends ItemModifier {

        public GemFind() {
            super(ArmorAttributeType.GEM_FIND, ItemArmor.ARMOR_SHIELD);
            addCondition(new ModifierCondition(ItemTier.TIER_1, null, new ModifierRange(ModifierType.STATIC, 1, 5), 5));
            addCondition(new ModifierCondition(ItemTier.TIER_2, null, new ModifierRange(ModifierType.STATIC, 1, 8), 5));
            addCondition(new ModifierCondition(ItemTier.TIER_3, null, new ModifierRange(ModifierType.STATIC, 1, 15), 5));
            addCondition(new ModifierCondition(ItemTier.TIER_4, null, new ModifierRange(ModifierType.STATIC, 1, 20), 5));
            addCondition(new ModifierCondition(ItemTier.TIER_5, null, new ModifierRange(ModifierType.STATIC, 1, 20), 5));
        }

    }

    public class ItemFind extends ItemModifier {

        public ItemFind() {
            super(ArmorAttributeType.ITEM_FIND, ItemArmor.ARMOR_SHIELD);
            addCondition(new ModifierCondition(ItemTier.TIER_1, null, new ModifierRange(ModifierType.STATIC, 1, 1), 5));
            addCondition(new ModifierCondition(ItemTier.TIER_2, null, new ModifierRange(ModifierType.STATIC, 1, 2), 5));
            addCondition(new ModifierCondition(ItemTier.TIER_3, null, new ModifierRange(ModifierType.STATIC, 1, 3), 5));
            addCondition(new ModifierCondition(ItemTier.TIER_4, null, new ModifierRange(ModifierType.STATIC, 1, 4), 5));
            addCondition(new ModifierCondition(ItemTier.TIER_5, null, new ModifierRange(ModifierType.STATIC, 1, 4), 5));
        }

    }

}

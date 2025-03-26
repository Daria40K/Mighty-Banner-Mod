import buff.BannerBuffRegister;
import static buff.BannerBuffRegister.MightyBanners;

import miscItem.MightyBannerItem;
import necesse.engine.modLoader.annotations.ModEntry;
import necesse.engine.registries.RecipeTechRegistry;
import necesse.inventory.item.Item;
import necesse.inventory.item.miscItem.BannerItem;
import necesse.engine.registries.ItemRegistry;
import necesse.inventory.recipe.Ingredient;
import necesse.inventory.recipe.Recipe;
import necesse.inventory.recipe.Recipes;


@ModEntry
public class MightyBannerMod {

    public void init() {
        BannerBuffRegister.register();

        // ===== Fishing
        ItemRegistry.registerItem("banner_of_fishing", new BannerItem(Item.Rarity.COMMON, 480, (m) -> MightyBanners.FISHING), 200.0F, true);

        // ===== Health regen
        ItemRegistry.registerItem("banner_of_health_regen", new BannerItem(Item.Rarity.COMMON, 480, (m) -> MightyBanners.HEALTH_REGEN), 200.0F, true);

        // ===== Mana regen
        ItemRegistry.registerItem("banner_of_mana_regen", new BannerItem(Item.Rarity.COMMON, 480, (m) -> MightyBanners.MANA_REGEN), 200.0F, true);

        // ===== Resistance
        ItemRegistry.registerItem("banner_of_resistance", new BannerItem(Item.Rarity.COMMON, 480, (m) -> MightyBanners.RESISTANCE), 200.0F, true);

        // ===== Summoning
        ItemRegistry.registerItem("banner_of_summoning", new BannerItem(Item.Rarity.COMMON, 480, (m) -> MightyBanners.SUMMONING), 200.0F, true);

        // ===== accuracy
        // ===== Attack Speed
        ItemRegistry.registerItem("banner_of_attack_speed", new BannerItem(Item.Rarity.COMMON, 480, (m) -> MightyBanners.ATTACK_SPEED), 200.0F, true);

        //ItemRegistry.registerItem("banner_of_greater_attack_speed", new BannerItem(Item.Rarity.COMMON, 480, (m) -> MightyBanners.GREATER_ATTACK_SPEED), 200.0F, true);
    }
    public void postInit() {
        // ===== Fishing
        Recipes.registerModRecipe(new Recipe("banner_of_fishing", 1, RecipeTechRegistry.DEMONIC_WORKSTATION,
                new Ingredient[]{
                        new Ingredient("wool", 30),
                        new Ingredient("fishingpotion", 10)
                }
        ).showAfter("bannerofsummonspeed"));

        // ===== Health regen
        Recipes.registerModRecipe(new Recipe("banner_of_health_regen", 1, RecipeTechRegistry.DEMONIC_WORKSTATION,
                new Ingredient[]{
                        new Ingredient("wool", 30),
                        new Ingredient("healthregenpotion", 10)
                }
        ).showAfter("banner_of_fishing"));

        // ===== Mana regen
        Recipes.registerModRecipe(new Recipe("banner_of_mana_regen", 1, RecipeTechRegistry.DEMONIC_WORKSTATION,
                new Ingredient[]{
                        new Ingredient("wool", 30),
                        new Ingredient("manaregenpotion", 10)
                }
        ).showAfter("banner_of_health_regen"));

        // ===== Resistance
        Recipes.registerModRecipe(new Recipe("banner_of_resistance", 1, RecipeTechRegistry.DEMONIC_WORKSTATION,
                new Ingredient[]{
                        new Ingredient("wool", 30),
                        new Ingredient("resistancepotion", 10)
                }
        ).showAfter("banner_of_mana_regen"));

        // ===== Summoning
        Recipes.registerModRecipe(new Recipe("banner_of_summoning", 1, RecipeTechRegistry.DEMONIC_WORKSTATION,
                new Ingredient[]{
                        new Ingredient("wool", 30),
                        new Ingredient("minionpotion", 10)
                }
        ).showAfter("banner_of_resistance"));

        // ===== Attack Speed
        Recipes.registerModRecipe(new Recipe("banner_of_attack_speed", 1, RecipeTechRegistry.DEMONIC_WORKSTATION,
                new Ingredient[]{
                        new Ingredient("wool", 30),
                        new Ingredient("attackspeedpotion", 10)
                }
        ).showAfter("banner_of_summoning"));
    }
}

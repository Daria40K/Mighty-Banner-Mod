package buff;

import necesse.engine.registries.BuffRegistry;
import necesse.entity.mobs.buffs.staticBuffs.Buff;

public class BannerBuffRegister {
    public static void register() {
        BannerBuffRegister.MightyBanners.FISHING = BuffRegistry.registerBuff("banner_of_fishing", new BannerOfFishingBuff());
        BannerBuffRegister.MightyBanners.HEALTH_REGEN = BuffRegistry.registerBuff("banner_of_health_regen", new BannerOfHealthRegenBuff());
        BannerBuffRegister.MightyBanners.MANA_REGEN = BuffRegistry.registerBuff("banner_of_mana_regen", new BannerOfManaRegenBuff());
        BannerBuffRegister.MightyBanners.RESISTANCE = BuffRegistry.registerBuff("banner_of_resistance", new BannerOfResistanceBuff());
        BannerBuffRegister.MightyBanners.SUMMONING = BuffRegistry.registerBuff("banner_of_summoning", new BannerOfSummoningBuff());
        BannerBuffRegister.MightyBanners.ATTACK_SPEED = BuffRegistry.registerBuff("banner_of_attack_speed", new BannerOfAttackSpeedBuff());

        BannerBuffRegister.MightyBanners.GREATER_FISHING = BuffRegistry.registerBuff("banner_of_greater_fishing", new BannerOfGreaterFishingBuff());
        BannerBuffRegister.MightyBanners.GREATER_HEALTH_REGEN = BuffRegistry.registerBuff("banner_of_greater_health_regen", new BannerOfGreaterHealthRegenBuff());
        BannerBuffRegister.MightyBanners.GREATER_MANA_REGEN = BuffRegistry.registerBuff("banner_of_greater_mana_regen", new BannerOfGreaterManaRegenBuff());
        BannerBuffRegister.MightyBanners.GREATER_RESISTANCE = BuffRegistry.registerBuff("banner_of_greater_resistance", new BannerOfGreaterResistanceBuff());
        BannerBuffRegister.MightyBanners.GREATER_SUMMONING = BuffRegistry.registerBuff("banner_of_greater_summoning", new BannerOfGreaterSummoningBuff());
        BannerBuffRegister.MightyBanners.GREATER_ATTACK_SPEED = BuffRegistry.registerBuff("banner_of_greater_attack_speed", new BannerOfGreaterAttackSpeedBuff());
    }

    public static class MightyBanners {
        public static Buff FISHING;
        public static Buff HEALTH_REGEN;
        public static Buff MANA_REGEN;
        public static Buff RESISTANCE;
        public static Buff SUMMONING;
        public static Buff ATTACK_SPEED;

        public static Buff GREATER_FISHING;
        public static Buff GREATER_HEALTH_REGEN;
        public static Buff GREATER_MANA_REGEN;
        public static Buff GREATER_RESISTANCE;
        public static Buff GREATER_SUMMONING;
        public static Buff GREATER_ATTACK_SPEED;

        public MightyBanners() {
        }
    }
}

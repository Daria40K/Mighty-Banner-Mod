package buff;

import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffModifiers;

public class BannerOfFishingBuff extends MightyVicinityBuff {
    @Override
    public void clientTick(ActiveBuff buff) {
        this.updateModifiers(buff);
    }

    @Override
    public void serverTick(ActiveBuff buff) {
        this.updateModifiers(buff);
    }

    public void updateModifiers(ActiveBuff buff) {
        //if(buff.owner.buffManager.hasBuff("banner_of_greater_fishing") || buff.owner.buffManager.hasBuff("banner_of_even_greater_fishing")) {
        if(buff.owner.buffManager.hasBuff("banner_of_greater_fishing")) {
            buff.setModifier(BuffModifiers.FISHING_POWER, 0);
            this.updateBuffActive(false);
        } else {
            buff.setModifier(BuffModifiers.FISHING_POWER, 20);
            this.updateBuffActive(true);
        }
    }
}
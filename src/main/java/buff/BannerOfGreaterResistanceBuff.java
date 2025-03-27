package buff;

import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffModifiers;

public class BannerOfGreaterResistanceBuff extends MightyVicinityBuff {
    @Override
    public void clientTick(ActiveBuff buff) {
        this.updateModifiers(buff);
    }

    @Override
    public void serverTick(ActiveBuff buff) {
        this.updateModifiers(buff);
    }

    public void updateModifiers(ActiveBuff buff) {
        if(buff.owner.buffManager.hasBuff("banner_of_even_greater_resistance")) {
            buff.setModifier(BuffModifiers.ARMOR_FLAT, 0);
            this.updateBuffActive(false);
        } else {
            buff.setModifier(BuffModifiers.ARMOR_FLAT, 12);
            this.updateBuffActive(true);
        }
    }
}
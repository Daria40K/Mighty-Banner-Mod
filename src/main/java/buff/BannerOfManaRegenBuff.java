package buff;

import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffModifiers;

public class BannerOfManaRegenBuff extends MightyVicinityBuff {
    @Override
    public void clientTick(ActiveBuff buff) {
        this.updateModifiers(buff);
    }

    @Override
    public void serverTick(ActiveBuff buff) {
        this.updateModifiers(buff);
    }

    public void updateModifiers(ActiveBuff buff) {
        if(buff.owner.buffManager.hasBuff("banner_of_greater_mana_regen") || buff.owner.buffManager.hasBuff("banner_of_even_greater_mana_regen")) {
            buff.setModifier(BuffModifiers.COMBAT_MANA_REGEN, 0F);
            this.updateBuffActive(false);
        } else {
            buff.setModifier(BuffModifiers.COMBAT_MANA_REGEN, 2.0F);
            this.updateBuffActive(true);
        }
    }
}
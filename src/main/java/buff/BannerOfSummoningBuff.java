package buff;

import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffModifiers;

public class BannerOfSummoningBuff extends MightyVicinityBuff {
    @Override
    public void clientTick(ActiveBuff buff) {
        this.updateModifiers(buff);
    }

    @Override
    public void serverTick(ActiveBuff buff) {
        this.updateModifiers(buff);
    }

    public void updateModifiers(ActiveBuff buff) {
        if(buff.owner.buffManager.hasBuff("banner_of_greater_summoning") || buff.owner.buffManager.hasBuff("banner_of_even_greater_summoning")) {
            buff.setModifier(BuffModifiers.MAX_SUMMONS, 0);
            this.updateBuffActive(false);
        } else {
            buff.setModifier(BuffModifiers.MAX_SUMMONS, 1);
            this.updateBuffActive(true);
        }
    }
}
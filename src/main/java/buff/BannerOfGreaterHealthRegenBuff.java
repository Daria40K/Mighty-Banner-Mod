package buff;

import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffModifiers;

public class BannerOfGreaterHealthRegenBuff extends MightyVicinityBuff {
    @Override
    public void clientTick(ActiveBuff buff) {
        this.updateModifiers(buff);
    }

    @Override
    public void serverTick(ActiveBuff buff) {
        this.updateModifiers(buff);
    }

    public void updateModifiers(ActiveBuff buff) {
        buff.setModifier(BuffModifiers.COMBAT_HEALTH_REGEN_FLAT, 1.0F);
        this.updateBuffActive(true);
    }
}
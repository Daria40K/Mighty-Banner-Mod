package buff;

import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffModifiers;

public class BannerOfGreaterAttackSpeedBuff extends MightyVicinityBuff {
    @Override
    public void clientTick(ActiveBuff buff) {
        updateModifiers(buff);
    }

    @Override
    public void serverTick(ActiveBuff buff) {
        updateModifiers(buff);
    }

    public void updateModifiers(ActiveBuff buff) {
        if(buff.owner.buffManager.hasBuff("banner_of_even_greater_attack_speed")) {
            buff.setModifier(BuffModifiers.ATTACK_SPEED, 0F);
            this.updateBuffActive(false);
        } else {
            buff.setModifier(BuffModifiers.ATTACK_SPEED, 0.2F);
            this.updateBuffActive(true);
        }
    }
}

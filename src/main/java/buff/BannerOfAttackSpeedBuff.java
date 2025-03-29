package buff;

import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffModifiers;

public class BannerOfAttackSpeedBuff extends MightyVicinityBuff {
    @Override
    public void clientTick(ActiveBuff buff) {
        this.updateModifiers(buff);
    }

    @Override
    public void serverTick(ActiveBuff buff) {
        this.updateModifiers(buff);
    }

    public void updateModifiers(ActiveBuff buff) {
        if(buff.owner.buffManager.hasBuff("banner_of_greater_attack_speed")) {
            buff.setModifier(BuffModifiers.ATTACK_SPEED, 0F);
            this.updateBuffActive(false);
        } else {
            buff.setModifier(BuffModifiers.ATTACK_SPEED, 0.15F);
            this.updateBuffActive(true);
        }
    }
}
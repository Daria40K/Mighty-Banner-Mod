package buff;

import necesse.engine.localization.message.LocalMessage;
import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffEventSubscriber;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.entity.mobs.buffs.staticBuffs.VicinityBuff;

public class BannerOfManaRegenBuff extends VicinityBuff {
    public BannerOfManaRegenBuff() {
    }

    public void init(ActiveBuff buff, BuffEventSubscriber eventSubscriber) {
        buff.setModifier(BuffModifiers.COMBAT_MANA_REGEN, 2.0F);
    }

    public void updateLocalDisplayName() {
        this.displayName = new LocalMessage("item", this.getStringID());
    }
}
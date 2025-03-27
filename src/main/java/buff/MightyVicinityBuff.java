package buff;

import necesse.engine.localization.message.LocalMessage;
import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffEventSubscriber;
import necesse.entity.mobs.buffs.staticBuffs.VicinityBuff;
import necesse.gfx.gameTexture.GameTexture;

import java.io.FileNotFoundException;

public class MightyVicinityBuff extends VicinityBuff {
    private GameTexture iconTextureInactive;
    private GameTexture iconTextureActive;

    @Override
    public void init(ActiveBuff buff, BuffEventSubscriber eventSubscriber) {
    }

    @Override
    public void loadTextures() {
        try {
            this.iconTexture = GameTexture.fromFileRaw("buffs/" + this.getStringID());
            this.iconTextureActive = GameTexture.fromFileRaw("buffs/" + this.getStringID());
            this.iconTextureInactive = GameTexture.fromFileRaw("buffs/" + this.getStringID() + "_inactive");
        } catch (FileNotFoundException var2) {
            this.iconTexture = GameTexture.fromFile("buffs/unknown");
            this.iconTextureActive = GameTexture.fromFile("buffs/unknown");
            this.iconTextureInactive = GameTexture.fromFile("buffs/unknown");
        }
    }

    public void updateBuffIcon(boolean active) {
        if (active) {
            this.iconTexture = this.iconTextureActive;
        } else {
            this.iconTexture = this.iconTextureInactive;
        }
    }

    public void updateDisplayName(boolean active) {
        if (active) {
            this.displayName = new LocalMessage("item", this.getStringID());
        } else {
            this.displayName = new LocalMessage("item", this.getStringID() + "_inactive");
        }
    }

    public void updateBuffActive(boolean active) {
        this.updateBuffIcon(active);
        this.updateDisplayName(active);
    }

    public void updateLocalDisplayName() {
        this.displayName = new LocalMessage("item", this.getStringID());
    }
}

package lmr.msd.models;

public final class AnimatedTileFrame {
    public short gfxIndex;
    public byte wait;

    public AnimatedTileFrame(short gfxIndex, byte wait) {
        this.gfxIndex = gfxIndex;
        this.wait = wait;
    }
}

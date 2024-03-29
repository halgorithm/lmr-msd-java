package lmr.msd.models;

import lmr.msd.models.edit.LayerRectangleSelection;
import lmr.msd.models.edit.LayerScatteredSelection;
import lmr.msd.tilemap.TileMap;

import java.awt.*;
import java.util.List;

public class Layer extends TileMap<
    Layer,
        LayerRectangleSelection,
        LayerScatteredSelection,
    GfxTile
> {
    public Layer(List<List<GfxTile>> data) {
        super(data);
    }

    public Layer self() {
        return this;
    }

    // TODO: pasteGraphic(int x, int y, int gfxX, int gfxY, int gfxWidth, int gfxHeight)

    public LayerRectangleSelection select(Rectangle rect) {
        return new LayerRectangleSelection(this, rect);
    }

    public LayerScatteredSelection select(List<Point> points) {
        return new LayerScatteredSelection(this, points);
    }

    public Layer make(List<List<GfxTile>> data) {
        return new Layer(data);
    }
}

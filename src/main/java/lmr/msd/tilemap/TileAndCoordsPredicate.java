package lmr.msd.tilemap;

@FunctionalInterface
public interface TileAndCoordsPredicate<T> {
    boolean test(T value, Short x, Short y);
}

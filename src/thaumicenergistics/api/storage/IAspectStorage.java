package thaumicenergistics.api.storage;

/**
 * Binary-compatibility marker for Gadomancy 1.5.11.
 *
 * <p>Gadomancy's TileEssentiaCompressor was compiled against an older
 * Thaumic Energistics API which declared this interface. Newer 1.7.10
 * Thaumic Energistics builds use IEssentiaRepo/IAspectStack instead and no
 * longer ship this type. Gadomancy already contains the storage methods it
 * needs, so a marker interface is sufficient to let the class load.</p>
 */
public interface IAspectStorage {
}

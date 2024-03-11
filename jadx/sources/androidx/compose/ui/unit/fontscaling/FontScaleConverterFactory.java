package androidx.compose.ui.unit.fontscaling;

import androidx.collection.SparseArrayCompat;
import o.dpR;

/* loaded from: classes.dex */
public final class FontScaleConverterFactory {
    public static final int $stable;
    public static final FontScaleConverterFactory INSTANCE;
    private static final Object[] LOOKUP_TABLES_WRITE_LOCK;
    private static volatile SparseArrayCompat<FontScaleConverter> sLookupTables;
    private static float sMinScaleBeforeCurvesApplied;

    private final int getKey(float f) {
        return (int) (f * 100.0f);
    }

    private final float getScaleFromKey(int i) {
        return i / 100.0f;
    }

    public final boolean isNonLinearFontScalingActive(float f) {
        return f >= sMinScaleBeforeCurvesApplied;
    }

    private FontScaleConverterFactory() {
    }

    static {
        FontScaleConverterFactory fontScaleConverterFactory = new FontScaleConverterFactory();
        INSTANCE = fontScaleConverterFactory;
        sLookupTables = new SparseArrayCompat<>(0, 1, null);
        Object[] objArr = new Object[0];
        LOOKUP_TABLES_WRITE_LOCK = objArr;
        sMinScaleBeforeCurvesApplied = 1.05f;
        synchronized (objArr) {
            fontScaleConverterFactory.putInto(sLookupTables, 1.15f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.3f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.5f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.8f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            fontScaleConverterFactory.putInto(sLookupTables, 2.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            dpR dpr = dpR.c;
        }
        float scaleFromKey = fontScaleConverterFactory.getScaleFromKey(sLookupTables.keyAt(0)) - 0.02f;
        sMinScaleBeforeCurvesApplied = scaleFromKey;
        if (scaleFromKey <= 1.0f) {
            throw new IllegalStateException("You should only apply non-linear scaling to font scales > 1".toString());
        }
        $stable = 8;
    }

    public final FontScaleConverter forScale(float f) {
        if (isNonLinearFontScalingActive(f)) {
            FontScaleConverter fontScaleConverter = INSTANCE.get(f);
            if (fontScaleConverter != null) {
                return fontScaleConverter;
            }
            int indexOfKey = sLookupTables.indexOfKey(getKey(f));
            if (indexOfKey >= 0) {
                return sLookupTables.valueAt(indexOfKey);
            }
            int i = -(indexOfKey + 1);
            int i2 = i - 1;
            if (i2 < 0 || i >= sLookupTables.size()) {
                FontScaleConverterTable fontScaleConverterTable = new FontScaleConverterTable(new float[]{1.0f}, new float[]{f});
                put(f, fontScaleConverterTable);
                return fontScaleConverterTable;
            }
            FontScaleConverter createInterpolatedTableBetween = createInterpolatedTableBetween(sLookupTables.valueAt(i2), sLookupTables.valueAt(i), MathUtils.INSTANCE.constrainedMap(0.0f, 1.0f, getScaleFromKey(sLookupTables.keyAt(i2)), getScaleFromKey(sLookupTables.keyAt(i)), f));
            put(f, createInterpolatedTableBetween);
            return createInterpolatedTableBetween;
        }
        return null;
    }

    private final FontScaleConverter createInterpolatedTableBetween(FontScaleConverter fontScaleConverter, FontScaleConverter fontScaleConverter2, float f) {
        float[] fArr = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
        float[] fArr2 = new float[9];
        for (int i = 0; i < 9; i++) {
            float f2 = fArr[i];
            fArr2[i] = MathUtils.INSTANCE.lerp(fontScaleConverter.convertSpToDp(f2), fontScaleConverter2.convertSpToDp(f2), f);
        }
        return new FontScaleConverterTable(fArr, fArr2);
    }

    private final void put(float f, FontScaleConverter fontScaleConverter) {
        synchronized (LOOKUP_TABLES_WRITE_LOCK) {
            SparseArrayCompat<FontScaleConverter> m6clone = sLookupTables.m6clone();
            INSTANCE.putInto(m6clone, f, fontScaleConverter);
            sLookupTables = m6clone;
            dpR dpr = dpR.c;
        }
    }

    private final void putInto(SparseArrayCompat<FontScaleConverter> sparseArrayCompat, float f, FontScaleConverter fontScaleConverter) {
        sparseArrayCompat.put(getKey(f), fontScaleConverter);
    }

    private final FontScaleConverter get(float f) {
        return sLookupTables.get(getKey(f));
    }
}

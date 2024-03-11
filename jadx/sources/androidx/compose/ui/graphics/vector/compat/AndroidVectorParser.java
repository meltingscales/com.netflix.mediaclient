package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import o.C8627dsp;
import o.C8632dsu;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class AndroidVectorParser {
    private int config;
    private final XmlPullParser xmlParser;

    private final void updateConfig(int i) {
        this.config = i | this.config;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AndroidVectorParser) {
            AndroidVectorParser androidVectorParser = (AndroidVectorParser) obj;
            return C8632dsu.c(this.xmlParser, androidVectorParser.xmlParser) && this.config == androidVectorParser.config;
        }
        return false;
    }

    public final XmlPullParser getXmlParser() {
        return this.xmlParser;
    }

    public int hashCode() {
        return (this.xmlParser.hashCode() * 31) + Integer.hashCode(this.config);
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.xmlParser + ", config=" + this.config + ')';
    }

    public AndroidVectorParser(XmlPullParser xmlPullParser, int i) {
        this.xmlParser = xmlPullParser;
        this.config = i;
    }

    public /* synthetic */ AndroidVectorParser(XmlPullParser xmlPullParser, int i, int i2, C8627dsp c8627dsp) {
        this(xmlPullParser, (i2 & 2) != 0 ? 0 : i);
    }

    public final TypedArray obtainAttributes(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, iArr);
        updateConfig(obtainAttributes.getChangingConfigurations());
        return obtainAttributes;
    }

    public final int getNamedInt(TypedArray typedArray, String str, int i, int i2) {
        int namedInt = TypedArrayUtils.getNamedInt(typedArray, this.xmlParser, str, i, i2);
        updateConfig(typedArray.getChangingConfigurations());
        return namedInt;
    }

    public final float getNamedFloat(TypedArray typedArray, String str, int i, float f) {
        float namedFloat = TypedArrayUtils.getNamedFloat(typedArray, this.xmlParser, str, i, f);
        updateConfig(typedArray.getChangingConfigurations());
        return namedFloat;
    }

    public final boolean getNamedBoolean(TypedArray typedArray, String str, int i, boolean z) {
        boolean namedBoolean = TypedArrayUtils.getNamedBoolean(typedArray, this.xmlParser, str, i, z);
        updateConfig(typedArray.getChangingConfigurations());
        return namedBoolean;
    }

    public final float getFloat(TypedArray typedArray, int i, float f) {
        float f2 = typedArray.getFloat(i, f);
        updateConfig(typedArray.getChangingConfigurations());
        return f2;
    }

    public final int getInt(TypedArray typedArray, int i, int i2) {
        int i3 = typedArray.getInt(i, i2);
        updateConfig(typedArray.getChangingConfigurations());
        return i3;
    }

    public final String getString(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        updateConfig(typedArray.getChangingConfigurations());
        return string;
    }

    public final float getDimension(TypedArray typedArray, int i, float f) {
        float dimension = typedArray.getDimension(i, f);
        updateConfig(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final ComplexColorCompat getNamedComplexColor(TypedArray typedArray, Resources.Theme theme, String str, int i, int i2) {
        ComplexColorCompat namedComplexColor = TypedArrayUtils.getNamedComplexColor(typedArray, this.xmlParser, theme, str, i, i2);
        updateConfig(typedArray.getChangingConfigurations());
        return namedComplexColor;
    }

    public final ColorStateList getNamedColorStateList(TypedArray typedArray, Resources.Theme theme, String str, int i) {
        ColorStateList namedColorStateList = TypedArrayUtils.getNamedColorStateList(typedArray, this.xmlParser, theme, str, i);
        updateConfig(typedArray.getChangingConfigurations());
        return namedColorStateList;
    }
}

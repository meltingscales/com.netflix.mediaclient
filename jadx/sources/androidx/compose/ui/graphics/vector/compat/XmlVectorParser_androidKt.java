package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.model.leafs.originals.interactive.animations.Ease;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.List;
import o.C8632dsu;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class XmlVectorParser_androidKt {
    private static final int FILL_TYPE_WINDING = 0;

    /* renamed from: getStrokeLineCap-CSYIeUk  reason: not valid java name */
    private static final int m1601getStrokeLineCapCSYIeUk(int i, int i2) {
        if (i != 0) {
            if (i != 1) {
                return i != 2 ? i2 : StrokeCap.Companion.m1450getSquareKaPHkGw();
            }
            return StrokeCap.Companion.m1449getRoundKaPHkGw();
        }
        return StrokeCap.Companion.m1448getButtKaPHkGw();
    }

    /* renamed from: getStrokeLineJoin-kLtJ_vA  reason: not valid java name */
    private static final int m1602getStrokeLineJoinkLtJ_vA(int i, int i2) {
        if (i != 0) {
            if (i != 1) {
                return i != 2 ? i2 : StrokeJoin.Companion.m1457getBevelLxFBmk8();
            }
            return StrokeJoin.Companion.m1459getRoundLxFBmk8();
        }
        return StrokeJoin.Companion.m1458getMiterLxFBmk8();
    }

    public static final boolean isAtEnd(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 1) {
            return xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3;
        }
        return true;
    }

    public static final int parseCurrentVectorNode(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, ImageVector.Builder builder, int i) {
        int eventType = androidVectorParser.getXmlParser().getEventType();
        if (eventType == 2) {
            String name = androidVectorParser.getXmlParser().getName();
            if (name != null) {
                int hashCode = name.hashCode();
                if (hashCode == -1649314686) {
                    if (name.equals("clip-path")) {
                        parseClipPath(androidVectorParser, resources, theme, attributeSet, builder);
                        return i + 1;
                    }
                    return i;
                } else if (hashCode == 3433509) {
                    if (name.equals(Ease.ANIMATION_EASE_TYPE.PATH)) {
                        parsePath(androidVectorParser, resources, theme, attributeSet, builder);
                        return i;
                    }
                    return i;
                } else if (hashCode == 98629247 && name.equals("group")) {
                    parseGroup(androidVectorParser, resources, theme, attributeSet, builder);
                    return i;
                } else {
                    return i;
                }
            }
            return i;
        } else if (eventType == 3 && C8632dsu.c((Object) "group", (Object) androidVectorParser.getXmlParser().getName())) {
            for (int i2 = 0; i2 < i + 1; i2++) {
                builder.clearGroup();
            }
            return 0;
        } else {
            return i;
        }
    }

    public static final XmlPullParser seekToStartTag(XmlPullParser xmlPullParser) {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static final ImageVector.Builder createVectorImageBuilder(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet) {
        long m1309getUnspecified0d7_KjU;
        int m1258getSrcIn0nO6VwU;
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY());
        boolean namedBoolean = androidVectorParser.getNamedBoolean(obtainAttributes, "autoMirrored", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_AUTO_MIRRORED(), false);
        float namedFloat = androidVectorParser.getNamedFloat(obtainAttributes, "viewportWidth", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH(), 0.0f);
        float namedFloat2 = androidVectorParser.getNamedFloat(obtainAttributes, "viewportHeight", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT(), 0.0f);
        if (namedFloat <= 0.0f) {
            throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        } else if (namedFloat2 <= 0.0f) {
            throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        } else {
            float dimension = androidVectorParser.getDimension(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_WIDTH(), 0.0f);
            float dimension2 = androidVectorParser.getDimension(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_HEIGHT(), 0.0f);
            if (obtainAttributes.hasValue(androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT())) {
                TypedValue typedValue = new TypedValue();
                obtainAttributes.getValue(androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT(), typedValue);
                if (typedValue.type == 2) {
                    m1309getUnspecified0d7_KjU = Color.Companion.m1309getUnspecified0d7_KjU();
                } else {
                    ColorStateList namedColorStateList = androidVectorParser.getNamedColorStateList(obtainAttributes, theme, "tint", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT());
                    if (namedColorStateList != null) {
                        m1309getUnspecified0d7_KjU = ColorKt.Color(namedColorStateList.getDefaultColor());
                    } else {
                        m1309getUnspecified0d7_KjU = Color.Companion.m1309getUnspecified0d7_KjU();
                    }
                }
            } else {
                m1309getUnspecified0d7_KjU = Color.Companion.m1309getUnspecified0d7_KjU();
            }
            long j = m1309getUnspecified0d7_KjU;
            int i = androidVectorParser.getInt(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT_MODE(), -1);
            if (i == -1) {
                m1258getSrcIn0nO6VwU = BlendMode.Companion.m1258getSrcIn0nO6VwU();
            } else if (i == 3) {
                m1258getSrcIn0nO6VwU = BlendMode.Companion.m1260getSrcOver0nO6VwU();
            } else if (i == 5) {
                m1258getSrcIn0nO6VwU = BlendMode.Companion.m1258getSrcIn0nO6VwU();
            } else if (i == 9) {
                m1258getSrcIn0nO6VwU = BlendMode.Companion.m1257getSrcAtop0nO6VwU();
            } else {
                switch (i) {
                    case 14:
                        m1258getSrcIn0nO6VwU = BlendMode.Companion.m1249getModulate0nO6VwU();
                        break;
                    case 15:
                        m1258getSrcIn0nO6VwU = BlendMode.Companion.m1254getScreen0nO6VwU();
                        break;
                    case 16:
                        m1258getSrcIn0nO6VwU = BlendMode.Companion.m1252getPlus0nO6VwU();
                        break;
                    default:
                        m1258getSrcIn0nO6VwU = BlendMode.Companion.m1258getSrcIn0nO6VwU();
                        break;
                }
            }
            int i2 = m1258getSrcIn0nO6VwU;
            float m2492constructorimpl = Dp.m2492constructorimpl(dimension / resources.getDisplayMetrics().density);
            float m2492constructorimpl2 = Dp.m2492constructorimpl(dimension2 / resources.getDisplayMetrics().density);
            obtainAttributes.recycle();
            return new ImageVector.Builder(null, m2492constructorimpl, m2492constructorimpl2, namedFloat, namedFloat2, j, i2, namedBoolean, 1, null);
        }
    }

    public static final void parsePath(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) {
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH());
        if (!TypedArrayUtils.hasAttribute(androidVectorParser.getXmlParser(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String string = androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_NAME());
        if (string == null) {
            string = "";
        }
        String str = string;
        List<PathNode> addPathNodes = VectorKt.addPathNodes(androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_PATH_DATA()));
        ComplexColorCompat namedComplexColor = androidVectorParser.getNamedComplexColor(obtainAttributes, theme, "fillColor", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_COLOR(), 0);
        float namedFloat = androidVectorParser.getNamedFloat(obtainAttributes, "fillAlpha", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA(), 1.0f);
        int m1601getStrokeLineCapCSYIeUk = m1601getStrokeLineCapCSYIeUk(androidVectorParser.getNamedInt(obtainAttributes, "strokeLineCap", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP(), -1), StrokeCap.Companion.m1448getButtKaPHkGw());
        int m1602getStrokeLineJoinkLtJ_vA = m1602getStrokeLineJoinkLtJ_vA(androidVectorParser.getNamedInt(obtainAttributes, "strokeLineJoin", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN(), -1), StrokeJoin.Companion.m1457getBevelLxFBmk8());
        float namedFloat2 = androidVectorParser.getNamedFloat(obtainAttributes, "strokeMiterLimit", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT(), 1.0f);
        ComplexColorCompat namedComplexColor2 = androidVectorParser.getNamedComplexColor(obtainAttributes, theme, "strokeColor", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR(), 0);
        float namedFloat3 = androidVectorParser.getNamedFloat(obtainAttributes, "strokeAlpha", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA(), 1.0f);
        float namedFloat4 = androidVectorParser.getNamedFloat(obtainAttributes, "strokeWidth", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH(), 1.0f);
        float namedFloat5 = androidVectorParser.getNamedFloat(obtainAttributes, "trimPathEnd", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END(), 1.0f);
        float namedFloat6 = androidVectorParser.getNamedFloat(obtainAttributes, "trimPathOffset", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET(), 0.0f);
        float namedFloat7 = androidVectorParser.getNamedFloat(obtainAttributes, "trimPathStart", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START(), 0.0f);
        int namedInt = androidVectorParser.getNamedInt(obtainAttributes, "fillType", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE(), FILL_TYPE_WINDING);
        obtainAttributes.recycle();
        Brush obtainBrushFromComplexColor = obtainBrushFromComplexColor(namedComplexColor);
        Brush obtainBrushFromComplexColor2 = obtainBrushFromComplexColor(namedComplexColor2);
        PathFillType.Companion companion = PathFillType.Companion;
        builder.m1583addPathoIyEayM(addPathNodes, namedInt == 0 ? companion.m1406getNonZeroRgk1Os() : companion.m1405getEvenOddRgk1Os(), str, obtainBrushFromComplexColor, namedFloat, obtainBrushFromComplexColor2, namedFloat3, namedFloat4, m1601getStrokeLineCapCSYIeUk, m1602getStrokeLineJoinkLtJ_vA, namedFloat2, namedFloat7, namedFloat5, namedFloat6);
    }

    private static final Brush obtainBrushFromComplexColor(ComplexColorCompat complexColorCompat) {
        if (complexColorCompat.willDraw()) {
            Shader shader = complexColorCompat.getShader();
            if (shader != null) {
                return BrushKt.ShaderBrush(shader);
            }
            return new SolidColor(ColorKt.Color(complexColorCompat.getColor()), null);
        }
        return null;
    }

    public static final void parseClipPath(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) {
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH());
        String string = androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_NAME());
        if (string == null) {
            string = "";
        }
        List<PathNode> addPathNodes = VectorKt.addPathNodes(androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_PATH_DATA()));
        obtainAttributes.recycle();
        builder.addGroup((r20 & 1) != 0 ? "" : string, (r20 & 2) != 0 ? 0.0f : 0.0f, (r20 & 4) != 0 ? 0.0f : 0.0f, (r20 & 8) != 0 ? 0.0f : 0.0f, (r20 & 16) != 0 ? 1.0f : 0.0f, (r20 & 32) == 0 ? 0.0f : 1.0f, (r20 & 64) != 0 ? 0.0f : 0.0f, (r20 & 128) == 0 ? 0.0f : 0.0f, (r20 & JSONzip.end) != 0 ? VectorKt.getEmptyPath() : addPathNodes);
    }

    public static final void parseGroup(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) {
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP());
        float namedFloat = androidVectorParser.getNamedFloat(obtainAttributes, InteractiveAnimation.ANIMATION_TYPE.ROTATION, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION(), 0.0f);
        float f = androidVectorParser.getFloat(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_X(), 0.0f);
        float f2 = androidVectorParser.getFloat(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_Y(), 0.0f);
        float namedFloat2 = androidVectorParser.getNamedFloat(obtainAttributes, "scaleX", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_X(), 1.0f);
        float namedFloat3 = androidVectorParser.getNamedFloat(obtainAttributes, "scaleY", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y(), 1.0f);
        float namedFloat4 = androidVectorParser.getNamedFloat(obtainAttributes, "translateX", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X(), 0.0f);
        float namedFloat5 = androidVectorParser.getNamedFloat(obtainAttributes, "translateY", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y(), 0.0f);
        String string = androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_NAME());
        if (string == null) {
            string = "";
        }
        obtainAttributes.recycle();
        builder.addGroup(string, namedFloat, f, f2, namedFloat2, namedFloat3, namedFloat4, namedFloat5, VectorKt.getEmptyPath());
    }
}

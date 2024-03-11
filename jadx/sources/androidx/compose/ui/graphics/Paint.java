package androidx.compose.ui.graphics;

import android.graphics.Shader;

/* loaded from: classes.dex */
public interface Paint {
    android.graphics.Paint asFrameworkPaint();

    float getAlpha();

    /* renamed from: getBlendMode-0nO6VwU */
    int mo1202getBlendMode0nO6VwU();

    /* renamed from: getColor-0d7_KjU */
    long mo1203getColor0d7_KjU();

    ColorFilter getColorFilter();

    /* renamed from: getFilterQuality-f-v9h1I */
    int mo1204getFilterQualityfv9h1I();

    PathEffect getPathEffect();

    Shader getShader();

    /* renamed from: getStrokeCap-KaPHkGw */
    int mo1205getStrokeCapKaPHkGw();

    /* renamed from: getStrokeJoin-LxFBmk8 */
    int mo1206getStrokeJoinLxFBmk8();

    float getStrokeMiterLimit();

    float getStrokeWidth();

    void setAlpha(float f);

    /* renamed from: setBlendMode-s9anfk8 */
    void mo1207setBlendModes9anfk8(int i);

    /* renamed from: setColor-8_81llA */
    void mo1208setColor8_81llA(long j);

    void setColorFilter(ColorFilter colorFilter);

    /* renamed from: setFilterQuality-vDHp3xo */
    void mo1209setFilterQualityvDHp3xo(int i);

    void setPathEffect(PathEffect pathEffect);

    void setShader(Shader shader);

    /* renamed from: setStrokeCap-BeK7IIE */
    void mo1210setStrokeCapBeK7IIE(int i);

    /* renamed from: setStrokeJoin-Ww9F2mQ */
    void mo1211setStrokeJoinWw9F2mQ(int i);

    void setStrokeMiterLimit(float f);

    void setStrokeWidth(float f);

    /* renamed from: setStyle-k9PVt8s */
    void mo1212setStylek9PVt8s(int i);
}

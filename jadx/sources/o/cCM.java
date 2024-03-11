package o;

import android.content.Context;
import android.provider.Settings;
import android.view.View;
import android.view.animation.ScaleAnimation;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;

/* loaded from: classes4.dex */
public final class cCM extends C1045Mp {
    public static final cCM a = new cCM();
    private static final boolean b = false;

    private cCM() {
        super("InteractiveAnimationUtil");
    }

    public final long d(Context context, long j) {
        long c;
        C8632dsu.c((Object) context, "");
        float c2 = c(context);
        if (c2 <= 0.0f) {
            return j;
        }
        c = dsT.c(((float) j) / c2);
        return c;
    }

    public final boolean b(Context context) {
        C8632dsu.c((Object) context, "");
        return !(c(context) == 0.0f);
    }

    private final float c(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x023f, code lost:
        if (o.C8632dsu.b(r2, 0.0f) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0241, code lost:
        if (r24 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0243, code lost:
        r4 = java.lang.Float.valueOf((r4.floatValue() * 1.0f) / r2.floatValue());
        r2 = java.lang.Float.valueOf(1.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0255, code lost:
        r0 = new android.view.animation.ScaleAnimation(r2.floatValue(), r4.floatValue(), r2.floatValue(), r4.floatValue(), 1, r19.pivotX(), 1, r19.pivotY());
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
        if (r20.equals(com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.ANIMATION_TYPE.POSITION_Y) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
        if (r20.equals(com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.ANIMATION_TYPE.POSITION_X) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e6, code lost:
        if (r20.equals(com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.ANIMATION_TYPE.SCALE) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f0, code lost:
        if (r20.equals(com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.ANIMATION_TYPE.ALPHA) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fa, code lost:
        if (r20.equals(com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.ANIMATION_TYPE.Y) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fe, code lost:
        r0 = r19.delta();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0102, code lost:
        if (r0 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0104, code lost:
        r0 = r18.getLayoutParams();
        o.C8632dsu.d(r0);
        r0 = ((android.view.ViewGroup.MarginLayoutParams) r0).topMargin;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010f, code lost:
        if (r2 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0111, code lost:
        r2 = java.lang.Float.valueOf(r0 / r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0118, code lost:
        if (r4 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011a, code lost:
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011b, code lost:
        r0 = r0;
        r1 = java.lang.Float.valueOf((r2.floatValue() * r21) - r0);
        r0 = java.lang.Float.valueOf((r4.floatValue() * r21) - r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0132, code lost:
        if (r24 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0134, code lost:
        r0 = java.lang.Float.valueOf(r0.floatValue() - r1.floatValue());
        r1 = java.lang.Float.valueOf(0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0145, code lost:
        r2 = new android.view.animation.TranslateAnimation(0.0f, 0.0f, r1.floatValue(), r0.floatValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0158, code lost:
        if (r19.fromOrigin() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015a, code lost:
        r1 = new android.view.animation.TranslateAnimation(0.0f, 0.0f, 0.0f, r0.floatValue() * r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0167, code lost:
        r1 = new android.view.animation.TranslateAnimation(0.0f, 0.0f, r0.floatValue() * r21, 0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017a, code lost:
        if (r20.equals(com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.ANIMATION_TYPE.X) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017e, code lost:
        r0 = r19.delta();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0182, code lost:
        if (r0 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0184, code lost:
        r0 = r18.getLayoutParams();
        o.C8632dsu.d(r0);
        r0 = ((android.view.ViewGroup.MarginLayoutParams) r0).getMarginStart();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0191, code lost:
        if (r2 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0193, code lost:
        r2 = java.lang.Float.valueOf(r0 / r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019a, code lost:
        if (r4 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019c, code lost:
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019d, code lost:
        r0 = r0;
        r1 = java.lang.Float.valueOf((r2.floatValue() * r21) - r0);
        r0 = java.lang.Float.valueOf((r4.floatValue() * r21) - r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
        if (r24 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b6, code lost:
        r0 = java.lang.Float.valueOf(r0.floatValue() - r1.floatValue());
        r1 = java.lang.Float.valueOf(0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c7, code lost:
        r2 = new android.view.animation.TranslateAnimation(r1.floatValue(), r0.floatValue(), 0.0f, 0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01d4, code lost:
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01db, code lost:
        if (r19.fromOrigin() == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01dd, code lost:
        r1 = new android.view.animation.TranslateAnimation(0.0f, r0.floatValue() * r21, 0.0f, 0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e9, code lost:
        r1 = new android.view.animation.TranslateAnimation(r0.floatValue() * r21, 0.0f, 0.0f, 0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01f4, code lost:
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01fd, code lost:
        if (r20.equals(com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.ANIMATION_TYPE.OPACITY) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0201, code lost:
        if (r2 != null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0203, code lost:
        r2 = java.lang.Float.valueOf(0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0207, code lost:
        if (r4 != null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0209, code lost:
        r4 = java.lang.Float.valueOf(1.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x020d, code lost:
        r18.setAlpha(1.0f);
        r0 = new android.view.animation.AlphaAnimation(r2.floatValue(), r4.floatValue());
        r0.setFillBefore(true);
        r0.setFillEnabled(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x022b, code lost:
        if (r20.equals(com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.ANIMATION_TYPE.TRANSFORM_SCALE) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x022f, code lost:
        if (r2 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0231, code lost:
        r2 = java.lang.Float.valueOf(1.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0235, code lost:
        if (r4 != null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0237, code lost:
        r4 = java.lang.Float.valueOf(1.0f);
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x039a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.animation.Animation b(android.view.View r18, com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation r19, java.lang.String r20, float r21, long r22, com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation r24) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cCM.b(android.view.View, com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation, java.lang.String, float, long, com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation):android.view.animation.Animation");
    }

    private final ScaleAnimation c(View view, Float f, Float f2, InteractiveAnimation interactiveAnimation, InteractiveAnimation interactiveAnimation2) {
        float scaleX = view.getScaleX();
        if (f == null) {
            f = Float.valueOf(scaleX);
        }
        if (f2 == null) {
            f2 = f;
        }
        if (!C8632dsu.b(f, 0.0f) && interactiveAnimation != null) {
            float floatValue = (f2.floatValue() * 1.0f) / f.floatValue();
            f = Float.valueOf(1.0f);
            f2 = Float.valueOf(floatValue);
        }
        return new ScaleAnimation(f.floatValue(), f2.floatValue(), 1.0f, 1.0f, 1, interactiveAnimation2.pivotX(), 1, interactiveAnimation2.pivotY());
    }
}

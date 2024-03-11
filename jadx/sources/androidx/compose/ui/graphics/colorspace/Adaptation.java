package androidx.compose.ui.graphics.colorspace;

import o.C8627dsp;

/* loaded from: classes.dex */
public abstract class Adaptation {
    private static final Adaptation Bradford;
    private static final Adaptation Ciecat02;
    public static final Companion Companion = new Companion(null);
    private static final Adaptation VonKries;
    private final float[] transform;

    public /* synthetic */ Adaptation(float[] fArr, C8627dsp c8627dsp) {
        this(fArr);
    }

    public final float[] getTransform$ui_graphics_release() {
        return this.transform;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final Adaptation getBradford() {
            return Adaptation.Bradford;
        }
    }

    private Adaptation(float[] fArr) {
        this.transform = fArr;
    }

    static {
        final float[] fArr = {0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f};
        Bradford = new Adaptation(fArr) { // from class: androidx.compose.ui.graphics.colorspace.Adaptation$Companion$Bradford$1
            public String toString() {
                return "Bradford";
            }
        };
        final float[] fArr2 = {0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f};
        VonKries = new Adaptation(fArr2) { // from class: androidx.compose.ui.graphics.colorspace.Adaptation$Companion$VonKries$1
            public String toString() {
                return "VonKries";
            }
        };
        final float[] fArr3 = {0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f};
        Ciecat02 = new Adaptation(fArr3) { // from class: androidx.compose.ui.graphics.colorspace.Adaptation$Companion$Ciecat02$1
            public String toString() {
                return "Ciecat02";
            }
        };
    }
}

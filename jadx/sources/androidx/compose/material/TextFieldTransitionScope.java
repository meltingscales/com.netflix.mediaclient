package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class TextFieldTransitionScope {
    public static final TextFieldTransitionScope INSTANCE = new TextFieldTransitionScope();

    /* loaded from: classes5.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputPhase.values().length];
            try {
                iArr[InputPhase.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TextFieldTransitionScope() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b0, code lost:
        if (r31 != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01eb, code lost:
        if (r31 != false) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a4  */
    /* renamed from: Transition-DTcfvLk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m695TransitionDTcfvLk(final androidx.compose.material.InputPhase r25, final long r26, final long r28, final o.InterfaceC8612dsa<? super androidx.compose.material.InputPhase, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, androidx.compose.ui.graphics.Color> r30, final boolean r31, final o.InterfaceC8619dsh<? super java.lang.Float, ? super androidx.compose.ui.graphics.Color, ? super androidx.compose.ui.graphics.Color, ? super java.lang.Float, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r32, androidx.compose.runtime.Composer r33, final int r34) {
        /*
            Method dump skipped, instructions count: 1050
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldTransitionScope.m695TransitionDTcfvLk(androidx.compose.material.InputPhase, long, long, o.dsa, boolean, o.dsh, androidx.compose.runtime.Composer, int):void");
    }

    private static final float Transition_DTcfvLk$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float Transition_DTcfvLk$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final long Transition_DTcfvLk$lambda$5(State<Color> state) {
        return state.getValue().m1302unboximpl();
    }

    private static final long Transition_DTcfvLk$lambda$6(State<Color> state) {
        return state.getValue().m1302unboximpl();
    }
}

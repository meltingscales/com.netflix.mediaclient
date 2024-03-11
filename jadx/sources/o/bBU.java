package o;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import com.netflix.mediaclient.commanderinfra.api.util.CommanderState;
import com.netflix.mediaclient.commanderinfra.api.util.TargetDeviceUiState;
import com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen;

/* loaded from: classes4.dex */
public final class bBU {
    private static final float a;
    private static final float b;
    private static final float c = androidx.compose.ui.unit.Dp.m2492constructorimpl(24);
    private static final float h = androidx.compose.ui.unit.Dp.m2492constructorimpl(56);
    private static final float j = androidx.compose.ui.unit.Dp.m2492constructorimpl(-72);
    private static final float f = androidx.compose.ui.unit.Dp.m2492constructorimpl(-16);
    private static final float i = androidx.compose.ui.unit.Dp.m2492constructorimpl(8);
    private static final float d = androidx.compose.ui.unit.Dp.m2492constructorimpl(28);
    private static final float e = androidx.compose.ui.unit.Dp.m2492constructorimpl(110);

    /* loaded from: classes4.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CommanderState.values().length];
            try {
                iArr[CommanderState.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommanderState.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen.c r17, androidx.compose.ui.Modifier r18, com.netflix.hawkins.consumer.tokens.Theme r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bBU.b(com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen$c, androidx.compose.ui.Modifier, com.netflix.hawkins.consumer.tokens.Theme, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen.c r57, final float r58, final float r59, final float r60, final float r61, final float r62, final int r63, androidx.compose.ui.Modifier r64, com.netflix.hawkins.consumer.tokens.Theme r65, androidx.compose.runtime.Composer r66, final int r67, final int r68) {
        /*
            Method dump skipped, instructions count: 1585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bBU.b(com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen$c, float, float, float, float, float, int, androidx.compose.ui.Modifier, com.netflix.hawkins.consumer.tokens.Theme, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final void b(MutableState<androidx.compose.ui.unit.Dp> mutableState, float f2) {
        mutableState.setValue(androidx.compose.ui.unit.Dp.m2490boximpl(f2));
    }

    private static final void a(MutableState<androidx.compose.ui.unit.Dp> mutableState, float f2) {
        mutableState.setValue(androidx.compose.ui.unit.Dp.m2490boximpl(f2));
    }

    private static final void e(MutableState<androidx.compose.ui.unit.Dp> mutableState, float f2) {
        mutableState.setValue(androidx.compose.ui.unit.Dp.m2490boximpl(f2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(drM<? super ControllerScreen.e, dpR> drm, float f2, float f3, float f4, MutableState<androidx.compose.ui.unit.Dp> mutableState, MutableState<CommanderState> mutableState2, MutableState<androidx.compose.ui.unit.Dp> mutableState3, MutableState<androidx.compose.ui.unit.Dp> mutableState4, MutableState<androidx.compose.ui.unit.Dp> mutableState5, MutableFloatState mutableFloatState) {
        b(mutableState2, CommanderState.a);
        drm.invoke(ControllerScreen.e.h.a);
        a(mutableState3, f2);
        b(mutableState4, androidx.compose.ui.unit.Dp.m2492constructorimpl(f3 + androidx.compose.ui.unit.Dp.m2492constructorimpl(1)));
        e(mutableState5, f4);
        mutableState.setValue(androidx.compose.ui.unit.Dp.m2490boximpl(a));
        c(mutableFloatState, 1.0f);
        drm.invoke(ControllerScreen.e.l.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(drM<? super ControllerScreen.e, dpR> drm, float f2, float f3, MutableState<androidx.compose.ui.unit.Dp> mutableState, MutableState<CommanderState> mutableState2, MutableState<androidx.compose.ui.unit.Dp> mutableState3, MutableState<androidx.compose.ui.unit.Dp> mutableState4, MutableState<androidx.compose.ui.unit.Dp> mutableState5, MutableFloatState mutableFloatState) {
        b(mutableState2, CommanderState.d);
        drm.invoke(ControllerScreen.e.C0715a.a);
        a(mutableState3, h);
        b(mutableState4, f2);
        e(mutableState5, f3);
        mutableState.setValue(androidx.compose.ui.unit.Dp.m2490boximpl(a));
        c(mutableFloatState, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(drM<? super ControllerScreen.e, dpR> drm, ControllerScreen.c cVar, float f2, MutableState<androidx.compose.ui.unit.Dp> mutableState, MutableState<CommanderState> mutableState2, MutableState<androidx.compose.ui.unit.Dp> mutableState3, MutableState<androidx.compose.ui.unit.Dp> mutableState4, MutableState<androidx.compose.ui.unit.Dp> mutableState5, MutableFloatState mutableFloatState) {
        b(mutableState2, CommanderState.b);
        drm.invoke(ControllerScreen.e.C0058e.e);
        float f3 = h;
        a(mutableState3, f3);
        VX e2 = C3596bDs.e(cVar);
        if ((e2 != null ? e2.a() : null) == TargetDeviceUiState.d) {
            f3 = e;
        }
        b(mutableState4, f3);
        e(mutableState5, f2);
        mutableState.setValue(androidx.compose.ui.unit.Dp.m2490boximpl(a));
        c(mutableFloatState, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(MutableState<androidx.compose.ui.unit.Dp> mutableState, MutableState<Boolean> mutableState2, drM<? super ControllerScreen.e, dpR> drm, float f2, float f3, float f4, MutableState<CommanderState> mutableState3, MutableState<androidx.compose.ui.unit.Dp> mutableState4, MutableState<androidx.compose.ui.unit.Dp> mutableState5, MutableState<androidx.compose.ui.unit.Dp> mutableState6, MutableFloatState mutableFloatState, float f5, float f6) {
        a(mutableState2, false);
        if (androidx.compose.ui.unit.Dp.m2491compareTo0680j_4(mutableState.getValue().m2498unboximpl(), a) < 0) {
            c(drm, f2, f3, f4, mutableState, mutableState3, mutableState4, mutableState5, mutableState6, mutableFloatState);
        } else {
            b(drm, f5, f6, mutableState, mutableState3, mutableState4, mutableState5, mutableState6, mutableFloatState);
        }
    }

    private static final void b(MutableState<androidx.compose.ui.unit.Dp> mutableState, float f2, float f3, float f4, float f5, float f6, MutableState<androidx.compose.ui.unit.Dp> mutableState2, MutableState<androidx.compose.ui.unit.Dp> mutableState3, MutableState<androidx.compose.ui.unit.Dp> mutableState4, float f7, float f8) {
        Comparable b2;
        Comparable b3;
        Comparable b4;
        b2 = C8657dts.b(androidx.compose.ui.unit.Dp.m2490boximpl(androidx.compose.ui.unit.Dp.m2492constructorimpl(f7 - androidx.compose.ui.unit.Dp.m2492constructorimpl(mutableState.getValue().m2498unboximpl() / 4))), androidx.compose.ui.unit.Dp.m2490boximpl(f2), androidx.compose.ui.unit.Dp.m2490boximpl(f3));
        b(mutableState2, ((androidx.compose.ui.unit.Dp) b2).m2498unboximpl());
        b3 = C8657dts.b(androidx.compose.ui.unit.Dp.m2490boximpl(androidx.compose.ui.unit.Dp.m2492constructorimpl(f8 - androidx.compose.ui.unit.Dp.m2492constructorimpl(mutableState.getValue().m2498unboximpl() * 1))), androidx.compose.ui.unit.Dp.m2490boximpl(h), androidx.compose.ui.unit.Dp.m2490boximpl(f4));
        a(mutableState3, ((androidx.compose.ui.unit.Dp) b3).m2498unboximpl());
        b4 = C8657dts.b(androidx.compose.ui.unit.Dp.m2490boximpl(androidx.compose.ui.unit.Dp.m2492constructorimpl(h(mutableState4) - androidx.compose.ui.unit.Dp.m2492constructorimpl(mutableState.getValue().m2498unboximpl() / 64))), androidx.compose.ui.unit.Dp.m2490boximpl(f5), androidx.compose.ui.unit.Dp.m2490boximpl(f6));
        e(mutableState4, ((androidx.compose.ui.unit.Dp) b4).m2498unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MutableState<androidx.compose.ui.unit.Dp> mutableState, float f2, float f3, float f4, MutableState<CommanderState> mutableState2, MutableState<androidx.compose.ui.unit.Dp> mutableState3, drM<? super ControllerScreen.e, dpR> drm, float f5, MutableState<androidx.compose.ui.unit.Dp> mutableState4, MutableState<androidx.compose.ui.unit.Dp> mutableState5, MutableFloatState mutableFloatState, float f6, PointerInputChange pointerInputChange, float f7) {
        float a2;
        if (!Offset.m1134equalsimpl0(PointerEventKt.positionChange(pointerInputChange), Offset.Companion.m1149getZeroF1C5BW0())) {
            pointerInputChange.consume();
        }
        mutableState.setValue(androidx.compose.ui.unit.Dp.m2490boximpl(androidx.compose.ui.unit.Dp.m2492constructorimpl(mutableState.getValue().m2498unboximpl() + f7)));
        float m2498unboximpl = mutableState.getValue().m2498unboximpl();
        float f8 = a;
        if (androidx.compose.ui.unit.Dp.m2491compareTo0680j_4(m2498unboximpl, f8) < 0 && f(mutableState2) == CommanderState.d) {
            if (androidx.compose.ui.unit.Dp.m2491compareTo0680j_4(i(mutableState3), f2) >= 0) {
                c(drm, f2, f4, f5, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, mutableFloatState);
            } else {
                b(mutableState, f3, f4, f2, f6, f5, mutableState4, mutableState3, mutableState5, f3, h);
            }
        } else if (androidx.compose.ui.unit.Dp.m2491compareTo0680j_4(mutableState.getValue().m2498unboximpl(), f8) > 0 && f(mutableState2) == CommanderState.a) {
            if (androidx.compose.ui.unit.Dp.m2491compareTo0680j_4(i(mutableState3), h) <= 0) {
                b(drm, f3, f6, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, mutableFloatState);
            } else {
                b(mutableState, f3, f4, f2, f6, f5, mutableState4, mutableState3, mutableState5, f4, f2);
            }
        }
        a2 = C8657dts.a(i(mutableState3) / f2, 0.0f, 1.0f);
        c(mutableFloatState, a2);
    }

    private static final float e(MutableState<androidx.compose.ui.unit.Dp> mutableState) {
        return mutableState.getValue().m2498unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CommanderState f(MutableState<CommanderState> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(MutableState<CommanderState> mutableState, CommanderState commanderState) {
        mutableState.setValue(commanderState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    private static final void c(MutableFloatState mutableFloatState, float f2) {
        mutableFloatState.setFloatValue(f2);
    }

    private static final float c(MutableState<androidx.compose.ui.unit.Dp> mutableState) {
        return mutableState.getValue().m2498unboximpl();
    }

    private static final float i(MutableState<androidx.compose.ui.unit.Dp> mutableState) {
        return mutableState.getValue().m2498unboximpl();
    }

    private static final float c(State<androidx.compose.ui.unit.Dp> state) {
        return state.getValue().m2498unboximpl();
    }

    private static final float h(MutableState<androidx.compose.ui.unit.Dp> mutableState) {
        return mutableState.getValue().m2498unboximpl();
    }

    private static final float a(State<androidx.compose.ui.unit.Dp> state) {
        return state.getValue().m2498unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(State<androidx.compose.ui.unit.Dp> state) {
        return state.getValue().m2498unboximpl();
    }

    static {
        float f2 = 0;
        b = androidx.compose.ui.unit.Dp.m2492constructorimpl(f2);
        a = androidx.compose.ui.unit.Dp.m2492constructorimpl(f2);
    }
}

package o;

import android.net.Uri;
import com.netflix.clcs.codegen.type.CLCSButtonSize;
import com.netflix.clcs.codegen.type.CLCSButtonType;
import com.netflix.clcs.codegen.type.CLCSDesignTheme;
import com.netflix.clcs.codegen.type.CLCSIconSize;
import com.netflix.clcs.codegen.type.CLCSInputSize;
import com.netflix.clcs.codegen.type.CLCSInputType;
import com.netflix.clcs.codegen.type.CLCSItemAlignment;
import com.netflix.clcs.codegen.type.CLCSLayoutDirection;
import com.netflix.clcs.codegen.type.CLCSLoggableSessionType;
import com.netflix.clcs.codegen.type.CLCSModalPresentation;
import com.netflix.clcs.codegen.type.CLCSPinEntrySize;
import com.netflix.clcs.codegen.type.CLCSRdidAccessState;
import com.netflix.clcs.codegen.type.CLCSSpaceSize;
import com.netflix.clcs.codegen.type.CLCSStackContentJustification;
import com.netflix.clcs.codegen.type.CLCSStaticListType;
import com.netflix.clcs.codegen.type.CLCSTemplateItemFlexibleSize;
import com.netflix.clcs.codegen.type.CLCSTextAlignment;
import com.netflix.clcs.codegen.type.CLCSToastPosition;
import com.netflix.clcs.models.Input;
import com.netflix.clcs.models.InputCopyLink;
import com.netflix.clcs.models.InterstitialLoggingHandler;
import com.netflix.clcs.models.ItemAlignment;
import com.netflix.clcs.models.Layout;
import com.netflix.clcs.models.RdidDeviceConsent;
import com.netflix.clcs.models.StackContentJustification;
import com.netflix.clcs.models.Text;
import com.netflix.hawkins.consumer.component.button.HawkinsButtonSize;
import com.netflix.hawkins.consumer.component.button.HawkinsButtonType;
import com.netflix.hawkins.consumer.component.icon.HawkinsIconSize;
import com.netflix.hawkins.consumer.component.input.HawkinsInputPinCodeSize;
import com.netflix.hawkins.consumer.component.input.HawkinsInputSize;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.hawkins.consumer.tokens.Token;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import o.AB;
import o.AE;
import o.AF;
import o.AI;
import o.AM;
import o.AR;
import o.AS;
import o.AU;
import o.AV;
import o.AbstractC8997hK;
import o.BA;
import o.BC;
import o.BJ;
import o.BK;
import o.BM;
import o.BO;
import o.BR;
import o.BU;
import o.BV;
import o.BX;
import o.BZ;
import o.C0752Bh;
import o.C0753Bi;
import o.C0754Bj;
import o.C0760Bp;
import o.C0762Br;
import o.C0764Bt;
import o.C0777Ce;
import o.FC;
import o.FE;
import o.FO;
import o.FQ;
import o.FX;
import o.FZ;

/* renamed from: o.Fu  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0871Fu {

    /* renamed from: o.Fu$c */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;
        public static final /* synthetic */ int[] f;
        public static final /* synthetic */ int[] g;
        public static final /* synthetic */ int[] h;
        public static final /* synthetic */ int[] i;
        public static final /* synthetic */ int[] j;
        public static final /* synthetic */ int[] k;
        public static final /* synthetic */ int[] l;
        public static final /* synthetic */ int[] m;
        public static final /* synthetic */ int[] n;

        /* renamed from: o  reason: collision with root package name */
        public static final /* synthetic */ int[] f13356o;
        public static final /* synthetic */ int[] r;
        public static final /* synthetic */ int[] s;
        public static final /* synthetic */ int[] t;

        static {
            int[] iArr = new int[CLCSDesignTheme.values().length];
            try {
                iArr[CLCSDesignTheme.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CLCSDesignTheme.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
            int[] iArr2 = new int[CLCSModalPresentation.values().length];
            try {
                iArr2[CLCSModalPresentation.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CLCSModalPresentation.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            d = iArr2;
            int[] iArr3 = new int[CLCSToastPosition.values().length];
            try {
                iArr3[CLCSToastPosition.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[CLCSToastPosition.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f13356o = iArr3;
            int[] iArr4 = new int[CLCSLayoutDirection.values().length];
            try {
                iArr4[CLCSLayoutDirection.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr4[CLCSLayoutDirection.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            k = iArr4;
            int[] iArr5 = new int[CLCSTemplateItemFlexibleSize.values().length];
            try {
                iArr5[CLCSTemplateItemFlexibleSize.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr5[CLCSTemplateItemFlexibleSize.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr5[CLCSTemplateItemFlexibleSize.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            n = iArr5;
            int[] iArr6 = new int[CLCSTextAlignment.values().length];
            try {
                iArr6[CLCSTextAlignment.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr6[CLCSTextAlignment.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            m = iArr6;
            int[] iArr7 = new int[CLCSButtonSize.values().length];
            try {
                iArr7[CLCSButtonSize.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr7[CLCSButtonSize.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            l = iArr7;
            int[] iArr8 = new int[CLCSInputSize.values().length];
            try {
                iArr8[CLCSInputSize.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr8[CLCSInputSize.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr8[CLCSInputSize.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            s = iArr8;
            int[] iArr9 = new int[CLCSInputType.values().length];
            try {
                iArr9[CLCSInputType.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr9[CLCSInputType.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr9[CLCSInputType.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr9[CLCSInputType.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            t = iArr9;
            int[] iArr10 = new int[CLCSPinEntrySize.values().length];
            try {
                iArr10[CLCSPinEntrySize.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr10[CLCSPinEntrySize.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr10[CLCSPinEntrySize.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            r = iArr10;
            int[] iArr11 = new int[CLCSStaticListType.values().length];
            try {
                iArr11[CLCSStaticListType.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr11[CLCSStaticListType.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            e = iArr11;
            int[] iArr12 = new int[CLCSIconSize.values().length];
            try {
                iArr12[CLCSIconSize.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr12[CLCSIconSize.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr12[CLCSIconSize.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr12[CLCSIconSize.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused31) {
            }
            b = iArr12;
            int[] iArr13 = new int[CLCSStackContentJustification.values().length];
            try {
                iArr13[CLCSStackContentJustification.g.ordinal()] = 1;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr13[CLCSStackContentJustification.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr13[CLCSStackContentJustification.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr13[CLCSStackContentJustification.b.ordinal()] = 4;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr13[CLCSStackContentJustification.d.ordinal()] = 5;
            } catch (NoSuchFieldError unused36) {
            }
            c = iArr13;
            int[] iArr14 = new int[CLCSItemAlignment.values().length];
            try {
                iArr14[CLCSItemAlignment.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr14[CLCSItemAlignment.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr14[CLCSItemAlignment.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr14[CLCSItemAlignment.j.ordinal()] = 4;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr14[CLCSItemAlignment.c.ordinal()] = 5;
            } catch (NoSuchFieldError unused41) {
            }
            g = iArr14;
            int[] iArr15 = new int[CLCSSpaceSize.values().length];
            try {
                iArr15[CLCSSpaceSize.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr15[CLCSSpaceSize.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr15[CLCSSpaceSize.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr15[CLCSSpaceSize.a.ordinal()] = 4;
            } catch (NoSuchFieldError unused45) {
            }
            f = iArr15;
            int[] iArr16 = new int[CLCSButtonType.values().length];
            try {
                iArr16[CLCSButtonType.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr16[CLCSButtonType.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr16[CLCSButtonType.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr16[CLCSButtonType.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr16[CLCSButtonType.a.ordinal()] = 5;
            } catch (NoSuchFieldError unused50) {
            }
            h = iArr16;
            int[] iArr17 = new int[CLCSLoggableSessionType.values().length];
            try {
                iArr17[CLCSLoggableSessionType.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr17[CLCSLoggableSessionType.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr17[CLCSLoggableSessionType.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr17[CLCSLoggableSessionType.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused54) {
            }
            i = iArr17;
            int[] iArr18 = new int[RdidDeviceConsent.values().length];
            try {
                iArr18[RdidDeviceConsent.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr18[RdidDeviceConsent.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr18[RdidDeviceConsent.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr18[RdidDeviceConsent.c.ordinal()] = 4;
            } catch (NoSuchFieldError unused58) {
            }
            j = iArr18;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r1 == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final o.FX b(o.BR r12) {
        /*
            java.lang.String r0 = ""
            o.C8632dsu.c(r12, r0)
            o.BR$a r0 = r12.e()
            o.FX$b r3 = d(r0)
            r0 = 0
            if (r3 != 0) goto L11
            return r0
        L11:
            java.lang.String r2 = r12.h()
            com.netflix.clcs.codegen.type.CLCSDesignTheme r1 = r12.i()
            if (r1 == 0) goto L33
            int[] r4 = o.C0871Fu.c.a
            int r1 = r1.ordinal()
            r1 = r4[r1]
            r4 = 1
            if (r1 == r4) goto L2f
            r4 = 2
            if (r1 == r4) goto L2c
            com.netflix.hawkins.consumer.tokens.Theme r1 = com.netflix.hawkins.consumer.tokens.Theme.b
            goto L31
        L2c:
            com.netflix.hawkins.consumer.tokens.Theme r1 = com.netflix.hawkins.consumer.tokens.Theme.a
            goto L31
        L2f:
            com.netflix.hawkins.consumer.tokens.Theme r1 = com.netflix.hawkins.consumer.tokens.Theme.b
        L31:
            if (r1 != 0) goto L35
        L33:
            com.netflix.hawkins.consumer.tokens.Theme r1 = com.netflix.hawkins.consumer.tokens.Theme.b
        L35:
            r4 = r1
            o.BR$e r1 = r12.b()
            if (r1 == 0) goto L48
            o.Bi r1 = r1.b()
            if (r1 == 0) goto L48
            o.FE r1 = a(r1)
            r5 = r1
            goto L49
        L48:
            r5 = r0
        L49:
            o.BR$j r1 = r12.g()
            if (r1 == 0) goto L5b
            o.Bi r1 = r1.a()
            if (r1 == 0) goto L5b
            o.FE r1 = a(r1)
            r6 = r1
            goto L5c
        L5b:
            r6 = r0
        L5c:
            o.BR$f r1 = r12.j()
            if (r1 == 0) goto L6e
            o.Bi r1 = r1.b()
            if (r1 == 0) goto L6e
            o.FE r1 = a(r1)
            r7 = r1
            goto L6f
        L6e:
            r7 = r0
        L6f:
            java.lang.String r8 = r12.f()
            java.lang.String r9 = r12.c()
            java.lang.String r10 = r12.d()
            java.util.List r12 = r12.a()
            if (r12 == 0) goto L87
            java.util.List r12 = b(r12)
            r11 = r12
            goto L88
        L87:
            r11 = r0
        L88:
            o.FX r12 = new o.FX
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0871Fu.b(o.BR):o.FX");
    }

    private static final FD d(AV av, Map<String, AV> map) {
        AR d;
        BT r;
        C0784Cl v;
        AF e;
        AM b;
        BA n;
        C0760Bp j;
        BV p;
        BO s;
        C0764Bt h;
        BC i;
        BD o2;
        C0776Cd t;
        BM l;
        C0754Bj a;
        BJ m;
        C0762Br f;
        C0777Ce q;
        C0759Bo c2;
        String y = av.y();
        switch (y.hashCode()) {
            case -1815782053:
                if (y.equals("CLCSInterstitialLegacyUMA")) {
                    String g = av.g();
                    AV.a k = av.k();
                    return new FT(g, (k == null || (r2 = k.e()) == null) ? "" : "");
                }
                break;
            case -1740541572:
                if (y.equals("CLCSCheckbox") && (d = av.d()) != null) {
                    return c(d, av.g());
                }
                break;
            case -1513039963:
                if (y.equals("CLCSStaticList") && (r = av.r()) != null) {
                    return e(r, av.g());
                }
                break;
            case -1077478759:
                if (y.equals("CLCSVerticalStack") && (v = av.v()) != null) {
                    return b(v, av.g(), map);
                }
                break;
            case -1069027547:
                if (y.equals("CLCSBanner") && (e = av.e()) != null) {
                    return a(e, av.g(), map);
                }
                break;
            case -1050372309:
                if (y.equals("CLCSButton") && (b = av.b()) != null) {
                    return c(b, av.g());
                }
                break;
            case -782406877:
                if (y.equals("CLCSLayout") && (n = av.n()) != null) {
                    return d(n, av.g(), map);
                }
                break;
            case -582790949:
                if (y.equals("CLCSImageComponent") && (j = av.j()) != null) {
                    return c(j, av.g());
                }
                break;
            case -568877019:
                if (y.equals("CLCSSpacer") && (p = av.p()) != null) {
                    return c(p, av.g());
                }
                break;
            case -477419649:
                if (y.equals("CLCSSelectableCard") && (s = av.s()) != null) {
                    return e(s, av.g(), map);
                }
                break;
            case 52017376:
                if (y.equals("CLCSInputCopyLink") && (h = av.h()) != null) {
                    return a(h, av.g());
                }
                break;
            case 249463985:
                if (y.equals("CLCSInput") && (i = av.i()) != null) {
                    return b(i, av.g());
                }
                break;
            case 253175700:
                if (y.equals("CLCSModal") && (o2 = av.o()) != null) {
                    return a(o2, av.g(), map);
                }
                break;
            case 259638030:
                if (y.equals("CLCSToast") && (t = av.t()) != null) {
                    return a(t, av.g(), map);
                }
                break;
            case 558723478:
                if (y.equals("CLCSPinEntry") && (l = av.l()) != null) {
                    return c(l, av.g());
                }
                break;
            case 950007996:
                if (y.equals("CLCSHorizontalDivider") && (a = av.a()) != null) {
                    return e(a, av.g());
                }
                break;
            case 1048062581:
                if (y.equals("CLCSPhoneInput") && (m = av.m()) != null) {
                    return e(m, av.g());
                }
                break;
            case 1532057266:
                if (y.equals("CLCSIcon") && (f = av.f()) != null) {
                    return c(f, av.g());
                }
                break;
            case 1532387174:
                if (y.equals("CLCSText") && (q = av.q()) != null) {
                    return e(q, av.g());
                }
                break;
            case 1901180139:
                if (y.equals("CLCSHorizontalStack") && (c2 = av.c()) != null) {
                    return c(c2, av.g(), map);
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
        if (r12 == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final com.netflix.clcs.models.Modal a(o.BD r10, java.lang.String r11, java.util.Map<java.lang.String, o.AV> r12) {
        /*
            o.BD$c r0 = r10.d()
            java.lang.String r0 = r0.b()
            java.lang.Object r0 = r12.get(r0)
            o.AV r0 = (o.AV) r0
            r1 = 0
            if (r0 == 0) goto L8c
            o.FD r9 = d(r0, r12)
            if (r9 != 0) goto L19
            goto L8c
        L19:
            o.BD$a r12 = r10.f()
            if (r12 == 0) goto L2b
            o.AU r12 = r12.a()
            if (r12 == 0) goto L2b
            o.FC r12 = b(r12)
            r4 = r12
            goto L2c
        L2b:
            r4 = r1
        L2c:
            o.BD$e r12 = r10.a()
            if (r12 == 0) goto L44
            o.Bw r12 = r12.d()
            if (r12 == 0) goto L44
            java.lang.String r12 = r12.c()
            if (r12 == 0) goto L44
            android.net.Uri r12 = android.net.Uri.parse(r12)
            r5 = r12
            goto L45
        L44:
            r5 = r1
        L45:
            com.netflix.clcs.codegen.type.CLCSModalPresentation r12 = r10.b()
            if (r12 == 0) goto L63
            int[] r0 = o.C0871Fu.c.d
            int r12 = r12.ordinal()
            r12 = r0[r12]
            r0 = 1
            if (r12 == r0) goto L5f
            r0 = 2
            if (r12 == r0) goto L5c
            com.netflix.clcs.models.Modal$Presentation r12 = com.netflix.clcs.models.Modal.Presentation.d
            goto L61
        L5c:
            com.netflix.clcs.models.Modal$Presentation r12 = com.netflix.clcs.models.Modal.Presentation.e
            goto L61
        L5f:
            com.netflix.clcs.models.Modal$Presentation r12 = com.netflix.clcs.models.Modal.Presentation.b
        L61:
            if (r12 != 0) goto L65
        L63:
            com.netflix.clcs.models.Modal$Presentation r12 = com.netflix.clcs.models.Modal.Presentation.d
        L65:
            r6 = r12
            com.netflix.clcs.codegen.type.CLCSButtonType r12 = r10.e()
            if (r12 == 0) goto L72
            com.netflix.hawkins.consumer.component.button.HawkinsButtonType r12 = a(r12)
            r7 = r12
            goto L73
        L72:
            r7 = r1
        L73:
            o.BD$d r10 = r10.c()
            if (r10 == 0) goto L83
            o.Bi r10 = r10.d()
            if (r10 == 0) goto L83
            o.FE r1 = a(r10)
        L83:
            r8 = r1
            com.netflix.clcs.models.Modal r10 = new com.netflix.clcs.models.Modal
            r2 = r10
            r3 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r10
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0871Fu.a(o.BD, java.lang.String, java.util.Map):com.netflix.clcs.models.Modal");
    }

    private static final C0876Fz a(AF af, String str, Map<String, AV> map) {
        FD d;
        AU c2;
        AV av = map.get(af.d().d());
        FC fc = null;
        if (av == null || (d = d(av, map)) == null) {
            return null;
        }
        AF.c a = af.a();
        if (a != null && (c2 = a.c()) != null) {
            fc = b(c2);
        }
        return new C0876Fz(str, fc, d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r13 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final com.netflix.clcs.models.Toast a(o.C0776Cd r11, java.lang.String r12, java.util.Map<java.lang.String, o.AV> r13) {
        /*
            o.Cd$c r0 = r11.c()
            java.lang.String r0 = r0.b()
            java.lang.Object r0 = r13.get(r0)
            o.AV r0 = (o.AV) r0
            r1 = 0
            if (r0 == 0) goto L71
            o.FD r10 = d(r0, r13)
            if (r10 != 0) goto L18
            goto L71
        L18:
            java.lang.String r4 = r11.f()
            java.lang.String r5 = r11.b()
            o.Cd$a r13 = r11.a()
            if (r13 == 0) goto L32
            o.AU r13 = r13.c()
            if (r13 == 0) goto L32
            o.FC r13 = b(r13)
            r6 = r13
            goto L33
        L32:
            r6 = r1
        L33:
            com.netflix.clcs.codegen.type.CLCSToastPosition r13 = r11.d()
            if (r13 == 0) goto L51
            int[] r0 = o.C0871Fu.c.f13356o
            int r13 = r13.ordinal()
            r13 = r0[r13]
            r0 = 1
            if (r13 == r0) goto L4d
            r0 = 2
            if (r13 == r0) goto L4a
            com.netflix.clcs.models.Toast$Position r13 = com.netflix.clcs.models.Toast.Position.c
            goto L4f
        L4a:
            com.netflix.clcs.models.Toast$Position r13 = com.netflix.clcs.models.Toast.Position.d
            goto L4f
        L4d:
            com.netflix.clcs.models.Toast$Position r13 = com.netflix.clcs.models.Toast.Position.c
        L4f:
            if (r13 != 0) goto L53
        L51:
            com.netflix.clcs.models.Toast$Position r13 = com.netflix.clcs.models.Toast.Position.c
        L53:
            r7 = r13
            java.lang.Integer r8 = r11.j()
            o.Cd$d r11 = r11.e()
            if (r11 == 0) goto L68
            o.Bi r11 = r11.b()
            if (r11 == 0) goto L68
            o.FE r1 = a(r11)
        L68:
            r9 = r1
            com.netflix.clcs.models.Toast r11 = new com.netflix.clcs.models.Toast
            r2 = r11
            r3 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0871Fu.a(o.Cd, java.lang.String, java.util.Map):com.netflix.clcs.models.Toast");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final o.C0879Gc b(o.C0784Cl r10, java.lang.String r11, java.util.Map<java.lang.String, o.AV> r12) {
        /*
            o.Cl$a r0 = r10.i()
            r1 = 0
            if (r0 == 0) goto L13
            o.AU r0 = r0.b()
            if (r0 == 0) goto L13
            o.FC r0 = b(r0)
            r4 = r0
            goto L14
        L13:
            r4 = r1
        L14:
            o.Cl$c r0 = r10.b()
            if (r0 == 0) goto L25
            o.Bc r0 = r0.d()
            if (r0 == 0) goto L25
            int r0 = e(r0)
            goto L2f
        L25:
            com.netflix.clcs.codegen.type.CLCSSpaceSize r0 = r10.c()
            if (r0 == 0) goto L35
            int r0 = a(r0)
        L2f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = r0
            goto L36
        L35:
            r5 = r1
        L36:
            com.netflix.clcs.codegen.type.CLCSStackContentJustification r0 = r10.a()
            if (r0 == 0) goto L42
            com.netflix.clcs.models.StackContentJustification r0 = c(r0)
            r6 = r0
            goto L43
        L42:
            r6 = r1
        L43:
            java.lang.Boolean r0 = r10.d()
            if (r0 == 0) goto L4e
            boolean r0 = r0.booleanValue()
            goto L4f
        L4e:
            r0 = 0
        L4f:
            r7 = r0
            com.netflix.clcs.codegen.type.CLCSItemAlignment r0 = r10.j()
            if (r0 == 0) goto L5c
            com.netflix.clcs.models.ItemAlignment r0 = d(r0)
            if (r0 != 0) goto L5e
        L5c:
            com.netflix.clcs.models.ItemAlignment r0 = com.netflix.clcs.models.ItemAlignment.c
        L5e:
            r8 = r0
            java.util.List r10 = r10.e()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r10.iterator()
        L6c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r0 = r10.next()
            o.Cl$e r0 = (o.C0784Cl.e) r0
            java.lang.String r0 = r0.e()
            java.lang.Object r0 = r12.get(r0)
            o.AV r0 = (o.AV) r0
            if (r0 == 0) goto L89
            o.FD r0 = d(r0, r12)
            goto L8a
        L89:
            r0 = r1
        L8a:
            if (r0 == 0) goto L6c
            r9.add(r0)
            goto L6c
        L90:
            o.Gc r10 = new o.Gc
            r2 = r10
            r3 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0871Fu.b(o.Cl, java.lang.String, java.util.Map):o.Gc");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final o.FH c(o.C0759Bo r10, java.lang.String r11, java.util.Map<java.lang.String, o.AV> r12) {
        /*
            o.Bo$e r0 = r10.i()
            r1 = 0
            if (r0 == 0) goto L13
            o.AU r0 = r0.e()
            if (r0 == 0) goto L13
            o.FC r0 = b(r0)
            r4 = r0
            goto L14
        L13:
            r4 = r1
        L14:
            o.Bo$d r0 = r10.d()
            if (r0 == 0) goto L25
            o.Bc r0 = r0.a()
            if (r0 == 0) goto L25
            int r0 = e(r0)
            goto L2f
        L25:
            com.netflix.clcs.codegen.type.CLCSSpaceSize r0 = r10.a()
            if (r0 == 0) goto L35
            int r0 = a(r0)
        L2f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = r0
            goto L36
        L35:
            r5 = r1
        L36:
            com.netflix.clcs.codegen.type.CLCSStackContentJustification r0 = r10.e()
            if (r0 == 0) goto L42
            com.netflix.clcs.models.StackContentJustification r0 = c(r0)
            r6 = r0
            goto L43
        L42:
            r6 = r1
        L43:
            java.lang.Boolean r0 = r10.c()
            if (r0 == 0) goto L4e
            boolean r0 = r0.booleanValue()
            goto L4f
        L4e:
            r0 = 0
        L4f:
            r7 = r0
            com.netflix.clcs.codegen.type.CLCSItemAlignment r0 = r10.h()
            if (r0 == 0) goto L5c
            com.netflix.clcs.models.ItemAlignment r0 = d(r0)
            if (r0 != 0) goto L5e
        L5c:
            com.netflix.clcs.models.ItemAlignment r0 = com.netflix.clcs.models.ItemAlignment.c
        L5e:
            r8 = r0
            java.util.List r10 = r10.b()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r10.iterator()
        L6c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r0 = r10.next()
            o.Bo$b r0 = (o.C0759Bo.b) r0
            java.lang.String r0 = r0.d()
            java.lang.Object r0 = r12.get(r0)
            o.AV r0 = (o.AV) r0
            if (r0 == 0) goto L89
            o.FD r0 = d(r0, r12)
            goto L8a
        L89:
            r0 = r1
        L8a:
            if (r0 == 0) goto L6c
            r9.add(r0)
            goto L6c
        L90:
            o.FH r10 = new o.FH
            r2 = r10
            r3 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0871Fu.c(o.Bo, java.lang.String, java.util.Map):o.FH");
    }

    private static final Layout.Direction c(CLCSLayoutDirection cLCSLayoutDirection) {
        int i = c.k[cLCSLayoutDirection.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Layout.Direction.d;
            }
            return Layout.Direction.d;
        }
        return Layout.Direction.a;
    }

    private static final Layout.Template d(BX bx) {
        Layout.Template.Flexible.Size size;
        BX.d d = bx.d();
        if (d != null) {
            Integer d2 = d.d();
            int intValue = d2 != null ? d2.intValue() : 0;
            int i = c.n[d.c().ordinal()];
            if (i == 1) {
                size = Layout.Template.Flexible.Size.b;
            } else if (i == 2) {
                size = Layout.Template.Flexible.Size.c;
            } else if (i == 3) {
                size = Layout.Template.Flexible.Size.d;
            } else {
                size = Layout.Template.Flexible.Size.b;
            }
            return new Layout.Template.Flexible(intValue, size);
        }
        BX.a c2 = bx.c();
        if (c2 != null) {
            Integer c3 = c2.c();
            return new Layout.Template.a(c3 != null ? c3.intValue() : 0, c2.d());
        }
        return null;
    }

    private static final Layout d(BA ba, String str, Map<String, AV> map) {
        FR fr;
        FR fr2;
        FR fr3;
        List i;
        ArrayList arrayList;
        FR fr4;
        FR fr5;
        FR fr6;
        C0747Bc e;
        C0747Bc e2;
        C0747Bc b;
        C0747Bc b2;
        C0747Bc a;
        C0747Bc b3;
        C0747Bc a2;
        C0747Bc d;
        C0747Bc e3;
        C0747Bc e4;
        C0747Bc b4;
        C0747Bc b5;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        AU b6;
        BA.t m = ba.m();
        FC b7 = (m == null || (b6 = m.b()) == null) ? null : b(b6);
        CLCSLayoutDirection h = ba.h();
        Layout.Direction c2 = h != null ? c(h) : null;
        BA.d i2 = ba.i();
        if (i2 != null) {
            CLCSLayoutDirection e5 = i2.e();
            Layout.Direction c3 = e5 != null ? c(e5) : null;
            CLCSLayoutDirection a3 = i2.a();
            Layout.Direction c4 = a3 != null ? c(a3) : null;
            CLCSLayoutDirection c5 = i2.c();
            Layout.Direction c6 = c5 != null ? c(c5) : null;
            CLCSLayoutDirection d2 = i2.d();
            Layout.Direction c7 = d2 != null ? c(d2) : null;
            CLCSLayoutDirection b8 = i2.b();
            fr = new FR(c3, c4, c6, c7, b8 != null ? c(b8) : null);
        } else {
            fr = null;
        }
        CLCSStackContentJustification c8 = ba.c();
        StackContentJustification c9 = c8 != null ? c(c8) : null;
        BA.b b9 = ba.b();
        if (b9 != null) {
            CLCSStackContentJustification b10 = b9.b();
            StackContentJustification c10 = b10 != null ? c(b10) : null;
            CLCSStackContentJustification a4 = b9.a();
            StackContentJustification c11 = a4 != null ? c(a4) : null;
            CLCSStackContentJustification c12 = b9.c();
            StackContentJustification c13 = c12 != null ? c(c12) : null;
            CLCSStackContentJustification e6 = b9.e();
            StackContentJustification c14 = e6 != null ? c(e6) : null;
            CLCSStackContentJustification d3 = b9.d();
            fr2 = new FR(c10, c11, c13, c14, d3 != null ? c(d3) : null);
        } else {
            fr2 = null;
        }
        CLCSItemAlignment j = ba.j();
        ItemAlignment d4 = j != null ? d(j) : null;
        BA.g f = ba.f();
        if (f != null) {
            CLCSItemAlignment a5 = f.a();
            ItemAlignment d5 = a5 != null ? d(a5) : null;
            CLCSItemAlignment d6 = f.d();
            ItemAlignment d7 = d6 != null ? d(d6) : null;
            CLCSItemAlignment e7 = f.e();
            ItemAlignment d8 = e7 != null ? d(e7) : null;
            CLCSItemAlignment c15 = f.c();
            ItemAlignment d9 = c15 != null ? d(c15) : null;
            CLCSItemAlignment b11 = f.b();
            fr3 = new FR(d5, d7, d8, d9, b11 != null ? d(b11) : null);
        } else {
            fr3 = null;
        }
        List<BA.p> k = ba.k();
        if (k == null) {
            i = C8569dql.i();
            arrayList = i;
        } else {
            ArrayList arrayList7 = new ArrayList();
            for (BA.p pVar : k) {
                Layout.Template d10 = d(pVar.d());
                if (d10 != null) {
                    arrayList7.add(d10);
                }
            }
            arrayList = arrayList7;
        }
        BA.q n = ba.n();
        if (n != null) {
            List<BA.y> b12 = n.b();
            if (b12 != null) {
                ArrayList arrayList8 = new ArrayList();
                for (BA.y yVar : b12) {
                    Layout.Template d11 = d(yVar.b());
                    if (d11 != null) {
                        arrayList8.add(d11);
                    }
                }
                arrayList2 = arrayList8;
            } else {
                arrayList2 = null;
            }
            List<BA.s> a6 = n.a();
            if (a6 != null) {
                ArrayList arrayList9 = new ArrayList();
                for (BA.s sVar : a6) {
                    Layout.Template d12 = d(sVar.d());
                    if (d12 != null) {
                        arrayList9.add(d12);
                    }
                }
                arrayList3 = arrayList9;
            } else {
                arrayList3 = null;
            }
            List<BA.h> d13 = n.d();
            if (d13 != null) {
                ArrayList arrayList10 = new ArrayList();
                for (BA.h hVar : d13) {
                    Layout.Template d14 = d(hVar.c());
                    if (d14 != null) {
                        arrayList10.add(d14);
                    }
                }
                arrayList4 = arrayList10;
            } else {
                arrayList4 = null;
            }
            List<BA.f> c16 = n.c();
            if (c16 != null) {
                ArrayList arrayList11 = new ArrayList();
                for (BA.f fVar : c16) {
                    Layout.Template d15 = d(fVar.c());
                    if (d15 != null) {
                        arrayList11.add(d15);
                    }
                }
                arrayList5 = arrayList11;
            } else {
                arrayList5 = null;
            }
            List<BA.v> e8 = n.e();
            if (e8 != null) {
                ArrayList arrayList12 = new ArrayList();
                for (BA.v vVar : e8) {
                    Layout.Template d16 = d(vVar.e());
                    if (d16 != null) {
                        arrayList12.add(d16);
                    }
                }
                arrayList6 = arrayList12;
            } else {
                arrayList6 = null;
            }
            fr4 = new FR(arrayList2, arrayList3, arrayList4, arrayList5, arrayList6);
        } else {
            fr4 = null;
        }
        BA.c d17 = ba.d();
        int e9 = (d17 == null || (b5 = d17.b()) == null) ? 0 : e(b5);
        BA.e a7 = ba.a();
        if (a7 != null) {
            BA.x d18 = a7.d();
            Integer valueOf = (d18 == null || (b4 = d18.b()) == null) ? null : Integer.valueOf(e(b4));
            BA.k c17 = a7.c();
            Integer valueOf2 = (c17 == null || (e4 = c17.e()) == null) ? null : Integer.valueOf(e(e4));
            BA.o e10 = a7.e();
            Integer valueOf3 = (e10 == null || (e3 = e10.e()) == null) ? null : Integer.valueOf(e(e3));
            BA.j b13 = a7.b();
            Integer valueOf4 = (b13 == null || (d = b13.d()) == null) ? null : Integer.valueOf(e(d));
            BA.u a8 = a7.a();
            fr5 = new FR(valueOf, valueOf2, valueOf3, valueOf4, (a8 == null || (a2 = a8.a()) == null) ? null : Integer.valueOf(e(a2)));
        } else {
            fr5 = null;
        }
        BA.l g = ba.g();
        int e11 = (g == null || (b3 = g.b()) == null) ? 0 : e(b3);
        BA.n o2 = ba.o();
        if (o2 != null) {
            BA.A d19 = o2.d();
            Integer valueOf5 = (d19 == null || (a = d19.a()) == null) ? null : Integer.valueOf(e(a));
            BA.r e12 = o2.e();
            Integer valueOf6 = (e12 == null || (b2 = e12.b()) == null) ? null : Integer.valueOf(e(b2));
            BA.m c18 = o2.c();
            Integer valueOf7 = (c18 == null || (b = c18.b()) == null) ? null : Integer.valueOf(e(b));
            BA.i a9 = o2.a();
            Integer valueOf8 = (a9 == null || (e2 = a9.e()) == null) ? null : Integer.valueOf(e(e2));
            BA.w b14 = o2.b();
            fr6 = new FR(valueOf5, valueOf6, valueOf7, valueOf8, (b14 == null || (e = b14.e()) == null) ? null : Integer.valueOf(e(e)));
        } else {
            fr6 = null;
        }
        List<BA.C0744a> e13 = ba.e();
        ArrayList arrayList13 = new ArrayList();
        for (BA.C0744a c0744a : e13) {
            AV av = map.get(c0744a.a());
            FD d20 = av != null ? d(av, map) : null;
            if (d20 != null) {
                arrayList13.add(d20);
            }
        }
        return new Layout(str, b7, c2, fr, c9, fr2, d4, fr3, arrayList, fr4, e9, fr5, e11, fr6, arrayList13);
    }

    private static final Text.Alignment b(CLCSTextAlignment cLCSTextAlignment) {
        int i = c.m[cLCSTextAlignment.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Text.Alignment.c;
            }
            return Text.Alignment.b;
        }
        return Text.Alignment.a;
    }

    private static final Text e(C0777Ce c0777Ce, String str) {
        FR fr;
        FR fr2;
        BB c2;
        String c3;
        BG d;
        String e;
        AW e2;
        C0779Cg a;
        C0779Cg d2;
        C0779Cg b;
        C0779Cg a2;
        C0779Cg c4;
        C0779Cg e3;
        BG b2;
        C0777Ce.c e4 = c0777Ce.e();
        Text.c cVar = null;
        String e5 = (e4 == null || (b2 = e4.b()) == null) ? null : b2.e();
        C0777Ce.g i = c0777Ce.i();
        Token.Typography d3 = (i == null || (e3 = i.e()) == null) ? null : d(e3);
        C0777Ce.j j = c0777Ce.j();
        if (j != null) {
            C0777Ce.o a3 = j.a();
            Token.Typography d4 = (a3 == null || (c4 = a3.c()) == null) ? null : d(c4);
            C0777Ce.i c5 = j.c();
            Token.Typography d5 = (c5 == null || (a2 = c5.a()) == null) ? null : d(a2);
            C0777Ce.d b3 = j.b();
            Token.Typography d6 = (b3 == null || (b = b3.b()) == null) ? null : d(b);
            C0777Ce.a e6 = j.e();
            Token.Typography d7 = (e6 == null || (d2 = e6.d()) == null) ? null : d(d2);
            C0777Ce.k d8 = j.d();
            fr = new FR(d4, d5, d6, d7, (d8 == null || (a = d8.a()) == null) ? null : d(a));
        } else {
            fr = null;
        }
        C0777Ce.b a4 = c0777Ce.a();
        Token.Color e7 = (a4 == null || (e2 = a4.e()) == null) ? null : e(e2);
        CLCSTextAlignment d9 = c0777Ce.d();
        Text.Alignment b4 = d9 != null ? b(d9) : null;
        C0777Ce.e b5 = c0777Ce.b();
        if (b5 != null) {
            CLCSTextAlignment e8 = b5.e();
            Text.Alignment b6 = e8 != null ? b(e8) : null;
            CLCSTextAlignment d10 = b5.d();
            Text.Alignment b7 = d10 != null ? b(d10) : null;
            CLCSTextAlignment b8 = b5.b();
            Text.Alignment b9 = b8 != null ? b(b8) : null;
            CLCSTextAlignment c6 = b5.c();
            Text.Alignment b10 = c6 != null ? b(c6) : null;
            CLCSTextAlignment a5 = b5.a();
            fr2 = new FR(b6, b7, b9, b10, a5 != null ? b(a5) : null);
        } else {
            fr2 = null;
        }
        C0777Ce.h c7 = c0777Ce.c();
        if (c7 == null || (d = c7.d()) == null || (e = d.e()) == null) {
            C0777Ce.f f = c0777Ce.f();
            if (f != null && (c2 = f.c()) != null && (c3 = c2.c()) != null) {
                cVar = new Text.c.b(c3);
            }
        } else {
            cVar = new Text.c.d(e);
        }
        return new Text(str, e5, d3, fr, e7, b4, fr2, cVar);
    }

    private static final FA c(AM am, String str) {
        BG a;
        AS e = am.e();
        AM.e b = am.b();
        return e(e, str, (b == null || (a = b.a()) == null) ? null : a.e(), am.a(), am.d());
    }

    static /* synthetic */ FA c(AS as, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        return e(as, str, str2, str3, str4);
    }

    private static final FA e(AS as, String str, String str2, String str3, String str4) {
        HawkinsButtonSize hawkinsButtonSize;
        HawkinsButtonType hawkinsButtonType;
        C0753Bi b;
        C0746Bb d;
        HawkinsButtonSize hawkinsButtonSize2;
        BG b2;
        AS.a b3 = as.b();
        FE fe = null;
        String e = (b3 == null || (b2 = b3.b()) == null) ? null : b2.e();
        CLCSButtonSize e2 = as.e();
        if (e2 != null) {
            int i = c.l[e2.ordinal()];
            if (i == 1) {
                hawkinsButtonSize2 = HawkinsButtonSize.c;
            } else if (i == 2) {
                hawkinsButtonSize2 = HawkinsButtonSize.b;
            } else {
                hawkinsButtonSize2 = HawkinsButtonSize.e;
            }
            hawkinsButtonSize = hawkinsButtonSize2;
        } else {
            hawkinsButtonSize = null;
        }
        CLCSButtonType c2 = as.c();
        if (c2 == null || (hawkinsButtonType = a(c2)) == null) {
            hawkinsButtonType = HawkinsButtonType.c;
        }
        HawkinsButtonType hawkinsButtonType2 = hawkinsButtonType;
        AS.e a = as.a();
        HawkinsIcon a2 = (a == null || (d = a.d()) == null) ? null : a(d);
        AS.b d2 = as.d();
        if (d2 != null && (b = d2.b()) != null) {
            fe = a(b);
        }
        return new FA(str, str2, str3, str4, e, hawkinsButtonSize, hawkinsButtonType2, a2, fe);
    }

    private static final FO c(C0760Bp c0760Bp, String str) {
        C0767Bw d;
        C0767Bw e;
        C0767Bw b;
        C0767Bw b2;
        C0767Bw b3;
        C0767Bw a;
        BG b4;
        C0760Bp.d d2 = c0760Bp.d();
        FR fr = null;
        r1 = null;
        FO.b bVar = null;
        String e2 = (d2 == null || (b4 = d2.b()) == null) ? null : b4.e();
        C0760Bp.c e3 = c0760Bp.e();
        FO.b b5 = (e3 == null || (a = e3.a()) == null) ? null : b(a);
        C0760Bp.e c2 = c0760Bp.c();
        if (c2 != null) {
            C0760Bp.f e4 = c2.e();
            FO.b b6 = (e4 == null || (b3 = e4.b()) == null) ? null : b(b3);
            C0760Bp.g a2 = c2.a();
            FO.b b7 = (a2 == null || (b2 = a2.b()) == null) ? null : b(b2);
            C0760Bp.b c3 = c2.c();
            FO.b b8 = (c3 == null || (b = c3.b()) == null) ? null : b(b);
            C0760Bp.a d3 = c2.d();
            FO.b b9 = (d3 == null || (e = d3.e()) == null) ? null : b(e);
            C0760Bp.i b10 = c2.b();
            if (b10 != null && (d = b10.d()) != null) {
                bVar = b(d);
            }
            fr = new FR(b6, b7, b8, b9, bVar);
        }
        return new FO(str, e2, b5, fr);
    }

    private static final FO.b b(C0767Bw c0767Bw) {
        String c2 = c0767Bw.c();
        return new FO.b(c2 != null ? Uri.parse(c2) : null, c0767Bw.b(), c0767Bw.e());
    }

    private static final FG c(C0762Br c0762Br, String str) {
        C0746Bb d;
        HawkinsIcon a;
        HawkinsIconSize hawkinsIconSize;
        AW a2;
        BG e;
        C0762Br.e c2 = c0762Br.c();
        Token.Color color = null;
        if (c2 == null || (d = c2.d()) == null || (a = a(d)) == null) {
            return null;
        }
        C0762Br.a b = c0762Br.b();
        String e2 = (b == null || (e = b.e()) == null) ? null : e.e();
        C0762Br.b d2 = c0762Br.d();
        if (d2 != null && (a2 = d2.a()) != null) {
            color = e(a2);
        }
        Token.Color color2 = color;
        CLCSIconSize e3 = c0762Br.e();
        if (e3 == null || (hawkinsIconSize = e(e3)) == null) {
            hawkinsIconSize = HawkinsIconSize.d;
        }
        return new FG(str, e2, color2, a, hawkinsIconSize);
    }

    private static final Input b(BC bc, String str) {
        HawkinsInputSize hawkinsInputSize;
        Input.Type type;
        BG a;
        C0753Bi d;
        BG e;
        C0746Bb c2;
        Input.Type type2;
        HawkinsInputSize hawkinsInputSize2;
        BU a2;
        BG e2;
        BC.c c3 = bc.c();
        String str2 = null;
        String e3 = (c3 == null || (e2 = c3.e()) == null) ? null : e2.e();
        String h = bc.h();
        BC.e b = bc.b();
        C0880Gd b2 = (b == null || (a2 = b.a()) == null) ? null : b(a2);
        CLCSInputSize e4 = bc.e();
        if (e4 != null) {
            int i = c.s[e4.ordinal()];
            if (i == 1) {
                hawkinsInputSize2 = HawkinsInputSize.b;
            } else if (i == 2) {
                hawkinsInputSize2 = HawkinsInputSize.e;
            } else {
                hawkinsInputSize2 = HawkinsInputSize.e;
            }
            hawkinsInputSize = hawkinsInputSize2;
        } else {
            hawkinsInputSize = null;
        }
        CLCSInputType j = bc.j();
        if (j != null) {
            int i2 = c.t[j.ordinal()];
            if (i2 == 1) {
                type2 = Input.Type.c;
            } else if (i2 == 2) {
                type2 = Input.Type.a;
            } else if (i2 == 3) {
                type2 = Input.Type.d;
            } else {
                type2 = i2 != 4 ? null : Input.Type.b;
            }
            type = type2;
        } else {
            type = null;
        }
        BC.a d2 = bc.d();
        HawkinsIcon a3 = (d2 == null || (c2 = d2.c()) == null) ? null : a(c2);
        BC.i f = bc.f();
        String e5 = (f == null || (e = f.e()) == null) ? null : e.e();
        BC.d i3 = bc.i();
        FE a4 = (i3 == null || (d = i3.d()) == null) ? null : a(d);
        BC.b a5 = bc.a();
        if (a5 != null && (a = a5.a()) != null) {
            str2 = a.e();
        }
        return new Input(str, e3, h, b2, hawkinsInputSize, type, a3, e5, a4, str2);
    }

    private static final FQ e(BJ bj, String str) {
        ArrayList arrayList;
        int d;
        BG a;
        BU c2;
        C0753Bi a2;
        C0753Bi a3;
        BG c3;
        BG b;
        BU c4;
        BU b2;
        BG e;
        BJ.b a4 = bj.a();
        String e2 = (a4 == null || (e = a4.e()) == null) ? null : e.e();
        String k = bj.k();
        String g = bj.g();
        BJ.e e3 = bj.e();
        C0880Gd b3 = (e3 == null || (b2 = e3.b()) == null) ? null : b(b2);
        BJ.h h = bj.h();
        C0880Gd b4 = (h == null || (c4 = h.c()) == null) ? null : b(c4);
        BJ.f n = bj.n();
        String e4 = (n == null || (b = n.b()) == null) ? null : b.e();
        BJ.a c5 = bj.c();
        String e5 = (c5 == null || (c3 = c5.c()) == null) ? null : c3.e();
        BJ.g j = bj.j();
        FE a5 = (j == null || (a3 = j.a()) == null) ? null : a(a3);
        BJ.i f = bj.f();
        FE a6 = (f == null || (a2 = f.a()) == null) ? null : a(a2);
        BJ.h h2 = bj.h();
        FE.l lVar = new FE.l((h2 == null || (c2 = h2.c()) == null) ? null : b(c2));
        List<BJ.d> b5 = bj.b();
        if (b5 != null) {
            d = C8572dqo.d(b5, 10);
            ArrayList arrayList2 = new ArrayList(d);
            for (BJ.d dVar : b5) {
                String d2 = dVar.d();
                String a7 = dVar.a();
                BJ.c e6 = dVar.e();
                arrayList2.add(new FQ.a(d2, a7, (e6 == null || (a = e6.a()) == null) ? null : a.e()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new FQ(str, e2, k, g, b3, b4, e4, e5, a5, a6, lVar, arrayList);
    }

    private static final FP c(BM bm, String str) {
        HawkinsInputPinCodeSize hawkinsInputPinCodeSize;
        C0753Bi d;
        BU a;
        BU a2;
        AW d2;
        C0779Cg e;
        BG d3;
        BM.e e2 = bm.e();
        FE fe = null;
        String e3 = (e2 == null || (d3 = e2.d()) == null) ? null : d3.e();
        String h = bm.h();
        String b = bm.b();
        BM.b j = bm.j();
        Token.Typography d4 = (j == null || (e = j.e()) == null) ? null : d(e);
        BM.a i = bm.i();
        Token.Color e4 = (i == null || (d2 = i.d()) == null) ? null : e(d2);
        Integer d5 = bm.d();
        CLCSPinEntrySize g = bm.g();
        int i2 = g == null ? -1 : c.r[g.ordinal()];
        if (i2 == 1) {
            hawkinsInputPinCodeSize = HawkinsInputPinCodeSize.d;
        } else if (i2 == 2) {
            hawkinsInputPinCodeSize = HawkinsInputPinCodeSize.e;
        } else if (i2 == 3) {
            hawkinsInputPinCodeSize = HawkinsInputPinCodeSize.e;
        } else {
            hawkinsInputPinCodeSize = HawkinsInputPinCodeSize.e;
        }
        HawkinsInputPinCodeSize hawkinsInputPinCodeSize2 = hawkinsInputPinCodeSize;
        BM.c a3 = bm.a();
        C0880Gd b2 = (a3 == null || (a2 = a3.a()) == null) ? null : b(a2);
        BM.c a4 = bm.a();
        FE.l lVar = new FE.l((a4 == null || (a = a4.a()) == null) ? null : b(a));
        BM.d c2 = bm.c();
        if (c2 != null && (d = c2.d()) != null) {
            fe = a(d);
        }
        return new FP(str, e3, h, b, d4, e4, d5, hawkinsInputPinCodeSize2, b2, lVar, fe);
    }

    private static final FB c(AR ar, String str) {
        C0753Bi e;
        AI c2;
        BG a;
        BG d;
        AR.c e2 = ar.e();
        FE fe = null;
        String e3 = (e2 == null || (d = e2.d()) == null) ? null : d.e();
        String j = ar.j();
        String a2 = ar.a();
        AR.d d2 = ar.d();
        String e4 = (d2 == null || (a = d2.a()) == null) ? null : a.e();
        AR.e c3 = ar.c();
        C0873Fw b = (c3 == null || (c2 = c3.c()) == null) ? null : b(c2);
        AR.a b2 = ar.b();
        if (b2 != null && (e = b2.e()) != null) {
            fe = a(e);
        }
        return new FB(str, e3, j, a2, e4, b, fe);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:
        if (r0 == null) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [o.Lh] */
    /* JADX WARN: Type inference failed for: r0v15, types: [o.Lh$d] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v5, types: [o.Lf] */
    /* JADX WARN: Type inference failed for: r7v3, types: [o.Lh$e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final o.FW e(o.BT r7, java.lang.String r8) {
        /*
            java.util.List r0 = r7.b()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r0.next()
            o.BT$g r2 = (o.BT.g) r2
            o.BT$j r4 = r2.c()
            if (r4 == 0) goto L67
            o.BB r4 = r4.c()
            if (r4 == 0) goto L67
            java.lang.String r4 = r4.c()
            if (r4 != 0) goto L2d
            goto L67
        L2d:
            o.BT$d r5 = r2.e()
            if (r5 == 0) goto L44
            o.BT$c r5 = r5.b()
            if (r5 == 0) goto L44
            o.Bb r5 = r5.a()
            if (r5 == 0) goto L44
            com.netflix.hawkins.consumer.icons.HawkinsIcon r5 = a(r5)
            goto L45
        L44:
            r5 = r3
        L45:
            o.Ll$d r6 = new o.Ll$d
            r6.<init>(r4)
            o.BT$a r2 = r2.a()
            if (r2 == 0) goto L61
            o.BB r2 = r2.a()
            if (r2 == 0) goto L61
            java.lang.String r2 = r2.c()
            if (r2 == 0) goto L61
            o.Ll$d r3 = new o.Ll$d
            r3.<init>(r2)
        L61:
            o.Lf r2 = new o.Lf
            r2.<init>(r5, r6, r3)
            r3 = r2
        L67:
            if (r3 == 0) goto Ld
            r1.add(r3)
            goto Ld
        L6d:
            com.netflix.clcs.codegen.type.CLCSStaticListType r0 = r7.a()
            r2 = 0
            r4 = 1
            if (r0 == 0) goto Lb6
            int[] r5 = o.C0871Fu.c.e
            int r0 = r0.ordinal()
            r0 = r5[r0]
            if (r0 == r4) goto Lb2
            r5 = 2
            if (r0 == r5) goto Laf
            java.util.List r0 = r7.b()
            boolean r5 = r0 instanceof java.util.Collection
            if (r5 == 0) goto L91
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L91
            goto Lad
        L91:
            java.util.Iterator r0 = r0.iterator()
        L95:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Lad
            java.lang.Object r5 = r0.next()
            o.BT$g r5 = (o.BT.g) r5
            o.BT$d r5 = r5.e()
            if (r5 == 0) goto L95
            o.Lh$e r0 = new o.Lh$e
            r0.<init>(r2, r4, r3)
            goto Lb4
        Lad:
            r0 = r3
            goto Lb4
        Laf:
            o.Lh$d r0 = o.AbstractC1014Lh.d.a
            goto Lb4
        Lb2:
            o.Lh$b r0 = o.AbstractC1014Lh.b.b
        Lb4:
            if (r0 != 0) goto Le2
        Lb6:
            java.util.List r7 = r7.b()
            boolean r0 = r7 instanceof java.util.Collection
            if (r0 == 0) goto Lc5
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto Lc5
            goto Le1
        Lc5:
            java.util.Iterator r7 = r7.iterator()
        Lc9:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Le1
            java.lang.Object r0 = r7.next()
            o.BT$g r0 = (o.BT.g) r0
            o.BT$d r0 = r0.e()
            if (r0 == 0) goto Lc9
            o.Lh$e r7 = new o.Lh$e
            r7.<init>(r2, r4, r3)
            r3 = r7
        Le1:
            r0 = r3
        Le2:
            o.FW r7 = new o.FW
            r7.<init>(r8, r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0871Fu.e(o.BT, java.lang.String):o.FW");
    }

    private static final FF e(C0754Bj c0754Bj, String str) {
        AW d;
        C0754Bj.d b = c0754Bj.b();
        return new FF(str, (b == null || (d = b.d()) == null) ? null : e(d));
    }

    private static final FV e(BO bo, String str, Map<String, AV> map) {
        FD d;
        FA fa;
        FA fa2;
        AU e;
        AU a;
        AS c2;
        AS e2;
        BU a2;
        AV av = map.get(bo.a().c());
        FC fc = null;
        if (av == null || (d = d(av, map)) == null) {
            return null;
        }
        BO.a c3 = bo.c();
        C0880Gd b = (c3 == null || (a2 = c3.a()) == null) ? null : b(a2);
        String g = bo.g();
        BO.e b2 = bo.b();
        if (b2 == null || (e2 = b2.e()) == null) {
            fa = null;
        } else {
            String uuid = UUID.randomUUID().toString();
            C8632dsu.a(uuid, "");
            fa = c(e2, uuid, null, null, null, 14, null);
        }
        BO.c d2 = bo.d();
        if (d2 == null || (c2 = d2.c()) == null) {
            fa2 = null;
        } else {
            String uuid2 = UUID.randomUUID().toString();
            C8632dsu.a(uuid2, "");
            fa2 = c(c2, uuid2, null, null, null, 14, null);
        }
        BO.b e3 = bo.e();
        FC b3 = (e3 == null || (a = e3.a()) == null) ? null : b(a);
        BO.i i = bo.i();
        if (i != null && (e = i.e()) != null) {
            fc = b(e);
        }
        return new FV(str, d, b, g, fa, fa2, b3, fc);
    }

    private static final FU c(BV bv, String str) {
        int a;
        C0747Bc e;
        BV.d e2 = bv.e();
        if (e2 == null || (e = e2.e()) == null) {
            CLCSSpaceSize a2 = bv.a();
            if (a2 == null) {
                a2 = CLCSSpaceSize.b;
            }
            a = a(a2);
        } else {
            a = e(e);
        }
        return new FU(str, a);
    }

    private static final FC.b c(BK bk) {
        C0747Bc e;
        C0747Bc e2;
        C0747Bc d;
        C0747Bc b;
        BK.a d2 = bk.d();
        Integer num = null;
        Integer valueOf = (d2 == null || (b = d2.b()) == null) ? null : Integer.valueOf(e(b));
        BK.b e3 = bk.e();
        Integer valueOf2 = (e3 == null || (d = e3.d()) == null) ? null : Integer.valueOf(e(d));
        BK.e c2 = bk.c();
        Integer valueOf3 = (c2 == null || (e2 = c2.e()) == null) ? null : Integer.valueOf(e(e2));
        BK.c a = bk.a();
        if (a != null && (e = a.e()) != null) {
            num = Integer.valueOf(e(e));
        }
        return new FC.b(valueOf, valueOf2, valueOf3, num);
    }

    private static final FC b(AU au) {
        FC.b bVar;
        FR fr;
        FC.e eVar;
        FC.a aVar;
        AL e;
        AL c2;
        AL e2;
        AL e3;
        AK c3;
        AK e4;
        AK c4;
        AK a;
        AW a2;
        AW d;
        BK e5;
        BK a3;
        BK e6;
        BK c5;
        BK e7;
        BK d2;
        FC.b c6;
        AU.l g = au.g();
        if (g == null || (d2 = g.d()) == null || (c6 = c(d2)) == null) {
            AU.o e8 = au.e();
            if (e8 != null) {
                CLCSSpaceSize d3 = e8.d();
                Integer valueOf = d3 != null ? Integer.valueOf(a(d3)) : null;
                CLCSSpaceSize e9 = e8.e();
                Integer valueOf2 = e9 != null ? Integer.valueOf(a(e9)) : null;
                CLCSSpaceSize b = e8.b();
                Integer valueOf3 = b != null ? Integer.valueOf(a(b)) : null;
                CLCSSpaceSize a4 = e8.a();
                bVar = new FC.b(valueOf, valueOf2, valueOf3, a4 != null ? Integer.valueOf(a(a4)) : null);
            } else {
                bVar = null;
            }
        } else {
            bVar = c6;
        }
        AU.n f = au.f();
        if (f != null) {
            AU.s b2 = f.b();
            FC.b c7 = (b2 == null || (e7 = b2.e()) == null) ? null : c(e7);
            AU.k c8 = f.c();
            FC.b c9 = (c8 == null || (c5 = c8.c()) == null) ? null : c(c5);
            AU.f d4 = f.d();
            FC.b c10 = (d4 == null || (e6 = d4.e()) == null) ? null : c(e6);
            AU.i a5 = f.a();
            FC.b c11 = (a5 == null || (a3 = a5.a()) == null) ? null : c(a3);
            AU.r e10 = f.e();
            fr = new FR(c7, c9, c10, c11, (e10 == null || (e5 = e10.e()) == null) ? null : c(e5));
        } else {
            fr = null;
        }
        AU.c c12 = au.c();
        Token.Color e11 = (c12 == null || (d = c12.d()) == null) ? null : e(d);
        AU.a b3 = au.b();
        Token.Color e12 = (b3 == null || (a2 = b3.a()) == null) ? null : e(a2);
        AU.e a6 = au.a();
        if (a6 != null) {
            AU.p c13 = a6.c();
            Integer valueOf4 = (c13 == null || (a = c13.a()) == null) ? null : Integer.valueOf(c(a));
            AU.b d5 = a6.d();
            Integer valueOf5 = (d5 == null || (c4 = d5.c()) == null) ? null : Integer.valueOf(c(c4));
            AU.m b4 = a6.b();
            Integer valueOf6 = (b4 == null || (e4 = b4.e()) == null) ? null : Integer.valueOf(c(e4));
            AU.h e13 = a6.e();
            eVar = new FC.e(valueOf4, valueOf5, valueOf6, (e13 == null || (c3 = e13.c()) == null) ? null : Integer.valueOf(c(c3)));
        } else {
            eVar = null;
        }
        AU.d d6 = au.d();
        if (d6 != null) {
            AU.t e14 = d6.e();
            int i = 0;
            int b5 = (e14 == null || (e3 = e14.e()) == null) ? 0 : b(e3);
            AU.q b6 = d6.b();
            int b7 = (b6 == null || (e2 = b6.e()) == null) ? 0 : b(e2);
            AU.g c14 = d6.c();
            int b8 = (c14 == null || (c2 = c14.c()) == null) ? 0 : b(c2);
            AU.j a7 = d6.a();
            if (a7 != null && (e = a7.e()) != null) {
                i = b(e);
            }
            aVar = new FC.a(b5, b7, b8, i);
        } else {
            aVar = null;
        }
        return new FC(bVar, fr, e11, e12, eVar, aVar);
    }

    private static final Token.Color e(AW aw) {
        return C1029Lw.b(Token.Color.a, aw.b());
    }

    private static final Token.Typography d(C0779Cg c0779Cg) {
        return LB.c(Token.Typography.a, c0779Cg.d());
    }

    private static final HawkinsIcon a(C0746Bb c0746Bb) {
        return C1028Lv.b(HawkinsIcon.a, c0746Bb.e(), false, 2, null);
    }

    private static final HawkinsIconSize e(CLCSIconSize cLCSIconSize) {
        int i = c.b[cLCSIconSize.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return HawkinsIconSize.c;
                    }
                    return HawkinsIconSize.d;
                }
                return HawkinsIconSize.a;
            }
            return HawkinsIconSize.d;
        }
        return HawkinsIconSize.e;
    }

    private static final StackContentJustification c(CLCSStackContentJustification cLCSStackContentJustification) {
        int i = c.c[cLCSStackContentJustification.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return StackContentJustification.e;
                        }
                        return StackContentJustification.c;
                    }
                    return StackContentJustification.b;
                }
                return StackContentJustification.a;
            }
            return StackContentJustification.d;
        }
        return StackContentJustification.c;
    }

    private static final ItemAlignment d(CLCSItemAlignment cLCSItemAlignment) {
        int i = c.g[cLCSItemAlignment.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return ItemAlignment.d;
                        }
                        return ItemAlignment.c;
                    }
                    return ItemAlignment.b;
                }
                return ItemAlignment.a;
            }
            return ItemAlignment.e;
        }
        return ItemAlignment.c;
    }

    private static final int a(CLCSSpaceSize cLCSSpaceSize) {
        int i = c.f[cLCSSpaceSize.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return i != 4 ? 0 : 32;
                }
                return 24;
            }
            return 16;
        }
        return 8;
    }

    private static final HawkinsButtonType a(CLCSButtonType cLCSButtonType) {
        int i = c.h[cLCSButtonType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return HawkinsButtonType.e;
                    }
                    return HawkinsButtonType.a;
                }
                return HawkinsButtonType.d;
            }
            return HawkinsButtonType.c;
        }
        return HawkinsButtonType.b;
    }

    private static final int e(C0747Bc c0747Bc) {
        boolean i;
        List d;
        Object D;
        i = C8691duz.i(c0747Bc.b(), "space-", false, 2, null);
        if (i) {
            d = duD.d((CharSequence) c0747Bc.b(), new String[]{"-"}, false, 0, 6, (Object) null);
            D = C8576dqs.D((List<? extends Object>) d);
            String str = (String) D;
            if (str != null) {
                return Integer.parseInt(str);
            }
            return 0;
        }
        return 0;
    }

    private static final int c(AK ak) {
        boolean i;
        List d;
        Object D;
        i = C8691duz.i(ak.e(), "border-width-", false, 2, null);
        if (i) {
            d = duD.d((CharSequence) ak.e(), new String[]{"-"}, false, 0, 6, (Object) null);
            D = C8576dqs.D((List<? extends Object>) d);
            String str = (String) D;
            if (str != null) {
                return Integer.parseInt(str);
            }
            return 0;
        }
        return 0;
    }

    private static final int b(AL al) {
        boolean i;
        List d;
        Object D;
        i = C8691duz.i(al.d(), "border-radius-", false, 2, null);
        if (i) {
            d = duD.d((CharSequence) al.d(), new String[]{"-"}, false, 0, 6, (Object) null);
            D = C8576dqs.D((List<? extends Object>) d);
            String str = (String) D;
            if (str != null) {
                return Integer.parseInt(str);
            }
            return 0;
        }
        return 0;
    }

    private static final FE a(C0752Bh c0752Bh, List<? extends FE> list) {
        FE.a.c cVar;
        C0752Bh.p i;
        ArrayList arrayList;
        FE dVar;
        C0752Bh.s j;
        C0752Bh.n a;
        C0752Bh.f c2;
        String d;
        C0752Bh.q g;
        C0752Bh.v d2;
        FE iVar;
        C0752Bh.r f;
        String d3;
        Uri parse;
        FE gVar;
        C0752Bh.j e;
        C0752Bh.m b;
        List<C0752Bh.g> a2;
        C0752Bh.u o2;
        String b2;
        C0752Bh.k a3;
        C0752Bh.b c3;
        AE a4;
        AB c4;
        AB a5;
        BG e2;
        BG d4;
        C0752Bh.d d5 = c0752Bh.d();
        ArrayList arrayList2 = null;
        r1 = null;
        ArrayList arrayList3 = null;
        if (d5 == null || (a3 = d5.a()) == null || (c3 = a3.c()) == null || (a4 = c3.a()) == null) {
            cVar = null;
        } else {
            AE.e c5 = a4.c();
            String e3 = (c5 == null || (d4 = c5.d()) == null) ? null : d4.e();
            AE.c e4 = a4.e();
            String e5 = (e4 == null || (e2 = e4.e()) == null) ? null : e2.e();
            String d6 = a4.d();
            AE.b b3 = a4.b();
            FE.a.c.AbstractC0085a c6 = (b3 == null || (a5 = b3.a()) == null) ? null : c(a5);
            AE.a a6 = a4.a();
            cVar = new FE.a.c(e3, e5, d6, c6, (a6 == null || (c4 = a6.c()) == null) ? null : c(c4));
        }
        String m = c0752Bh.m();
        switch (m.hashCode()) {
            case -2022778581:
                if (m.equals("CLCSRequestScreenUpdate") && (i = c0752Bh.i()) != null) {
                    String c7 = i.c();
                    List<C0752Bh.i> a7 = i.a();
                    if (a7 != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (C0752Bh.i iVar2 : a7) {
                            FJ e6 = e(iVar2.a().d());
                            FE.n.a aVar = e6 == null ? null : new FE.n.a(e6, iVar2.d());
                            if (aVar != null) {
                                arrayList4.add(aVar);
                            }
                        }
                        arrayList = arrayList4;
                    } else {
                        arrayList = null;
                    }
                    return new FE.j(cVar, c7, arrayList, i.d(), i.b());
                }
                return null;
            case -1066450511:
                if (m.equals("CLCSDismiss")) {
                    C0752Bh.o c8 = c0752Bh.c();
                    dVar = new FE.d(cVar, c8 != null ? c8.e() : null);
                    return dVar;
                }
                return null;
            case -770044573:
                if (m.equals("CLCSLogOut")) {
                    C0752Bh.l h = c0752Bh.h();
                    dVar = new FE.h(cVar, h != null ? h.c() : null);
                    return dVar;
                }
                return null;
            case -150884559:
                if (m.equals("CLCSNavigateBack") && (j = c0752Bh.j()) != null) {
                    return new FE.f(cVar, j.e(), j.a(), j.c());
                }
                return null;
            case 292014615:
                if (!m.equals("CLCSInAppNavigation") || (a = c0752Bh.a()) == null || (c2 = a.c()) == null || (d = c2.d()) == null) {
                    return null;
                }
                return new FE.e(cVar, d);
            case 309107073:
                if (!m.equals("CLCSRecordRdidCtaConsent") || (g = c0752Bh.g()) == null || (d2 = g.d()) == null || d2.e() == null || d2.d() == null || d2.c() == null) {
                    return null;
                }
                String e7 = d2.e();
                String instant = d2.d().toString();
                C8632dsu.a(instant, "");
                iVar = new FE.i(e7, instant, d2.c().booleanValue(), cVar);
                return iVar;
            case 499318294:
                if (!m.equals("CLCSOpenWebView") || (f = c0752Bh.f()) == null || (d3 = f.d()) == null || (parse = Uri.parse(d3)) == null) {
                    return null;
                }
                Boolean e8 = c0752Bh.f().e();
                boolean booleanValue = e8 != null ? e8.booleanValue() : true;
                Boolean a8 = c0752Bh.f().a();
                gVar = new FE.g(parse, booleanValue, a8 != null ? a8.booleanValue() : true, cVar);
                return gVar;
            case 653314928:
                if (m.equals("CLCSClientDebugLogging") && (e = c0752Bh.e()) != null) {
                    return new FE.c(cVar, e.a());
                }
                return null;
            case 808123131:
                if (m.equals("CLCSClientLogging") && (b = c0752Bh.b()) != null) {
                    int i2 = c.i[b.e().ordinal()];
                    InterstitialLoggingHandler.LoggingSessionType loggingSessionType = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? InterstitialLoggingHandler.LoggingSessionType.a : InterstitialLoggingHandler.LoggingSessionType.d : InterstitialLoggingHandler.LoggingSessionType.b : InterstitialLoggingHandler.LoggingSessionType.a : InterstitialLoggingHandler.LoggingSessionType.e;
                    C0752Bh.a d7 = b.d();
                    String d8 = d7 != null ? d7.d() : null;
                    C0752Bh.a d9 = b.d();
                    String b4 = d9 != null ? d9.b() : null;
                    C0752Bh.a d10 = b.d();
                    dVar = new FE.b(cVar, loggingSessionType, d8, b4, d10 != null ? d10.a() : null);
                    return dVar;
                }
                return null;
            case 1063577702:
                if (m.equals("CLCSSendFeedback")) {
                    C0752Bh.t n = c0752Bh.n();
                    String c9 = n != null ? n.c() : null;
                    C0752Bh.t n2 = c0752Bh.n();
                    if (n2 != null && (a2 = n2.a()) != null) {
                        arrayList3 = new ArrayList();
                        for (C0752Bh.g gVar2 : a2) {
                            FJ e9 = e(gVar2.b());
                            if (e9 != null) {
                                arrayList3.add(e9);
                            }
                        }
                    }
                    gVar = new FE.o(c9, arrayList3, cVar);
                    return gVar;
                }
                return null;
            case 1065850921:
                if (m.equals("CLCSSequentialEffect")) {
                    return new FE.m(list, cVar);
                }
                return null;
            case 1618545063:
                if (!m.equals("CLCSSubmitAction") || (o2 = c0752Bh.o()) == null || (b2 = o2.b()) == null) {
                    return null;
                }
                String e10 = c0752Bh.o().e();
                List<C0752Bh.h> c10 = c0752Bh.o().c();
                if (c10 != null) {
                    ArrayList arrayList5 = new ArrayList();
                    for (C0752Bh.h hVar : c10) {
                        FJ e11 = e(hVar.e().b());
                        FE.n.a aVar2 = e11 == null ? null : new FE.n.a(e11, hVar.c());
                        if (aVar2 != null) {
                            arrayList5.add(aVar2);
                        }
                    }
                    arrayList2 = arrayList5;
                }
                iVar = new FE.n(e10, b2, arrayList2, cVar);
                return iVar;
            default:
                return null;
        }
    }

    private static final FZ d(BZ bz) {
        String a = bz.d().a();
        if (C8632dsu.c((Object) a, (Object) "CLCSStringValueCheckLength")) {
            BZ.b b = bz.d().b();
            Integer e = b != null ? b.e() : null;
            BZ.b b2 = bz.d().b();
            Integer c2 = b2 != null ? b2.c() : null;
            String e2 = bz.c().e().e();
            return new FZ.c(e, c2, e2 != null ? e2 : "");
        } else if (C8632dsu.c((Object) a, (Object) "CLCSStringValueCheckPattern")) {
            BZ.e c3 = bz.d().c();
            String str = (c3 == null || (str = c3.a()) == null) ? "" : "";
            String e3 = bz.c().e().e();
            return new FZ.d(str, e3 != null ? e3 : "");
        } else {
            return null;
        }
    }

    private static final FJ e(C0751Bg c0751Bg) {
        AI e;
        String c2 = c0751Bg.c();
        if (C8632dsu.c((Object) c2, (Object) "CLCSStringField")) {
            BU d = c0751Bg.d();
            if (d != null) {
                return b(d);
            }
        } else if (C8632dsu.c((Object) c2, (Object) "CLCSBooleanField") && (e = c0751Bg.e()) != null) {
            return b(e);
        }
        return null;
    }

    private static final C0880Gd b(BU bu) {
        List i;
        String b = bu.b();
        String c2 = bu.c();
        List<BU.e> d = bu.d();
        if (d == null) {
            i = C8569dql.i();
        } else {
            i = new ArrayList();
            for (BU.e eVar : d) {
                FZ d2 = d(eVar.c());
                if (d2 != null) {
                    i.add(d2);
                }
            }
        }
        return new C0880Gd(b, c2, i);
    }

    private static final C0873Fw b(AI ai) {
        BG e;
        String e2 = ai.e();
        Boolean b = ai.b();
        Boolean c2 = ai.c();
        boolean booleanValue = c2 != null ? c2.booleanValue() : false;
        AI.d d = ai.d();
        return new C0873Fw(e2, b, booleanValue, (d == null || (e = d.e()) == null) ? null : e.e());
    }

    public static final FE a(C0753Bi c0753Bi) {
        List list;
        List<C0753Bi.c> c2;
        List i;
        C8632dsu.c((Object) c0753Bi, "");
        C0753Bi.d e = c0753Bi.e();
        if (e == null || (c2 = e.c()) == null) {
            list = null;
        } else {
            list = new ArrayList();
            for (C0753Bi.c cVar : c2) {
                C0752Bh d = cVar.d();
                i = C8569dql.i();
                FE a = a(d, i);
                if (a != null) {
                    list.add(a);
                }
            }
        }
        C0752Bh a2 = c0753Bi.a();
        if (list == null) {
            list = C8569dql.i();
        }
        return a(a2, list);
    }

    private static final FE.a.c.AbstractC0085a c(AB ab) {
        BG c2;
        BG c3;
        BG c4;
        BG c5;
        String c6 = ab.c();
        int hashCode = c6.hashCode();
        String str = null;
        if (hashCode != -1528408016) {
            if (hashCode != -1417348885) {
                if (hashCode == 1615694238 && c6.equals("AlertDialogActionNavigateLogin")) {
                    AB.c e = ab.e();
                    if (e != null && (c5 = e.c()) != null) {
                        str = c5.e();
                    }
                    return new FE.a.c.AbstractC0085a.e(str);
                }
            } else if (c6.equals("AlertDialogActionNavigateAppStore")) {
                AB.c e2 = ab.e();
                if (e2 != null && (c4 = e2.c()) != null) {
                    str = c4.e();
                }
                return new FE.a.c.AbstractC0085a.b(str);
            }
        } else if (c6.equals("AlertDialogActionDismiss")) {
            AB.c e3 = ab.e();
            if (e3 != null && (c2 = e3.c()) != null) {
                str = c2.e();
            }
            return new FE.a.c.AbstractC0085a.C0086c(str);
        }
        AB.c e4 = ab.e();
        if (e4 != null && (c3 = e4.c()) != null) {
            str = c3.e();
        }
        return new FE.a.c.AbstractC0085a.C0086c(str);
    }

    private static final FX.b d(BR.a aVar) {
        Map d;
        FD d2;
        int d3;
        int e;
        int b;
        List<BR.b> d4 = aVar.d();
        if (d4 == null) {
            d = dqE.d();
        } else {
            d3 = C8572dqo.d(d4, 10);
            e = dqD.e(d3);
            b = C8657dts.b(e, 16);
            d = new LinkedHashMap(b);
            for (BR.b bVar : d4) {
                Pair a = dpD.a(bVar.a().g(), bVar.a());
                d.put(a.d(), a.a());
            }
        }
        AV av = (AV) d.get(aVar.a().b());
        if (av == null || (d2 = d(av, d)) == null) {
            return null;
        }
        return new FX.b(d2, aVar.e());
    }

    public static final DU b(FM fm) {
        AbstractC8997hK abstractC8997hK;
        AbstractC8997hK abstractC8997hK2;
        C8632dsu.c((Object) fm, "");
        RdidDeviceConsent c2 = fm.c();
        if (c2 == null || (abstractC8997hK = AbstractC8997hK.d.e(c(c2))) == null) {
            abstractC8997hK = AbstractC8997hK.e.c;
        }
        AbstractC8997hK abstractC8997hK3 = abstractC8997hK;
        List<FS> b = fm.b();
        if (b == null || (abstractC8997hK2 = AbstractC8997hK.d.e(d(b))) == null) {
            abstractC8997hK2 = AbstractC8997hK.e.c;
        }
        AbstractC8997hK abstractC8997hK4 = abstractC8997hK2;
        AbstractC8997hK.c cVar = AbstractC8997hK.d;
        return new DU(cVar.e(Boolean.valueOf(fm.e())), cVar.e(fm.d()), null, null, abstractC8997hK3, abstractC8997hK4, 12, null);
    }

    private static final CLCSRdidAccessState c(RdidDeviceConsent rdidDeviceConsent) {
        int i = c.j[rdidDeviceConsent.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return CLCSRdidAccessState.e;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return CLCSRdidAccessState.b;
            }
            return CLCSRdidAccessState.d;
        }
        return CLCSRdidAccessState.a;
    }

    private static final InputCopyLink a(C0764Bt c0764Bt, String str) {
        InputCopyLink.Size size;
        AS e;
        InputCopyLink.Size size2;
        BG d;
        BG c2;
        C0764Bt.b e2 = c0764Bt.e();
        FA fa = null;
        String e3 = (e2 == null || (c2 = e2.c()) == null) ? null : c2.e();
        String g = c0764Bt.g();
        String b = c0764Bt.b();
        C0764Bt.d i = c0764Bt.i();
        String e4 = (i == null || (d = i.d()) == null) ? null : d.e();
        String str2 = e4 == null ? "" : e4;
        String d2 = c0764Bt.d();
        CLCSInputSize c3 = c0764Bt.c();
        if (c3 != null) {
            int i2 = c.s[c3.ordinal()];
            if (i2 == 1) {
                size2 = InputCopyLink.Size.a;
            } else {
                size2 = i2 != 3 ? null : InputCopyLink.Size.d;
            }
            size = size2;
        } else {
            size = null;
        }
        C0764Bt.e a = c0764Bt.a();
        if (a != null && (e = a.e()) != null) {
            String uuid = UUID.randomUUID().toString();
            C8632dsu.a(uuid, "");
            fa = c(e, uuid, null, null, null, 14, null);
        }
        return new InputCopyLink(str, e3, g, b, str2, d2, size, fa);
    }

    private static final List<DY> d(List<FS> list) {
        int d;
        d = C8572dqo.d(list, 10);
        ArrayList arrayList = new ArrayList(d);
        for (FS fs : list) {
            AbstractC8997hK.c cVar = AbstractC8997hK.d;
            arrayList.add(new DY(cVar.e(fs.c()), cVar.e(Instant.b(fs.a())), cVar.e(Boolean.valueOf(fs.b()))));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0009 A[SYNTHETIC] */
    @android.annotation.SuppressLint({"LogNotNetflixLog"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.util.List<o.FI> b(java.util.List<o.BR.d> r6) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L9:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L69
            java.lang.Object r1 = r6.next()
            o.BR$d r1 = (o.BR.d) r1
            o.BR$c r2 = r1.c()
            r3 = 0
            if (r2 == 0) goto L27
            o.Bg r2 = r2.b()
            if (r2 == 0) goto L27
            o.FJ r2 = e(r2)
            goto L28
        L27:
            r2 = r3
        L28:
            com.netflix.clcs.codegen.type.CLCSFieldValueProvider r4 = r1.b()     // Catch: java.lang.IllegalArgumentException -> L37
            if (r4 == 0) goto L59
            java.lang.String r4 = r4.e()     // Catch: java.lang.IllegalArgumentException -> L37
            com.netflix.clcs.models.FieldValueProvider r1 = com.netflix.clcs.models.FieldValueProvider.valueOf(r4)     // Catch: java.lang.IllegalArgumentException -> L37
            goto L5a
        L37:
            com.netflix.clcs.codegen.type.CLCSFieldValueProvider r1 = r1.b()
            if (r1 == 0) goto L42
            java.lang.String r1 = r1.e()
            goto L43
        L42:
            r1 = r3
        L43:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "can not find value for value provider "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.String r4 = "ApolloModels"
            android.util.Log.e(r4, r1)
        L59:
            r1 = r3
        L5a:
            if (r2 == 0) goto L63
            if (r1 == 0) goto L63
            o.FI r3 = new o.FI
            r3.<init>(r2, r1)
        L63:
            if (r3 == 0) goto L9
            r0.add(r3)
            goto L9
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0871Fu.b(java.util.List):java.util.List");
    }
}

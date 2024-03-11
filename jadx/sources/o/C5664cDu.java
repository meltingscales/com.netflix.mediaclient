package o;

import android.widget.FrameLayout;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.Style;
import com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement;
import com.netflix.model.leafs.originals.interactive.template.LabelElement;
import com.netflix.model.leafs.originals.interactive.template.TriviaStreakIndicatorElement;
import io.reactivex.Observable;
import java.util.HashMap;
import java.util.Map;
import o.cIE;

/* renamed from: o.cDu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5664cDu extends AbstractC5649cDf {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long e$s69$76 = 3998885519034259257L;
    private static int f = 1;
    private static int j;
    private final FrameLayout a;
    private final TriviaStreakIndicatorElement b;
    private final String c;
    private final String e;
    private final String g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C5664cDu(io.reactivex.Observable r13, com.netflix.model.leafs.originals.interactive.InteractiveMoments r14, com.netflix.model.leafs.originals.interactive.Moment r15, android.widget.FrameLayout r16, com.netflix.model.leafs.originals.interactive.template.TriviaStreakIndicatorElement r17, java.util.Map r18, java.util.HashMap r19, float r20, o.InterfaceC9638uF r21, boolean r22, int r23, o.C8627dsp r24) {
        /*
            r12 = this;
            r0 = r23
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L1e
            int r0 = o.C5664cDu.f
            int r1 = r0 + 119
            int r2 = r1 % 128
            o.C5664cDu.j = r2
            r2 = 2
            int r1 = r1 % r2
            int r0 = r0 + 115
            int r1 = r0 % 128
            o.C5664cDu.j = r1
            int r0 = r0 % r2
            if (r0 == 0) goto L1a
            goto L1b
        L1a:
            int r2 = r2 % r2
        L1b:
            r0 = 0
            r11 = r0
            goto L20
        L1e:
            r11 = r22
        L20:
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5664cDu.<init>(io.reactivex.Observable, com.netflix.model.leafs.originals.interactive.InteractiveMoments, com.netflix.model.leafs.originals.interactive.Moment, android.widget.FrameLayout, com.netflix.model.leafs.originals.interactive.template.TriviaStreakIndicatorElement, java.util.Map, java.util.HashMap, float, o.uF, boolean, int, o.dsp):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5664cDu(Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, Moment moment, FrameLayout frameLayout, TriviaStreakIndicatorElement triviaStreakIndicatorElement, Map<String, ? extends Style> map, HashMap<String, Image> hashMap, float f2, InterfaceC9638uF interfaceC9638uF, boolean z) {
        super(observable, interactiveMoments, moment, map, hashMap, f2, interfaceC9638uF, z);
        LabelElement label;
        C1204Sr c1204Sr;
        BackgroundImageElement background;
        C5640cCx c5640cCx;
        String str;
        cIA cia;
        int i;
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interactiveMoments, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) frameLayout, "");
        C8632dsu.c((Object) triviaStreakIndicatorElement, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) hashMap, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        this.a = frameLayout;
        this.b = triviaStreakIndicatorElement;
        this.e = "";
        Object[] objArr = new Object[1];
        q(1, new char[]{47937, 41207, 33466, 47984, 12554}, objArr);
        this.c = ((String) objArr[0]).intern();
        this.g = "2";
        frameLayout.setTag(triviaStreakIndicatorElement.id());
        AbstractC5649cDf.a(this, frameLayout, triviaStreakIndicatorElement, null, null, 12, null);
        TriviaStreakIndicatorElement.StreakContainerElementChildren children = triviaStreakIndicatorElement.children();
        if (children != null && (background = children.background(interactiveMoments)) != null && (c5640cCx = (C5640cCx) frameLayout.findViewById(cIE.b.s)) != null) {
            int i2 = j + 73;
            f = i2 % 128;
            if (i2 % 2 == 0) {
                C8632dsu.d(c5640cCx);
                str = null;
                cia = null;
                i = 96;
            } else {
                C8632dsu.d(c5640cCx);
                str = null;
                cia = null;
                i = 12;
            }
            AbstractC5649cDf.a(this, c5640cCx, background, str, cia, i, null);
        }
        TriviaStreakIndicatorElement.StreakContainerElementChildren children2 = triviaStreakIndicatorElement.children();
        if (children2 == null || (label = children2.label(interactiveMoments)) == null || (c1204Sr = (C1204Sr) frameLayout.findViewById(cIE.b.L)) == null) {
            return;
        }
        int i3 = f + 83;
        j = i3 % 128;
        int i4 = i3 % 2;
        C8632dsu.d(c1204Sr);
        AbstractC5649cDf.a(this, c1204Sr, label, null, null, 12, null);
        c1204Sr.setText(c(label.id()));
        int i5 = j + 41;
        f = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        int i6 = 2 % 2;
    }

    @Override // o.AbstractC5649cDf
    public void e(int i) {
        int i2 = 2 % 2;
        int i3 = f + 95;
        j = i3 % 128;
        int i4 = i3 % 2;
        super.e(i);
        Object obj = null;
        d(this, false, 1, null);
        int i5 = j + 45;
        f = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.AbstractC5649cDf
    public void a(int i) {
        int i2 = 2 % 2;
        int i3 = f + 9;
        j = i3 % 128;
        int i4 = i3 % 2;
        super.a(i);
        c(false);
    }

    static /* synthetic */ void d(C5664cDu c5664cDu, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = f + 11;
        j = i3 % 128;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i | 1) != 0) {
            z = true;
        }
        c5664cDu.c(z);
        int i4 = j + 11;
        f = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c(boolean r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5664cDu.c(boolean):void");
    }

    private static void q(int i, char[] cArr, Object[] objArr) {
        int i2 = 2 % 2;
        C9586sT c9586sT = new C9586sT();
        char[] b = C9586sT.b(e$s69$76 ^ 7567248728798573470L, cArr, i);
        c9586sT.d = 4;
        int i3 = $11 + 93;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (c9586sT.d < b.length) {
            c9586sT.b = c9586sT.d - 4;
            b[c9586sT.d] = (char) ((b[c9586sT.d] ^ b[c9586sT.d % 4]) ^ (c9586sT.b * (e$s69$76 ^ 7567248728798573470L)));
            c9586sT.d++;
        }
        String str = new String(b, 4, b.length - 4);
        int i5 = $10 + 23;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }
}

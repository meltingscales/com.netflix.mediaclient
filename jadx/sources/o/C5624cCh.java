package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import o.C1204Sr;
import o.C5624cCh;
import o.C5640cCx;
import o.cIE;

/* renamed from: o.cCh  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5624cCh extends FrameLayout {
    private final InterfaceC8554dpx a;
    private final InterfaceC8554dpx b;
    private final InterfaceC8554dpx c;
    private final InterfaceC8554dpx d;
    private final InterfaceC8554dpx e;
    private final InterfaceC8554dpx f;
    private final InterfaceC8554dpx i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5624cCh(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5624cCh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ C5624cCh(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5624cCh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        InterfaceC8554dpx b;
        InterfaceC8554dpx b2;
        InterfaceC8554dpx b3;
        InterfaceC8554dpx b4;
        InterfaceC8554dpx b5;
        InterfaceC8554dpx b6;
        InterfaceC8554dpx b7;
        C8632dsu.c((Object) context, "");
        b = dpB.b(new drO<C1204Sr>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveStandardButtonLayout$debugOverlay$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final C1204Sr invoke() {
                C1204Sr c1204Sr = (C1204Sr) C5624cCh.this.findViewById(cIE.b.n);
                c1204Sr.setVisibility(0);
                return c1204Sr;
            }
        });
        this.c = b;
        b2 = dpB.b(new drO<View>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveStandardButtonLayout$underline$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final View invoke() {
                View findViewById = C5624cCh.this.findViewById(cIE.b.k);
                findViewById.setVisibility(0);
                return findViewById;
            }
        });
        this.i = b2;
        b3 = dpB.b(new drO<FrameLayout>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveStandardButtonLayout$imageContainer$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final FrameLayout invoke() {
                return (FrameLayout) C5624cCh.this.findViewById(cIE.b.m);
            }
        });
        this.d = b3;
        b4 = dpB.b(new drO<C5640cCx>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveStandardButtonLayout$icon$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final C5640cCx invoke() {
                C5640cCx c5640cCx = (C5640cCx) C5624cCh.this.findViewById(cIE.b.f13666o);
                c5640cCx.setVisibility(0);
                return c5640cCx;
            }
        });
        this.e = b4;
        b5 = dpB.b(new drO<C1204Sr>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveStandardButtonLayout$textView$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final C1204Sr invoke() {
                return (C1204Sr) C5624cCh.this.findViewById(cIE.b.l);
            }
        });
        this.f = b5;
        b6 = dpB.b(new drO<C5640cCx>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveStandardButtonLayout$backgroundImage$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final C5640cCx invoke() {
                return (C5640cCx) C5624cCh.this.findViewById(cIE.b.i);
            }
        });
        this.b = b6;
        b7 = dpB.b(new drO<C5640cCx>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveStandardButtonLayout$accessoryView$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final C5640cCx invoke() {
                C5640cCx c5640cCx = (C5640cCx) C5624cCh.this.findViewById(cIE.b.j);
                c5640cCx.setVisibility(0);
                return c5640cCx;
            }
        });
        this.a = b7;
    }

    public final C1204Sr e() {
        Object value = this.c.getValue();
        C8632dsu.a(value, "");
        return (C1204Sr) value;
    }

    public final View j() {
        Object value = this.i.getValue();
        C8632dsu.a(value, "");
        return (View) value;
    }

    public final FrameLayout a() {
        Object value = this.d.getValue();
        C8632dsu.a(value, "");
        return (FrameLayout) value;
    }

    public final C5640cCx d() {
        Object value = this.e.getValue();
        C8632dsu.a(value, "");
        return (C5640cCx) value;
    }

    public final C1204Sr h() {
        Object value = this.f.getValue();
        C8632dsu.a(value, "");
        return (C1204Sr) value;
    }

    public final C5640cCx c() {
        Object value = this.b.getValue();
        C8632dsu.a(value, "");
        return (C5640cCx) value;
    }

    public final C5640cCx b() {
        Object value = this.a.getValue();
        C8632dsu.a(value, "");
        return (C5640cCx) value;
    }
}

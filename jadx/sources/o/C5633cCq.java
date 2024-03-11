package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C1204Sr;
import o.C5633cCq;
import o.C5640cCx;
import o.cIE;

/* renamed from: o.cCq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5633cCq extends FrameLayout {
    private final InterfaceC8554dpx a;
    private final InterfaceC8554dpx b;
    private final InterfaceC8554dpx c;
    private final InterfaceC8554dpx d;
    private final InterfaceC8554dpx e;
    private final InterfaceC8554dpx f;
    private final InterfaceC8554dpx h;
    private final InterfaceC8554dpx i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5633cCq(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5633cCq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ C5633cCq(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5633cCq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        InterfaceC8554dpx b;
        InterfaceC8554dpx b2;
        InterfaceC8554dpx b3;
        InterfaceC8554dpx b4;
        InterfaceC8554dpx b5;
        InterfaceC8554dpx b6;
        InterfaceC8554dpx b7;
        InterfaceC8554dpx b8;
        C8632dsu.c((Object) context, "");
        setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: o.cCq.4
            @Override // android.view.View.AccessibilityDelegate
            public void sendAccessibilityEvent(View view, int i2) {
                C8632dsu.c((Object) view, "");
                if (C8632dsu.c(view, C5633cCq.this) && i2 == 8) {
                    C5633cCq.this.b().sendAccessibilityEvent(8);
                } else {
                    super.sendAccessibilityEvent(view, i2);
                }
            }
        });
        b = dpB.b(new drO<C1204Sr>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveTooltipLayout$debugOverlay$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final C1204Sr invoke() {
                C1204Sr c1204Sr = (C1204Sr) C5633cCq.this.findViewById(cIE.b.n);
                c1204Sr.setVisibility(0);
                return c1204Sr;
            }
        });
        this.e = b;
        b2 = dpB.b(new drO<FrameLayout>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveTooltipLayout$imageContainer$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final FrameLayout invoke() {
                return (FrameLayout) C5633cCq.this.findViewById(cIE.b.m);
            }
        });
        this.a = b2;
        b3 = dpB.b(new drO<C5640cCx>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveTooltipLayout$backgroundImage$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final C5640cCx invoke() {
                C5640cCx c5640cCx = (C5640cCx) C5633cCq.this.findViewById(cIE.b.i);
                c5640cCx.setVisibility(0);
                return c5640cCx;
            }
        });
        this.c = b3;
        b4 = dpB.b(new drO<FrameLayout>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveTooltipLayout$tooltip$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final FrameLayout invoke() {
                return (FrameLayout) C5633cCq.this.findViewById(cIE.b.bZ);
            }
        });
        this.h = b4;
        b5 = dpB.b(new drO<C1204Sr>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveTooltipLayout$label$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final C1204Sr invoke() {
                return (C1204Sr) C5633cCq.this.findViewById(cIE.b.cd);
            }
        });
        this.b = b5;
        b6 = dpB.b(new drO<C1204Sr>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveTooltipLayout$subtitle$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final C1204Sr invoke() {
                return (C1204Sr) C5633cCq.this.findViewById(cIE.b.ca);
            }
        });
        this.i = b6;
        b7 = dpB.b(new drO<NetflixImageView>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveTooltipLayout$preview$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final NetflixImageView invoke() {
                return (NetflixImageView) C5633cCq.this.findViewById(cIE.b.cb);
            }
        });
        this.d = b7;
        b8 = dpB.b(new drO<NetflixImageView>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveTooltipLayout$top$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final NetflixImageView invoke() {
                return (NetflixImageView) C5633cCq.this.findViewById(cIE.b.ce);
            }
        });
        this.f = b8;
    }

    public final C1204Sr a() {
        Object value = this.e.getValue();
        C8632dsu.a(value, "");
        return (C1204Sr) value;
    }

    public final FrameLayout d() {
        Object value = this.a.getValue();
        C8632dsu.a(value, "");
        return (FrameLayout) value;
    }

    public final C5640cCx b() {
        Object value = this.c.getValue();
        C8632dsu.a(value, "");
        return (C5640cCx) value;
    }

    public final FrameLayout j() {
        Object value = this.h.getValue();
        C8632dsu.a(value, "");
        return (FrameLayout) value;
    }

    public final C1204Sr c() {
        Object value = this.b.getValue();
        C8632dsu.a(value, "");
        return (C1204Sr) value;
    }

    public final C1204Sr h() {
        Object value = this.i.getValue();
        C8632dsu.a(value, "");
        return (C1204Sr) value;
    }

    public final NetflixImageView e() {
        Object value = this.d.getValue();
        C8632dsu.a(value, "");
        return (NetflixImageView) value;
    }

    public final NetflixImageView i() {
        Object value = this.f.getValue();
        C8632dsu.a(value, "");
        return (NetflixImageView) value;
    }
}

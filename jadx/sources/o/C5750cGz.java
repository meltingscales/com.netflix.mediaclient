package o;

import android.view.ViewGroup;
import o.C5750cGz;

/* renamed from: o.cGz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5750cGz extends AbstractC5765cHn implements cFQ {
    private final ViewGroup c;
    private final InterfaceC8554dpx e;

    @Override // o.AbstractC9944zY
    /* renamed from: i */
    public ViewGroup e() {
        return this.c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5750cGz(ViewGroup viewGroup) {
        super(viewGroup);
        InterfaceC8554dpx b;
        C8632dsu.c((Object) viewGroup, "");
        this.c = viewGroup;
        b = dpB.b(new drO<Integer>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PlayerLegacyAndroidViewsContainerUIView$containerId$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final Integer invoke() {
                return Integer.valueOf(C5750cGz.this.e().getId());
            }
        });
        this.e = b;
        g();
    }

    @Override // o.AbstractC5765cHn
    public int bI_() {
        return ((Number) this.e.getValue()).intValue();
    }

    @Override // o.cFQ
    public void j() {
        e().setEnabled(false);
        e().setVisibility(4);
    }

    @Override // o.cFQ
    public void g() {
        e().setEnabled(true);
        e().setVisibility(0);
    }
}

package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.DisplayCutoutCompat;
import com.netflix.mediaclient.util.AccessibilityUtils;
import o.C5733cGi;
import o.cBO;
import o.cBQ;
import o.cIE;
import o.dpR;

/* renamed from: o.cGi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5733cGi extends cGC {
    private final View d;

    @Override // o.AbstractC9944zY
    public View e() {
        return this.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5733cGi(ViewGroup viewGroup) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.s, viewGroup, false);
        C8632dsu.d(inflate);
        this.d = inflate;
        viewGroup.addView(e());
        e().setOnClickListener(new View.OnClickListener() { // from class: o.cGk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5733cGi.b(C5733cGi.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C5733cGi c5733cGi, View view) {
        C8632dsu.c((Object) c5733cGi, "");
        c5733cGi.b((C5733cGi) c5733cGi.g());
    }

    public cBO g() {
        return cBO.C5567c.c;
    }

    @Override // o.cGC, o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        e().setContentDescription(e().getResources().getString(com.netflix.mediaclient.ui.R.o.D));
        if (AccessibilityUtils.a(e().getContext())) {
            AbstractC5765cHn.a(this, true, false, 0.0f, false, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PlayerBackUIView$show$1
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    b();
                    return dpR.c;
                }

                public final void b() {
                    C5733cGi.this.e().sendAccessibilityEvent(8);
                    C5733cGi.this.b((C5733cGi) cBQ.k.e);
                }
            }, 12, null);
        } else {
            AbstractC5765cHn.a(this, true, false, 0.0f, false, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PlayerBackUIView$show$2
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    d();
                    return dpR.c;
                }

                public final void d() {
                    C5733cGi.this.b((C5733cGi) cBQ.k.e);
                }
            }, 12, null);
        }
    }

    @Override // o.cGC, o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        AbstractC5765cHn.a(this, false, false, 0.0f, false, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PlayerBackUIView$hide$1
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                b();
                return dpR.c;
            }

            public final void b() {
                C5733cGi.this.b((C5733cGi) cBQ.n.c);
            }
        }, 12, null);
    }

    @Override // o.AbstractC9944zY
    public void b(DisplayCutoutCompat displayCutoutCompat) {
        C8632dsu.c((Object) displayCutoutCompat, "");
        e().setTranslationX(displayCutoutCompat.getSafeInsetLeft());
    }
}

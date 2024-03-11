package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.SkipAheadCommand;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.ui.player.v2.SkipCreditsType;
import o.C5753cHb;
import o.cBO;
import o.cBQ;
import o.cIE;

/* renamed from: o.cHb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5753cHb extends AbstractC5765cHn implements InterfaceC5725cGa {
    private final View a;
    private SkipCreditsType b;
    private final RS c;
    private int d;
    private final InterfaceC8554dpx e;

    /* renamed from: o.cHb$b */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SkipCreditsType.values().length];
            try {
                iArr[SkipCreditsType.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SkipCreditsType.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SkipCreditsType.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    @Override // o.InterfaceC5725cGa
    public void a(int i) {
        this.d = i;
    }

    @Override // o.InterfaceC5725cGa
    public void a(SkipCreditsType skipCreditsType) {
        C8632dsu.c((Object) skipCreditsType, "");
        this.b = skipCreditsType;
    }

    @Override // o.AbstractC9944zY
    /* renamed from: g */
    public RS e() {
        return this.c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5753cHb(ViewGroup viewGroup) {
        super(viewGroup);
        InterfaceC8554dpx b2;
        C8632dsu.c((Object) viewGroup, "");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.u, viewGroup, true);
        C8632dsu.a(inflate, "");
        this.a = inflate;
        View findViewById = inflate.findViewById(cIE.b.bC);
        C8632dsu.a(findViewById, "");
        this.c = (RS) findViewById;
        this.b = SkipCreditsType.c;
        b2 = dpB.b(new drO<Integer>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PlayerSkipCreditsUIView$containerId$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final Integer invoke() {
                return Integer.valueOf(C5753cHb.this.e().getId());
            }
        });
        this.e = b2;
        e().setOnClickListener(new View.OnClickListener() { // from class: o.cHe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5753cHb.e(C5753cHb.this, view);
            }
        });
    }

    @Override // o.AbstractC5765cHn
    public int bI_() {
        return ((Number) this.e.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C5753cHb c5753cHb, View view) {
        C8632dsu.c((Object) c5753cHb, "");
        int i = b.a[c5753cHb.b.ordinal()];
        if (i == 1) {
            c5753cHb.b((C5753cHb) cBO.J.b);
            c5753cHb.e().e(true);
        } else if (i == 2) {
            c5753cHb.b((C5753cHb) cBO.L.b);
            c5753cHb.e().e(true);
        } else if (i != 3) {
        } else {
            c5753cHb.b((C5753cHb) new cBO.K(c5753cHb.d));
            CLv2Utils.INSTANCE.e(new Focus(AppView.skipContentButton, null), new SkipAheadCommand());
            c5753cHb.e().e(true);
        }
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        b((C5753cHb) cBO.M.c);
        e().c(true);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        e().e(true);
    }

    @Override // o.InterfaceC5725cGa
    public void b(int i) {
        e().setText(i);
    }

    @Override // o.InterfaceC5725cGa
    public void b(CharSequence charSequence) {
        C8632dsu.c((Object) charSequence, "");
        e().setText(charSequence);
    }

    @Override // o.InterfaceC5725cGa
    public void b(boolean z) {
        if (e().a()) {
            e().e(z);
            b((C5753cHb) cBQ.i.c);
        }
    }

    @Override // o.InterfaceC5725cGa
    public void e(boolean z) {
        if (e().a()) {
            return;
        }
        e().c(z);
        b((C5753cHb) new cBQ.j(this.b));
    }

    @Override // o.InterfaceC5725cGa
    public void j() {
        e().setVisibility(8);
    }
}

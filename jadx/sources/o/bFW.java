package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import com.netflix.mediaclient.ui.details.uiView.ISeasonsSelectionUIView;
import com.netflix.mediaclient.util.ViewUtils;
import io.reactivex.Observable;
import o.AbstractC3652bFu;
import o.C9834xU;
import o.bFW;

/* loaded from: classes4.dex */
public class bFW extends AbstractC9944zY<AbstractC3652bFu> implements ISeasonsSelectionUIView {
    private final C7491cxH a;
    private final InterfaceC8554dpx c;
    private final InterfaceC8554dpx d;
    private final View f;
    private final Observable<AbstractC3652bFu> g;
    private final ViewGroup h;
    private final C9935zP i;
    private final ISeasonsSelectionUIView.DisplayMode j;
    private final C1204Sr m;
    public static final a e = new a(null);
    private static final ActionBar.LayoutParams b = new ActionBar.LayoutParams(-2, -2, 8388627);

    @Override // o.AbstractC9944zY
    public /* bridge */ /* synthetic */ View e() {
        return this.m;
    }

    public int g() {
        return com.netflix.mediaclient.ui.R.i.bm;
    }

    public final ViewGroup h() {
        return this.h;
    }

    @Override // com.netflix.mediaclient.ui.details.uiView.ISeasonsSelectionUIView
    public ISeasonsSelectionUIView.DisplayMode i() {
        return this.j;
    }

    public final C1204Sr j() {
        return this.m;
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public Observable<AbstractC3652bFu> v() {
        return this.g;
    }

    public /* synthetic */ bFW(ViewGroup viewGroup, C9935zP c9935zP, ISeasonsSelectionUIView.DisplayMode displayMode, int i, C8627dsp c8627dsp) {
        this(viewGroup, (i & 2) != 0 ? null : c9935zP, (i & 4) != 0 ? ISeasonsSelectionUIView.DisplayMode.d : displayMode);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bFW(ViewGroup viewGroup, C9935zP c9935zP, ISeasonsSelectionUIView.DisplayMode displayMode) {
        super(viewGroup);
        View e2;
        C1204Sr c1204Sr;
        InterfaceC8554dpx b2;
        Observable<AbstractC3652bFu> v;
        InterfaceC8554dpx b3;
        C8632dsu.c((Object) viewGroup, "");
        C8632dsu.c((Object) displayMode, "");
        this.h = viewGroup;
        this.i = c9935zP;
        this.j = displayMode;
        this.a = new C7491cxH();
        ISeasonsSelectionUIView.DisplayMode displayMode2 = ISeasonsSelectionUIView.DisplayMode.e;
        if (displayMode == displayMode2) {
            e2 = LayoutInflater.from(viewGroup.getContext()).inflate(com.netflix.mediaclient.ui.R.i.bo, viewGroup, false);
            C8632dsu.a(e2, "");
        } else {
            e2 = C9703vR.e(viewGroup, g(), 0, 2, null);
        }
        this.f = e2;
        if (displayMode == displayMode2) {
            C8632dsu.d(e2);
            c1204Sr = (C1204Sr) e2;
        } else {
            View findViewById = e2.findViewById(com.netflix.mediaclient.ui.R.g.ft);
            C8632dsu.a(findViewById, "");
            c1204Sr = (C1204Sr) findViewById;
        }
        this.m = c1204Sr;
        b2 = dpB.b(new drO<Integer>() { // from class: com.netflix.mediaclient.ui.details.uiView.SeasonsSelectionUIView$containerId$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final Integer invoke() {
                return Integer.valueOf(bFW.this.j().getId());
            }
        });
        this.d = b2;
        this.g = (c9935zP == null || (v = c9935zP.d(AbstractC3652bFu.class)) == null) ? super.v() : v;
        b3 = dpB.b(new drO<Drawable>() { // from class: com.netflix.mediaclient.ui.details.uiView.SeasonsSelectionUIView$caret$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final Drawable invoke() {
                return bFW.this.h().getContext().getResources().getDrawable(C9834xU.j.B, bFW.this.h().getContext().getTheme());
            }
        });
        this.c = b3;
        c1204Sr.setOnClickListener(new View.OnClickListener() { // from class: o.bFY
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bFW.a(bFW.this, view);
            }
        });
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    private final Drawable f() {
        Object value = this.c.getValue();
        C8632dsu.a(value, "");
        return (Drawable) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(bFW bfw, View view) {
        dpR dpr;
        C8632dsu.c((Object) bfw, "");
        C9935zP c9935zP = bfw.i;
        if (c9935zP != null) {
            c9935zP.b(AbstractC3652bFu.class, new AbstractC3652bFu.c());
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            bfw.b((bFW) new AbstractC3652bFu.c());
        }
    }

    @Override // com.netflix.mediaclient.ui.details.uiView.ISeasonsSelectionUIView
    public void d(String str) {
        C8632dsu.c((Object) str, "");
        this.m.setText(str);
    }

    @Override // com.netflix.mediaclient.ui.details.uiView.ISeasonsSelectionUIView
    public void b(C1234Tv c1234Tv) {
        C1204Sr c1204Sr = this.m;
        if (c1234Tv == null || c1204Sr.getVisibility() != 0) {
            return;
        }
        Context context = c1204Sr.getContext();
        C8632dsu.a(context, "");
        DialogC1237Ty dialogC1237Ty = new DialogC1237Ty(context, c1234Tv, null, false, null, 24, null);
        Window window = dialogC1237Ty.getWindow();
        if (window != null) {
            C8150deu.a(window, 2);
        }
        dialogC1237Ty.show();
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        if (this.j == ISeasonsSelectionUIView.DisplayMode.e) {
            C7491cxH.a(this.a, this.m, true, null, 4, null);
        } else {
            this.m.setVisibility(0);
        }
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        if (this.j == ISeasonsSelectionUIView.DisplayMode.e) {
            C7491cxH.a(this.a, this.m, false, null, 4, null);
        } else {
            this.m.setVisibility(8);
        }
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void d() {
        C1204Sr c1204Sr = this.m;
        c1204Sr.setEnabled(true);
        ViewUtils.d(f(), c1204Sr.getTextColors().getDefaultColor());
        c1204Sr.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, f(), (Drawable) null);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void b() {
        this.m.setEnabled(false);
        this.m.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // com.netflix.mediaclient.ui.details.uiView.ISeasonsSelectionUIView
    public void a(int i) {
        dpR dpr;
        if (this.m.getVisibility() == 0) {
            C9935zP c9935zP = this.i;
            if (c9935zP != null) {
                c9935zP.b(AbstractC3652bFu.class, new AbstractC3652bFu.a(i, this.j == ISeasonsSelectionUIView.DisplayMode.e));
                dpr = dpR.c;
            } else {
                dpr = null;
            }
            if (dpr == null) {
                b((bFW) new AbstractC3652bFu.a(i, this.j == ISeasonsSelectionUIView.DisplayMode.e));
            }
        }
    }
}

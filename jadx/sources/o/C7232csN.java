package o;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.app.ActionBar;
import androidx.core.content.ContextCompat;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import o.C1026Lt;
import o.C7373cuw;

/* renamed from: o.csN  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7232csN extends C7263css {
    private C7292ctU a;
    private final InterfaceC7221csC b;
    private ImageView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7232csN(NetflixActivity netflixActivity, InterfaceC7221csC interfaceC7221csC) {
        super(netflixActivity);
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) interfaceC7221csC, "");
        this.b = interfaceC7221csC;
    }

    @Override // o.C7263css
    public void c(boolean z) {
        ImageView imageView = this.c;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(z ? 0 : 8);
    }

    @Override // o.C7263css
    public void a(NetflixActionBar.b.C0051b c0051b) {
        C8632dsu.c((Object) c0051b, "");
        if (this.a == null) {
            this.a = g();
        }
        String d = d();
        if (d == null) {
            c0051b.l(false).b(NetflixActionBar.LogoType.e).b(true);
        } else {
            c0051b.l(true).e((CharSequence) d);
        }
        c0051b.c(a()).f(true).a(new ActionBar.LayoutParams(-1, -1, 16));
        C7292ctU c7292ctU = this.a;
        if (c7292ctU != null) {
            c7292ctU.b();
        }
    }

    private final C7292ctU g() {
        boolean a = this.b.a();
        boolean d = this.b.d();
        if (a || d) {
            e(LayoutInflater.from(c()).inflate(a ? C7373cuw.b.k : C7373cuw.b.l, (ViewGroup) null));
            a(a());
            View a2 = a();
            if (a2 != null) {
                return (C7292ctU) a2.findViewById(C7373cuw.c.M);
            }
            return null;
        }
        return null;
    }

    private final void a(View view) {
        this.c = view != null ? (ImageView) view.findViewById(C7373cuw.c.q) : null;
        Drawable drawable = ContextCompat.getDrawable(c(), C1026Lt.a.CV);
        if (drawable != null) {
            Drawable e = BrowseExperience.e(drawable, c(), com.netflix.mediaclient.ui.R.a.c);
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setImageDrawable(e);
            }
        }
        ImageView imageView2 = this.c;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: o.csK
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C7232csN.b(C7232csN.this, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C7232csN c7232csN, View view) {
        C8632dsu.c((Object) c7232csN, "");
        c7232csN.e().onNext(dpR.c);
    }
}

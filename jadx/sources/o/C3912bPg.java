package o;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import o.C3912bPg;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.bPg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3912bPg extends bMW {
    public static final b e = new b(null);
    private C3915bPj b;
    private InterfaceC5185btw d;

    @Override // o.InterfaceC8894fN
    public void e() {
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    /* renamed from: o.bPg$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("GameRatingsDialogFrag");
        }

        @SuppressLint({"CheckResult"})
        public final void c(NetflixActivity netflixActivity, InterfaceC5185btw interfaceC5185btw) {
            C8632dsu.c((Object) netflixActivity, "");
            C8632dsu.c((Object) interfaceC5185btw, "");
            C3912bPg c3912bPg = new C3912bPg();
            c3912bPg.d = interfaceC5185btw;
            netflixActivity.showFullScreenDialog(c3912bPg);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        NetflixActivity requireNetflixActivity = requireNetflixActivity();
        C8632dsu.a(requireNetflixActivity, "");
        InterfaceC5185btw interfaceC5185btw = this.d;
        if (interfaceC5185btw == null) {
            C8632dsu.d("");
            interfaceC5185btw = null;
        }
        C3915bPj c3915bPj = new C3915bPj(requireNetflixActivity, interfaceC5185btw, new drM<View, dpR>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.GameMetadataDialogFrag$onCreateView$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(View view) {
                d(view);
                return dpR.c;
            }

            public final void d(View view) {
                C8632dsu.c((Object) view, "");
                C3912bPg.this.dismiss();
            }
        });
        this.b = c3915bPj;
        c3915bPj.open();
        C3915bPj c3915bPj2 = this.b;
        if (c3915bPj2 == null) {
            C8632dsu.d("");
            return null;
        }
        return c3915bPj2;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag
    public boolean handleBackPressed() {
        dismiss();
        return true;
    }
}

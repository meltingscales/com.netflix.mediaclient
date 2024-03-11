package o;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.cardview.widget.CardView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;

/* loaded from: classes4.dex */
public final class bQI extends NetflixDialogFrag {
    public static final e c = new e(null);
    private Long a;
    private bOV d;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(TabLayout.Tab tab, int i) {
        C8632dsu.c((Object) tab, "");
    }

    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    private final bOV b() {
        bOV bov = this.d;
        C8632dsu.d(bov);
        return bov;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        C8632dsu.c((Object) layoutInflater, "");
        this.d = bOV.e(layoutInflater, viewGroup, false);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        CardView a = b().a();
        C8632dsu.a(a, "");
        return a;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        bQH bqh = new bQH(this);
        final ViewPager2 viewPager2 = b().a;
        C8632dsu.a(viewPager2, "");
        C1203Sq c1203Sq = b().g;
        C8632dsu.a(c1203Sq, "");
        C1203Sq c1203Sq2 = b().b;
        C8632dsu.a(c1203Sq2, "");
        C1203Sq c1203Sq3 = b().e;
        C8632dsu.a(c1203Sq3, "");
        C1193Sg c1193Sg = b().d;
        C8632dsu.a(c1193Sg, "");
        viewPager2.setAdapter(bqh);
        viewPager2.registerOnPageChangeCallback(new d());
        c1203Sq.setOnClickListener(new View.OnClickListener() { // from class: o.bQJ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                bQI.b(ViewPager2.this, view2);
            }
        });
        c1203Sq.setClickable(true);
        c1203Sq2.setOnClickListener(new View.OnClickListener() { // from class: o.bQN
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                bQI.a(ViewPager2.this, view2);
            }
        });
        c1203Sq2.setClickable(true);
        c1203Sq3.setOnClickListener(new View.OnClickListener() { // from class: o.bQM
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                bQI.c(bQI.this, view2);
            }
        });
        c1203Sq3.setClickable(true);
        c1193Sg.setOnClickListener(new View.OnClickListener() { // from class: o.bQL
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                bQI.a(bQI.this, view2);
            }
        });
        c1193Sg.setClickable(true);
        new TabLayoutMediator(b().c, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.bQK
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                bQI.e(tab, i);
            }
        }).attach();
    }

    /* loaded from: classes4.dex */
    public static final class d extends ViewPager2.OnPageChangeCallback {
        d() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            bQI.this.c(i);
            C1044Mm.e("InterstitialDialogFragment_TAG", "onPageSelected: pso = " + i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ViewPager2 viewPager2, View view) {
        C8632dsu.c((Object) viewPager2, "");
        viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ViewPager2 viewPager2, View view) {
        C8632dsu.c((Object) viewPager2, "");
        viewPager2.setCurrentItem(viewPager2.getCurrentItem() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(bQI bqi, View view) {
        C8632dsu.c((Object) bqi, "");
        bqi.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(bQI bqi, View view) {
        C8632dsu.c((Object) bqi, "");
        bqi.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(int i) {
        AppView appView;
        C1203Sq c1203Sq = b().g;
        C8632dsu.a(c1203Sq, "");
        C1203Sq c1203Sq2 = b().b;
        C8632dsu.a(c1203Sq2, "");
        C1203Sq c1203Sq3 = b().e;
        C8632dsu.a(c1203Sq3, "");
        if (i == 0) {
            c1203Sq2.setVisibility(4);
            c1203Sq.setVisibility(0);
            c1203Sq3.setVisibility(8);
            appView = AppView.publicHandleEdModalDescription;
        } else if (i == 1) {
            c1203Sq2.setVisibility(0);
            c1203Sq.setVisibility(0);
            c1203Sq3.setVisibility(8);
            appView = AppView.publicHandleEdModalSocial;
        } else if (i != 2) {
            appView = null;
        } else {
            c1203Sq2.setVisibility(0);
            c1203Sq.setVisibility(8);
            c1203Sq3.setVisibility(0);
            appView = AppView.publicHandleEdModalLeaderboard;
        }
        a(appView);
    }

    private final void a(AppView appView) {
        a();
        if (appView != null) {
            Long startSession = Logger.INSTANCE.startSession(new Presentation(appView, null));
            this.a = startSession;
            C1044Mm.e("InterstitialDialogFragment_TAG", "startPresentationSession(" + startSession + "): appView = " + appView);
        }
    }

    private final void a() {
        Long l = this.a;
        if (l != null) {
            Logger.INSTANCE.endSession(l);
            Long l2 = this.a;
            C1044Mm.e("InterstitialDialogFragment_TAG", "endPresentationSession: (" + l2 + ")");
            this.a = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        C1044Mm.e("InterstitialDialogFragment_TAG", "onStart: InterstitialDialogFragment_TAG");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        C1044Mm.e("InterstitialDialogFragment_TAG", "onStop: InterstitialDialogFragment_TAG");
        a();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.d = null;
    }
}

package com.netflix.mediaclient.ui.common.episodes.list;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.common.episodes.list.EpisodesListSelectorDialogFragment;
import com.netflix.mediaclient.util.ViewUtils;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.subjects.PublishSubject;
import javax.inject.Inject;
import o.AbstractC3646bFo;
import o.C1045Mp;
import o.C3622bEr;
import o.C8627dsp;
import o.C8632dsu;
import o.C9726vo;
import o.C9935zP;
import o.InterfaceC3619bEo;
import o.bEC;
import o.bED;
import o.bEF;
import o.bEH;
import o.bEI;
import o.bEL;
import o.bFZ;
import o.dpR;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class EpisodesListSelectorDialogFragment extends bEC<AbstractC3646bFo> {
    public static final c a = new c(null);
    private bEI b;
    private C3622bEr d;
    @Inject
    public InterfaceC3619bEo episodesListRepositoryFactory;
    private bEH f;
    private final C9935zP h = C9935zP.b.d(this);

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("EpisodesListSelectorDialogFragment");
        }

        public final EpisodesListSelectorDialogFragment d(String str, String str2, long j, bEH beh) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            EpisodesListSelectorDialogFragment episodesListSelectorDialogFragment = new EpisodesListSelectorDialogFragment();
            episodesListSelectorDialogFragment.setStyle(2, R.l.m);
            Bundle bundle = new Bundle();
            bundle.putString(NetflixActivity.EXTRA_VIDEO_ID, str);
            bundle.putString(NetflixActivity.EXTRA_EPISODE_ID, str2);
            bundle.putLong(NetflixActivity.EXTRA_PLAYER_ID, j);
            episodesListSelectorDialogFragment.setArguments(bundle);
            episodesListSelectorDialogFragment.f = beh;
            return episodesListSelectorDialogFragment;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements View.OnLayoutChangeListener {
        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Window window;
            view.removeOnLayoutChangeListener(this);
            Dialog dialog = EpisodesListSelectorDialogFragment.this.getDialog();
            if (dialog == null || (window = dialog.getWindow()) == null) {
                return;
            }
            ViewUtils.a(window);
            ViewUtils.b(window);
            window.setBackgroundDrawableResource(R.c.q);
        }
    }

    public final InterfaceC3619bEo a() {
        InterfaceC3619bEo interfaceC3619bEo = this.episodesListRepositoryFactory;
        if (interfaceC3619bEo != null) {
            return interfaceC3619bEo;
        }
        C8632dsu.d("");
        return null;
    }

    private final bEI b() {
        bEI bei = this.b;
        if (bei != null) {
            return bei;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, binding is null".toString());
    }

    @Override // o.NE, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        this.b = bEI.d(layoutInflater, viewGroup, false);
        ConstraintLayout d = b().d();
        C8632dsu.a(d, "");
        return d;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    @SuppressLint({"CheckResult"})
    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        if (ViewCompat.isLaidOut(view) && !view.isLayoutRequested()) {
            Dialog dialog = getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                ViewUtils.a(window);
                ViewUtils.b(window);
                window.setBackgroundDrawableResource(R.c.q);
            }
        } else {
            view.addOnLayoutChangeListener(new b());
        }
        Bundle arguments = getArguments();
        arguments.getClass();
        String string = arguments.getString(NetflixActivity.EXTRA_VIDEO_ID);
        string.getClass();
        String string2 = arguments.getString(NetflixActivity.EXTRA_EPISODE_ID);
        string2.getClass();
        long j = arguments.getLong(NetflixActivity.EXTRA_PLAYER_ID);
        b().c.setOnClickListener(new View.OnClickListener() { // from class: o.bEj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EpisodesListSelectorDialogFragment.d(EpisodesListSelectorDialogFragment.this, view2);
            }
        });
        NetflixActivity requireNetflixActivity = requireNetflixActivity();
        C8632dsu.a(requireNetflixActivity, "");
        FrameLayout frameLayout = b().d;
        C8632dsu.a(frameLayout, "");
        FrameLayout frameLayout2 = b().b;
        C8632dsu.a(frameLayout2, "");
        C9935zP c9935zP = this.h;
        PublishSubject<dpR> publishSubject = this.e;
        C8632dsu.a(publishSubject, "");
        bEH beh = this.f;
        InterfaceC3619bEo a2 = a();
        PublishSubject<dpR> publishSubject2 = this.e;
        C8632dsu.a(publishSubject2, "");
        this.d = new C3622bEr(requireNetflixActivity, frameLayout, frameLayout2, string2, c9935zP, publishSubject, string, j, beh, a2.e(publishSubject2));
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(EpisodesListSelectorDialogFragment episodesListSelectorDialogFragment, View view) {
        C8632dsu.c((Object) episodesListSelectorDialogFragment, "");
        episodesListSelectorDialogFragment.c(true);
        episodesListSelectorDialogFragment.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.h.b(bFZ.class, bFZ.g.c);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        Window window;
        C8632dsu.c((Object) configuration, "");
        super.onConfigurationChanged(configuration);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            this.h.b(bEL.class, new bEL.d(window, configuration.orientation));
        }
        this.h.b(bFZ.class, new bFZ.j(configuration.orientation));
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        C8632dsu.c((Object) dialogInterface, "");
        super.onCancel(dialogInterface);
        c(true);
    }

    @Override // o.NE, com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        c(false);
        C3622bEr c3622bEr = this.d;
        if (c3622bEr != null) {
            c3622bEr.d();
        }
        super.onDestroyView();
        this.b = null;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onDestroy() {
        C3622bEr c3622bEr = this.d;
        if (c3622bEr != null) {
            c3622bEr.a();
        }
        super.onDestroy();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag
    public void applyActivityPadding(View view) {
        C8632dsu.c((Object) view, "");
        view.setPadding(view.getPaddingLeft(), this.statusBarPadding, view.getPaddingRight(), this.bottomPadding);
    }

    private final void c(boolean z) {
        this.h.b(bFZ.class, new bFZ.a(z));
    }

    private final void d() {
        FrameLayout frameLayout = b().b;
        C8632dsu.a(frameLayout, "");
        new bED(new bEF(frameLayout), this.h.d(bEL.class));
        Dialog dialog = getDialog();
        C9726vo.d(dialog != null ? dialog.getWindow() : null, getView(), new EpisodesListSelectorDialogFragment$initializeWindowAndOrientationObservables$1(this));
    }
}

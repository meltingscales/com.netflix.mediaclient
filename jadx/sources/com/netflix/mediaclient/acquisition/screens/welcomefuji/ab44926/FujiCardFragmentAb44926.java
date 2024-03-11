package com.netflix.mediaclient.acquisition.screens.welcomefuji.ab44926;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.FujiCardFragment;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.FujiCardParsedData;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.C8627dsp;
import o.C8632dsu;
import o.C9867yA;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class FujiCardFragmentAb44926 extends Hilt_FujiCardFragmentAb44926 implements C9867yA.b {
    @Inject
    public C9867yA keyboardState;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public final void setKeyboardState(C9867yA c9867yA) {
        C8632dsu.c((Object) c9867yA, "");
        this.keyboardState = c9867yA;
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final FujiCardFragmentAb44926 newInstance(FujiCardParsedData fujiCardParsedData, int i) {
            C8632dsu.c((Object) fujiCardParsedData, "");
            FujiCardFragmentAb44926 fujiCardFragmentAb44926 = new FujiCardFragmentAb44926();
            Bundle bundle = new Bundle();
            bundle.putParcelable(FujiCardFragment.CARD_DATA, fujiCardParsedData);
            bundle.putInt("position", i);
            fujiCardFragmentAb44926.setArguments(bundle);
            return fujiCardFragmentAb44926;
        }
    }

    public final C9867yA getKeyboardState() {
        C9867yA c9867yA = this.keyboardState;
        if (c9867yA != null) {
            return c9867yA;
        }
        C8632dsu.d("");
        return null;
    }

    private final View getToolbarBackground() {
        View findViewById = requireView().findViewById(R.id.toolbarBackground);
        C8632dsu.a(findViewById, "");
        return findViewById;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.welcomefuji.FujiCardFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        return layoutInflater.inflate(isVlvCard() ? R.layout.fragment_vlv_fuji_card_ab44926 : R.layout.fragment_fuji_card_ab44926, viewGroup, false);
    }

    @Override // com.netflix.mediaclient.acquisition.screens.welcomefuji.FujiCardFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        getKeyboardState().c(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getKeyboardState().e(this);
    }

    @Override // o.C9867yA.b
    public void onKeyboardStateChanged(boolean z) {
        getToolbarBackground().setBackgroundResource((isVlvCard() && z) ? R.drawable.fuji_vlv_toolbar_to_statusbar_gradient_ab44926 : z ? R.drawable.fuji_toolbar_to_statusbar_gradient_ab44926 : R.color.welcome_toolbar_bottom_background_ab44926);
    }

    @Override // com.netflix.mediaclient.acquisition.screens.welcomefuji.FujiCardFragment
    public View getBottomView() {
        View view = getView();
        if (view != null) {
            return view.findViewById(R.id.subheader);
        }
        return null;
    }
}

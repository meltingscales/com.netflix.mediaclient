package com.netflix.mediaclient.acquisition.components.faq;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.C8632dsu;
import o.dpR;
import o.drM;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class FaqFragment extends Hilt_FaqFragment {
    public static final int $stable = 8;
    @Inject
    public FaqInteractionListener faqInteractionListener;
    private FaqTray faqTray;
    @Inject
    public SignupMoneyballEntryPoint moneyballEntryPoint;
    public FaqViewModel viewModel;

    /* loaded from: classes3.dex */
    public interface FaqInteractionListener {
        void logFaqItemExpanded(String str);

        void logFaqItemShrunk(String str);

        void logFaqTrayClosed();

        void logFaqTrayOpened();
    }

    public final void setFaqInteractionListener(FaqInteractionListener faqInteractionListener) {
        C8632dsu.c((Object) faqInteractionListener, "");
        this.faqInteractionListener = faqInteractionListener;
    }

    public final void setMoneyballEntryPoint(SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        C8632dsu.c((Object) signupMoneyballEntryPoint, "");
        this.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    public final void setViewModel(FaqViewModel faqViewModel) {
        C8632dsu.c((Object) faqViewModel, "");
        this.viewModel = faqViewModel;
    }

    public final FaqInteractionListener getFaqInteractionListener() {
        FaqInteractionListener faqInteractionListener = this.faqInteractionListener;
        if (faqInteractionListener != null) {
            return faqInteractionListener;
        }
        C8632dsu.d("");
        return null;
    }

    public final FaqViewModel getViewModel() {
        FaqViewModel faqViewModel = this.viewModel;
        if (faqViewModel != null) {
            return faqViewModel;
        }
        C8632dsu.d("");
        return null;
    }

    public final SignupMoneyballEntryPoint getMoneyballEntryPoint() {
        SignupMoneyballEntryPoint signupMoneyballEntryPoint = this.moneyballEntryPoint;
        if (signupMoneyballEntryPoint != null) {
            return signupMoneyballEntryPoint;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.mediaclient.acquisition.components.faq.Hilt_FaqFragment, com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.AbstractC1083Oa, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    @SuppressLint({"MissingSuperCall"})
    public void onAttach(Context context) {
        C8632dsu.c((Object) context, "");
        super.onAttach(context);
        setViewModel(getMoneyballEntryPoint().faqViewModelInitializer().createFaqViewModel());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        FragmentActivity requireActivity = requireActivity();
        C8632dsu.a(requireActivity, "");
        FaqTray faqTray = new FaqTray(requireActivity, getViewModel().getFaqs(), getFaqInteractionListener(), new drM<View, dpR>() { // from class: com.netflix.mediaclient.acquisition.components.faq.FaqFragment$onCreateView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(View view) {
                invoke2(view);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                FaqTray faqTray2;
                C8632dsu.c((Object) view, "");
                FaqFragment.this.getFaqInteractionListener().logFaqTrayClosed();
                faqTray2 = FaqFragment.this.faqTray;
                if (faqTray2 != null) {
                    faqTray2.close();
                }
                FaqFragment.this.dismiss();
            }
        });
        this.faqTray = faqTray;
        return faqTray;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        getFaqInteractionListener().logFaqTrayOpened();
        FaqTray faqTray = this.faqTray;
        if (faqTray != null) {
            faqTray.open();
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag
    public boolean handleBackPressed() {
        getFaqInteractionListener().logFaqTrayClosed();
        FaqTray faqTray = this.faqTray;
        if (faqTray != null) {
            faqTray.close();
            return true;
        }
        return true;
    }
}

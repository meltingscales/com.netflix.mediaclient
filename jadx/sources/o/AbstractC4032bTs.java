package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment;
import com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: o.bTs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4032bTs extends LolomoMvRxFragment {
    private ContextWrapper b;
    private boolean e;
    private boolean m = false;

    @Override // o.bTM, o.AbstractC3852bNa, o.NY, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        L();
        bf_();
    }

    @Override // o.bTM, o.AbstractC3852bNa, com.netflix.mediaclient.android.fragment.NetflixFrag, o.NY, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.b;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        L();
        bf_();
    }

    private void L() {
        if (this.b == null) {
            this.b = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.e = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // o.bTM, o.AbstractC3852bNa, o.NY, androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() != null || this.e) {
            L();
            return this.b;
        }
        return null;
    }

    @Override // o.bTM, o.AbstractC3852bNa, o.NY, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(onGetLayoutInflater, this));
    }

    @Override // o.bTM, o.AbstractC3852bNa, o.NY
    public void bf_() {
        if (this.m) {
            return;
        }
        this.m = true;
        ((InterfaceC4023bTj) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).b((FeedLolomoFragment) UnsafeCasts.unsafeCast(this));
    }
}

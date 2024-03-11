package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.netflix.mediaclient.ui.login.EmailPasswordFragment;
import com.netflix.mediaclient.ui.login.recaptchav3.RecaptchaEmailPasswordFragment;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: o.cbD  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6323cbD extends EmailPasswordFragment {
    private ContextWrapper l;
    private boolean m = false;
    private boolean n;

    @Override // com.netflix.mediaclient.ui.login.EmailPasswordFragment, o.AbstractC6314cav, o.C6318caz, o.NY, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        I();
        bf_();
    }

    @Override // com.netflix.mediaclient.ui.login.EmailPasswordFragment, o.AbstractC6314cav, com.netflix.mediaclient.android.fragment.NetflixFrag, o.NY, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.l;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        I();
        bf_();
    }

    private void I() {
        if (this.l == null) {
            this.l = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.n = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // com.netflix.mediaclient.ui.login.EmailPasswordFragment, o.AbstractC6314cav, o.NY, androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() != null || this.n) {
            I();
            return this.l;
        }
        return null;
    }

    @Override // com.netflix.mediaclient.ui.login.EmailPasswordFragment, o.AbstractC6314cav, o.NY, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(onGetLayoutInflater, this));
    }

    @Override // o.AbstractC6314cav, o.NY
    public void bf_() {
        if (this.m) {
            return;
        }
        this.m = true;
        ((InterfaceC6329cbJ) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).e((RecaptchaEmailPasswordFragment) UnsafeCasts.unsafeCast(this));
    }
}

package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.netflix.mediaclient.ui.profiles.languages.impl.ProfileLanguagesFragment;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes4.dex */
public abstract class cOI extends bMX {
    private ContextWrapper b;
    private boolean e;
    private boolean j = false;

    @Override // o.AbstractC3852bNa, o.NY, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        I();
        bf_();
    }

    @Override // o.AbstractC3852bNa, com.netflix.mediaclient.android.fragment.NetflixFrag, o.NY, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.b;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        I();
        bf_();
    }

    private void I() {
        if (this.b == null) {
            this.b = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.e = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // o.AbstractC3852bNa, o.NY, androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() != null || this.e) {
            I();
            return this.b;
        }
        return null;
    }

    @Override // o.AbstractC3852bNa, o.NY, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(onGetLayoutInflater, this));
    }

    @Override // o.AbstractC3852bNa, o.NY
    public void bf_() {
        if (this.j) {
            return;
        }
        this.j = true;
        ((cOS) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).d((ProfileLanguagesFragment) UnsafeCasts.unsafeCast(this));
    }
}

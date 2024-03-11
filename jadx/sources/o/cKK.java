package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.netflix.mediaclient.ui.profilelock.impl.ProfileLockPinDialog;
import com.netflix.mediaclient.ui.profilelock.impl.VerifyPinDialog;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes4.dex */
public abstract class cKK extends ProfileLockPinDialog {
    private boolean b;
    private ContextWrapper c;
    private boolean d = false;

    @Override // o.cKJ, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        i();
        b();
    }

    @Override // o.cKJ, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.c;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        i();
        b();
    }

    private void i() {
        if (this.c == null) {
            this.c = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.b = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // o.cKJ, androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() != null || this.b) {
            i();
            return this.c;
        }
        return null;
    }

    @Override // o.cKJ, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(onGetLayoutInflater, this));
    }

    @Override // o.cKJ
    protected void b() {
        if (this.d) {
            return;
        }
        this.d = true;
        ((InterfaceC5872cLm) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).c((VerifyPinDialog) UnsafeCasts.unsafeCast(this));
    }
}

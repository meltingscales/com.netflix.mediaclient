package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.ui.login.LoginErrorDialogFrag;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: o.cau  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6313cau extends NetflixDialogFrag {
    private boolean b;
    private boolean c = false;
    private ContextWrapper d;

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.AbstractC1083Oa, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        b();
        inject();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.AbstractC1083Oa, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.d;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        b();
        inject();
    }

    private void b() {
        if (this.d == null) {
            this.d = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.b = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.AbstractC1083Oa, androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() != null || this.b) {
            b();
            return this.d;
        }
        return null;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.AbstractC1083Oa, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(onGetLayoutInflater, this));
    }

    @Override // o.AbstractC1083Oa
    public void inject() {
        if (this.c) {
            return;
        }
        this.c = true;
        ((InterfaceC6275caI) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).c((LoginErrorDialogFrag) UnsafeCasts.unsafeCast(this));
    }
}

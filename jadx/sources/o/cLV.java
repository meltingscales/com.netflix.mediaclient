package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.ui.profiles.SwitchProfileSheetFragment;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes4.dex */
public abstract class cLV extends NetflixDialogFrag {
    private boolean c = false;
    private boolean d;
    private ContextWrapper e;

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.AbstractC1083Oa, androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public /* bridge */ /* synthetic */ ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.AbstractC1083Oa, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        b();
        inject();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.AbstractC1083Oa, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.e;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        b();
        inject();
    }

    private void b() {
        if (this.e == null) {
            this.e = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.d = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.AbstractC1083Oa, androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() != null || this.d) {
            b();
            return this.e;
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
        ((InterfaceC5954cOo) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).b((SwitchProfileSheetFragment) UnsafeCasts.unsafeCast(this));
    }
}

package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.ui.offline.ErrorDownloadSheetFragment;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: o.cta  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7298cta extends NetflixDialogFrag {
    private boolean b = false;
    private ContextWrapper c;
    private boolean d;

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.AbstractC1083Oa, androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public /* bridge */ /* synthetic */ ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.AbstractC1083Oa, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        d();
        inject();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.AbstractC1083Oa, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.c;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        d();
        inject();
    }

    private void d() {
        if (this.c == null) {
            this.c = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.d = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.AbstractC1083Oa, androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() != null || this.d) {
            d();
            return this.c;
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
        if (this.b) {
            return;
        }
        this.b = true;
        ((InterfaceC7234csP) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).c((ErrorDownloadSheetFragment) UnsafeCasts.unsafeCast(this));
    }
}

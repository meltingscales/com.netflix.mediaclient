package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.ui.search.napa.SearchResultsOnNapaFrag;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes4.dex */
public abstract class cRD extends NetflixFrag {
    private boolean b;
    private ContextWrapper e;
    private boolean j = false;

    @Override // o.NY, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        a();
        bf_();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.NY, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.e;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a();
        bf_();
    }

    private void a() {
        if (this.e == null) {
            this.e = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.b = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // o.NY, androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() != null || this.b) {
            a();
            return this.e;
        }
        return null;
    }

    @Override // o.NY, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(onGetLayoutInflater, this));
    }

    @Override // o.NY
    public void bf_() {
        if (this.j) {
            return;
        }
        this.j = true;
        ((cRQ) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).d((SearchResultsOnNapaFrag) UnsafeCasts.unsafeCast(this));
    }
}

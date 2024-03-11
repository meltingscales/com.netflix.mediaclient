package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.netflix.mediaclient.ui.login.EmailPasswordFragment;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: o.cav  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6314cav extends C6318caz {
    private ContextWrapper b;
    private boolean n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13715o;

    @Override // o.C6318caz, o.NY, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        a();
        bf_();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.NY, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.b;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a();
        bf_();
    }

    private void a() {
        if (this.b == null) {
            this.b = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f13715o = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // o.NY, androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() != null || this.f13715o) {
            a();
            return this.b;
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
        if (this.n) {
            return;
        }
        this.n = true;
        ((InterfaceC6307cao) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent()).b((EmailPasswordFragment) UnsafeCasts.unsafeCast(this));
    }
}

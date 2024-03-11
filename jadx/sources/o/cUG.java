package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import androidx.preference.PreferenceFragmentCompat;
import com.netflix.mediaclient.ui.settings.SettingsFragment;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes4.dex */
public abstract class cUG extends PreferenceFragmentCompat implements GeneratedComponentManagerHolder {
    private volatile FragmentComponentManager a;
    private boolean d;
    private ContextWrapper e;
    private final Object c = new Object();
    private boolean b = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        a();
        d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.e;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a();
        d();
    }

    private void a() {
        if (this.e == null) {
            this.e = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.d = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() != null || this.d) {
            a();
            return this.e;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(onGetLayoutInflater, this));
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    protected FragmentComponentManager b() {
        return new FragmentComponentManager(this);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: e */
    public final FragmentComponentManager componentManager() {
        if (this.a == null) {
            synchronized (this.c) {
                if (this.a == null) {
                    this.a = b();
                }
            }
        }
        return this.a;
    }

    protected void d() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((InterfaceC6153cVv) generatedComponent()).e((SettingsFragment) UnsafeCasts.unsafeCast(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }
}

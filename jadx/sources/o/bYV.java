package o;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import com.netflix.mediaclient.ui.launch.NetflixComLaunchActivity;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes4.dex */
public abstract class bYV extends AppCompatActivity implements GeneratedComponentManagerHolder {
    private volatile ActivityComponentManager b;
    private SavedStateHandleHolder e;
    private final Object d = new Object();
    private boolean c = false;

    public bYV() {
        d();
    }

    private void d() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: o.bYV.5
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(Context context) {
                bYV.this.c();
            }
        });
    }

    private void e() {
        if (getApplication() instanceof GeneratedComponentManager) {
            SavedStateHandleHolder savedStateHandleHolder = componentManager().getSavedStateHandleHolder();
            this.e = savedStateHandleHolder;
            if (savedStateHandleHolder.isInvalid()) {
                this.e.setExtras(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        SavedStateHandleHolder savedStateHandleHolder = this.e;
        if (savedStateHandleHolder != null) {
            savedStateHandleHolder.clear();
        }
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    protected ActivityComponentManager a() {
        return new ActivityComponentManager(this);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: b */
    public final ActivityComponentManager componentManager() {
        if (this.b == null) {
            synchronized (this.d) {
                if (this.b == null) {
                    this.b = a();
                }
            }
        }
        return this.b;
    }

    protected void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        ((InterfaceC4181bZf) generatedComponent()).d((NetflixComLaunchActivity) UnsafeCasts.unsafeCast(this));
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getActivityFactory(this, super.getDefaultViewModelProviderFactory());
    }
}

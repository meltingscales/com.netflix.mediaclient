package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import java.util.Map;
import o.C8632dsu;
import o.InterfaceC8554dpx;
import o.dpB;
import o.drO;

/* loaded from: classes2.dex */
public final class SavedStateHandlesProvider implements SavedStateRegistry.SavedStateProvider {
    private boolean restored;
    private Bundle restoredState;
    private final SavedStateRegistry savedStateRegistry;
    private final InterfaceC8554dpx viewModel$delegate;

    public SavedStateHandlesProvider(SavedStateRegistry savedStateRegistry, final ViewModelStoreOwner viewModelStoreOwner) {
        InterfaceC8554dpx b;
        C8632dsu.c((Object) savedStateRegistry, "");
        C8632dsu.c((Object) viewModelStoreOwner, "");
        this.savedStateRegistry = savedStateRegistry;
        b = dpB.b(new drO<SavedStateHandlesVM>() { // from class: androidx.lifecycle.SavedStateHandlesProvider$viewModel$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final SavedStateHandlesVM invoke() {
                return SavedStateHandleSupport.getSavedStateHandlesVM(ViewModelStoreOwner.this);
            }
        });
        this.viewModel$delegate = b;
    }

    private final SavedStateHandlesVM getViewModel() {
        return (SavedStateHandlesVM) this.viewModel$delegate.getValue();
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public Bundle saveState() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, SavedStateHandle> entry : getViewModel().getHandles().entrySet()) {
            String key = entry.getKey();
            Bundle saveState = entry.getValue().savedStateProvider().saveState();
            if (!C8632dsu.c(saveState, Bundle.EMPTY)) {
                bundle.putBundle(key, saveState);
            }
        }
        this.restored = false;
        return bundle;
    }

    public final void performRestore() {
        if (this.restored) {
            return;
        }
        this.restoredState = this.savedStateRegistry.consumeRestoredStateForKey("androidx.lifecycle.internal.SavedStateHandlesProvider");
        this.restored = true;
        getViewModel();
    }

    public final Bundle consumeRestoredStateForKey(String str) {
        C8632dsu.c((Object) str, "");
        performRestore();
        Bundle bundle = this.restoredState;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.restoredState;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.restoredState;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.restoredState = null;
        }
        return bundle2;
    }
}

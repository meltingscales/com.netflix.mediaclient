package androidx.navigation;

import android.content.Context;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import o.C8632dsu;

/* loaded from: classes5.dex */
public class NavHostController extends NavController {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostController(Context context) {
        super(context);
        C8632dsu.c((Object) context, "");
    }

    @Override // androidx.navigation.NavController
    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        C8632dsu.c((Object) lifecycleOwner, "");
        super.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.navigation.NavController
    public final void setOnBackPressedDispatcher(OnBackPressedDispatcher onBackPressedDispatcher) {
        C8632dsu.c((Object) onBackPressedDispatcher, "");
        super.setOnBackPressedDispatcher(onBackPressedDispatcher);
    }

    @Override // androidx.navigation.NavController
    public final void enableOnBackPressed(boolean z) {
        super.enableOnBackPressed(z);
    }

    @Override // androidx.navigation.NavController
    public final void setViewModelStore(ViewModelStore viewModelStore) {
        C8632dsu.c((Object) viewModelStore, "");
        super.setViewModelStore(viewModelStore);
    }
}

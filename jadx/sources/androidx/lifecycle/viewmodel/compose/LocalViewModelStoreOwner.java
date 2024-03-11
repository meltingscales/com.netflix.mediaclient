package androidx.lifecycle.viewmodel.compose;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import o.C8632dsu;
import o.drO;

/* loaded from: classes2.dex */
public final class LocalViewModelStoreOwner {
    public static final LocalViewModelStoreOwner INSTANCE = new LocalViewModelStoreOwner();
    private static final ProvidableCompositionLocal<ViewModelStoreOwner> LocalViewModelStoreOwner = CompositionLocalKt.compositionLocalOf$default(null, new drO<ViewModelStoreOwner>() { // from class: androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner$LocalViewModelStoreOwner$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drO
        public final ViewModelStoreOwner invoke() {
            return null;
        }
    }, 1, null);

    private LocalViewModelStoreOwner() {
    }

    public final ProvidedValue<ViewModelStoreOwner> provides(ViewModelStoreOwner viewModelStoreOwner) {
        C8632dsu.c((Object) viewModelStoreOwner, "");
        return LocalViewModelStoreOwner.provides(viewModelStoreOwner);
    }

    public final ViewModelStoreOwner getCurrent(Composer composer, int i) {
        composer.startReplaceableGroup(-584162872);
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) composer.consume(LocalViewModelStoreOwner);
        if (viewModelStoreOwner == null) {
            viewModelStoreOwner = ViewTreeViewModelStoreOwner.get((View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView()));
        }
        composer.endReplaceableGroup();
        return viewModelStoreOwner;
    }
}

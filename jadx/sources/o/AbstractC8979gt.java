package o;

import android.app.Application;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;

/* renamed from: o.gt  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8979gt {
    public /* synthetic */ AbstractC8979gt(C8627dsp c8627dsp) {
        this();
    }

    public abstract SavedStateRegistry a();

    public abstract Object b();

    public abstract ComponentActivity c();

    public abstract ViewModelStoreOwner d();

    private AbstractC8979gt() {
    }

    public final <A extends Application> A j() {
        A a = (A) c().getApplication();
        C8632dsu.d(a);
        return a;
    }
}

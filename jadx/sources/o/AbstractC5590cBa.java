package o;

import androidx.core.view.DisplayCutoutCompat;
import io.reactivex.Observable;
import io.reactivex.subjects.Subject;
import java.util.ArrayList;

/* renamed from: o.cBa  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5590cBa {
    private final ArrayList<Observable<cBO>> b = new ArrayList<>();
    private Subject<cBO> d;

    public final ArrayList<Observable<cBO>> b() {
        return this.b;
    }

    public abstract void b(boolean z, DisplayCutoutCompat displayCutoutCompat);

    public final ArrayList<Observable<cBO>> c() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(Subject<cBO> subject) {
        this.d = subject;
    }

    public final Subject<cBO> d() {
        return this.d;
    }

    public static /* synthetic */ void a(AbstractC5590cBa abstractC5590cBa, boolean z, DisplayCutoutCompat displayCutoutCompat, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layoutComponents");
        }
        if ((i & 2) != 0) {
            displayCutoutCompat = null;
        }
        abstractC5590cBa.b(z, displayCutoutCompat);
    }
}

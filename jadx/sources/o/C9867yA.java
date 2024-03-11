package o;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowInsets;
import dagger.hilt.android.scopes.ActivityScoped;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;

@ActivityScoped
/* renamed from: o.yA  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9867yA {
    private boolean c = false;
    private Set<b> b = new HashSet();
    private Runnable e = new Runnable() { // from class: o.yA.4
        @Override // java.lang.Runnable
        public void run() {
            C9867yA c9867yA = C9867yA.this;
            c9867yA.e(c9867yA.c);
        }
    };
    private Handler d = new Handler(Looper.getMainLooper());

    /* renamed from: o.yA$b */
    /* loaded from: classes2.dex */
    public interface b {
        void onKeyboardStateChanged(boolean z);
    }

    public boolean d() {
        return this.c;
    }

    @Inject
    public C9867yA(final Activity activity) {
        activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: o.yA.3
            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                boolean z = C9867yA.this.c;
                C9867yA.this.c = windowInsets.getSystemWindowInsetBottom() - C9870yD.b(activity, 80) > windowInsets.getStableInsetBottom();
                if (z != C9867yA.this.c) {
                    C9867yA c9867yA = C9867yA.this;
                    c9867yA.b(c9867yA.c);
                }
                return view.onApplyWindowInsets(windowInsets);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        if (z) {
            e(true);
        } else {
            this.d.post(this.e);
        }
    }

    public void e(boolean z) {
        synchronized (this) {
            for (b bVar : this.b) {
                bVar.onKeyboardStateChanged(z);
            }
        }
    }

    public void c(b bVar) {
        synchronized (this) {
            this.b.add(bVar);
        }
    }

    public void e(b bVar) {
        synchronized (this) {
            this.b.remove(bVar);
        }
    }
}

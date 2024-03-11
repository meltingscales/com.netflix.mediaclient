package o;

import android.text.Editable;
import android.text.TextWatcher;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.discrete.InputDuration;

/* renamed from: o.Vk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1275Vk implements TextWatcher {
    private boolean a;
    private long b;
    private boolean c;
    private final AppView d;
    private long e;

    private final void b() {
        this.e = -1L;
        this.b = 0L;
        this.c = false;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    public final void b(boolean z) {
        this.a = z;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C1275Vk(AppView appView, boolean z) {
        C8632dsu.c((Object) appView, "");
        this.d = appView;
        this.a = z;
        this.e = -1L;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.a) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.e == -1) {
                this.e = currentTimeMillis;
            }
            this.b = currentTimeMillis;
            this.c = i3 - i2 > 1;
        }
    }

    public final void d() {
        if (this.a) {
            long j = this.e;
            if (j != -1) {
                Logger.INSTANCE.logEvent(new InputDuration(Long.valueOf(this.b - j), this.d, Boolean.valueOf(this.c)));
            }
            b();
        }
    }
}

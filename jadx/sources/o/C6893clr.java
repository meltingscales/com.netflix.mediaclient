package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import javax.inject.Inject;

/* renamed from: o.clr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6893clr extends ViewModel {
    private final MutableLiveData<Boolean> b;
    private final MutableLiveData<Boolean> c;
    private final MutableLiveData<Boolean> d;

    public final MutableLiveData<Boolean> c() {
        return this.d;
    }

    public final MutableLiveData<Boolean> d() {
        return this.b;
    }

    public final MutableLiveData<Boolean> e() {
        return this.c;
    }

    @Inject
    public C6893clr() {
        Boolean bool = Boolean.FALSE;
        this.d = new MutableLiveData<>(bool);
        this.c = new MutableLiveData<>(bool);
        this.b = new MutableLiveData<>(bool);
    }
}

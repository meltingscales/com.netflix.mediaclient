package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import javax.inject.Inject;

/* renamed from: o.ckR  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6814ckR extends ViewModel {
    private final MutableLiveData<Boolean> a;
    private final MutableLiveData<Boolean> d;
    private final MutableLiveData<Boolean> e;

    public final MutableLiveData<Boolean> b() {
        return this.a;
    }

    public final MutableLiveData<Boolean> c() {
        return this.e;
    }

    public final MutableLiveData<Boolean> d() {
        return this.d;
    }

    @Inject
    public C6814ckR() {
        Boolean bool = Boolean.FALSE;
        this.d = new MutableLiveData<>(bool);
        this.e = new MutableLiveData<>(bool);
        this.a = new MutableLiveData<>(bool);
    }
}

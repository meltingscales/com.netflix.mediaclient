package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import javax.inject.Inject;

/* renamed from: o.cku  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6843cku extends ViewModel {
    private final MutableLiveData<Boolean> b;
    private final MutableLiveData<Boolean> c;
    private final MutableLiveData<Boolean> e;

    public final MutableLiveData<Boolean> a() {
        return this.e;
    }

    public final MutableLiveData<Boolean> b() {
        return this.c;
    }

    public final MutableLiveData<Boolean> d() {
        return this.b;
    }

    @Inject
    public C6843cku() {
        Boolean bool = Boolean.FALSE;
        this.c = new MutableLiveData<>(bool);
        this.b = new MutableLiveData<>(bool);
        this.e = new MutableLiveData<>(bool);
    }
}

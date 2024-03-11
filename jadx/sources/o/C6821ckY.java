package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import javax.inject.Inject;

/* renamed from: o.ckY  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6821ckY extends ViewModel {
    private final MutableLiveData<Boolean> c;
    private final MutableLiveData<Boolean> d;

    public final MutableLiveData<Boolean> b() {
        return this.d;
    }

    public final MutableLiveData<Boolean> e() {
        return this.c;
    }

    @Inject
    public C6821ckY() {
        Boolean bool = Boolean.FALSE;
        this.d = new MutableLiveData<>(bool);
        this.c = new MutableLiveData<>(bool);
    }
}

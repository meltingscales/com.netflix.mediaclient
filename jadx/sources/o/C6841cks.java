package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import javax.inject.Inject;

/* renamed from: o.cks  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6841cks extends ViewModel {
    private final MutableLiveData<Boolean> d;
    private final MutableLiveData<Boolean> e;

    public final MutableLiveData<Boolean> c() {
        return this.e;
    }

    public final MutableLiveData<Boolean> e() {
        return this.d;
    }

    @Inject
    public C6841cks() {
        Boolean bool = Boolean.FALSE;
        this.e = new MutableLiveData<>(bool);
        this.d = new MutableLiveData<>(bool);
    }
}

package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import javax.inject.Inject;

/* renamed from: o.clm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6888clm extends ViewModel {
    private final MutableLiveData<Boolean> a;
    private final MutableLiveData<Boolean> b;
    private final MutableLiveData<Boolean> e;

    public final MutableLiveData<Boolean> a() {
        return this.e;
    }

    public final MutableLiveData<Boolean> d() {
        return this.a;
    }

    public final MutableLiveData<Boolean> e() {
        return this.b;
    }

    @Inject
    public C6888clm() {
        Boolean bool = Boolean.FALSE;
        this.a = new MutableLiveData<>(bool);
        this.b = new MutableLiveData<>(bool);
        this.e = new MutableLiveData<>(bool);
    }
}

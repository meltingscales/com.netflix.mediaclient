package o;

import androidx.lifecycle.MutableLiveData;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.BooleanField;
import com.netflix.android.moneyball.fields.ChoiceField;
import com.netflix.android.moneyball.fields.NumberField;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModel;
import com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import java.util.List;

/* renamed from: o.bzD  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5458bzD extends AbstractNetworkViewModel2 {
    private final NumberField a;
    private final NumberField b;
    private final NumberField c;
    private final List<C5466bzL> d;
    private final ChoiceField e;
    private final C5462bzH f;
    private final C5459bzE g;
    private final int h;
    private final BooleanField i;
    private final BooleanField j;
    private final ActionField l;
    private final StringProvider m;
    private final Long n;

    /* renamed from: o  reason: collision with root package name */
    private final Integer f13643o;

    public final ChoiceField a() {
        return this.e;
    }

    public final List<C5466bzL> b() {
        return this.d;
    }

    public final NumberField c() {
        return this.c;
    }

    public final NumberField d() {
        return this.a;
    }

    public final NumberField e() {
        return this.b;
    }

    public final BooleanField f() {
        return this.i;
    }

    public final Long g() {
        return this.n;
    }

    public final int i() {
        return this.h;
    }

    public final BooleanField j() {
        return this.j;
    }

    public final Integer k() {
        return this.f13643o;
    }

    public final boolean l() {
        return this.j != null;
    }

    public final boolean o() {
        return this.i != null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5458bzD(StringProvider stringProvider, SignupNetworkManager signupNetworkManager, ErrorMessageViewModel errorMessageViewModel, C5459bzE c5459bzE, C5462bzH c5462bzH) {
        super(signupNetworkManager, stringProvider, errorMessageViewModel);
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModel, "");
        C8632dsu.c((Object) c5459bzE, "");
        C8632dsu.c((Object) c5462bzH, "");
        this.m = stringProvider;
        this.g = c5459bzE;
        this.f = c5462bzH;
        this.e = c5459bzE.e();
        this.b = c5459bzE.d();
        this.a = c5459bzE.b();
        this.c = c5459bzE.c();
        this.l = c5459bzE.i();
        this.j = c5459bzE.g();
        this.i = c5459bzE.f();
        this.f13643o = c5459bzE.o();
        this.n = c5459bzE.h();
        this.h = c5459bzE.j();
        this.d = c5459bzE.a();
    }

    public final MutableLiveData<Boolean> h() {
        return this.f.a();
    }

    public final boolean m() {
        NumberField numberField;
        NumberField numberField2;
        NumberField numberField3 = this.b;
        boolean z = numberField3 != null && numberField3.isValid() && (numberField = this.a) != null && numberField.isValid() && (numberField2 = this.c) != null && numberField2.isValid();
        ChoiceField choiceField = this.e;
        Object value = choiceField != null ? choiceField.getValue() : null;
        String str = value instanceof String ? (String) value : null;
        return ((str == null || str.length() == 0) ^ true) && z && q() && n();
    }

    private final boolean q() {
        BooleanField booleanField = this.j;
        Object value = booleanField != null ? booleanField.getValue() : null;
        return ((value instanceof Boolean ? (Boolean) value : null) != null && C8632dsu.c(this.j.getValue(), Boolean.TRUE)) || this.j == null;
    }

    private final boolean n() {
        BooleanField booleanField = this.i;
        return (booleanField != null && C8632dsu.c(booleanField.getValue(), Boolean.TRUE)) || this.i == null;
    }

    public final void d(NetworkRequestResponseListener networkRequestResponseListener) {
        performAction(this.g.i(), h(), networkRequestResponseListener);
    }
}

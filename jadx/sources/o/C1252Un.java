package o;

import java.util.Optional;
import javax.inject.Inject;

/* renamed from: o.Un  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1252Un implements InterfaceC1246Uh {
    private final String a;
    private final Boolean b;
    private final String c;
    private final String d;
    private final String e;

    public Boolean a() {
        return this.b;
    }

    @Override // o.InterfaceC1246Uh
    public String b() {
        return this.a;
    }

    @Override // o.InterfaceC1246Uh
    public String d() {
        return this.c;
    }

    @Override // o.InterfaceC1246Uh
    public String e() {
        return this.d;
    }

    @Inject
    public C1252Un(Optional<String> optional) {
        C8632dsu.c((Object) optional, "");
        this.b = C1247Ui.d;
        this.c = "https://www.netflix.com";
        this.d = "https://develop.test.web.netflix.com";
        this.a = "https://develop.staging.web.netflix.com";
        this.e = (String) dsO.e(optional);
    }

    @Override // o.InterfaceC1246Uh
    public /* synthetic */ boolean c() {
        return a().booleanValue();
    }
}

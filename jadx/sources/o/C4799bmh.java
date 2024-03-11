package o;

import android.net.Uri;
import androidx.media3.datasource.HttpDataSource;
import o.InterfaceC4796bme;

/* renamed from: o.bmh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4799bmh implements InterfaceC4796bme {
    private InterfaceC4796bme b;

    public void a(InterfaceC4796bme interfaceC4796bme) {
        this.b = interfaceC4796bme;
    }

    @Override // o.InterfaceC4796bme
    public void d(Uri uri, HttpDataSource.RequestProperties requestProperties, InterfaceC4796bme.a aVar) {
        InterfaceC4796bme interfaceC4796bme = this.b;
        if (interfaceC4796bme != null) {
            interfaceC4796bme.d(uri, requestProperties, aVar);
        }
    }
}

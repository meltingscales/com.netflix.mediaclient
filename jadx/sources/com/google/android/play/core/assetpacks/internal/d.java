package com.google.android.play.core.assetpacks.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes5.dex */
public final class d extends a implements f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.f
    public final void c(String str, List list, Bundle bundle, h hVar) {
        Parcel a = a();
        a.writeString(str);
        a.writeTypedList(list);
        c.c(a, bundle);
        a.writeStrongBinder(hVar);
        b(14, a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.f
    public final void d(String str, Bundle bundle, Bundle bundle2, h hVar) {
        Parcel a = a();
        a.writeString(str);
        c.c(a, bundle);
        c.c(a, bundle2);
        a.writeStrongBinder(hVar);
        b(11, a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.f
    public final void e(String str, Bundle bundle, h hVar) {
        Parcel a = a();
        a.writeString(str);
        c.c(a, bundle);
        a.writeStrongBinder(hVar);
        b(5, a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.f
    public final void f(String str, Bundle bundle, h hVar) {
        Parcel a = a();
        a.writeString(str);
        c.c(a, bundle);
        a.writeStrongBinder(hVar);
        b(10, a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.f
    public final void g(String str, Bundle bundle, Bundle bundle2, h hVar) {
        Parcel a = a();
        a.writeString(str);
        c.c(a, bundle);
        c.c(a, bundle2);
        a.writeStrongBinder(hVar);
        b(6, a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.f
    public final void h(String str, Bundle bundle, Bundle bundle2, h hVar) {
        Parcel a = a();
        a.writeString(str);
        c.c(a, bundle);
        c.c(a, bundle2);
        a.writeStrongBinder(hVar);
        b(7, a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.f
    public final void i(String str, Bundle bundle, Bundle bundle2, h hVar) {
        Parcel a = a();
        a.writeString(str);
        c.c(a, bundle);
        c.c(a, bundle2);
        a.writeStrongBinder(hVar);
        b(9, a);
    }
}

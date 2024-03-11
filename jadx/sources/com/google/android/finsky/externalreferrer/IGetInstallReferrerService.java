package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.a.a;
import com.google.android.a.b;
import com.google.android.a.c;

/* loaded from: classes2.dex */
public interface IGetInstallReferrerService extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class Stub extends b implements IGetInstallReferrerService {

        /* loaded from: classes2.dex */
        public static class Proxy extends a implements IGetInstallReferrerService {
            Proxy(IBinder iBinder) {
                super(iBinder);
            }

            @Override // com.google.android.finsky.externalreferrer.IGetInstallReferrerService
            public final Bundle c(Bundle bundle) {
                Parcel a = a();
                c.b(a, bundle);
                Parcel b = b(a);
                Bundle bundle2 = (Bundle) c.a(b, Bundle.CREATOR);
                b.recycle();
                return bundle2;
            }
        }

        public static IGetInstallReferrerService b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof IGetInstallReferrerService) {
                return (IGetInstallReferrerService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.a.b
        public final boolean a(int i, Parcel parcel, Parcel parcel2) {
            if (i == 1) {
                Bundle c = c((Bundle) c.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                c.c(parcel2, c);
                return true;
            }
            return false;
        }
    }

    Bundle c(Bundle bundle);
}

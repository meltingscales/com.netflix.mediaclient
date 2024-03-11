package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.netflix.partner.NetflixPartnerRecoResults;
import com.netflix.partner.NetflixPartnerSearchResults;

/* renamed from: o.dlk  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC8433dlk extends IInterface {
    void a(NetflixPartnerSearchResults netflixPartnerSearchResults);

    void d(int i, String str);

    void d(NetflixPartnerRecoResults netflixPartnerRecoResults);

    /* renamed from: o.dlk$c */
    /* loaded from: classes6.dex */
    public static abstract class c extends Binder implements InterfaceC8433dlk {
        public c() {
            attachInterface(this, "com.netflix.partner.INetflixPartnerCallback");
        }

        public static InterfaceC8433dlk a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.netflix.partner.INetflixPartnerCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC8433dlk)) {
                return (InterfaceC8433dlk) queryLocalInterface;
            }
            return new e(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.netflix.partner.INetflixPartnerCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.netflix.partner.INetflixPartnerCallback");
                return true;
            }
            if (i == 1) {
                a((NetflixPartnerSearchResults) e.c(parcel, NetflixPartnerSearchResults.CREATOR));
                parcel2.writeNoException();
            } else if (i == 2) {
                d((NetflixPartnerRecoResults) e.c(parcel, NetflixPartnerRecoResults.CREATOR));
                parcel2.writeNoException();
            } else if (i == 3) {
                d(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        /* renamed from: o.dlk$c$e */
        /* loaded from: classes6.dex */
        static class e implements InterfaceC8433dlk {
            private IBinder e;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.e;
            }

            e(IBinder iBinder) {
                this.e = iBinder;
            }

            @Override // o.InterfaceC8433dlk
            public void a(NetflixPartnerSearchResults netflixPartnerSearchResults) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.netflix.partner.INetflixPartnerCallback");
                    e.c(obtain, netflixPartnerSearchResults, 0);
                    this.e.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.InterfaceC8433dlk
            public void d(NetflixPartnerRecoResults netflixPartnerRecoResults) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.netflix.partner.INetflixPartnerCallback");
                    e.c(obtain, netflixPartnerRecoResults, 0);
                    this.e.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.InterfaceC8433dlk
            public void d(int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.netflix.partner.INetflixPartnerCallback");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.e.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    /* renamed from: o.dlk$e */
    /* loaded from: classes6.dex */
    public static class e {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void c(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }
}

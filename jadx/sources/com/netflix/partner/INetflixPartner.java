package com.netflix.partner;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Surface;
import o.InterfaceC8433dlk;
import o.InterfaceC8440dlr;

/* loaded from: classes6.dex */
public interface INetflixPartner extends IInterface {
    void a(int i, String str, InterfaceC8433dlk interfaceC8433dlk);

    void a(String str);

    void a(String str, int i, int i2, InterfaceC8433dlk interfaceC8433dlk);

    void c(Surface surface, String str, boolean z, InterfaceC8440dlr interfaceC8440dlr);

    boolean d();

    int e();

    void e(String str, int i, InterfaceC8433dlk interfaceC8433dlk);

    /* loaded from: classes6.dex */
    public static abstract class Stub extends Binder implements INetflixPartner {
        static final int TRANSACTION_cardEvent = 6;
        static final int TRANSACTION_createPlaybackSession = 7;
        static final int TRANSACTION_getApiVersion = 5;
        static final int TRANSACTION_getRecommendations = 4;
        static final int TRANSACTION_isUserSignedIn = 1;
        static final int TRANSACTION_search = 3;
        static final int TRANSACTION_searchInApp = 2;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.netflix.partner.INetflixPartner");
        }

        public static INetflixPartner asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.netflix.partner.INetflixPartner");
            if (queryLocalInterface != null && (queryLocalInterface instanceof INetflixPartner)) {
                return (INetflixPartner) queryLocalInterface;
            }
            return new e(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.netflix.partner.INetflixPartner");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.netflix.partner.INetflixPartner");
                return true;
            }
            switch (i) {
                case 1:
                    boolean d = d();
                    parcel2.writeNoException();
                    parcel2.writeInt(d ? 1 : 0);
                    break;
                case 2:
                    a(parcel.readString());
                    parcel2.writeNoException();
                    break;
                case 3:
                    e(parcel.readString(), parcel.readInt(), InterfaceC8433dlk.c.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 4:
                    a(parcel.readString(), parcel.readInt(), parcel.readInt(), InterfaceC8433dlk.c.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 5:
                    int e2 = e();
                    parcel2.writeNoException();
                    parcel2.writeInt(e2);
                    break;
                case 6:
                    a(parcel.readInt(), parcel.readString(), InterfaceC8433dlk.c.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 7:
                    c((Surface) d.d(parcel, Surface.CREATOR), parcel.readString(), parcel.readInt() != 0, InterfaceC8440dlr.e.c(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        /* loaded from: classes6.dex */
        static class e implements INetflixPartner {
            private IBinder e;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.e;
            }

            e(IBinder iBinder) {
                this.e = iBinder;
            }

            @Override // com.netflix.partner.INetflixPartner
            public boolean d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.netflix.partner.INetflixPartner");
                    this.e.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.netflix.partner.INetflixPartner
            public void a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.netflix.partner.INetflixPartner");
                    obtain.writeString(str);
                    this.e.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.netflix.partner.INetflixPartner
            public void e(String str, int i, InterfaceC8433dlk interfaceC8433dlk) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.netflix.partner.INetflixPartner");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeStrongInterface(interfaceC8433dlk);
                    this.e.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.netflix.partner.INetflixPartner
            public void a(String str, int i, int i2, InterfaceC8433dlk interfaceC8433dlk) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.netflix.partner.INetflixPartner");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeStrongInterface(interfaceC8433dlk);
                    this.e.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.netflix.partner.INetflixPartner
            public int e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.netflix.partner.INetflixPartner");
                    this.e.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.netflix.partner.INetflixPartner
            public void a(int i, String str, InterfaceC8433dlk interfaceC8433dlk) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.netflix.partner.INetflixPartner");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(interfaceC8433dlk);
                    this.e.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.netflix.partner.INetflixPartner
            public void c(Surface surface, String str, boolean z, InterfaceC8440dlr interfaceC8440dlr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.netflix.partner.INetflixPartner");
                    d.c(obtain, surface, 0);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeStrongInterface(interfaceC8440dlr);
                    this.e.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class d {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T d(Parcel parcel, Parcelable.Creator<T> creator) {
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

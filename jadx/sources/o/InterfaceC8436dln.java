package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: o.dln  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC8436dln extends IInterface {
    void a();

    void b();

    void d();

    void d(long j);

    void e();

    /* renamed from: o.dln$a */
    /* loaded from: classes6.dex */
    public static abstract class a extends Binder implements InterfaceC8436dln {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public a() {
            attachInterface(this, "com.netflix.partner.IPartnerPlaybackSession");
        }

        public static InterfaceC8436dln e(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.netflix.partner.IPartnerPlaybackSession");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC8436dln)) {
                return (InterfaceC8436dln) queryLocalInterface;
            }
            return new d(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.netflix.partner.IPartnerPlaybackSession");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.netflix.partner.IPartnerPlaybackSession");
                return true;
            }
            if (i == 1) {
                e();
                parcel2.writeNoException();
            } else if (i == 2) {
                b();
                parcel2.writeNoException();
            } else if (i == 3) {
                d();
                parcel2.writeNoException();
            } else if (i == 4) {
                d(parcel.readLong());
                parcel2.writeNoException();
            } else if (i == 5) {
                a();
                parcel2.writeNoException();
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        /* renamed from: o.dln$a$d */
        /* loaded from: classes6.dex */
        static class d implements InterfaceC8436dln {
            private IBinder a;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            d(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // o.InterfaceC8436dln
            public void e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.netflix.partner.IPartnerPlaybackSession");
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.InterfaceC8436dln
            public void b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.netflix.partner.IPartnerPlaybackSession");
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.InterfaceC8436dln
            public void d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.netflix.partner.IPartnerPlaybackSession");
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.InterfaceC8436dln
            public void d(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.netflix.partner.IPartnerPlaybackSession");
                    obtain.writeLong(j);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.InterfaceC8436dln
            public void a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.netflix.partner.IPartnerPlaybackSession");
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}

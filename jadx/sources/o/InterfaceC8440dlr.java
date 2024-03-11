package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import o.InterfaceC8436dln;

/* renamed from: o.dlr  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC8440dlr extends IInterface {
    void b(String str);

    void d(InterfaceC8436dln interfaceC8436dln);

    /* renamed from: o.dlr$e */
    /* loaded from: classes6.dex */
    public static abstract class e extends Binder implements InterfaceC8440dlr {
        public e() {
            attachInterface(this, "com.netflix.partner.IPartnerPlaybackSessionListener");
        }

        public static InterfaceC8440dlr c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.netflix.partner.IPartnerPlaybackSessionListener");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC8440dlr)) {
                return (InterfaceC8440dlr) queryLocalInterface;
            }
            return new a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.netflix.partner.IPartnerPlaybackSessionListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.netflix.partner.IPartnerPlaybackSessionListener");
                return true;
            }
            if (i == 1) {
                d(InterfaceC8436dln.a.e(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 2) {
                b(parcel.readString());
                parcel2.writeNoException();
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        /* renamed from: o.dlr$e$a */
        /* loaded from: classes6.dex */
        static class a implements InterfaceC8440dlr {
            private IBinder b;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.b;
            }

            a(IBinder iBinder) {
                this.b = iBinder;
            }

            @Override // o.InterfaceC8440dlr
            public void d(InterfaceC8436dln interfaceC8436dln) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.netflix.partner.IPartnerPlaybackSessionListener");
                    obtain.writeStrongInterface(interfaceC8436dln);
                    this.b.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.InterfaceC8440dlr
            public void b(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.netflix.partner.IPartnerPlaybackSessionListener");
                    obtain.writeString(str);
                    this.b.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}

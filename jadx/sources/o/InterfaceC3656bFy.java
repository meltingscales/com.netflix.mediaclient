package o;

import android.content.Context;
import com.netflix.mediaclient.servicemgr.interface_.SupplementalMessageType;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import kotlin.Pair;

/* renamed from: o.bFy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3656bFy {
    public static final c d = c.e;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.bFy$e */
    /* loaded from: classes4.dex */
    public interface e {
        InterfaceC3656bFy I();
    }

    Pair<String, String> a(InterfaceC5187bty interfaceC5187bty, Context context);

    Integer b(SupplementalMessageType supplementalMessageType);

    CharSequence e(InterfaceC5227bul interfaceC5227bul, Context context);

    /* renamed from: o.bFy$c */
    /* loaded from: classes4.dex */
    public static final class c {
        static final /* synthetic */ c e = new c();

        private c() {
        }

        public final InterfaceC3656bFy e(Context context) {
            C8632dsu.c((Object) context, "");
            return ((e) EntryPointAccessors.fromApplication(context, e.class)).I();
        }
    }
}

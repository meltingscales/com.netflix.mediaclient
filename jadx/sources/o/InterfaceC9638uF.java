package o;

import android.content.Context;
import com.netflix.android.imageloader.api.GetImageRequest;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import io.reactivex.Single;
import o.C9646uN;
import o.C9684uz;

/* renamed from: o.uF  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC9638uF {
    public static final e a = e.d;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.uF$b */
    /* loaded from: classes.dex */
    public interface b {
        InterfaceC9638uF e();
    }

    static InterfaceC9638uF e(Context context) {
        return a.d(context);
    }

    Single<GetImageRequest.a> b(GetImageRequest.e eVar);

    void c();

    Single<C9646uN.e> d(C9646uN.b bVar);

    boolean d();

    Single<C9684uz.d> e(C9684uz.a aVar);

    boolean e(Throwable th);

    /* renamed from: o.uF$e */
    /* loaded from: classes.dex */
    public static final class e {
        static final /* synthetic */ e d = new e();

        private e() {
        }

        public final InterfaceC9638uF d(Context context) {
            C8632dsu.c((Object) context, "");
            return ((b) EntryPointAccessors.fromApplication(context, b.class)).e();
        }
    }
}

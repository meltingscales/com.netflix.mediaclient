package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import com.netflix.mediaclient.ui.offline.OfflineProfileImageUtil$cacheProfileImage$1;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Single;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import java.io.File;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.C7285ctN;
import o.C8106deC;
import o.C8632dsu;
import o.C9684uz;
import o.InterfaceC9638uF;
import o.dpR;

@Singleton
/* renamed from: o.ctN  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7285ctN {
    private final InterfaceC9638uF a;
    private final Set<String> c;
    private final Context e;
    public static final d d = new d(null);
    public static final int b = 8;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.ctN$a */
    /* loaded from: classes4.dex */
    public interface a {
        C7285ctN aj();
    }

    public static final C7285ctN a(Context context) {
        return d.d(context);
    }

    @Inject
    public C7285ctN(@ApplicationContext Context context, InterfaceC9638uF interfaceC9638uF) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        this.e = context;
        this.a = interfaceC9638uF;
        this.c = Collections.newSetFromMap(new ConcurrentHashMap());
    }

    /* renamed from: o.ctN$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("OfflineProfileImageUtil");
        }

        public final C7285ctN d(Context context) {
            C8632dsu.c((Object) context, "");
            return ((a) EntryPointAccessors.fromApplication(context, a.class)).aj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File c() {
        return new File(this.e.getFilesDir(), "img/of/profiles/");
    }

    private final File c(String str) {
        File c = c();
        return new File(c, str + ".img");
    }

    @SuppressLint({"CheckResult"})
    public final void d(final String str, final String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        if (this.c.contains(str2)) {
            return;
        }
        this.c.add(str2);
        final File c = c(str2);
        Single<Boolean> b2 = C8106deC.b(c);
        final OfflineProfileImageUtil$cacheProfileImage$1 offlineProfileImageUtil$cacheProfileImage$1 = new drM<Boolean, Boolean>() { // from class: com.netflix.mediaclient.ui.offline.OfflineProfileImageUtil$cacheProfileImage$1
            @Override // o.drM
            /* renamed from: d */
            public final Boolean invoke(Boolean bool) {
                C8632dsu.c((Object) bool, "");
                return Boolean.valueOf(!bool.booleanValue());
            }
        };
        Maybe<Boolean> filter = b2.filter(new Predicate() { // from class: o.ctO
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean b3;
                b3 = C7285ctN.b(drM.this, obj);
                return b3;
            }
        });
        final drM<Boolean, MaybeSource<? extends Boolean>> drm = new drM<Boolean, MaybeSource<? extends Boolean>>() { // from class: com.netflix.mediaclient.ui.offline.OfflineProfileImageUtil$cacheProfileImage$2
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final MaybeSource<? extends Boolean> invoke(Boolean bool) {
                File c2;
                C8632dsu.c((Object) bool, "");
                c2 = C7285ctN.this.c();
                return C8106deC.d(c2).toMaybe();
            }
        };
        Maybe<R> flatMap = filter.flatMap(new Function() { // from class: o.ctQ
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                MaybeSource h;
                h = C7285ctN.h(drM.this, obj);
                return h;
            }
        });
        final drM<Boolean, MaybeSource<? extends C9684uz.d>> drm2 = new drM<Boolean, MaybeSource<? extends C9684uz.d>>() { // from class: com.netflix.mediaclient.ui.offline.OfflineProfileImageUtil$cacheProfileImage$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final MaybeSource<? extends C9684uz.d> invoke(Boolean bool) {
                InterfaceC9638uF interfaceC9638uF;
                C8632dsu.c((Object) bool, "");
                C9684uz.a e = new C9684uz().e(str).e();
                interfaceC9638uF = this.a;
                return interfaceC9638uF.e(e).toMaybe();
            }
        };
        Maybe flatMap2 = flatMap.flatMap(new Function() { // from class: o.ctR
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                MaybeSource i;
                i = C7285ctN.i(drM.this, obj);
                return i;
            }
        });
        final drM<C9684uz.d, MaybeSource<? extends Object>> drm3 = new drM<C9684uz.d, MaybeSource<? extends Object>>() { // from class: com.netflix.mediaclient.ui.offline.OfflineProfileImageUtil$cacheProfileImage$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final MaybeSource<? extends Object> invoke(C9684uz.d dVar) {
                InterfaceC9638uF interfaceC9638uF;
                C8632dsu.c((Object) dVar, "");
                interfaceC9638uF = C7285ctN.this.a;
                if (interfaceC9638uF.d()) {
                    return C8106deC.c(dVar.c(), c).toMaybe();
                }
                return C8106deC.b(dVar.c(), c).toMaybe();
            }
        };
        Maybe doFinally = flatMap2.flatMap(new Function() { // from class: o.ctP
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                MaybeSource j;
                j = C7285ctN.j(drM.this, obj);
                return j;
            }
        }).doFinally(new Action() { // from class: o.ctT
            @Override // io.reactivex.functions.Action
            public final void run() {
                C7285ctN.d(C7285ctN.this, str2);
            }
        });
        C8632dsu.a(doFinally, "");
        SubscribersKt.subscribeBy$default(doFinally, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.offline.OfflineProfileImageUtil$cacheProfileImage$6
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                b(th);
                return dpR.c;
            }

            public final void b(Throwable th) {
                C8632dsu.c((Object) th, "");
                C7285ctN.d dVar = C7285ctN.d;
            }
        }, (drO) null, (drM) null, 6, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaybeSource h(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (MaybeSource) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaybeSource i(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (MaybeSource) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaybeSource j(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (MaybeSource) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C7285ctN c7285ctN, String str) {
        C8632dsu.c((Object) c7285ctN, "");
        C8632dsu.c((Object) str, "");
        c7285ctN.c.remove(str);
    }

    public final boolean a(String str) {
        C8632dsu.c((Object) str, "");
        return this.c.contains(str);
    }

    public final String b(String str) {
        C8632dsu.c((Object) str, "");
        String uri = Uri.fromFile(c(str)).toString();
        C8632dsu.a(uri, "");
        return uri;
    }
}

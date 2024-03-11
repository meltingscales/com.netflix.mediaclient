package o;

import com.netflix.mediaclient.service.falkor.NotificationsListStatus;
import com.netflix.mediaclient.util.ObservableNotificationsMap$observeNotificationsRx$1;
import io.reactivex.Observable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlinx.coroutines.channels.BufferOverflow;

/* renamed from: o.dfu  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8203dfu {
    private final ConcurrentHashMap<String, NotificationsListStatus> b = new ConcurrentHashMap<>();
    private final InterfaceC8810dzj<Pair<String, NotificationsListStatus>> c = C8820dzt.b(1, 0, BufferOverflow.DROP_OLDEST, 2, null);

    public final void a(String str, NotificationsListStatus notificationsListStatus) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) notificationsListStatus, "");
        this.b.put(str, notificationsListStatus);
        this.c.a(new Pair<>(str, notificationsListStatus));
    }

    public final NotificationsListStatus e(String str) {
        C8632dsu.c((Object) str, "");
        NotificationsListStatus orDefault = this.b.getOrDefault(str, NotificationsListStatus.a);
        C8632dsu.a(orDefault, "");
        return orDefault;
    }

    public final Observable<NotificationsListStatus> d(String str) {
        C8632dsu.c((Object) str, "");
        return C7672dBb.d(new b(new e(dyR.j(this.c, new ObservableNotificationsMap$observeNotificationsRx$1(str, this, null)), str)), null, 1, null);
    }

    /* renamed from: o.dfu$b */
    /* loaded from: classes5.dex */
    public static final class b implements dyS<NotificationsListStatus> {
        final /* synthetic */ dyS d;

        public b(dyS dys) {
            this.d = dys;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super NotificationsListStatus> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.d.collect(new AnonymousClass4(dyq), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: o.dfu$b$4  reason: invalid class name */
        /* loaded from: classes5.dex */
        public static final class AnonymousClass4<T> implements dyQ {
            final /* synthetic */ dyQ b;

            public AnonymousClass4(dyQ dyq) {
                this.b = dyq;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, o.InterfaceC8585dra r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.netflix.mediaclient.util.ObservableNotificationsMap$observeNotificationsRx$$inlined$map$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.netflix.mediaclient.util.ObservableNotificationsMap$observeNotificationsRx$$inlined$map$1$2$1 r0 = (com.netflix.mediaclient.util.ObservableNotificationsMap$observeNotificationsRx$$inlined$map$1$2$1) r0
                    int r1 = r0.a
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.a = r1
                    goto L18
                L13:
                    com.netflix.mediaclient.util.ObservableNotificationsMap$observeNotificationsRx$$inlined$map$1$2$1 r0 = new com.netflix.mediaclient.util.ObservableNotificationsMap$observeNotificationsRx$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.b
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.a
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    o.C8556dpz.d(r6)
                    o.dyQ r6 = r4.b
                    kotlin.Pair r5 = (kotlin.Pair) r5
                    java.lang.Object r5 = r5.a()
                    r0.a = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    o.dpR r5 = o.dpR.c
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C8203dfu.b.AnonymousClass4.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    /* renamed from: o.dfu$e */
    /* loaded from: classes5.dex */
    public static final class e implements dyS<Pair<? extends String, ? extends NotificationsListStatus>> {
        final /* synthetic */ String d;
        final /* synthetic */ dyS e;

        public e(dyS dys, String str) {
            this.e = dys;
            this.d = str;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super Pair<? extends String, ? extends NotificationsListStatus>> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object e;
            Object collect = this.e.collect(new AnonymousClass3(dyq, this.d), interfaceC8585dra);
            e = C8586drb.e();
            return collect == e ? collect : dpR.c;
        }

        /* renamed from: o.dfu$e$3  reason: invalid class name */
        /* loaded from: classes5.dex */
        public static final class AnonymousClass3<T> implements dyQ {
            final /* synthetic */ String b;
            final /* synthetic */ dyQ d;

            public AnonymousClass3(dyQ dyq, String str) {
                this.d = dyq;
                this.b = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r6, o.InterfaceC8585dra r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.netflix.mediaclient.util.ObservableNotificationsMap$observeNotificationsRx$$inlined$filter$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.netflix.mediaclient.util.ObservableNotificationsMap$observeNotificationsRx$$inlined$filter$1$2$1 r0 = (com.netflix.mediaclient.util.ObservableNotificationsMap$observeNotificationsRx$$inlined$filter$1$2$1) r0
                    int r1 = r0.a
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.a = r1
                    goto L18
                L13:
                    com.netflix.mediaclient.util.ObservableNotificationsMap$observeNotificationsRx$$inlined$filter$1$2$1 r0 = new com.netflix.mediaclient.util.ObservableNotificationsMap$observeNotificationsRx$$inlined$filter$1$2$1
                    r0.<init>(r5, r7)
                L18:
                    java.lang.Object r7 = r0.d
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.a
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r7)
                    goto L4e
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    o.C8556dpz.d(r7)
                    o.dyQ r7 = r5.d
                    r2 = r6
                    kotlin.Pair r2 = (kotlin.Pair) r2
                    java.lang.Object r2 = r2.d()
                    java.lang.String r4 = r5.b
                    boolean r2 = o.C8632dsu.c(r2, r4)
                    if (r2 == 0) goto L4e
                    r0.a = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L4e
                    return r1
                L4e:
                    o.dpR r6 = o.dpR.c
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C8203dfu.e.AnonymousClass3.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }
}

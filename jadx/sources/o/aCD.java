package o;

import com.apollographql.apollo3.api.http.HttpMethod;
import com.apollographql.apollo3.exception.ApolloNetworkException;
import com.netflix.android.volley.Request;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Result;
import o.C7819dGn;
import o.C7826dGu;
import o.C9009hW;
import o.aCA;
import o.aCH;
import o.dpR;

/* loaded from: classes3.dex */
public final class aCD implements InterfaceC9101jI {
    private final boolean b;
    private final aCH.a c;
    private final C1567aGb d;
    private final aCA.d e;

    @AssistedFactory
    /* loaded from: classes3.dex */
    public interface a extends InterfaceC1477aCt {
    }

    @Override // o.InterfaceC9101jI
    public void b() {
    }

    @AssistedInject
    public aCD(aCH.a aVar, aCA.d dVar, @Assisted C1567aGb c1567aGb, @Assisted boolean z) {
        C8632dsu.c((Object) aVar, "");
        C8632dsu.c((Object) dVar, "");
        this.c = aVar;
        this.e = dVar;
        this.d = c1567aGb;
        this.b = z;
    }

    /* loaded from: classes3.dex */
    public static final class d extends AbstractC7825dGt {
        final /* synthetic */ InterfaceC9002hP a;

        d(InterfaceC9002hP interfaceC9002hP) {
            this.a = interfaceC9002hP;
        }

        @Override // o.AbstractC7825dGt
        public C7822dGq a() {
            return C7822dGq.b.e(this.a.a());
        }

        @Override // o.AbstractC7825dGt
        public long d() {
            return this.a.e();
        }

        @Override // o.AbstractC7825dGt
        public void a(dIq diq) {
            C8632dsu.c((Object) diq, "");
            this.a.d(diq);
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements aCB {
        final /* synthetic */ InterfaceC8743dwx<C9009hW> a;

        /* JADX WARN: Multi-variable type inference failed */
        e(InterfaceC8743dwx<? super C9009hW> interfaceC8743dwx) {
            this.a = interfaceC8743dwx;
        }

        @Override // o.aCB
        public void c(int i, Map<String, String> map, InterfaceC7871dIn interfaceC7871dIn) {
            if (interfaceC7871dIn == null) {
                InterfaceC8743dwx<C9009hW> interfaceC8743dwx = this.a;
                Result.c cVar = Result.e;
                interfaceC8743dwx.resumeWith(Result.e(C8556dpz.a(new NullPointerException("bodySource was null, statusCode = " + i))));
                return;
            }
            C9009hW.a c = new C9009hW.a(i).c(interfaceC7871dIn);
            if (map != null) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    C9006hT c9006hT = (key == null || value == null) ? null : new C9006hT(key, value);
                    if (c9006hT != null) {
                        arrayList.add(c9006hT);
                    }
                }
                c.b(arrayList);
            }
            Result.c cVar2 = Result.e;
            Object e = Result.e(c.a());
            InterfaceC8743dwx<C9009hW> interfaceC8743dwx2 = this.a;
            C8556dpz.d(e);
            interfaceC8743dwx2.resumeWith(Result.e(e));
        }

        @Override // o.aCB
        public void d(IOException iOException) {
            C8632dsu.c((Object) iOException, "");
            InterfaceC8743dwx<C9009hW> interfaceC8743dwx = this.a;
            Result.c cVar = Result.e;
            interfaceC8743dwx.resumeWith(Result.e(C8556dpz.a(new ApolloNetworkException("Failed to execute GraphQL http network request", iOException))));
        }
    }

    @Override // o.InterfaceC9101jI
    public Object c(C9008hV c9008hV, InterfaceC8585dra<? super C9009hW> interfaceC8585dra) {
        InterfaceC8585dra b;
        Object obj;
        boolean g;
        Object e2;
        boolean d2;
        b = C8590drf.b(interfaceC8585dra);
        C8741dwv c8741dwv = new C8741dwv(b, 1);
        c8741dwv.h();
        C7826dGu.b a2 = new C7826dGu.b().a(c9008hV.e());
        C7819dGn.d dVar = new C7819dGn.d();
        for (C9006hT c9006hT : c9008hV.b()) {
            dVar.d(c9006hT.b(), c9006hT.a());
        }
        C7826dGu.b b2 = a2.b(dVar.b());
        if (c9008hV.c() == HttpMethod.e) {
            throw new IllegalStateException("HTTP Get is not supported by NetflixHttpEngine");
        }
        InterfaceC9002hP d3 = c9008hV.d();
        if (d3 == null) {
            throw new IllegalStateException("HTTP POST requires a request body".toString());
        }
        b2.c(new d(d3));
        C7826dGu a3 = b2.a();
        Iterator<T> it = c9008hV.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            d2 = C8691duz.d(((C9006hT) obj).b(), C9003hQ.a.c(), true);
            if (d2) {
                break;
            }
        }
        C9006hT c9006hT2 = (C9006hT) obj;
        String a4 = c9006hT2 != null ? c9006hT2.a() : null;
        if (a4 != null) {
            g = C8691duz.g(a4);
            if (!g) {
                final aCA b3 = InterfaceC1477aCt.d.e(c9008hV) ? this.e.b(a3, this.b) : this.c.e(a3, this.d, this.b);
                b3.e(new e(c8741dwv));
                C1735aMh.e.b(b3);
                c8741dwv.a((drM<? super Throwable, dpR>) new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.graphqlplatform.impl.client.network.http.NetflixHttpEngine$execute$2$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Throwable th) {
                        a(th);
                        return dpR.c;
                    }

                    public final void a(Throwable th) {
                        ((Request) b3).e();
                    }
                });
                Object b4 = c8741dwv.b();
                e2 = C8586drb.e();
                if (b4 == e2) {
                    C8592drh.c(interfaceC8585dra);
                }
                return b4;
            }
        }
        throw new IllegalStateException("Tried to use GraphQL operation without an operationName");
    }
}

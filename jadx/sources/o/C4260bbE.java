package o;

import com.netflix.mediaclient.StatusCode;
import java.util.HashMap;
import o.AbstractC4213baK;

/* renamed from: o.bbE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4260bbE {
    public static final b c = new b(null);
    private HashMap<String, C4257bbB> b = new HashMap<>();

    /* renamed from: o.bbE$b */
    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("OfflineLatencyTrackerManager/DownloadPerfTracer ");
        }
    }

    public final void c(final AbstractC4213baK abstractC4213baK) {
        C8632dsu.c((Object) abstractC4213baK, "");
        if (InterfaceC1659aJm.b.e().e()) {
            C8187dfe.c(new Runnable() { // from class: o.bbC
                @Override // java.lang.Runnable
                public final void run() {
                    C4260bbE.a(C4260bbE.this, abstractC4213baK);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4260bbE c4260bbE, AbstractC4213baK abstractC4213baK) {
        C8632dsu.c((Object) c4260bbE, "");
        C8632dsu.c((Object) abstractC4213baK, "");
        c4260bbE.d(abstractC4213baK);
    }

    private final void d(AbstractC4213baK abstractC4213baK) {
        if (abstractC4213baK instanceof AbstractC4213baK.i) {
            AbstractC4213baK.i iVar = (AbstractC4213baK.i) abstractC4213baK;
            if (this.b.containsKey(iVar.d())) {
                c(iVar.d(), StatusCode.INTERNAL_ERROR);
            }
            this.b.put(iVar.d(), new C4257bbB(iVar.c(), iVar.d(), iVar.a()));
        } else if (abstractC4213baK instanceof AbstractC4213baK.a) {
            C4257bbB c4257bbB = this.b.get(((AbstractC4213baK.a) abstractC4213baK).e());
            if (c4257bbB != null) {
                c4257bbB.d();
            }
        } else if (abstractC4213baK instanceof AbstractC4213baK.b) {
            AbstractC4213baK.b bVar = (AbstractC4213baK.b) abstractC4213baK;
            C4257bbB c4257bbB2 = this.b.get(bVar.d());
            if (c4257bbB2 != null) {
                c4257bbB2.b(bVar.e());
            }
        } else if (abstractC4213baK instanceof AbstractC4213baK.h) {
            C4257bbB c4257bbB3 = this.b.get(((AbstractC4213baK.h) abstractC4213baK).a());
            if (c4257bbB3 != null) {
                c4257bbB3.b();
            }
        } else if (abstractC4213baK instanceof AbstractC4213baK.j) {
            AbstractC4213baK.j jVar = (AbstractC4213baK.j) abstractC4213baK;
            C4257bbB c4257bbB4 = this.b.get(jVar.b());
            if (c4257bbB4 != null) {
                c4257bbB4.e(jVar.e());
                b(jVar.b(), jVar.e());
                if (jVar.e() == StatusCode.OK) {
                    c4257bbB4.e();
                }
            }
        } else if (abstractC4213baK instanceof AbstractC4213baK.e) {
            AbstractC4213baK.e eVar = (AbstractC4213baK.e) abstractC4213baK;
            C4257bbB c4257bbB5 = this.b.get(eVar.d());
            if (c4257bbB5 != null) {
                c4257bbB5.d(eVar.c(), eVar.e());
                b(eVar.d(), eVar.c());
                if (c4257bbB5.c()) {
                    c(eVar.d(), eVar.c());
                }
            }
        } else if (abstractC4213baK instanceof AbstractC4213baK.d) {
            AbstractC4213baK.d dVar = (AbstractC4213baK.d) abstractC4213baK;
            C4257bbB c4257bbB6 = this.b.get(dVar.b());
            if (c4257bbB6 != null) {
                c4257bbB6.c(dVar.c());
            }
        } else if (abstractC4213baK instanceof AbstractC4213baK.c) {
            AbstractC4213baK.c cVar = (AbstractC4213baK.c) abstractC4213baK;
            C4257bbB c4257bbB7 = this.b.get(cVar.b());
            if (c4257bbB7 != null) {
                c4257bbB7.c(cVar.e(), cVar.d());
                if (c4257bbB7.a() && c4257bbB7.c()) {
                    c(cVar.b(), cVar.d());
                }
            }
        } else if (abstractC4213baK instanceof AbstractC4213baK.g) {
            AbstractC4213baK.g gVar = (AbstractC4213baK.g) abstractC4213baK;
            c(gVar.e(), gVar.c());
        }
    }

    private final void b(String str, StatusCode statusCode) {
        if (statusCode != StatusCode.OK) {
            c(str, statusCode);
        }
    }

    private final void c(String str, StatusCode statusCode) {
        C4257bbB c4257bbB = this.b.get(str);
        if (c4257bbB != null) {
            c4257bbB.a(statusCode);
            this.b.remove(str);
        }
    }
}

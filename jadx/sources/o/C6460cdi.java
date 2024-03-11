package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref;

/* renamed from: o.cdi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6460cdi extends AbstractC1224Tl<GenreItem> {
    public static final e c = new e(null);
    public static final int e = 8;
    private List<GenreItem> a;
    private ServiceManager b;

    public List<GenreItem> f() {
        return this.a;
    }

    public C6460cdi() {
        List<GenreItem> f;
        f = C8569dql.f(C6452cda.a.c());
        this.a = f;
        d(0);
    }

    /* renamed from: o.cdi$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("Genregeddon");
        }
    }

    @Override // o.AbstractC1224Tl
    public String e(int i) {
        return f().get(i).getId();
    }

    @Override // o.AbstractC1224Tl
    public String a(int i) {
        String title = f().get(i).getTitle();
        C8632dsu.d((Object) title);
        return title;
    }

    @Override // o.AbstractC1224Tl
    public int a() {
        return this.a.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1224Tl
    /* renamed from: i */
    public GenreItem b(int i) {
        return this.a.get(i);
    }

    public void a(String str) {
        C8632dsu.c((Object) str, "");
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (C8632dsu.c((Object) this.a.get(i).getId(), (Object) str)) {
                d(i);
                return;
            }
        }
    }

    public final void e(ServiceManager serviceManager) {
        synchronized (this) {
            C8632dsu.c((Object) serviceManager, "");
            this.b = serviceManager;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC1224Tl
    public Observable<List<GenreItem>> d(boolean z) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.d = z ? TaskMode.FROM_NETWORK : TaskMode.FROM_CACHE_OR_NETWORK;
        Observable<List<GenreItem>> create = Observable.create(new ObservableOnSubscribe() { // from class: o.cdh
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C6460cdi.b(C6460cdi.this, objectRef, observableEmitter);
            }
        });
        C8632dsu.a(create, "");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, com.netflix.mediaclient.browse.api.task.TaskMode] */
    public static final void b(C6460cdi c6460cdi, Ref.ObjectRef objectRef, ObservableEmitter observableEmitter) {
        List<GenreItem> f;
        C8632dsu.c((Object) c6460cdi, "");
        C8632dsu.c((Object) objectRef, "");
        C8632dsu.c((Object) observableEmitter, "");
        ServiceManager serviceManager = c6460cdi.b;
        if (serviceManager != null && serviceManager.c()) {
            serviceManager.j().b(ConfigFastPropertyFeatureControlConfig.Companion.t() ? "actionbarCategoryListV2" : "actionbarCategoryList", (TaskMode) objectRef.d, new c(c6460cdi, observableEmitter));
            objectRef.d = TaskMode.FROM_NETWORK;
            return;
        }
        f = C8569dql.f(C6452cda.a.c());
        c6460cdi.a = f;
        observableEmitter.onNext(f);
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.cdi$c */
    /* loaded from: classes4.dex */
    public final class c extends AbstractC5164btb {
        private ObservableEmitter<List<GenreItem>> b;
        final /* synthetic */ C6460cdi c;

        public c(C6460cdi c6460cdi, ObservableEmitter<List<GenreItem>> observableEmitter) {
            C8632dsu.c((Object) observableEmitter, "");
            this.c = c6460cdi;
            this.b = observableEmitter;
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void i(List<? extends GenreItem> list, Status status) {
            List f;
            C8632dsu.c((Object) status, "");
            super.i(list, status);
            if (status.i()) {
                e eVar = C6460cdi.c;
                ObservableEmitter<List<GenreItem>> observableEmitter = this.b;
                observableEmitter.onError(new Throwable("status error " + status));
            } else if (list != null && !list.isEmpty()) {
                f = C8569dql.f(C6452cda.a.c());
                f.addAll(list);
                this.c.a = f;
                this.b.onNext(this.c.a);
                this.b.onComplete();
            } else {
                C6460cdi.c.getLogTag();
                this.b.onError(new Throwable("No genres in response"));
            }
        }
    }

    public final GenreItem e(String str) {
        Object obj;
        C8632dsu.c((Object) str, "");
        Iterator<T> it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C8632dsu.c((Object) ((GenreItem) obj).getId(), (Object) str)) {
                break;
            }
        }
        return (GenreItem) obj;
    }
}

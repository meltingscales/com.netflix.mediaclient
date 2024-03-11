package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.context.GamesInMyList;
import com.netflix.cl.model.event.discrete.Presented;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.cl.model.event.session.action.RemoveFromPlaylist;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.ui.mylist.impl.tab.MyListTabItems;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* renamed from: o.cmS  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6921cmS extends C1045Mp {
    public static final C6921cmS e = new C6921cmS();
    private static final AppView a = AppView.myListGallery;
    private static final AtomicReference<Long> c = new AtomicReference<>(null);
    public static final int b = 8;

    /* renamed from: o.cmS$d */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[MyListTabItems.Type.values().length];
            try {
                iArr[MyListTabItems.Type.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MyListTabItems.Type.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            b = iArr;
        }
    }

    private C6921cmS() {
        super("MyListCL");
    }

    public final void b() {
        c.getAndUpdate(new UnaryOperator() { // from class: o.cmT
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Long b2;
                b2 = C6921cmS.b((Long) obj);
                return b2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long b(Long l) {
        return l == null ? Long.valueOf(Logger.INSTANCE.addContext(new GamesInMyList(null))) : l;
    }

    public final void c() {
        c.getAndUpdate(new UnaryOperator() { // from class: o.cmW
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Long d2;
                d2 = C6921cmS.d((Long) obj);
                return d2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long d(Long l) {
        Logger.INSTANCE.removeContext(l);
        return null;
    }

    public final void d(final boolean z) {
        Logger.INSTANCE.logEvent(new Selected(AppView.myListEditButton, a, CommandValue.SelectCommand, new TrackingInfo() { // from class: o.cmR
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject e2;
                e2 = C6921cmS.e(z);
                return e2;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject e(boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("edit", z ? "on" : "off");
        return jSONObject;
    }

    public final void a(final String str) {
        C8632dsu.c((Object) str, "");
        Logger.INSTANCE.logEvent(new Selected(AppView.myListGallery, null, CommandValue.SelectCommand, new TrackingInfo() { // from class: o.cmX
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject c2;
                c2 = C6921cmS.c(str);
                return c2;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject c(String str) {
        C8632dsu.c((Object) str, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("filter", str);
        return jSONObject;
    }

    public final void e(final String str) {
        C8632dsu.c((Object) str, "");
        Logger.INSTANCE.logEvent(new Selected(AppView.myListGallery, null, CommandValue.SelectCommand, new TrackingInfo() { // from class: o.cmQ
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject h;
                h = C6921cmS.h(str);
                return h;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject h(String str) {
        C8632dsu.c((Object) str, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sort", str);
        return jSONObject;
    }

    public final void d(MyListTabItems.Type type, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) type, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        Logger.INSTANCE.logEvent(new Presented(e(type), Boolean.FALSE, TrackingInfoHolder.e(trackingInfoHolder, null, 1, null)));
    }

    public final void c(MyListTabItems.Type type) {
        C8632dsu.c((Object) type, "");
        Logger.INSTANCE.logEvent(new Selected(e(type), a, CommandValue.SelectCommand, new TrackingInfo() { // from class: o.cmP
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject e2;
                e2 = C6921cmS.e();
                return e2;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject e() {
        return new JSONObject();
    }

    public final void b(boolean z, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        Logger.INSTANCE.logEvent(new Selected(a(z), a, b(z), TrackingInfoHolder.e(trackingInfoHolder, null, 1, null)));
    }

    public final Long d(boolean z, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        return Logger.INSTANCE.startSession(new RemoveFromPlaylist(a(z), a, b(z), TrackingInfoHolder.e(trackingInfoHolder, null, 1, null)));
    }

    public final void a(Long l) {
        Logger.INSTANCE.endSession(l);
    }

    public final void c(boolean z, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        Logger logger = Logger.INSTANCE;
        AppView appView = AppView.myListUndoButton;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isSwipeToDelete", z);
        dpR dpr = dpR.c;
        logger.logEvent(new Presented(appView, null, trackingInfoHolder.c(jSONObject)));
    }

    public final void a(boolean z, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        Logger logger = Logger.INSTANCE;
        AppView appView = AppView.myListUndoButton;
        AppView appView2 = a;
        CommandValue commandValue = CommandValue.SelectCommand;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isSwipeToDelete", z);
        dpR dpr = dpR.c;
        logger.logEvent(new Selected(appView, appView2, commandValue, trackingInfoHolder.c(jSONObject)));
    }

    public final void d(AppView appView, TrackingInfo trackingInfo) {
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) trackingInfo, "");
        Logger.INSTANCE.logEvent(new Selected(AppView.myListLolomoRowAction, appView, CommandValue.SelectCommand, trackingInfo));
    }

    public final void a() {
        Logger.INSTANCE.logEvent(new Presented(AppView.myListGamesPopover, null, null));
    }

    private final AppView e(MyListTabItems.Type type) {
        int i = d.b[type.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return AppView.myListVideoSection;
            }
            throw new NoWhenBranchMatchedException();
        }
        return AppView.myListGameSection;
    }

    private final AppView a(boolean z) {
        return z ? AppView.myListItem : AppView.removeFromRowButton;
    }

    private final CommandValue b(boolean z) {
        return z ? CommandValue.SwipeDeleteCommand : CommandValue.SelectCommand;
    }
}

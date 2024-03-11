package o;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.ControllerModelList;
import com.airbnb.epoxy.IllegalEpoxyUsage;
import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: o.ap  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2914ap implements InterfaceC2023aX {
    private static final int DELAY_TO_CHECK_ADAPTER_COUNT_MS = 3000;
    private static final InterfaceC4626bi NO_OP_TIMER = new C4202ba();
    public static Handler defaultDiffingHandler;
    public static Handler defaultModelBuildingHandler;
    private static boolean filterDuplicatesDefault;
    private static boolean globalDebugLoggingEnabled;
    private static e globalExceptionHandler;
    private final C3020ar adapter;
    private final Runnable buildModelsRunnable;
    private C2861ao debugObserver;
    private volatile boolean filterDuplicates;
    private volatile boolean hasBuiltModelsEver;
    private final AbstractC2269ad helper;
    private final List<d> interceptors;
    private final Handler modelBuildHandler;
    private List<b> modelInterceptorCallbacks;
    private ControllerModelList modelsBeingBuilt;
    private int recyclerViewAttachCount;
    private volatile int requestedModelBuildType;
    private AbstractC3073as<?> stagedModel;
    private volatile Thread threadBuildingModels;
    private InterfaceC4626bi timer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.ap$b */
    /* loaded from: classes2.dex */
    public interface b {
        void b(AbstractC2914ap abstractC2914ap);

        void d(AbstractC2914ap abstractC2914ap);
    }

    /* renamed from: o.ap$d */
    /* loaded from: classes2.dex */
    public interface d {
        void c(List<AbstractC3073as<?>> list);
    }

    /* renamed from: o.ap$e */
    /* loaded from: classes2.dex */
    public interface e {
        void d(AbstractC2914ap abstractC2914ap, RuntimeException runtimeException);
    }

    public static void setGlobalDebugLoggingEnabled(boolean z) {
        globalDebugLoggingEnabled = z;
    }

    public static void setGlobalDuplicateFilteringDefault(boolean z) {
        filterDuplicatesDefault = z;
    }

    public static void setGlobalExceptionHandler(e eVar) {
        globalExceptionHandler = eVar;
    }

    protected abstract void buildModels();

    public C3020ar getAdapter() {
        return this.adapter;
    }

    public boolean isDebugLoggingEnabled() {
        return this.timer != NO_OP_TIMER;
    }

    public boolean isDuplicateFilteringEnabled() {
        return this.filterDuplicates;
    }

    public boolean isStickyHeader(int i) {
        return false;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onModelBound(C1511aE c1511aE, AbstractC3073as<?> abstractC3073as, int i, AbstractC3073as<?> abstractC3073as2) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onModelUnbound(C1511aE c1511aE, AbstractC3073as<?> abstractC3073as) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onViewAttachedToWindow(C1511aE c1511aE, AbstractC3073as<?> abstractC3073as) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onViewDetachedFromWindow(C1511aE c1511aE, AbstractC3073as<?> abstractC3073as) {
    }

    public void setFilterDuplicates(boolean z) {
        this.filterDuplicates = z;
    }

    public void setupStickyHeaderView(View view) {
    }

    public void teardownStickyHeaderView(View view) {
    }

    static {
        Handler handler = C2050aY.c.d;
        defaultModelBuildingHandler = handler;
        defaultDiffingHandler = handler;
        filterDuplicatesDefault = false;
        globalDebugLoggingEnabled = false;
        globalExceptionHandler = new e() { // from class: o.ap.5
            @Override // o.AbstractC2914ap.e
            public void d(AbstractC2914ap abstractC2914ap, RuntimeException runtimeException) {
            }
        };
    }

    public AbstractC2914ap() {
        this(defaultModelBuildingHandler, defaultDiffingHandler);
    }

    public AbstractC2914ap(Handler handler, Handler handler2) {
        this.recyclerViewAttachCount = 0;
        this.interceptors = new CopyOnWriteArrayList();
        this.filterDuplicates = filterDuplicatesDefault;
        this.threadBuildingModels = null;
        this.timer = NO_OP_TIMER;
        this.helper = C2702al.c(this);
        this.requestedModelBuildType = 0;
        this.buildModelsRunnable = new Runnable() { // from class: o.ap.1
            @Override // java.lang.Runnable
            public void run() {
                AbstractC2914ap.this.threadBuildingModels = Thread.currentThread();
                AbstractC2914ap.this.cancelPendingModelBuild();
                AbstractC2914ap.this.helper.resetAutoModels();
                AbstractC2914ap.this.modelsBeingBuilt = new ControllerModelList(AbstractC2914ap.this.getExpectedModelCount());
                AbstractC2914ap.this.timer.b("Models built");
                try {
                    AbstractC2914ap.this.buildModels();
                    AbstractC2914ap.this.addCurrentlyStagedModelIfExists();
                    AbstractC2914ap.this.timer.a();
                    AbstractC2914ap.this.runInterceptors();
                    AbstractC2914ap abstractC2914ap = AbstractC2914ap.this;
                    abstractC2914ap.filterDuplicatesIfNeeded(abstractC2914ap.modelsBeingBuilt);
                    AbstractC2914ap.this.modelsBeingBuilt.e();
                    AbstractC2914ap.this.timer.b("Models diffed");
                    AbstractC2914ap.this.adapter.c(AbstractC2914ap.this.modelsBeingBuilt);
                    AbstractC2914ap.this.timer.a();
                    AbstractC2914ap.this.modelsBeingBuilt = null;
                    AbstractC2914ap.this.hasBuiltModelsEver = true;
                    AbstractC2914ap.this.threadBuildingModels = null;
                } catch (Throwable th) {
                    AbstractC2914ap.this.timer.a();
                    AbstractC2914ap.this.modelsBeingBuilt = null;
                    AbstractC2914ap.this.hasBuiltModelsEver = true;
                    AbstractC2914ap.this.threadBuildingModels = null;
                    AbstractC2914ap.this.stagedModel = null;
                    throw th;
                }
            }
        };
        this.adapter = new C3020ar(this, handler2);
        this.modelBuildHandler = handler;
        setDebugLoggingEnabled(globalDebugLoggingEnabled);
    }

    public void requestModelBuild() {
        if (isBuildingModels()) {
            throw new IllegalEpoxyUsage("Cannot call `requestModelBuild` from inside `buildModels`");
        }
        if (this.hasBuiltModelsEver) {
            requestDelayedModelBuild(0);
        } else {
            this.buildModelsRunnable.run();
        }
    }

    public boolean hasPendingModelBuild() {
        return (this.requestedModelBuildType == 0 && this.threadBuildingModels == null && !this.adapter.f()) ? false : true;
    }

    public void addModelBuildListener(InterfaceC4255bb interfaceC4255bb) {
        this.adapter.c(interfaceC4255bb);
    }

    public void removeModelBuildListener(InterfaceC4255bb interfaceC4255bb) {
        this.adapter.e(interfaceC4255bb);
    }

    public void requestDelayedModelBuild(int i) {
        synchronized (this) {
            if (isBuildingModels()) {
                throw new IllegalEpoxyUsage("Cannot call `requestDelayedModelBuild` from inside `buildModels`");
            }
            if (this.requestedModelBuildType == 2) {
                cancelPendingModelBuild();
            } else if (this.requestedModelBuildType == 1) {
                return;
            }
            this.requestedModelBuildType = i == 0 ? 1 : 2;
            this.modelBuildHandler.postDelayed(this.buildModelsRunnable, i);
        }
    }

    public void cancelPendingModelBuild() {
        synchronized (this) {
            if (this.requestedModelBuildType != 0) {
                this.requestedModelBuildType = 0;
                this.modelBuildHandler.removeCallbacks(this.buildModelsRunnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getExpectedModelCount() {
        int itemCount = this.adapter.getItemCount();
        if (itemCount != 0) {
            return itemCount;
        }
        return 25;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getFirstIndexOfModelInBuildingList(AbstractC3073as<?> abstractC3073as) {
        assertIsBuildingModels();
        int size = this.modelsBeingBuilt.size();
        for (int i = 0; i < size; i++) {
            if (this.modelsBeingBuilt.get(i) == abstractC3073as) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isModelAddedMultipleTimes(AbstractC3073as<?> abstractC3073as) {
        assertIsBuildingModels();
        int size = this.modelsBeingBuilt.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.modelsBeingBuilt.get(i2) == abstractC3073as) {
                i++;
            }
        }
        return i > 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addAfterInterceptorCallback(b bVar) {
        assertIsBuildingModels();
        if (this.modelInterceptorCallbacks == null) {
            this.modelInterceptorCallbacks = new ArrayList();
        }
        this.modelInterceptorCallbacks.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runInterceptors() {
        if (!this.interceptors.isEmpty()) {
            List<b> list = this.modelInterceptorCallbacks;
            if (list != null) {
                for (b bVar : list) {
                    bVar.d(this);
                }
            }
            this.timer.b("Interceptors executed");
            for (d dVar : this.interceptors) {
                dVar.c(this.modelsBeingBuilt);
            }
            this.timer.a();
            List<b> list2 = this.modelInterceptorCallbacks;
            if (list2 != null) {
                for (b bVar2 : list2) {
                    bVar2.b(this);
                }
            }
        }
        this.modelInterceptorCallbacks = null;
    }

    public void addInterceptor(d dVar) {
        this.interceptors.add(dVar);
    }

    public void removeInterceptor(d dVar) {
        this.interceptors.remove(dVar);
    }

    public int getModelCountBuiltSoFar() {
        assertIsBuildingModels();
        return this.modelsBeingBuilt.size();
    }

    private void assertIsBuildingModels() {
        if (!isBuildingModels()) {
            throw new IllegalEpoxyUsage("Can only call this when inside the `buildModels` method");
        }
    }

    private void assertNotBuildingModels() {
        if (isBuildingModels()) {
            throw new IllegalEpoxyUsage("Cannot call this from inside `buildModels`");
        }
    }

    @Override // o.InterfaceC2023aX
    public void add(AbstractC3073as<?> abstractC3073as) {
        abstractC3073as.b(this);
    }

    protected void add(AbstractC3073as<?>... abstractC3073asArr) {
        ControllerModelList controllerModelList = this.modelsBeingBuilt;
        controllerModelList.ensureCapacity(controllerModelList.size() + abstractC3073asArr.length);
        for (AbstractC3073as<?> abstractC3073as : abstractC3073asArr) {
            add(abstractC3073as);
        }
    }

    public void add(List<? extends AbstractC3073as<?>> list) {
        ControllerModelList controllerModelList = this.modelsBeingBuilt;
        controllerModelList.ensureCapacity(controllerModelList.size() + list.size());
        for (AbstractC3073as<?> abstractC3073as : list) {
            add(abstractC3073as);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addInternal(AbstractC3073as<?> abstractC3073as) {
        assertIsBuildingModels();
        if (abstractC3073as.c()) {
            throw new IllegalEpoxyUsage("You must set an id on a model before adding it. Use the @AutoModel annotation if you want an id to be automatically generated for you.");
        }
        if (!abstractC3073as.j()) {
            throw new IllegalEpoxyUsage("You cannot hide a model in an EpoxyController. Use `addIf` to conditionally add a model instead.");
        }
        clearModelFromStaging(abstractC3073as);
        abstractC3073as.a = null;
        this.modelsBeingBuilt.add(abstractC3073as);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStagedModel(AbstractC3073as<?> abstractC3073as) {
        if (abstractC3073as != this.stagedModel) {
            addCurrentlyStagedModelIfExists();
        }
        this.stagedModel = abstractC3073as;
    }

    void addCurrentlyStagedModelIfExists() {
        AbstractC3073as<?> abstractC3073as = this.stagedModel;
        if (abstractC3073as != null) {
            abstractC3073as.b(this);
        }
        this.stagedModel = null;
    }

    void clearModelFromStaging(AbstractC3073as<?> abstractC3073as) {
        if (this.stagedModel != abstractC3073as) {
            addCurrentlyStagedModelIfExists();
        }
        this.stagedModel = null;
    }

    public boolean isBuildingModels() {
        return this.threadBuildingModels == Thread.currentThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void filterDuplicatesIfNeeded(List<AbstractC3073as<?>> list) {
        if (this.filterDuplicates) {
            this.timer.b("Duplicates filtered");
            HashSet hashSet = new HashSet(list.size());
            ListIterator<AbstractC3073as<?>> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                AbstractC3073as<?> next = listIterator.next();
                if (!hashSet.add(Long.valueOf(next.b()))) {
                    int previousIndex = listIterator.previousIndex();
                    listIterator.remove();
                    int findPositionOfDuplicate = findPositionOfDuplicate(list, next);
                    AbstractC3073as<?> abstractC3073as = list.get(findPositionOfDuplicate);
                    if (previousIndex <= findPositionOfDuplicate) {
                        findPositionOfDuplicate++;
                    }
                    onExceptionSwallowed(new IllegalEpoxyUsage("Two models have the same ID. ID's must be unique!\nOriginal has position " + findPositionOfDuplicate + ":\n" + abstractC3073as + "\nDuplicate has position " + previousIndex + ":\n" + next));
                }
            }
            this.timer.a();
        }
    }

    private int findPositionOfDuplicate(List<AbstractC3073as<?>> list, AbstractC3073as<?> abstractC3073as) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).b() == abstractC3073as.b()) {
                return i;
            }
        }
        throw new IllegalArgumentException("No duplicates in list");
    }

    public void setDebugLoggingEnabled(boolean z) {
        assertNotBuildingModels();
        if (z) {
            this.timer = new C2543ai(getClass().getSimpleName());
            if (this.debugObserver == null) {
                this.debugObserver = new C2861ao(getClass().getSimpleName());
            }
            this.adapter.registerAdapterDataObserver(this.debugObserver);
            return;
        }
        this.timer = NO_OP_TIMER;
        C2861ao c2861ao = this.debugObserver;
        if (c2861ao != null) {
            this.adapter.unregisterAdapterDataObserver(c2861ao);
        }
    }

    public void moveModel(int i, int i2) {
        assertNotBuildingModels();
        this.adapter.a(i, i2);
        requestDelayedModelBuild(500);
    }

    public void notifyModelChanged(int i) {
        assertNotBuildingModels();
        this.adapter.b(i);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.adapter.a(bundle);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        this.adapter.c(bundle);
    }

    public GridLayoutManager.SpanSizeLookup getSpanSizeLookup() {
        return this.adapter.e();
    }

    public void setSpanCount(int i) {
        this.adapter.d(i);
    }

    public int getSpanCount() {
        return this.adapter.b();
    }

    public boolean isMultiSpan() {
        return this.adapter.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onExceptionSwallowed(RuntimeException runtimeException) {
        globalExceptionHandler.d(this, runtimeException);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onAttachedToRecyclerViewInternal(RecyclerView recyclerView) {
        int i = this.recyclerViewAttachCount + 1;
        this.recyclerViewAttachCount = i;
        if (i > 1) {
            C2050aY.c.d.postDelayed(new Runnable() { // from class: o.ap.2
                @Override // java.lang.Runnable
                public void run() {
                    if (AbstractC2914ap.this.recyclerViewAttachCount > 1) {
                        AbstractC2914ap.this.onExceptionSwallowed(new IllegalStateException("This EpoxyController had its adapter added to more than one ReyclerView. Epoxy does not support attaching an adapter to multiple RecyclerViews because saved state will not work properly. If you did not intend to attach your adapter to multiple RecyclerViews you may be leaking a reference to a previous RecyclerView. Make sure to remove the adapter from any previous RecyclerViews (eg if the adapter is reused in a Fragment across multiple onCreateView/onDestroyView cycles). See https://github.com/airbnb/epoxy/wiki/Avoiding-Memory-Leaks for more information."));
                    }
                }
            }, OnRampFragment.ARTIFICIAL_PERSONALIZATION_WAIT_TIME);
        }
        onAttachedToRecyclerView(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onDetachedFromRecyclerViewInternal(RecyclerView recyclerView) {
        this.recyclerViewAttachCount--;
        onDetachedFromRecyclerView(recyclerView);
    }
}

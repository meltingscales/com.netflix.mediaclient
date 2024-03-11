package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.TaskStackBuilder;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavControllerViewModel;
import androidx.navigation.NavDeepLinkRequest;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.BufferOverflow;
import o.C8560dqc;
import o.C8569dql;
import o.C8571dqn;
import o.C8576dqs;
import o.C8621dsj;
import o.C8627dsp;
import o.C8632dsu;
import o.C8670due;
import o.C8820dzt;
import o.InterfaceC8554dpx;
import o.InterfaceC8810dzj;
import o.InterfaceC8812dzl;
import o.InterfaceC8822dzv;
import o.dpB;
import o.dpR;
import o.drM;
import o.drO;
import o.dtQ;
import o.dtY;
import o.dyR;
import o.dyS;
import o.dzB;
import org.linphone.core.Privacy;

/* loaded from: classes5.dex */
public class NavController {
    public static final Companion Companion = new Companion(null);
    private static boolean deepLinkSaveState = true;
    private final InterfaceC8810dzj<NavBackStackEntry> _currentBackStackEntryFlow;
    private NavGraph _graph;
    private NavigatorProvider _navigatorProvider;
    private final InterfaceC8812dzl<List<NavBackStackEntry>> _visibleEntries;
    private Activity activity;
    private drM<? super NavBackStackEntry, dpR> addToBackStackHandler;
    private final C8560dqc<NavBackStackEntry> backQueue;
    private final List<NavBackStackEntry> backStackEntriesToDispatch;
    private final Map<Integer, String> backStackMap;
    private final Map<String, C8560dqc<NavBackStackEntryState>> backStackStates;
    private Parcelable[] backStackToRestore;
    private final Map<NavBackStackEntry, NavBackStackEntry> childToParentEntries;
    private final Context context;
    private final dyS<NavBackStackEntry> currentBackStackEntryFlow;
    private boolean deepLinkHandled;
    private int dispatchReentrantCount;
    private boolean enableOnBackPressedCallback;
    private final Map<NavBackStackEntry, Boolean> entrySavedState;
    private Lifecycle.State hostLifecycleState;
    private NavInflater inflater;
    private final LifecycleObserver lifecycleObserver;
    private LifecycleOwner lifecycleOwner;
    private final InterfaceC8554dpx navInflater$delegate;
    private final Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> navigatorState;
    private Bundle navigatorStateToRestore;
    private final OnBackPressedCallback onBackPressedCallback;
    private OnBackPressedDispatcher onBackPressedDispatcher;
    private final CopyOnWriteArrayList<OnDestinationChangedListener> onDestinationChangedListeners;
    private final Map<NavBackStackEntry, AtomicInteger> parentToChildCount;
    private drM<? super NavBackStackEntry, dpR> popFromBackStackHandler;
    private NavControllerViewModel viewModel;
    private final InterfaceC8822dzv<List<NavBackStackEntry>> visibleEntries;

    /* loaded from: classes5.dex */
    public interface OnDestinationChangedListener {
        void onDestinationChanged(NavController navController, NavDestination navDestination, Bundle bundle);
    }

    public C8560dqc<NavBackStackEntry> getBackQueue() {
        return this.backQueue;
    }

    public final Context getContext() {
        return this.context;
    }

    public final dyS<NavBackStackEntry> getCurrentBackStackEntryFlow() {
        return this.currentBackStackEntryFlow;
    }

    public NavigatorProvider getNavigatorProvider() {
        return this._navigatorProvider;
    }

    public final InterfaceC8822dzv<List<NavBackStackEntry>> getVisibleEntries() {
        return this.visibleEntries;
    }

    public NavController(Context context) {
        dtQ a;
        Object obj;
        List i;
        InterfaceC8554dpx b;
        C8632dsu.c((Object) context, "");
        this.context = context;
        a = dtY.a(context, new drM<Context, Context>() { // from class: androidx.navigation.NavController$activity$1
            @Override // o.drM
            public final Context invoke(Context context2) {
                C8632dsu.c((Object) context2, "");
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            }
        });
        Iterator it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.activity = (Activity) obj;
        this.backQueue = new C8560dqc<>();
        i = C8569dql.i();
        InterfaceC8812dzl<List<NavBackStackEntry>> d = dzB.d(i);
        this._visibleEntries = d;
        this.visibleEntries = dyR.b((InterfaceC8812dzl) d);
        this.childToParentEntries = new LinkedHashMap();
        this.parentToChildCount = new LinkedHashMap();
        this.backStackMap = new LinkedHashMap();
        this.backStackStates = new LinkedHashMap();
        this.onDestinationChangedListeners = new CopyOnWriteArrayList<>();
        this.hostLifecycleState = Lifecycle.State.INITIALIZED;
        this.lifecycleObserver = new LifecycleEventObserver() { // from class: androidx.navigation.NavController$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                NavController.m2732lifecycleObserver$lambda2(NavController.this, lifecycleOwner, event);
            }
        };
        this.onBackPressedCallback = new OnBackPressedCallback() { // from class: androidx.navigation.NavController$onBackPressedCallback$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(false);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                NavController.this.popBackStack();
            }
        };
        this.enableOnBackPressedCallback = true;
        this._navigatorProvider = new NavigatorProvider();
        this.navigatorState = new LinkedHashMap();
        this.entrySavedState = new LinkedHashMap();
        NavigatorProvider navigatorProvider = this._navigatorProvider;
        navigatorProvider.addNavigator(new NavGraphNavigator(navigatorProvider));
        this._navigatorProvider.addNavigator(new ActivityNavigator(this.context));
        this.backStackEntriesToDispatch = new ArrayList();
        b = dpB.b(new drO<NavInflater>() { // from class: androidx.navigation.NavController$navInflater$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final NavInflater invoke() {
                NavInflater navInflater;
                navInflater = NavController.this.inflater;
                return navInflater == null ? new NavInflater(NavController.this.getContext(), NavController.this._navigatorProvider) : navInflater;
            }
        });
        this.navInflater$delegate = b;
        InterfaceC8810dzj<NavBackStackEntry> b2 = C8820dzt.b(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this._currentBackStackEntryFlow = b2;
        this.currentBackStackEntryFlow = dyR.e((InterfaceC8810dzj) b2);
    }

    public NavGraph getGraph() {
        NavGraph navGraph = this._graph;
        if (navGraph != null) {
            if (navGraph != null) {
                return navGraph;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavGraph");
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
    }

    public void setGraph(NavGraph navGraph) {
        C8632dsu.c((Object) navGraph, "");
        setGraph(navGraph, null);
    }

    private final void linkChildToParent(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2) {
        this.childToParentEntries.put(navBackStackEntry, navBackStackEntry2);
        if (this.parentToChildCount.get(navBackStackEntry2) == null) {
            this.parentToChildCount.put(navBackStackEntry2, new AtomicInteger(0));
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(navBackStackEntry2);
        C8632dsu.d(atomicInteger);
        atomicInteger.incrementAndGet();
    }

    public final NavBackStackEntry unlinkChildFromParent$navigation_runtime_release(NavBackStackEntry navBackStackEntry) {
        C8632dsu.c((Object) navBackStackEntry, "");
        NavBackStackEntry remove = this.childToParentEntries.remove(navBackStackEntry);
        if (remove == null) {
            return null;
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(remove);
        Integer valueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(this._navigatorProvider.getNavigator(remove.getDestination().getNavigatorName()));
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.markTransitionComplete(remove);
            }
            this.parentToChildCount.remove(remove);
        }
        return remove;
    }

    public final Lifecycle.State getHostLifecycleState$navigation_runtime_release() {
        return this.lifecycleOwner == null ? Lifecycle.State.CREATED : this.hostLifecycleState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lifecycleObserver$lambda-2  reason: not valid java name */
    public static final void m2732lifecycleObserver$lambda2(NavController navController, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C8632dsu.c((Object) navController, "");
        C8632dsu.c((Object) lifecycleOwner, "");
        C8632dsu.c((Object) event, "");
        Lifecycle.State targetState = event.getTargetState();
        C8632dsu.a(targetState, "");
        navController.hostLifecycleState = targetState;
        if (navController._graph != null) {
            Iterator<NavBackStackEntry> it = navController.getBackQueue().iterator();
            while (it.hasNext()) {
                it.next().handleLifecycleEvent(event);
            }
        }
    }

    private final void navigateInternal(Navigator<? extends NavDestination> navigator, List<NavBackStackEntry> list, NavOptions navOptions, Navigator.Extras extras, drM<? super NavBackStackEntry, dpR> drm) {
        this.addToBackStackHandler = drm;
        navigator.navigate(list, navOptions, extras);
        this.addToBackStackHandler = null;
    }

    private final void popBackStackInternal(Navigator<? extends NavDestination> navigator, NavBackStackEntry navBackStackEntry, boolean z, drM<? super NavBackStackEntry, dpR> drm) {
        this.popFromBackStackHandler = drm;
        navigator.popBackStack(navBackStackEntry, z);
        this.popFromBackStackHandler = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class NavControllerNavigatorState extends NavigatorState {
        private final Navigator<? extends NavDestination> navigator;
        final /* synthetic */ NavController this$0;

        public NavControllerNavigatorState(NavController navController, Navigator<? extends NavDestination> navigator) {
            C8632dsu.c((Object) navigator, "");
            this.this$0 = navController;
            this.navigator = navigator;
        }

        @Override // androidx.navigation.NavigatorState
        public void push(NavBackStackEntry navBackStackEntry) {
            C8632dsu.c((Object) navBackStackEntry, "");
            Navigator navigator = this.this$0._navigatorProvider.getNavigator(navBackStackEntry.getDestination().getNavigatorName());
            if (C8632dsu.c(navigator, this.navigator)) {
                drM drm = this.this$0.addToBackStackHandler;
                if (drm != null) {
                    drm.invoke(navBackStackEntry);
                    addInternal(navBackStackEntry);
                    return;
                }
                Log.i("NavController", "Ignoring add of destination " + navBackStackEntry.getDestination() + " outside of the call to navigate(). ");
                return;
            }
            Object obj = this.this$0.navigatorState.get(navigator);
            if (obj == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + navBackStackEntry.getDestination().getNavigatorName() + " should already be created").toString());
            }
            ((NavControllerNavigatorState) obj).push(navBackStackEntry);
        }

        public final void addInternal(NavBackStackEntry navBackStackEntry) {
            C8632dsu.c((Object) navBackStackEntry, "");
            super.push(navBackStackEntry);
        }

        @Override // androidx.navigation.NavigatorState
        public NavBackStackEntry createBackStackEntry(NavDestination navDestination, Bundle bundle) {
            C8632dsu.c((Object) navDestination, "");
            return NavBackStackEntry.Companion.create$default(NavBackStackEntry.Companion, this.this$0.getContext(), navDestination, bundle, this.this$0.getHostLifecycleState$navigation_runtime_release(), this.this$0.viewModel, null, null, 96, null);
        }

        @Override // androidx.navigation.NavigatorState
        public void pop(final NavBackStackEntry navBackStackEntry, final boolean z) {
            C8632dsu.c((Object) navBackStackEntry, "");
            Navigator navigator = this.this$0._navigatorProvider.getNavigator(navBackStackEntry.getDestination().getNavigatorName());
            if (C8632dsu.c(navigator, this.navigator)) {
                drM drm = this.this$0.popFromBackStackHandler;
                if (drm != null) {
                    drm.invoke(navBackStackEntry);
                    super.pop(navBackStackEntry, z);
                    return;
                }
                this.this$0.popBackStackFromNavigator$navigation_runtime_release(navBackStackEntry, new drO<dpR>() { // from class: androidx.navigation.NavController$NavControllerNavigatorState$pop$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // o.drO
                    public /* bridge */ /* synthetic */ dpR invoke() {
                        invoke2();
                        return dpR.c;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        super/*androidx.navigation.NavigatorState*/.pop(navBackStackEntry, z);
                    }
                });
                return;
            }
            Object obj = this.this$0.navigatorState.get(navigator);
            C8632dsu.d(obj);
            ((NavControllerNavigatorState) obj).pop(navBackStackEntry, z);
        }

        @Override // androidx.navigation.NavigatorState
        public void popWithTransition(NavBackStackEntry navBackStackEntry, boolean z) {
            C8632dsu.c((Object) navBackStackEntry, "");
            super.popWithTransition(navBackStackEntry, z);
            this.this$0.entrySavedState.put(navBackStackEntry, Boolean.valueOf(z));
        }

        @Override // androidx.navigation.NavigatorState
        public void markTransitionComplete(NavBackStackEntry navBackStackEntry) {
            NavControllerViewModel navControllerViewModel;
            C8632dsu.c((Object) navBackStackEntry, "");
            boolean c = C8632dsu.c(this.this$0.entrySavedState.get(navBackStackEntry), Boolean.TRUE);
            super.markTransitionComplete(navBackStackEntry);
            this.this$0.entrySavedState.remove(navBackStackEntry);
            if (!this.this$0.getBackQueue().contains(navBackStackEntry)) {
                this.this$0.unlinkChildFromParent$navigation_runtime_release(navBackStackEntry);
                if (navBackStackEntry.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                    navBackStackEntry.setMaxLifecycle(Lifecycle.State.DESTROYED);
                }
                C8560dqc<NavBackStackEntry> backQueue = this.this$0.getBackQueue();
                if (!(backQueue instanceof Collection) || !backQueue.isEmpty()) {
                    for (NavBackStackEntry navBackStackEntry2 : backQueue) {
                        if (C8632dsu.c((Object) navBackStackEntry2.getId(), (Object) navBackStackEntry.getId())) {
                            break;
                        }
                    }
                }
                if (!c && (navControllerViewModel = this.this$0.viewModel) != null) {
                    navControllerViewModel.clear(navBackStackEntry.getId());
                }
                this.this$0.updateBackStackLifecycle$navigation_runtime_release();
                this.this$0._visibleEntries.a(this.this$0.populateVisibleEntries$navigation_runtime_release());
            } else if (!isNavigating()) {
                this.this$0.updateBackStackLifecycle$navigation_runtime_release();
                this.this$0._visibleEntries.a(this.this$0.populateVisibleEntries$navigation_runtime_release());
            }
        }
    }

    public boolean popBackStack() {
        if (getBackQueue().isEmpty()) {
            return false;
        }
        NavDestination currentDestination = getCurrentDestination();
        C8632dsu.d(currentDestination);
        return popBackStack(currentDestination.getId(), true);
    }

    public boolean popBackStack(int i, boolean z) {
        return popBackStack(i, z, false);
    }

    public boolean popBackStack(int i, boolean z, boolean z2) {
        return popBackStackInternal(i, z, z2) && dispatchOnDestinationChanged();
    }

    static /* synthetic */ boolean popBackStackInternal$default(NavController navController, int i, boolean z, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                z2 = false;
            }
            return navController.popBackStackInternal(i, z, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
    }

    private final boolean popBackStackInternal(int i, boolean z, final boolean z2) {
        List N;
        NavDestination navDestination;
        dtQ a;
        dtQ<NavDestination> s;
        dtQ a2;
        dtQ<NavDestination> s2;
        if (getBackQueue().isEmpty()) {
            return false;
        }
        ArrayList<Navigator<? extends NavDestination>> arrayList = new ArrayList();
        N = C8576dqs.N(getBackQueue());
        Iterator it = N.iterator();
        while (true) {
            if (!it.hasNext()) {
                navDestination = null;
                break;
            }
            NavDestination destination = ((NavBackStackEntry) it.next()).getDestination();
            Navigator navigator = this._navigatorProvider.getNavigator(destination.getNavigatorName());
            if (z || destination.getId() != i) {
                arrayList.add(navigator);
            }
            if (destination.getId() == i) {
                navDestination = destination;
                break;
            }
        }
        if (navDestination == null) {
            String displayName = NavDestination.Companion.getDisplayName(this.context, i);
            Log.i("NavController", "Ignoring popBackStack to destination " + displayName + " as it was not found on the current back stack");
            return false;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final C8560dqc<NavBackStackEntryState> c8560dqc = new C8560dqc<>();
        for (Navigator<? extends NavDestination> navigator2 : arrayList) {
            final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            popBackStackInternal(navigator2, getBackQueue().e(), z2, new drM<NavBackStackEntry, dpR>() { // from class: androidx.navigation.NavController$popBackStackInternal$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* bridge */ /* synthetic */ dpR invoke(NavBackStackEntry navBackStackEntry) {
                    invoke2(navBackStackEntry);
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(NavBackStackEntry navBackStackEntry) {
                    C8632dsu.c((Object) navBackStackEntry, "");
                    Ref.BooleanRef.this.a = true;
                    booleanRef.a = true;
                    this.popEntryFromBackStack(navBackStackEntry, z2, c8560dqc);
                }
            });
            if (!booleanRef2.a) {
                break;
            }
        }
        if (z2) {
            if (!z) {
                a2 = dtY.a(navDestination, new drM<NavDestination, NavDestination>() { // from class: androidx.navigation.NavController$popBackStackInternal$3
                    @Override // o.drM
                    public final NavDestination invoke(NavDestination navDestination2) {
                        C8632dsu.c((Object) navDestination2, "");
                        NavGraph parent = navDestination2.getParent();
                        if (parent == null || parent.getStartDestinationId() != navDestination2.getId()) {
                            return null;
                        }
                        return navDestination2.getParent();
                    }
                });
                s2 = C8670due.s(a2, new drM<NavDestination, Boolean>() { // from class: androidx.navigation.NavController$popBackStackInternal$4
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public final Boolean invoke(NavDestination navDestination2) {
                        Map map;
                        C8632dsu.c((Object) navDestination2, "");
                        map = NavController.this.backStackMap;
                        return Boolean.valueOf(!map.containsKey(Integer.valueOf(navDestination2.getId())));
                    }
                });
                for (NavDestination navDestination2 : s2) {
                    Map<Integer, String> map = this.backStackMap;
                    int id = navDestination2.getId();
                    NavBackStackEntryState c = c8560dqc.c();
                    map.put(Integer.valueOf(id), c != null ? c.getId() : null);
                }
            }
            if (!c8560dqc.isEmpty()) {
                NavBackStackEntryState b = c8560dqc.b();
                a = dtY.a(findDestination(b.getDestinationId()), new drM<NavDestination, NavDestination>() { // from class: androidx.navigation.NavController$popBackStackInternal$6
                    @Override // o.drM
                    public final NavDestination invoke(NavDestination navDestination3) {
                        C8632dsu.c((Object) navDestination3, "");
                        NavGraph parent = navDestination3.getParent();
                        if (parent == null || parent.getStartDestinationId() != navDestination3.getId()) {
                            return null;
                        }
                        return navDestination3.getParent();
                    }
                });
                s = C8670due.s(a, new drM<NavDestination, Boolean>() { // from class: androidx.navigation.NavController$popBackStackInternal$7
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public final Boolean invoke(NavDestination navDestination3) {
                        Map map2;
                        C8632dsu.c((Object) navDestination3, "");
                        map2 = NavController.this.backStackMap;
                        return Boolean.valueOf(!map2.containsKey(Integer.valueOf(navDestination3.getId())));
                    }
                });
                for (NavDestination navDestination3 : s) {
                    this.backStackMap.put(Integer.valueOf(navDestination3.getId()), b.getId());
                }
                this.backStackStates.put(b.getId(), c8560dqc);
            }
        }
        updateOnBackPressedCallbackEnabled();
        return booleanRef.a;
    }

    public final void popBackStackFromNavigator$navigation_runtime_release(NavBackStackEntry navBackStackEntry, drO<dpR> dro) {
        C8632dsu.c((Object) navBackStackEntry, "");
        C8632dsu.c((Object) dro, "");
        int indexOf = getBackQueue().indexOf(navBackStackEntry);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + navBackStackEntry + " as it was not found on the current back stack");
            return;
        }
        int i = indexOf + 1;
        if (i != getBackQueue().size()) {
            popBackStackInternal(getBackQueue().get(i).getDestination().getId(), true, false);
        }
        popEntryFromBackStack$default(this, navBackStackEntry, false, null, 6, null);
        dro.invoke();
        updateOnBackPressedCallbackEnabled();
        dispatchOnDestinationChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void popEntryFromBackStack$default(NavController navController, NavBackStackEntry navBackStackEntry, boolean z, C8560dqc c8560dqc, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            c8560dqc = new C8560dqc();
        }
        navController.popEntryFromBackStack(navBackStackEntry, z, c8560dqc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void popEntryFromBackStack(NavBackStackEntry navBackStackEntry, boolean z, C8560dqc<NavBackStackEntryState> c8560dqc) {
        NavControllerViewModel navControllerViewModel;
        InterfaceC8822dzv<Set<NavBackStackEntry>> transitionsInProgress;
        Set<NavBackStackEntry> b;
        NavBackStackEntry e = getBackQueue().e();
        if (!C8632dsu.c(e, navBackStackEntry)) {
            throw new IllegalStateException(("Attempted to pop " + navBackStackEntry.getDestination() + ", which is not the top of the back stack (" + e.getDestination() + ')').toString());
        }
        getBackQueue().j();
        NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(getNavigatorProvider().getNavigator(e.getDestination().getNavigatorName()));
        boolean z2 = true;
        if ((navControllerNavigatorState == null || (transitionsInProgress = navControllerNavigatorState.getTransitionsInProgress()) == null || (b = transitionsInProgress.b()) == null || !b.contains(e)) && !this.parentToChildCount.containsKey(e)) {
            z2 = false;
        }
        Lifecycle.State currentState = e.getLifecycle().getCurrentState();
        Lifecycle.State state = Lifecycle.State.CREATED;
        if (currentState.isAtLeast(state)) {
            if (z) {
                e.setMaxLifecycle(state);
                c8560dqc.c((C8560dqc<NavBackStackEntryState>) new NavBackStackEntryState(e));
            }
            if (!z2) {
                e.setMaxLifecycle(Lifecycle.State.DESTROYED);
                unlinkChildFromParent$navigation_runtime_release(e);
            } else {
                e.setMaxLifecycle(state);
            }
        }
        if (z || z2 || (navControllerViewModel = this.viewModel) == null) {
            return;
        }
        navControllerViewModel.clear(e.getId());
    }

    private final boolean clearBackStackInternal(int i) {
        for (NavControllerNavigatorState navControllerNavigatorState : this.navigatorState.values()) {
            navControllerNavigatorState.setNavigating(true);
        }
        boolean restoreStateInternal = restoreStateInternal(i, null, null, null);
        for (NavControllerNavigatorState navControllerNavigatorState2 : this.navigatorState.values()) {
            navControllerNavigatorState2.setNavigating(false);
        }
        return restoreStateInternal && popBackStackInternal(i, true, false);
    }

    private final int getDestinationCountOnBackStack() {
        C8560dqc<NavBackStackEntry> backQueue = getBackQueue();
        int i = 0;
        if (!(backQueue instanceof Collection) || !backQueue.isEmpty()) {
            for (NavBackStackEntry navBackStackEntry : backQueue) {
                if ((!(navBackStackEntry.getDestination() instanceof NavGraph)) && (i = i + 1) < 0) {
                    C8569dql.f();
                }
            }
        }
        return i;
    }

    private final boolean dispatchOnDestinationChanged() {
        List<NavBackStackEntry> n;
        while (!getBackQueue().isEmpty() && (getBackQueue().e().getDestination() instanceof NavGraph)) {
            popEntryFromBackStack$default(this, getBackQueue().e(), false, null, 6, null);
        }
        NavBackStackEntry a = getBackQueue().a();
        if (a != null) {
            this.backStackEntriesToDispatch.add(a);
        }
        this.dispatchReentrantCount++;
        updateBackStackLifecycle$navigation_runtime_release();
        int i = this.dispatchReentrantCount - 1;
        this.dispatchReentrantCount = i;
        if (i == 0) {
            n = C8576dqs.n(this.backStackEntriesToDispatch);
            this.backStackEntriesToDispatch.clear();
            for (NavBackStackEntry navBackStackEntry : n) {
                Iterator<OnDestinationChangedListener> it = this.onDestinationChangedListeners.iterator();
                while (it.hasNext()) {
                    it.next().onDestinationChanged(this, navBackStackEntry.getDestination(), navBackStackEntry.getArguments());
                }
                this._currentBackStackEntryFlow.a(navBackStackEntry);
            }
            this._visibleEntries.a(populateVisibleEntries$navigation_runtime_release());
        }
        return a != null;
    }

    public final void updateBackStackLifecycle$navigation_runtime_release() {
        List<NavBackStackEntry> n;
        Object B;
        NavDestination navDestination;
        List<NavBackStackEntry> N;
        AtomicInteger atomicInteger;
        InterfaceC8822dzv<Set<NavBackStackEntry>> transitionsInProgress;
        Set<NavBackStackEntry> b;
        List<NavBackStackEntry> N2;
        n = C8576dqs.n(getBackQueue());
        if (n.isEmpty()) {
            return;
        }
        B = C8576dqs.B((List<? extends Object>) n);
        NavDestination destination = ((NavBackStackEntry) B).getDestination();
        if (destination instanceof FloatingWindow) {
            N2 = C8576dqs.N(n);
            for (NavBackStackEntry navBackStackEntry : N2) {
                navDestination = navBackStackEntry.getDestination();
                if (!(navDestination instanceof NavGraph) && !(navDestination instanceof FloatingWindow)) {
                    break;
                }
            }
        }
        navDestination = null;
        HashMap hashMap = new HashMap();
        N = C8576dqs.N(n);
        for (NavBackStackEntry navBackStackEntry2 : N) {
            Lifecycle.State maxLifecycle = navBackStackEntry2.getMaxLifecycle();
            NavDestination destination2 = navBackStackEntry2.getDestination();
            if (destination != null && destination2.getId() == destination.getId()) {
                Lifecycle.State state = Lifecycle.State.RESUMED;
                if (maxLifecycle != state) {
                    NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(getNavigatorProvider().getNavigator(navBackStackEntry2.getDestination().getNavigatorName()));
                    if (!C8632dsu.c((navControllerNavigatorState == null || (transitionsInProgress = navControllerNavigatorState.getTransitionsInProgress()) == null || (b = transitionsInProgress.b()) == null) ? null : Boolean.valueOf(b.contains(navBackStackEntry2)), Boolean.TRUE) && ((atomicInteger = this.parentToChildCount.get(navBackStackEntry2)) == null || atomicInteger.get() != 0)) {
                        hashMap.put(navBackStackEntry2, state);
                    } else {
                        hashMap.put(navBackStackEntry2, Lifecycle.State.STARTED);
                    }
                }
                destination = destination.getParent();
            } else if (navDestination != null && destination2.getId() == navDestination.getId()) {
                if (maxLifecycle == Lifecycle.State.RESUMED) {
                    navBackStackEntry2.setMaxLifecycle(Lifecycle.State.STARTED);
                } else {
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    if (maxLifecycle != state2) {
                        hashMap.put(navBackStackEntry2, state2);
                    }
                }
                navDestination = navDestination.getParent();
            } else {
                navBackStackEntry2.setMaxLifecycle(Lifecycle.State.CREATED);
            }
        }
        for (NavBackStackEntry navBackStackEntry3 : n) {
            Lifecycle.State state3 = (Lifecycle.State) hashMap.get(navBackStackEntry3);
            if (state3 != null) {
                navBackStackEntry3.setMaxLifecycle(state3);
            } else {
                navBackStackEntry3.updateState();
            }
        }
    }

    public final List<NavBackStackEntry> populateVisibleEntries$navigation_runtime_release() {
        ArrayList arrayList = new ArrayList();
        for (NavControllerNavigatorState navControllerNavigatorState : this.navigatorState.values()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : navControllerNavigatorState.getTransitionsInProgress().b()) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if (!arrayList.contains(navBackStackEntry) && !navBackStackEntry.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            C8571dqn.b(arrayList, arrayList2);
        }
        C8560dqc<NavBackStackEntry> backQueue = getBackQueue();
        ArrayList arrayList3 = new ArrayList();
        for (NavBackStackEntry navBackStackEntry2 : backQueue) {
            NavBackStackEntry navBackStackEntry3 = navBackStackEntry2;
            if (!arrayList.contains(navBackStackEntry3) && navBackStackEntry3.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                arrayList3.add(navBackStackEntry2);
            }
        }
        C8571dqn.b(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((NavBackStackEntry) obj2).getDestination() instanceof NavGraph)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public void setGraph(NavGraph navGraph, Bundle bundle) {
        C8632dsu.c((Object) navGraph, "");
        if (!C8632dsu.c(this._graph, navGraph)) {
            NavGraph navGraph2 = this._graph;
            if (navGraph2 != null) {
                for (Integer num : new ArrayList(this.backStackMap.keySet())) {
                    C8632dsu.a(num, "");
                    clearBackStackInternal(num.intValue());
                }
                popBackStackInternal$default(this, navGraph2.getId(), true, false, 4, null);
            }
            this._graph = navGraph;
            onGraphCreated(bundle);
            return;
        }
        int size = navGraph.getNodes().size();
        for (int i = 0; i < size; i++) {
            NavDestination valueAt = navGraph.getNodes().valueAt(i);
            NavGraph navGraph3 = this._graph;
            C8632dsu.d(navGraph3);
            navGraph3.getNodes().replace(i, valueAt);
            C8560dqc<NavBackStackEntry> backQueue = getBackQueue();
            ArrayList<NavBackStackEntry> arrayList = new ArrayList();
            for (NavBackStackEntry navBackStackEntry : backQueue) {
                NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
                if (valueAt != null && navBackStackEntry2.getDestination().getId() == valueAt.getId()) {
                    arrayList.add(navBackStackEntry);
                }
            }
            for (NavBackStackEntry navBackStackEntry3 : arrayList) {
                C8632dsu.a(valueAt, "");
                navBackStackEntry3.setDestination(valueAt);
            }
        }
    }

    private final void onGraphCreated(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.navigatorStateToRestore;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                NavigatorProvider navigatorProvider = this._navigatorProvider;
                C8632dsu.a(next, "");
                Navigator navigator = navigatorProvider.getNavigator(next);
                Bundle bundle3 = bundle2.getBundle(next);
                if (bundle3 != null) {
                    navigator.onRestoreState(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.backStackToRestore;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                NavDestination findDestination = findDestination(navBackStackEntryState.getDestinationId());
                if (findDestination == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + NavDestination.Companion.getDisplayName(this.context, navBackStackEntryState.getDestinationId()) + " cannot be found from the current destination " + getCurrentDestination());
                }
                NavBackStackEntry instantiate = navBackStackEntryState.instantiate(this.context, findDestination, getHostLifecycleState$navigation_runtime_release(), this.viewModel);
                Navigator<? extends NavDestination> navigator2 = this._navigatorProvider.getNavigator(findDestination.getNavigatorName());
                Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> map = this.navigatorState;
                NavControllerNavigatorState navControllerNavigatorState = map.get(navigator2);
                if (navControllerNavigatorState == null) {
                    navControllerNavigatorState = new NavControllerNavigatorState(this, navigator2);
                    map.put(navigator2, navControllerNavigatorState);
                }
                getBackQueue().add(instantiate);
                navControllerNavigatorState.addInternal(instantiate);
                NavGraph parent = instantiate.getDestination().getParent();
                if (parent != null) {
                    linkChildToParent(instantiate, getBackStackEntry(parent.getId()));
                }
            }
            updateOnBackPressedCallbackEnabled();
            this.backStackToRestore = null;
        }
        ArrayList<Navigator<? extends NavDestination>> arrayList = new ArrayList();
        for (Object obj : this._navigatorProvider.getNavigators().values()) {
            if (!((Navigator) obj).isAttached()) {
                arrayList.add(obj);
            }
        }
        for (Navigator<? extends NavDestination> navigator3 : arrayList) {
            Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> map2 = this.navigatorState;
            NavControllerNavigatorState navControllerNavigatorState2 = map2.get(navigator3);
            if (navControllerNavigatorState2 == null) {
                navControllerNavigatorState2 = new NavControllerNavigatorState(this, navigator3);
                map2.put(navigator3, navControllerNavigatorState2);
            }
            navigator3.onAttach(navControllerNavigatorState2);
        }
        if (this._graph != null && getBackQueue().isEmpty()) {
            if (!this.deepLinkHandled && (activity = this.activity) != null) {
                C8632dsu.d(activity);
                if (handleDeepLink(activity.getIntent())) {
                    return;
                }
            }
            NavGraph navGraph = this._graph;
            C8632dsu.d(navGraph);
            navigate(navGraph, bundle, null, null);
            return;
        }
        dispatchOnDestinationChanged();
    }

    public boolean handleDeepLink(Intent intent) {
        int[] iArr;
        NavDestination findNode;
        NavGraph navGraph;
        Bundle bundle;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if (intArray == null || intArray.length == 0) {
            NavGraph navGraph2 = this._graph;
            C8632dsu.d(navGraph2);
            NavDestination.DeepLinkMatch matchDeepLink = navGraph2.matchDeepLink(new NavDeepLinkRequest(intent));
            if (matchDeepLink != null) {
                NavDestination destination = matchDeepLink.getDestination();
                int[] buildDeepLinkIds$default = NavDestination.buildDeepLinkIds$default(destination, null, 1, null);
                Bundle addInDefaultArgs = destination.addInDefaultArgs(matchDeepLink.getMatchingArgs());
                if (addInDefaultArgs != null) {
                    bundle2.putAll(addInDefaultArgs);
                }
                iArr = buildDeepLinkIds$default;
                parcelableArrayList = null;
                if (iArr != null || iArr.length == 0) {
                    return false;
                }
                String findInvalidDestinationDisplayNameInDeepLink = findInvalidDestinationDisplayNameInDeepLink(iArr);
                if (findInvalidDestinationDisplayNameInDeepLink != null) {
                    Log.i("NavController", "Could not find destination " + findInvalidDestinationDisplayNameInDeepLink + " in the navigation graph, ignoring the deep link from " + intent);
                    return false;
                }
                bundle2.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                int length = iArr.length;
                Bundle[] bundleArr = new Bundle[length];
                for (int i = 0; i < length; i++) {
                    Bundle bundle4 = new Bundle();
                    bundle4.putAll(bundle2);
                    if (parcelableArrayList != null && (bundle = (Bundle) parcelableArrayList.get(i)) != null) {
                        bundle4.putAll(bundle);
                    }
                    bundleArr[i] = bundle4;
                }
                int flags = intent.getFlags();
                int i2 = 268435456 & flags;
                if (i2 != 0 && (flags & Privacy.DEFAULT) == 0) {
                    intent.addFlags(Privacy.DEFAULT);
                    TaskStackBuilder addNextIntentWithParentStack = TaskStackBuilder.create(this.context).addNextIntentWithParentStack(intent);
                    C8632dsu.a(addNextIntentWithParentStack, "");
                    addNextIntentWithParentStack.startActivities();
                    Activity activity = this.activity;
                    if (activity != null) {
                        activity.finish();
                        activity.overridePendingTransition(0, 0);
                    }
                    return true;
                } else if (i2 != 0) {
                    if (!getBackQueue().isEmpty()) {
                        NavGraph navGraph3 = this._graph;
                        C8632dsu.d(navGraph3);
                        popBackStackInternal$default(this, navGraph3.getId(), true, false, 4, null);
                    }
                    for (int i3 = 0; i3 < iArr.length; i3++) {
                        int i4 = iArr[i3];
                        Bundle bundle5 = bundleArr[i3];
                        final NavDestination findDestination = findDestination(i4);
                        if (findDestination == null) {
                            throw new IllegalStateException("Deep Linking failed: destination " + NavDestination.Companion.getDisplayName(this.context, i4) + " cannot be found from the current destination " + getCurrentDestination());
                        }
                        navigate(findDestination, bundle5, NavOptionsBuilderKt.navOptions(new drM<NavOptionsBuilder, dpR>() { // from class: androidx.navigation.NavController$handleDeepLink$2
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            public /* bridge */ /* synthetic */ dpR invoke(NavOptionsBuilder navOptionsBuilder) {
                                invoke2(navOptionsBuilder);
                                return dpR.c;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2(NavOptionsBuilder navOptionsBuilder) {
                                boolean z;
                                C8632dsu.c((Object) navOptionsBuilder, "");
                                navOptionsBuilder.anim(new drM<AnimBuilder, dpR>() { // from class: androidx.navigation.NavController$handleDeepLink$2.1
                                    @Override // o.drM
                                    public /* bridge */ /* synthetic */ dpR invoke(AnimBuilder animBuilder) {
                                        invoke2(animBuilder);
                                        return dpR.c;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2(AnimBuilder animBuilder) {
                                        C8632dsu.c((Object) animBuilder, "");
                                        animBuilder.setEnter(0);
                                        animBuilder.setExit(0);
                                    }
                                });
                                NavDestination navDestination = NavDestination.this;
                                if (navDestination instanceof NavGraph) {
                                    dtQ<NavDestination> hierarchy = NavDestination.Companion.getHierarchy(navDestination);
                                    NavController navController = this;
                                    for (NavDestination navDestination2 : hierarchy) {
                                        NavDestination currentDestination = navController.getCurrentDestination();
                                        if (C8632dsu.c(navDestination2, currentDestination != null ? currentDestination.getParent() : null)) {
                                            return;
                                        }
                                    }
                                    z = NavController.deepLinkSaveState;
                                    if (z) {
                                        navOptionsBuilder.popUpTo(NavGraph.Companion.findStartDestination(this.getGraph()).getId(), new drM<PopUpToBuilder, dpR>() { // from class: androidx.navigation.NavController$handleDeepLink$2.2
                                            @Override // o.drM
                                            public /* bridge */ /* synthetic */ dpR invoke(PopUpToBuilder popUpToBuilder) {
                                                invoke2(popUpToBuilder);
                                                return dpR.c;
                                            }

                                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                            public final void invoke2(PopUpToBuilder popUpToBuilder) {
                                                C8632dsu.c((Object) popUpToBuilder, "");
                                                popUpToBuilder.setSaveState(true);
                                            }
                                        });
                                    }
                                }
                            }
                        }), null);
                    }
                    return true;
                } else {
                    NavGraph navGraph4 = this._graph;
                    int length2 = iArr.length;
                    for (int i5 = 0; i5 < length2; i5++) {
                        int i6 = iArr[i5];
                        Bundle bundle6 = bundleArr[i5];
                        if (i5 == 0) {
                            findNode = this._graph;
                        } else {
                            C8632dsu.d(navGraph4);
                            findNode = navGraph4.findNode(i6);
                        }
                        if (findNode == null) {
                            throw new IllegalStateException("Deep Linking failed: destination " + NavDestination.Companion.getDisplayName(this.context, i6) + " cannot be found in graph " + navGraph4);
                        }
                        if (i5 != iArr.length - 1) {
                            if (findNode instanceof NavGraph) {
                                while (true) {
                                    navGraph = (NavGraph) findNode;
                                    C8632dsu.d(navGraph);
                                    if (!(navGraph.findNode(navGraph.getStartDestinationId()) instanceof NavGraph)) {
                                        break;
                                    }
                                    findNode = navGraph.findNode(navGraph.getStartDestinationId());
                                }
                                navGraph4 = navGraph;
                            }
                        } else {
                            NavOptions.Builder builder = new NavOptions.Builder();
                            NavGraph navGraph5 = this._graph;
                            C8632dsu.d(navGraph5);
                            navigate(findNode, bundle6, NavOptions.Builder.setPopUpTo$default(builder, navGraph5.getId(), true, false, 4, null).setEnterAnim(0).setExitAnim(0).build(), null);
                        }
                    }
                    this.deepLinkHandled = true;
                    return true;
                }
            }
        }
        iArr = intArray;
        if (iArr != null) {
        }
        return false;
    }

    private final String findInvalidDestinationDisplayNameInDeepLink(int[] iArr) {
        NavGraph navGraph;
        NavGraph navGraph2 = this._graph;
        int length = iArr.length;
        int i = 0;
        while (true) {
            NavDestination navDestination = null;
            if (i >= length) {
                return null;
            }
            int i2 = iArr[i];
            if (i == 0) {
                NavGraph navGraph3 = this._graph;
                C8632dsu.d(navGraph3);
                if (navGraph3.getId() == i2) {
                    navDestination = this._graph;
                }
            } else {
                C8632dsu.d(navGraph2);
                navDestination = navGraph2.findNode(i2);
            }
            if (navDestination == null) {
                return NavDestination.Companion.getDisplayName(this.context, i2);
            }
            if (i != iArr.length - 1 && (navDestination instanceof NavGraph)) {
                while (true) {
                    navGraph = (NavGraph) navDestination;
                    C8632dsu.d(navGraph);
                    if (!(navGraph.findNode(navGraph.getStartDestinationId()) instanceof NavGraph)) {
                        break;
                    }
                    navDestination = navGraph.findNode(navGraph.getStartDestinationId());
                }
                navGraph2 = navGraph;
            }
            i++;
        }
    }

    public NavDestination getCurrentDestination() {
        NavBackStackEntry currentBackStackEntry = getCurrentBackStackEntry();
        if (currentBackStackEntry != null) {
            return currentBackStackEntry.getDestination();
        }
        return null;
    }

    public final NavDestination findDestination(int i) {
        NavDestination navDestination;
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            return null;
        }
        C8632dsu.d(navGraph);
        if (navGraph.getId() == i) {
            return this._graph;
        }
        NavBackStackEntry a = getBackQueue().a();
        if (a == null || (navDestination = a.getDestination()) == null) {
            navDestination = this._graph;
            C8632dsu.d(navDestination);
        }
        return findDestination(navDestination, i);
    }

    private final NavDestination findDestination(NavDestination navDestination, int i) {
        NavGraph parent;
        if (navDestination.getId() == i) {
            return navDestination;
        }
        if (navDestination instanceof NavGraph) {
            parent = (NavGraph) navDestination;
        } else {
            parent = navDestination.getParent();
            C8632dsu.d(parent);
        }
        return parent.findNode(i);
    }

    public void navigate(NavDeepLinkRequest navDeepLinkRequest, NavOptions navOptions, Navigator.Extras extras) {
        C8632dsu.c((Object) navDeepLinkRequest, "");
        NavGraph navGraph = this._graph;
        C8632dsu.d(navGraph);
        NavDestination.DeepLinkMatch matchDeepLink = navGraph.matchDeepLink(navDeepLinkRequest);
        if (matchDeepLink != null) {
            Bundle addInDefaultArgs = matchDeepLink.getDestination().addInDefaultArgs(matchDeepLink.getMatchingArgs());
            if (addInDefaultArgs == null) {
                addInDefaultArgs = new Bundle();
            }
            NavDestination destination = matchDeepLink.getDestination();
            Intent intent = new Intent();
            intent.setDataAndType(navDeepLinkRequest.getUri(), navDeepLinkRequest.getMimeType());
            intent.setAction(navDeepLinkRequest.getAction());
            addInDefaultArgs.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
            navigate(destination, addInDefaultArgs, navOptions, extras);
            return;
        }
        throw new IllegalArgumentException("Navigation destination that matches request " + navDeepLinkRequest + " cannot be found in the navigation graph " + this._graph);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x010e A[LOOP:1: B:35:0x0108->B:37:0x010e, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void navigate(final androidx.navigation.NavDestination r21, android.os.Bundle r22, androidx.navigation.NavOptions r23, androidx.navigation.Navigator.Extras r24) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.navigate(androidx.navigation.NavDestination, android.os.Bundle, androidx.navigation.NavOptions, androidx.navigation.Navigator$Extras):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean restoreStateInternal(int r14, final android.os.Bundle r15, androidx.navigation.NavOptions r16, androidx.navigation.Navigator.Extras r17) {
        /*
            r13 = this;
            r6 = r13
            java.util.Map<java.lang.Integer, java.lang.String> r0 = r6.backStackMap
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            java.util.Map<java.lang.Integer, java.lang.String> r0 = r6.backStackMap
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Map<java.lang.Integer, java.lang.String> r1 = r6.backStackMap
            java.util.Collection r1 = r1.values()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            androidx.navigation.NavController$restoreStateInternal$1 r2 = new androidx.navigation.NavController$restoreStateInternal$1
            r2.<init>()
            o.C8570dqm.d(r1, r2)
            java.util.Map<java.lang.String, o.dqc<androidx.navigation.NavBackStackEntryState>> r1 = r6.backStackStates
            java.util.Map r1 = o.dsH.d(r1)
            java.lang.Object r0 = r1.remove(r0)
            o.dqc r0 = (o.C8560dqc) r0
            java.util.List r7 = r13.instantiateBackStack(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r7.iterator()
        L49:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L62
            java.lang.Object r3 = r2.next()
            r4 = r3
            androidx.navigation.NavBackStackEntry r4 = (androidx.navigation.NavBackStackEntry) r4
            androidx.navigation.NavDestination r4 = r4.getDestination()
            boolean r4 = r4 instanceof androidx.navigation.NavGraph
            if (r4 != 0) goto L49
            r1.add(r3)
            goto L49
        L62:
            java.util.Iterator r1 = r1.iterator()
        L66:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lac
            java.lang.Object r2 = r1.next()
            androidx.navigation.NavBackStackEntry r2 = (androidx.navigation.NavBackStackEntry) r2
            java.lang.Object r3 = o.C8570dqm.i(r0)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L8d
            java.lang.Object r4 = o.C8570dqm.g(r3)
            androidx.navigation.NavBackStackEntry r4 = (androidx.navigation.NavBackStackEntry) r4
            if (r4 == 0) goto L8d
            androidx.navigation.NavDestination r4 = r4.getDestination()
            if (r4 == 0) goto L8d
            java.lang.String r4 = r4.getNavigatorName()
            goto L8e
        L8d:
            r4 = 0
        L8e:
            androidx.navigation.NavDestination r5 = r2.getDestination()
            java.lang.String r5 = r5.getNavigatorName()
            boolean r4 = o.C8632dsu.c(r4, r5)
            if (r4 == 0) goto La0
            r3.add(r2)
            goto L66
        La0:
            androidx.navigation.NavBackStackEntry[] r2 = new androidx.navigation.NavBackStackEntry[]{r2}
            java.util.List r2 = o.C8570dqm.c(r2)
            r0.add(r2)
            goto L66
        Lac:
            kotlin.jvm.internal.Ref$BooleanRef r8 = new kotlin.jvm.internal.Ref$BooleanRef
            r8.<init>()
            java.util.Iterator r9 = r0.iterator()
        Lb5:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lf1
            java.lang.Object r0 = r9.next()
            r10 = r0
            java.util.List r10 = (java.util.List) r10
            androidx.navigation.NavigatorProvider r0 = r6._navigatorProvider
            java.lang.Object r1 = o.C8570dqm.b(r10)
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            androidx.navigation.NavDestination r1 = r1.getDestination()
            java.lang.String r1 = r1.getNavigatorName()
            androidx.navigation.Navigator r11 = r0.getNavigator(r1)
            kotlin.jvm.internal.Ref$IntRef r3 = new kotlin.jvm.internal.Ref$IntRef
            r3.<init>()
            androidx.navigation.NavController$restoreStateInternal$4 r12 = new androidx.navigation.NavController$restoreStateInternal$4
            r0 = r12
            r1 = r8
            r2 = r7
            r4 = r13
            r5 = r15
            r0.<init>()
            r0 = r13
            r1 = r11
            r2 = r10
            r3 = r16
            r4 = r17
            r5 = r12
            r0.navigateInternal(r1, r2, r3, r4, r5)
            goto Lb5
        Lf1:
            boolean r0 = r8.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.restoreStateInternal(int, android.os.Bundle, androidx.navigation.NavOptions, androidx.navigation.Navigator$Extras):boolean");
    }

    private final List<NavBackStackEntry> instantiateBackStack(C8560dqc<NavBackStackEntryState> c8560dqc) {
        NavDestination graph;
        ArrayList arrayList = new ArrayList();
        NavBackStackEntry a = getBackQueue().a();
        if (a == null || (graph = a.getDestination()) == null) {
            graph = getGraph();
        }
        if (c8560dqc != null) {
            for (NavBackStackEntryState navBackStackEntryState : c8560dqc) {
                NavDestination findDestination = findDestination(graph, navBackStackEntryState.getDestinationId());
                if (findDestination == null) {
                    String displayName = NavDestination.Companion.getDisplayName(this.context, navBackStackEntryState.getDestinationId());
                    throw new IllegalStateException(("Restore State failed: destination " + displayName + " cannot be found from the current destination " + graph).toString());
                }
                arrayList.add(navBackStackEntryState.instantiate(this.context, findDestination, getHostLifecycleState$navigation_runtime_release(), this.viewModel));
                graph = findDestination;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addEntryToBackStack$default(NavController navController, NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List list, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
        }
        if ((i & 8) != 0) {
            list = C8569dql.i();
        }
        navController.addEntryToBackStack(navDestination, bundle, navBackStackEntry, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addEntryToBackStack(NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List<NavBackStackEntry> list) {
        C8560dqc<NavBackStackEntry> c8560dqc;
        NavDestination navDestination2;
        List<NavBackStackEntry> list2;
        NavBackStackEntry navBackStackEntry2;
        Bundle bundle2;
        List<NavBackStackEntry> b;
        NavBackStackEntry navBackStackEntry3;
        NavGraph navGraph;
        NavBackStackEntry navBackStackEntry4;
        List<NavBackStackEntry> list3;
        Bundle bundle3;
        Bundle bundle4 = bundle;
        NavBackStackEntry navBackStackEntry5 = navBackStackEntry;
        List<NavBackStackEntry> list4 = list;
        NavDestination destination = navBackStackEntry.getDestination();
        if (!(destination instanceof FloatingWindow)) {
            while (!getBackQueue().isEmpty() && (getBackQueue().e().getDestination() instanceof FloatingWindow) && popBackStackInternal$default(this, getBackQueue().e().getDestination().getId(), true, false, 4, null)) {
            }
        }
        C8560dqc c8560dqc2 = new C8560dqc();
        NavBackStackEntry navBackStackEntry6 = null;
        if (navDestination instanceof NavGraph) {
            NavDestination navDestination3 = destination;
            while (true) {
                C8632dsu.d(navDestination3);
                NavGraph parent = navDestination3.getParent();
                if (parent != null) {
                    ListIterator<NavBackStackEntry> listIterator = list4.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            navBackStackEntry4 = null;
                            break;
                        }
                        navBackStackEntry4 = listIterator.previous();
                        if (C8632dsu.c(navBackStackEntry4.getDestination(), parent)) {
                            break;
                        }
                    }
                    NavBackStackEntry navBackStackEntry7 = navBackStackEntry4;
                    if (navBackStackEntry7 == null) {
                        navDestination2 = destination;
                        list3 = list4;
                        bundle3 = bundle4;
                        navBackStackEntry2 = navBackStackEntry5;
                        navBackStackEntry7 = NavBackStackEntry.Companion.create$default(NavBackStackEntry.Companion, this.context, parent, bundle, getHostLifecycleState$navigation_runtime_release(), this.viewModel, null, null, 96, null);
                    } else {
                        navDestination2 = destination;
                        list3 = list4;
                        navBackStackEntry2 = navBackStackEntry5;
                        bundle3 = bundle4;
                    }
                    c8560dqc2.c((C8560dqc) navBackStackEntry7);
                    if ((!getBackQueue().isEmpty()) && getBackQueue().e().getDestination() == parent) {
                        list2 = list3;
                        bundle2 = bundle3;
                        navGraph = parent;
                        c8560dqc = c8560dqc2;
                        popEntryFromBackStack$default(this, getBackQueue().e(), false, null, 6, null);
                    } else {
                        list2 = list3;
                        bundle2 = bundle3;
                        navGraph = parent;
                        c8560dqc = c8560dqc2;
                    }
                } else {
                    navGraph = parent;
                    c8560dqc = c8560dqc2;
                    navDestination2 = destination;
                    list2 = list4;
                    navBackStackEntry2 = navBackStackEntry5;
                    bundle2 = bundle4;
                }
                if (navGraph == null || navGraph == navDestination) {
                    break;
                }
                navBackStackEntry5 = navBackStackEntry2;
                navDestination3 = navGraph;
                c8560dqc2 = c8560dqc;
                bundle4 = bundle2;
                list4 = list2;
                destination = navDestination2;
            }
        } else {
            c8560dqc = c8560dqc2;
            navDestination2 = destination;
            list2 = list4;
            navBackStackEntry2 = navBackStackEntry5;
            bundle2 = bundle4;
        }
        NavGraph destination2 = c8560dqc.isEmpty() ? navDestination2 : ((NavBackStackEntry) c8560dqc.b()).getDestination();
        while (destination2 != null && findDestination(destination2.getId()) == null) {
            destination2 = destination2.getParent();
            if (destination2 != null) {
                ListIterator<NavBackStackEntry> listIterator2 = list2.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        navBackStackEntry3 = null;
                        break;
                    }
                    navBackStackEntry3 = listIterator2.previous();
                    if (C8632dsu.c(navBackStackEntry3.getDestination(), destination2)) {
                        break;
                    }
                }
                NavBackStackEntry navBackStackEntry8 = navBackStackEntry3;
                if (navBackStackEntry8 == null) {
                    navBackStackEntry8 = NavBackStackEntry.Companion.create$default(NavBackStackEntry.Companion, this.context, destination2, destination2.addInDefaultArgs(bundle2), getHostLifecycleState$navigation_runtime_release(), this.viewModel, null, null, 96, null);
                }
                c8560dqc.c((C8560dqc) navBackStackEntry8);
            }
        }
        if (!c8560dqc.isEmpty()) {
            navDestination2 = ((NavBackStackEntry) c8560dqc.b()).getDestination();
        }
        while (!getBackQueue().isEmpty() && (getBackQueue().e().getDestination() instanceof NavGraph) && ((NavGraph) getBackQueue().e().getDestination()).findNode(navDestination2.getId(), false) == null) {
            popEntryFromBackStack$default(this, getBackQueue().e(), false, null, 6, null);
        }
        NavBackStackEntry c = getBackQueue().c();
        if (c == null) {
            c = (NavBackStackEntry) c8560dqc.c();
        }
        if (!C8632dsu.c(c != null ? c.getDestination() : null, this._graph)) {
            ListIterator<NavBackStackEntry> listIterator3 = list2.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                NavBackStackEntry previous = listIterator3.previous();
                NavDestination destination3 = previous.getDestination();
                NavGraph navGraph2 = this._graph;
                C8632dsu.d(navGraph2);
                if (C8632dsu.c(destination3, navGraph2)) {
                    navBackStackEntry6 = previous;
                    break;
                }
            }
            NavBackStackEntry navBackStackEntry9 = navBackStackEntry6;
            if (navBackStackEntry9 == null) {
                NavBackStackEntry.Companion companion = NavBackStackEntry.Companion;
                Context context = this.context;
                NavGraph navGraph3 = this._graph;
                C8632dsu.d(navGraph3);
                NavGraph navGraph4 = this._graph;
                C8632dsu.d(navGraph4);
                navBackStackEntry9 = NavBackStackEntry.Companion.create$default(companion, context, navGraph3, navGraph4.addInDefaultArgs(bundle2), getHostLifecycleState$navigation_runtime_release(), this.viewModel, null, null, 96, null);
            }
            c8560dqc.c((C8560dqc) navBackStackEntry9);
        }
        for (NavBackStackEntry navBackStackEntry10 : c8560dqc) {
            NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(this._navigatorProvider.getNavigator(navBackStackEntry10.getDestination().getNavigatorName()));
            if (navControllerNavigatorState == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + navDestination.getNavigatorName() + " should already be created").toString());
            }
            navControllerNavigatorState.addInternal(navBackStackEntry10);
        }
        getBackQueue().addAll(c8560dqc);
        getBackQueue().add(navBackStackEntry2);
        b = C8576dqs.b((Collection<? extends NavBackStackEntry>) ((Collection<? extends Object>) c8560dqc), navBackStackEntry2);
        for (NavBackStackEntry navBackStackEntry11 : b) {
            NavGraph parent2 = navBackStackEntry11.getDestination().getParent();
            if (parent2 != null) {
                linkChildToParent(navBackStackEntry11, getBackStackEntry(parent2.getId()));
            }
        }
    }

    public static /* synthetic */ void navigate$default(NavController navController, String str, NavOptions navOptions, Navigator.Extras extras, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i & 2) != 0) {
            navOptions = null;
        }
        if ((i & 4) != 0) {
            extras = null;
        }
        navController.navigate(str, navOptions, extras);
    }

    public final void navigate(String str, NavOptions navOptions, Navigator.Extras extras) {
        C8632dsu.c((Object) str, "");
        NavDeepLinkRequest.Builder.Companion companion = NavDeepLinkRequest.Builder.Companion;
        Uri parse = Uri.parse(NavDestination.Companion.createRoute(str));
        C8632dsu.b(parse, "");
        navigate(companion.fromUri(parse).build(), navOptions, extras);
    }

    public Bundle saveState() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, Navigator<? extends NavDestination>> entry : this._navigatorProvider.getNavigators().entrySet()) {
            String key = entry.getKey();
            Bundle onSaveState = entry.getValue().onSaveState();
            if (onSaveState != null) {
                arrayList.add(key);
                bundle2.putBundle(key, onSaveState);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        if (!getBackQueue().isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[getBackQueue().size()];
            Iterator<NavBackStackEntry> it = getBackQueue().iterator();
            int i = 0;
            while (it.hasNext()) {
                parcelableArr[i] = new NavBackStackEntryState(it.next());
                i++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (!this.backStackMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.backStackMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i2 = 0;
            for (Map.Entry<Integer, String> entry2 : this.backStackMap.entrySet()) {
                iArr[i2] = entry2.getKey().intValue();
                arrayList2.add(entry2.getValue());
                i2++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!this.backStackStates.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry<String, C8560dqc<NavBackStackEntryState>> entry3 : this.backStackStates.entrySet()) {
                String key2 = entry3.getKey();
                C8560dqc<NavBackStackEntryState> value = entry3.getValue();
                arrayList3.add(key2);
                Parcelable[] parcelableArr2 = new Parcelable[value.size()];
                int i3 = 0;
                for (NavBackStackEntryState navBackStackEntryState : value) {
                    if (i3 < 0) {
                        C8569dql.h();
                    }
                    parcelableArr2[i3] = navBackStackEntryState;
                    i3++;
                }
                bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + key2, parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.deepLinkHandled) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.deepLinkHandled);
        }
        return bundle;
    }

    public void restoreState(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.context.getClassLoader());
        this.navigatorStateToRestore = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.backStackToRestore = bundle.getParcelableArray("android-support-nav:controller:backStack");
        this.backStackStates.clear();
        int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                this.backStackMap.put(Integer.valueOf(intArray[i]), stringArrayList.get(i2));
                i++;
                i2++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
        if (stringArrayList2 != null) {
            for (String str : stringArrayList2) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                if (parcelableArray != null) {
                    Map<String, C8560dqc<NavBackStackEntryState>> map = this.backStackStates;
                    C8632dsu.a(str, "");
                    C8560dqc<NavBackStackEntryState> c8560dqc = new C8560dqc<>(parcelableArray.length);
                    Iterator b = C8621dsj.b(parcelableArray);
                    while (b.hasNext()) {
                        Parcelable parcelable = (Parcelable) b.next();
                        if (parcelable == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        }
                        c8560dqc.add((NavBackStackEntryState) parcelable);
                    }
                    map.put(str, c8560dqc);
                }
            }
        }
        this.deepLinkHandled = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        C8632dsu.c((Object) lifecycleOwner, "");
        if (C8632dsu.c(lifecycleOwner, this.lifecycleOwner)) {
            return;
        }
        LifecycleOwner lifecycleOwner2 = this.lifecycleOwner;
        if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
            lifecycle.removeObserver(this.lifecycleObserver);
        }
        this.lifecycleOwner = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this.lifecycleObserver);
    }

    public void setOnBackPressedDispatcher(OnBackPressedDispatcher onBackPressedDispatcher) {
        C8632dsu.c((Object) onBackPressedDispatcher, "");
        if (C8632dsu.c(onBackPressedDispatcher, this.onBackPressedDispatcher)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.lifecycleOwner;
        if (lifecycleOwner == null) {
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString());
        }
        this.onBackPressedCallback.remove();
        this.onBackPressedDispatcher = onBackPressedDispatcher;
        onBackPressedDispatcher.addCallback(lifecycleOwner, this.onBackPressedCallback);
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        lifecycle.removeObserver(this.lifecycleObserver);
        lifecycle.addObserver(this.lifecycleObserver);
    }

    public void enableOnBackPressed(boolean z) {
        this.enableOnBackPressedCallback = z;
        updateOnBackPressedCallbackEnabled();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (getDestinationCountOnBackStack() > 1) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void updateOnBackPressedCallbackEnabled() {
        /*
            r3 = this;
            androidx.activity.OnBackPressedCallback r0 = r3.onBackPressedCallback
            boolean r1 = r3.enableOnBackPressedCallback
            if (r1 == 0) goto Le
            int r1 = r3.getDestinationCountOnBackStack()
            r2 = 1
            if (r1 <= r2) goto Le
            goto Lf
        Le:
            r2 = 0
        Lf:
            r0.setEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.updateOnBackPressedCallbackEnabled():void");
    }

    public void setViewModelStore(ViewModelStore viewModelStore) {
        C8632dsu.c((Object) viewModelStore, "");
        NavControllerViewModel navControllerViewModel = this.viewModel;
        NavControllerViewModel.Companion companion = NavControllerViewModel.Companion;
        if (C8632dsu.c(navControllerViewModel, companion.getInstance(viewModelStore))) {
            return;
        }
        if (!getBackQueue().isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
        }
        this.viewModel = companion.getInstance(viewModelStore);
    }

    public NavBackStackEntry getBackStackEntry(int i) {
        NavBackStackEntry navBackStackEntry;
        C8560dqc<NavBackStackEntry> backQueue = getBackQueue();
        ListIterator<NavBackStackEntry> listIterator = backQueue.listIterator(backQueue.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntry = null;
                break;
            }
            navBackStackEntry = listIterator.previous();
            if (navBackStackEntry.getDestination().getId() == i) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
        if (navBackStackEntry2 != null) {
            return navBackStackEntry2;
        }
        throw new IllegalArgumentException(("No destination with ID " + i + " is on the NavController's back stack. The current destination is " + getCurrentDestination()).toString());
    }

    public NavBackStackEntry getCurrentBackStackEntry() {
        return getBackQueue().a();
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}

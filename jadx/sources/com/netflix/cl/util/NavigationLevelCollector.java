package com.netflix.cl.util;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.NavigationLevel;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.SessionEnded;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import kotlin.TypeCastException;
import o.C8632dsu;
import o.dpR;
import o.dsH;

/* loaded from: classes2.dex */
public final class NavigationLevelCollector {
    public static final NavigationLevelCollector INSTANCE = new NavigationLevelCollector();
    private static final LinkedList<NavigationLevel> appViews = new LinkedList<>();
    private static final List<AppView> navigationLevels;
    private static final SessionListener sessionListener;

    public final LinkedList<NavigationLevel> getAppViews() {
        return appViews;
    }

    public final List<AppView> getNavigationLevels() {
        return navigationLevels;
    }

    static {
        List synchronizedList = Collections.synchronizedList(new LinkedList<AppView>() { // from class: com.netflix.cl.util.NavigationLevelCollector$navigationLevels$1
            public /* bridge */ boolean contains(AppView appView) {
                return super.contains((Object) appView);
            }

            @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
            public final /* bridge */ boolean contains(Object obj) {
                if (obj == null || (obj instanceof AppView)) {
                    return contains((AppView) obj);
                }
                return false;
            }

            public int getSize() {
                return super.size();
            }

            public /* bridge */ int indexOf(AppView appView) {
                return super.indexOf((Object) appView);
            }

            @Override // java.util.LinkedList, java.util.AbstractList, java.util.List
            public final /* bridge */ int indexOf(Object obj) {
                if (obj == null || (obj instanceof AppView)) {
                    return indexOf((AppView) obj);
                }
                return -1;
            }

            public /* bridge */ int lastIndexOf(AppView appView) {
                return super.lastIndexOf((Object) appView);
            }

            @Override // java.util.LinkedList, java.util.AbstractList, java.util.List
            public final /* bridge */ int lastIndexOf(Object obj) {
                if (obj == null || (obj instanceof AppView)) {
                    return lastIndexOf((AppView) obj);
                }
                return -1;
            }

            public /* bridge */ boolean remove(AppView appView) {
                return super.remove((Object) appView);
            }

            @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
            public final /* bridge */ boolean remove(Object obj) {
                if (obj == null || (obj instanceof AppView)) {
                    return remove((AppView) obj);
                }
                return false;
            }

            @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
            public final int size() {
                return getSize();
            }

            @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
            public boolean add(AppView appView) {
                boolean add = super.add((NavigationLevelCollector$navigationLevels$1) appView);
                while (add && size() > 10) {
                    super.remove();
                }
                return add;
            }
        });
        if (synchronizedList == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableList<com.netflix.cl.model.AppView?>");
        }
        navigationLevels = dsH.a(synchronizedList);
        sessionListener = new SessionListener() { // from class: com.netflix.cl.util.NavigationLevelCollector$sessionListener$1
            @Override // com.netflix.cl.util.SessionListener
            public void onStartSession(Session session) {
                C8632dsu.d(session, "");
                if (session instanceof NavigationLevel) {
                    NavigationLevelCollector navigationLevelCollector = NavigationLevelCollector.INSTANCE;
                    navigationLevelCollector.getAppViews().addLast(session);
                    navigationLevelCollector.getNavigationLevels().add(((NavigationLevel) session).getView());
                }
            }

            @Override // com.netflix.cl.util.SessionListener
            public void onEndSession(Session session, SessionEnded sessionEnded) {
                C8632dsu.d(session, "");
                C8632dsu.d(sessionEnded, "");
                if (session instanceof NavigationLevel) {
                    NavigationLevelCollector.INSTANCE.getAppViews().removeLastOccurrence(session);
                }
            }
        };
    }

    private NavigationLevelCollector() {
    }

    public final void initListener() {
        Logger.INSTANCE.addSessionListeners(sessionListener);
    }

    public final NavigationLevel getCurrentNavigationLevel() {
        LinkedList<NavigationLevel> linkedList = appViews;
        if (!linkedList.isEmpty()) {
            return linkedList.peekLast();
        }
        return null;
    }

    public final String getCurrentScreen() {
        AppView view;
        NavigationLevel currentNavigationLevel = getCurrentNavigationLevel();
        if (currentNavigationLevel == null || (view = currentNavigationLevel.getView()) == null) {
            return null;
        }
        return view.name();
    }

    public final String buildNavigationLevelsString() {
        StringBuilder sb;
        String sb2;
        List<AppView> list = navigationLevels;
        synchronized (list) {
            sb = null;
            for (AppView appView : list) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(appView);
                sb.append(";");
            }
            dpR dpr = dpR.c;
        }
        return (sb == null || (sb2 = sb.toString()) == null) ? "" : sb2;
    }
}

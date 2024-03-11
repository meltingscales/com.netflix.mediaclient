package o;

import android.annotation.SuppressLint;
import android.util.Pair;
import com.google.gson.JsonElement;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.subtitles.Subtitle;
import com.netflix.model.leafs.originals.interactive.ImpressionData;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.StateData;
import com.netflix.model.leafs.originals.interactive.condition.Snapshots;
import com.netflix.model.leafs.originals.interactive.condition.State;
import com.netflix.model.leafs.originals.interactive.condition.StateHistory;
import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import io.reactivex.subjects.CompletableSubject;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C6004cQk;
import o.C8572dqo;
import o.C8632dsu;
import o.cFH;

/* loaded from: classes4.dex */
public final class cFH {
    public static final c d = new c(null);
    private Completable e;

    public cFH() {
        Completable complete = Completable.complete();
        C8632dsu.a(complete, "");
        this.e = complete;
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("InteractiveMomentsRepository");
        }
    }

    public final Single<C6004cQk.d<InteractiveMoments>> d(C7535cxz c7535cxz, final String str, long j, final String str2, List<String> list, Subtitle subtitle, AudioSource audioSource, StateHistory stateHistory) {
        InteractiveMoments.Builder builder;
        C8632dsu.c((Object) c7535cxz, "");
        C8632dsu.c((Object) str, "");
        InteractiveMoments e = c7535cxz.e();
        final InteractiveMoments build = (e == null || (builder = e.toBuilder()) == null) ? null : builder.build();
        String m = c7535cxz.m();
        if (m == null) {
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ad;
            C8632dsu.a(netflixImmutableStatus, "");
            Single<C6004cQk.d<InteractiveMoments>> just = Single.just(new C6004cQk.d(null, netflixImmutableStatus));
            C8632dsu.a(just, "");
            return just;
        }
        C6004cQk c6004cQk = new C6004cQk();
        String languageCodeBcp47 = audioSource != null ? audioSource.getLanguageCodeBcp47() : null;
        String languageCodeBcp472 = subtitle != null ? subtitle.getLanguageCodeBcp47() : null;
        InteractiveMoments e2 = c7535cxz.e();
        Single<C6004cQk.d<InteractiveMoments>> delaySubscription = c6004cQk.d(m, "IntMomentsRepo", str, j, languageCodeBcp47, languageCodeBcp472, str2, list, e2 != null ? e2.version() : null, stateHistory).delaySubscription(this.e);
        final drM<C6004cQk.d<InteractiveMoments>, C6004cQk.d<InteractiveMoments>> drm = new drM<C6004cQk.d<InteractiveMoments>, C6004cQk.d<InteractiveMoments>>() { // from class: com.netflix.mediaclient.ui.player.v2.repository.interactive.InteractiveMomentsRepository$requestInteractiveMoments$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final C6004cQk.d<InteractiveMoments> invoke(C6004cQk.d<InteractiveMoments> dVar) {
                InteractiveMoments interactiveMoments;
                ArrayList arrayList;
                int d2;
                Moment moment;
                StateHistory stateHistory2;
                Snapshots snapshots;
                C8632dsu.c((Object) dVar, "");
                InteractiveMoments c2 = dVar.c();
                String str3 = str;
                if (C8632dsu.c((Object) str3, (Object) Moment.InteractiveIntent.DUBS_SUBS_CHANGE)) {
                    if (c2 != null) {
                        InteractiveMoments interactiveMoments2 = build;
                        if (interactiveMoments2 != null && (snapshots = interactiveMoments2.snapshots()) != null) {
                            cFH.d.getLogTag();
                            c2.snapshots().clear();
                            c2.snapshots().addAll(snapshots);
                        }
                        InteractiveMoments interactiveMoments3 = build;
                        if (interactiveMoments3 != null && (stateHistory2 = interactiveMoments3.stateHistory()) != null) {
                            c2.stateHistory().persistent().values = stateHistory2.persistent().values;
                            c2.stateHistory().global().values = stateHistory2.global().values;
                            c2.stateHistory().sessionState = stateHistory2.sessionState;
                        }
                    }
                } else if (C8632dsu.c((Object) str3, (Object) Moment.InteractiveIntent.MOMENT_REFRESH)) {
                    if (c2 != null && (interactiveMoments = build) != null) {
                        Map<String, List<Moment>> momentsBySegment = interactiveMoments.momentsBySegment();
                        C8632dsu.a(momentsBySegment, "");
                        String str4 = str2;
                        List<Moment> list2 = build.momentsBySegment().get(str2);
                        if (list2 != null) {
                            d2 = C8572dqo.d(list2, 10);
                            arrayList = new ArrayList(d2);
                            for (Moment moment2 : list2) {
                                Map<String, Moment> momentsById = c2.momentsById();
                                if (momentsById != null && (moment = momentsById.get(moment2.id())) != null) {
                                    moment2 = moment;
                                }
                                arrayList.add(moment2);
                            }
                        } else {
                            arrayList = null;
                        }
                        momentsBySegment.put(str4, arrayList);
                    }
                    c2 = build;
                }
                return new C6004cQk.d<>(c2, dVar.d());
            }
        };
        Single map = delaySubscription.map(new Function() { // from class: o.cFI
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                C6004cQk.d c2;
                c2 = cFH.c(drM.this, obj);
                return c2;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6004cQk.d c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (C6004cQk.d) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CompletableSubject completableSubject, cFH cfh) {
        C8632dsu.c((Object) completableSubject, "");
        C8632dsu.c((Object) cfh, "");
        completableSubject.onComplete();
        if (C8632dsu.c(cfh.e, completableSubject)) {
            Completable complete = Completable.complete();
            C8632dsu.a(complete, "");
            cfh.e = complete;
        }
    }

    @SuppressLint({"CheckResult"})
    public final Completable d(C7535cxz c7535cxz, ImpressionData impressionData) {
        StateHistory create;
        Snapshots snapshots;
        StateData data;
        AbstractMap abstractMap;
        d.getLogTag();
        State state = null;
        InteractiveMoments e = c7535cxz != null ? c7535cxz.e() : null;
        if (e == null || (create = e.stateHistory()) == null) {
            create = StateHistory.create(new State(), new State());
        }
        String m = c7535cxz != null ? c7535cxz.m() : null;
        if (e == null || (snapshots = e.snapshots()) == null) {
            snapshots = new Snapshots(0);
        }
        if (m == null) {
            Completable complete = Completable.complete();
            C8632dsu.a(complete, "");
            return complete;
        }
        if (impressionData != null && (data = impressionData.data()) != null) {
            Iterator<Pair<String, JsonElement>> persistentIterator = data.persistentIterator(e);
            C8632dsu.a(persistentIterator, "");
            while (persistentIterator.hasNext()) {
                Pair<String, JsonElement> next = persistentIterator.next();
                if (next != null) {
                    AbstractMap abstractMap2 = create.persistent().values;
                    C8632dsu.a(abstractMap2, "");
                    abstractMap2.put(next.first, next.second);
                }
            }
            Iterator<Pair<String, JsonElement>> globalIterator = data.globalIterator(e);
            C8632dsu.a(globalIterator, "");
            while (globalIterator.hasNext()) {
                Pair<String, JsonElement> next2 = globalIterator.next();
                if (next2 != null) {
                    AbstractMap abstractMap3 = create.global().values;
                    C8632dsu.a(abstractMap3, "");
                    abstractMap3.put(next2.first, next2.second);
                }
            }
            Iterator<Pair<String, JsonElement>> sessionIterator = data.sessionIterator(e);
            C8632dsu.a(sessionIterator, "");
            while (sessionIterator.hasNext()) {
                Pair<String, JsonElement> next3 = sessionIterator.next();
                if (next3 != null) {
                    AbstractMap abstractMap4 = create.sessionState;
                    C8632dsu.a(abstractMap4, "");
                    abstractMap4.put(next3.first, next3.second);
                }
            }
            Iterator<Pair<String, JsonElement>> passThroughIterator = data.passThroughIterator(e);
            state = new State();
            C8632dsu.d(passThroughIterator);
            while (passThroughIterator.hasNext()) {
                Pair<String, JsonElement> next4 = passThroughIterator.next();
                if (next4 != null && (abstractMap = state.values) != null) {
                    C8632dsu.d(abstractMap);
                    abstractMap.put(next4.first, next4.second);
                }
            }
        }
        d.getLogTag();
        Completable completable = this.e;
        final CompletableSubject create2 = CompletableSubject.create();
        C8632dsu.a(create2, "");
        this.e = create2;
        C6004cQk c6004cQk = new C6004cQk();
        C8632dsu.d(create);
        Completable doOnComplete = c6004cQk.b(m, create, snapshots, state).delaySubscription(completable).ignoreElement().doOnComplete(new Action() { // from class: o.cFG
            @Override // io.reactivex.functions.Action
            public final void run() {
                cFH.a(CompletableSubject.this, this);
            }
        });
        C8632dsu.a(doOnComplete, "");
        return doOnComplete;
    }
}

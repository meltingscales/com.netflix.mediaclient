package androidx.room;

import android.annotation.SuppressLint;
import androidx.room.InvalidationTracker;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes5.dex */
public class RxRoom {
    public static final Object NOTHING = new Object();

    public static Flowable<Object> createFlowable(final RoomDatabase roomDatabase, final String... strArr) {
        return Flowable.create(new FlowableOnSubscribe<Object>() { // from class: androidx.room.RxRoom.1
            @Override // io.reactivex.FlowableOnSubscribe
            public void subscribe(final FlowableEmitter<Object> flowableEmitter) {
                final InvalidationTracker.Observer observer = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.RxRoom.1.1
                    @Override // androidx.room.InvalidationTracker.Observer
                    public void onInvalidated(Set<String> set) {
                        if (flowableEmitter.isCancelled()) {
                            return;
                        }
                        flowableEmitter.onNext(RxRoom.NOTHING);
                    }
                };
                if (!flowableEmitter.isCancelled()) {
                    roomDatabase.getInvalidationTracker().addObserver(observer);
                    flowableEmitter.setDisposable(Disposables.fromAction(new Action() { // from class: androidx.room.RxRoom.1.2
                        @Override // io.reactivex.functions.Action
                        public void run() {
                            roomDatabase.getInvalidationTracker().removeObserver(observer);
                        }
                    }));
                }
                if (flowableEmitter.isCancelled()) {
                    return;
                }
                flowableEmitter.onNext(RxRoom.NOTHING);
            }
        }, BackpressureStrategy.LATEST);
    }

    public static <T> Flowable<T> createFlowable(RoomDatabase roomDatabase, boolean z, String[] strArr, Callable<T> callable) {
        Scheduler from = Schedulers.from(getExecutor(roomDatabase, z));
        final Maybe fromCallable = Maybe.fromCallable(callable);
        return (Flowable<T>) createFlowable(roomDatabase, strArr).subscribeOn(from).unsubscribeOn(from).observeOn(from).flatMapMaybe(new Function<Object, MaybeSource<T>>() { // from class: androidx.room.RxRoom.2
            @Override // io.reactivex.functions.Function
            public MaybeSource<T> apply(Object obj) {
                return Maybe.this;
            }
        });
    }

    private static Executor getExecutor(RoomDatabase roomDatabase, boolean z) {
        if (z) {
            return roomDatabase.getTransactionExecutor();
        }
        return roomDatabase.getQueryExecutor();
    }
}

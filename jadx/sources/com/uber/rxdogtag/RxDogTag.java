package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.functions.BiFunction;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.reactivestreams.Subscriber;

/* loaded from: classes.dex */
public final class RxDogTag {
    public static final String STACK_ELEMENT_SOURCE_DELEGATE = "[[ Originating callback: %s ]]";
    public static final String STACK_ELEMENT_SOURCE_HEADER = "[[ ↑↑ Inferred subscribe point ↑↑ ]]";
    public static final String STACK_ELEMENT_TRACE_HEADER = "[[ ↓↓ Original trace ↓↓ ]]";

    /* loaded from: classes.dex */
    public interface Configurer {
        void apply(Builder builder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface NonCheckingConsumer<T> {
        void accept(T t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface NonCheckingPredicate<T> {
        boolean test(T t);
    }

    private RxDogTag() {
        throw new InstantiationError();
    }

    public static void reset() {
        synchronized (RxDogTag.class) {
            RxJavaPlugins.setOnFlowableSubscribe(null);
            RxJavaPlugins.setOnObservableSubscribe(null);
            RxJavaPlugins.setOnMaybeSubscribe(null);
            RxJavaPlugins.setOnSingleSubscribe(null);
            RxJavaPlugins.setOnCompletableSubscribe(null);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static void install() {
        new Builder().install();
    }

    private static boolean shouldDecorate(Object obj) {
        if (obj instanceof RxDogTagErrorReceiver) {
            return true;
        }
        if (obj instanceof LambdaConsumerIntrospection) {
            return !((LambdaConsumerIntrospection) obj).hasCustomOnError();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void installWithBuilder(final Configuration configuration) {
        synchronized (RxDogTag.class) {
            RxJavaPlugins.setOnObservableSubscribe(new BiFunction() { // from class: com.uber.rxdogtag.RxDogTag$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    Observer lambda$installWithBuilder$0;
                    lambda$installWithBuilder$0 = RxDogTag.lambda$installWithBuilder$0(RxDogTag.Configuration.this, (Observable) obj, (Observer) obj2);
                    return lambda$installWithBuilder$0;
                }
            });
            RxJavaPlugins.setOnFlowableSubscribe(new BiFunction() { // from class: com.uber.rxdogtag.RxDogTag$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    Subscriber lambda$installWithBuilder$1;
                    lambda$installWithBuilder$1 = RxDogTag.lambda$installWithBuilder$1(RxDogTag.Configuration.this, (Flowable) obj, (Subscriber) obj2);
                    return lambda$installWithBuilder$1;
                }
            });
            RxJavaPlugins.setOnSingleSubscribe(new BiFunction() { // from class: com.uber.rxdogtag.RxDogTag$$ExternalSyntheticLambda2
                @Override // io.reactivex.functions.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    SingleObserver lambda$installWithBuilder$2;
                    lambda$installWithBuilder$2 = RxDogTag.lambda$installWithBuilder$2(RxDogTag.Configuration.this, (Single) obj, (SingleObserver) obj2);
                    return lambda$installWithBuilder$2;
                }
            });
            RxJavaPlugins.setOnMaybeSubscribe(new BiFunction() { // from class: com.uber.rxdogtag.RxDogTag$$ExternalSyntheticLambda3
                @Override // io.reactivex.functions.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    MaybeObserver lambda$installWithBuilder$3;
                    lambda$installWithBuilder$3 = RxDogTag.lambda$installWithBuilder$3(RxDogTag.Configuration.this, (Maybe) obj, (MaybeObserver) obj2);
                    return lambda$installWithBuilder$3;
                }
            });
            RxJavaPlugins.setOnCompletableSubscribe(new BiFunction() { // from class: com.uber.rxdogtag.RxDogTag$$ExternalSyntheticLambda4
                @Override // io.reactivex.functions.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    CompletableObserver lambda$installWithBuilder$4;
                    lambda$installWithBuilder$4 = RxDogTag.lambda$installWithBuilder$4(RxDogTag.Configuration.this, (Completable) obj, (CompletableObserver) obj2);
                    return lambda$installWithBuilder$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Observer lambda$installWithBuilder$0(Configuration configuration, Observable observable, Observer observer) {
        for (ObserverHandler observerHandler : configuration.observerHandlers) {
            if (shouldDecorate(observerHandler.handle(observable, observer))) {
                return new DogTagObserver(configuration, observer);
            }
        }
        return observer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Subscriber lambda$installWithBuilder$1(Configuration configuration, Flowable flowable, Subscriber subscriber) {
        for (ObserverHandler observerHandler : configuration.observerHandlers) {
            if (shouldDecorate(observerHandler.handle(flowable, subscriber))) {
                return new DogTagSubscriber(configuration, subscriber);
            }
        }
        return subscriber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SingleObserver lambda$installWithBuilder$2(Configuration configuration, Single single, SingleObserver singleObserver) {
        for (ObserverHandler observerHandler : configuration.observerHandlers) {
            if (shouldDecorate(observerHandler.handle(single, singleObserver))) {
                return new DogTagSingleObserver(configuration, singleObserver);
            }
        }
        return singleObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ MaybeObserver lambda$installWithBuilder$3(Configuration configuration, Maybe maybe, MaybeObserver maybeObserver) {
        for (ObserverHandler observerHandler : configuration.observerHandlers) {
            if (shouldDecorate(observerHandler.handle(maybe, maybeObserver))) {
                return new DogTagMaybeObserver(configuration, maybeObserver);
            }
        }
        return maybeObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CompletableObserver lambda$installWithBuilder$4(Configuration configuration, Completable completable, CompletableObserver completableObserver) {
        for (ObserverHandler observerHandler : configuration.observerHandlers) {
            if (shouldDecorate(observerHandler.handle(completable, completableObserver))) {
                return new DogTagCompletableObserver(configuration, completableObserver);
            }
        }
        return completableObserver;
    }

    private static StackTraceElement extractStackElementTag(Throwable th, Set<String> set) {
        StackTraceElement[] stackTrace;
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!containsAnyPackages(stackTraceElement.getClassName(), set)) {
                return stackTraceElement;
            }
        }
        return new StackTraceElement("Unknown", "unknown", "unknown", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void guardedDelegateCall(final NonCheckingConsumer<Throwable> nonCheckingConsumer, Runnable runnable) {
        final Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.currentThread().getUncaughtExceptionHandler();
        try {
            try {
                Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.uber.rxdogtag.RxDogTag$$ExternalSyntheticLambda5
                    @Override // java.lang.Thread.UncaughtExceptionHandler
                    public final void uncaughtException(Thread thread, Throwable th) {
                        RxDogTag.lambda$guardedDelegateCall$5(uncaughtExceptionHandler, nonCheckingConsumer, thread, th);
                    }
                });
                runnable.run();
            } catch (OnErrorNotImplementedException e) {
                nonCheckingConsumer.accept(e.getCause());
            } catch (Throwable th) {
                nonCheckingConsumer.accept(th);
            }
        } finally {
            Thread.currentThread().setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$guardedDelegateCall$5(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, NonCheckingConsumer nonCheckingConsumer, Thread thread, Throwable th) {
        Thread.currentThread().setUncaughtExceptionHandler(uncaughtExceptionHandler);
        if (th instanceof OnErrorNotImplementedException) {
            nonCheckingConsumer.accept(th);
        } else if ((th instanceof NullPointerException) && "subscribeActual failed".equals(th.getMessage())) {
            nonCheckingConsumer.accept(th.getCause());
        } else {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static OnErrorNotImplementedException createException(Configuration configuration, Throwable th, Throwable th2, String str) {
        OnErrorNotImplementedException onErrorNotImplementedException;
        StackTraceElement[] stackTraceElementArr;
        StackTraceElement extractStackElementTag = extractStackElementTag(th, configuration.ignoredPackages);
        if (configuration.repackageOnErrorNotImplementedExceptions && (th2 instanceof OnErrorNotImplementedException)) {
            th2 = th2.getCause();
        }
        if (th2 instanceof OnErrorNotImplementedException) {
            OnErrorNotImplementedException onErrorNotImplementedException2 = (OnErrorNotImplementedException) th2;
            onErrorNotImplementedException = onErrorNotImplementedException2;
            th2 = onErrorNotImplementedException2.getCause();
        } else {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            onErrorNotImplementedException = new OnErrorNotImplementedException(message, th2);
            onErrorNotImplementedException.setStackTrace(new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = th2.getStackTrace();
        char c = 3;
        int i = str != null ? 4 : 3;
        if (configuration.disableAnnotations) {
            stackTraceElementArr = new StackTraceElement[stackTrace.length + 1];
            stackTraceElementArr[0] = extractStackElementTag;
            if (stackTrace.length != 0) {
                System.arraycopy(stackTrace, 0, stackTraceElementArr, 1, stackTrace.length);
            }
        } else {
            int indexOfLast = indexOfLast(stackTrace, new NonCheckingPredicate() { // from class: com.uber.rxdogtag.RxDogTag$$ExternalSyntheticLambda6
                @Override // com.uber.rxdogtag.RxDogTag.NonCheckingPredicate
                public final boolean test(Object obj) {
                    boolean lambda$createException$6;
                    lambda$createException$6 = RxDogTag.lambda$createException$6((StackTraceElement) obj);
                    return lambda$createException$6;
                }
            });
            int i2 = indexOfLast != -1 ? indexOfLast + 1 : 0;
            StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[(stackTrace.length + i) - i2];
            stackTraceElementArr2[0] = extractStackElementTag;
            stackTraceElementArr2[1] = new StackTraceElement(STACK_ELEMENT_SOURCE_HEADER, "", "", 0);
            if (str != null) {
                stackTraceElementArr2[2] = new StackTraceElement(String.format(Locale.US, STACK_ELEMENT_SOURCE_DELEGATE, str), "", "", 0);
            } else {
                c = 2;
            }
            stackTraceElementArr2[c] = new StackTraceElement(STACK_ELEMENT_TRACE_HEADER, "", "", 0);
            if (stackTrace.length != 0) {
                System.arraycopy(stackTrace, i2, stackTraceElementArr2, i, stackTrace.length - i2);
            }
            stackTraceElementArr = stackTraceElementArr2;
        }
        th2.setStackTrace(stackTraceElementArr);
        return onErrorNotImplementedException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$createException$6(StackTraceElement stackTraceElement) {
        return STACK_ELEMENT_TRACE_HEADER.equals(stackTraceElement.getClassName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void reportError(Configuration configuration, Throwable th, Throwable th2, String str) {
        RxJavaPlugins.onError(createException(configuration, th, th2, str));
    }

    private static boolean containsAnyPackages(String str, Set<String> set) {
        for (String str2 : set) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static <T> int indexOfLast(T[] tArr, NonCheckingPredicate<T> nonCheckingPredicate) {
        for (int length = tArr.length - 1; length >= 0; length--) {
            if (nonCheckingPredicate.test(tArr[length])) {
                return length;
            }
        }
        return -1;
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        boolean guardObserverCallbacks = true;
        boolean disableAnnotations = false;
        List<ObserverHandler> observerHandlers = new ArrayList();
        Set<String> ignoredPackages = new LinkedHashSet();
        boolean repackageOnErrorNotImplementedExceptions = true;

        public Builder disableAnnotations() {
            this.disableAnnotations = true;
            return this;
        }

        public Builder disableRepackagingOnErrorNotImplementedExceptions() {
            this.repackageOnErrorNotImplementedExceptions = false;
            return this;
        }

        public Builder guardObserverCallbacks(boolean z) {
            this.guardObserverCallbacks = z;
            return this;
        }

        Builder() {
        }

        public Builder addObserverHandlers(ObserverHandler... observerHandlerArr) {
            return addObserverHandlers(Arrays.asList(observerHandlerArr));
        }

        public Builder addObserverHandlers(Collection<ObserverHandler> collection) {
            this.observerHandlers.addAll(collection);
            return this;
        }

        public Builder addIgnoredPackages(String... strArr) {
            return addIgnoredPackages(Arrays.asList(strArr));
        }

        public Builder addIgnoredPackages(Collection<String> collection) {
            this.ignoredPackages.addAll(collection);
            return this;
        }

        public Builder configureWith(Configurer configurer) {
            configurer.apply(this);
            return this;
        }

        public void install() {
            RxDogTag.installWithBuilder(new Configuration(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class Configuration {
        final boolean disableAnnotations;
        final boolean guardObserverCallbacks;
        final Set<String> ignoredPackages;
        final List<ObserverHandler> observerHandlers;
        final boolean repackageOnErrorNotImplementedExceptions;
        private static final Collection<String> DEFAULT_IGNORED_PACKAGES = Arrays.asList(Observable.class.getPackage().getName(), DogTagObserver.class.getPackage().getName());
        private static final ObserverHandler DEFAULT_HANDLER = new ObserverHandler() { // from class: com.uber.rxdogtag.RxDogTag.Configuration.1
        };

        Configuration(Builder builder) {
            this.disableAnnotations = builder.disableAnnotations;
            ArrayList arrayList = new ArrayList(builder.observerHandlers);
            arrayList.add(DEFAULT_HANDLER);
            LinkedHashSet linkedHashSet = new LinkedHashSet(builder.ignoredPackages);
            linkedHashSet.addAll(DEFAULT_IGNORED_PACKAGES);
            this.observerHandlers = Collections.unmodifiableList(arrayList);
            this.ignoredPackages = Collections.unmodifiableSet(linkedHashSet);
            this.repackageOnErrorNotImplementedExceptions = builder.repackageOnErrorNotImplementedExceptions;
            this.guardObserverCallbacks = builder.guardObserverCallbacks;
        }
    }
}

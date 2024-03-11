package org.xbill.DNS;

import j$.time.Duration;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xbill.DNS.ExtendedResolver;

/* loaded from: classes5.dex */
public class ExtendedResolver implements Resolver {
    private final AtomicInteger lbStart;
    private boolean loadBalance;
    private final List<ResolverEntry> resolvers;
    private int retries;
    private Duration timeout;
    @Generated
    private static final Logger log = LoggerFactory.getLogger(ExtendedResolver.class);
    public static final Duration DEFAULT_TIMEOUT = Duration.b(10);
    public static final Duration DEFAULT_RESOLVER_TIMEOUT = Duration.b(5);

    @Override // org.xbill.DNS.Resolver
    public Duration getTimeout() {
        return this.timeout;
    }

    @Override // org.xbill.DNS.Resolver
    public void setTimeout(Duration duration) {
        this.timeout = duration;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class Resolution {
        private final int[] attempts;
        private int currentResolver;
        private long endTime;
        private final Message query;
        private List<ResolverEntry> resolvers;
        private final int retriesPerResolver;

        Resolution(ExtendedResolver extendedResolver, Message message) {
            this.resolvers = new ArrayList(extendedResolver.resolvers);
            this.endTime = System.nanoTime() + extendedResolver.timeout.g();
            if (extendedResolver.loadBalance) {
                int updateAndGet = extendedResolver.lbStart.updateAndGet(new IntUnaryOperator() { // from class: org.xbill.DNS.ExtendedResolver$Resolution$$ExternalSyntheticLambda3
                    @Override // java.util.function.IntUnaryOperator
                    public final int applyAsInt(int i) {
                        int lambda$new$0;
                        lambda$new$0 = ExtendedResolver.Resolution.this.lambda$new$0(i);
                        return lambda$new$0;
                    }
                });
                if (updateAndGet > 0) {
                    ArrayList arrayList = new ArrayList(this.resolvers.size());
                    for (int i = 0; i < this.resolvers.size(); i++) {
                        arrayList.add(this.resolvers.get((i + updateAndGet) % this.resolvers.size()));
                    }
                    this.resolvers = arrayList;
                }
            } else {
                this.resolvers = (List) this.resolvers.stream().sorted(Comparator.comparingInt(new ToIntFunction() { // from class: org.xbill.DNS.ExtendedResolver$Resolution$$ExternalSyntheticLambda4
                    @Override // java.util.function.ToIntFunction
                    public final int applyAsInt(Object obj) {
                        int lambda$new$1;
                        lambda$new$1 = ExtendedResolver.Resolution.lambda$new$1((ExtendedResolver.ResolverEntry) obj);
                        return lambda$new$1;
                    }
                })).collect(Collectors.toList());
            }
            this.attempts = new int[this.resolvers.size()];
            this.retriesPerResolver = extendedResolver.retries;
            this.query = message;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ int lambda$new$0(int i) {
            return (i + 1) % this.resolvers.size();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$new$1(ResolverEntry resolverEntry) {
            return resolverEntry.failures.get();
        }

        private CompletableFuture<Message> send() {
            ResolverEntry resolverEntry = this.resolvers.get(this.currentResolver);
            Logger logger = ExtendedResolver.log;
            Name name = this.query.getQuestion().getName();
            String string = Type.string(this.query.getQuestion().getType());
            int id = this.query.getHeader().getID();
            int i = this.currentResolver;
            logger.debug("Sending {}/{}, id={} to resolver {} ({}), attempt {} of {}", name, string, Integer.valueOf(id), Integer.valueOf(i), resolverEntry.resolver, Integer.valueOf(this.attempts[this.currentResolver] + 1), Integer.valueOf(this.retriesPerResolver));
            int[] iArr = this.attempts;
            int i2 = this.currentResolver;
            iArr[i2] = iArr[i2] + 1;
            return resolverEntry.resolver.sendAsync(this.query).toCompletableFuture();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CompletionStage<Message> startAsync() {
            final CompletableFuture completableFuture = new CompletableFuture();
            send().handleAsync(new BiFunction() { // from class: org.xbill.DNS.ExtendedResolver$Resolution$$ExternalSyntheticLambda2
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    Void lambda$startAsync$2;
                    lambda$startAsync$2 = ExtendedResolver.Resolution.this.lambda$startAsync$2(completableFuture, (Message) obj, (Throwable) obj2);
                    return lambda$startAsync$2;
                }
            });
            return completableFuture;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: handle */
        public Void lambda$startAsync$2(Message message, Throwable th, final CompletableFuture<Message> completableFuture) {
            AtomicInteger atomicInteger = this.resolvers.get(this.currentResolver).failures;
            if (th != null) {
                Logger logger = ExtendedResolver.log;
                Name name = this.query.getQuestion().getName();
                String string = Type.string(this.query.getQuestion().getType());
                int id = this.query.getHeader().getID();
                int i = this.currentResolver;
                Resolver resolver = this.resolvers.get(i).resolver;
                int i2 = this.attempts[this.currentResolver];
                int i3 = this.retriesPerResolver;
                logger.debug("Failed to resolve {}/{}, id={} with resolver {} ({}) on attempt {} of {}, reason={}", name, string, Integer.valueOf(id), Integer.valueOf(i), resolver, Integer.valueOf(i2), Integer.valueOf(i3), th.getMessage());
                atomicInteger.incrementAndGet();
                if (this.endTime - System.nanoTime() < 0) {
                    completableFuture.completeExceptionally(new IOException("Timed out while trying to resolve " + this.query.getQuestion().getName() + "/" + Type.string(this.query.getQuestion().type) + ", id=" + this.query.getHeader().getID()));
                } else {
                    int size = (this.currentResolver + 1) % this.resolvers.size();
                    this.currentResolver = size;
                    if (this.attempts[size] < this.retriesPerResolver) {
                        send().handleAsync(new BiFunction() { // from class: org.xbill.DNS.ExtendedResolver$Resolution$$ExternalSyntheticLambda0
                            @Override // java.util.function.BiFunction
                            public final Object apply(Object obj, Object obj2) {
                                Void lambda$handle$3;
                                lambda$handle$3 = ExtendedResolver.Resolution.this.lambda$handle$3(completableFuture, (Message) obj, (Throwable) obj2);
                                return lambda$handle$3;
                            }
                        });
                        return null;
                    }
                    completableFuture.completeExceptionally(th);
                }
            } else {
                atomicInteger.updateAndGet(new IntUnaryOperator() { // from class: org.xbill.DNS.ExtendedResolver$Resolution$$ExternalSyntheticLambda1
                    @Override // java.util.function.IntUnaryOperator
                    public final int applyAsInt(int i4) {
                        int lambda$handle$4;
                        lambda$handle$4 = ExtendedResolver.Resolution.lambda$handle$4(i4);
                        return lambda$handle$4;
                    }
                });
                completableFuture.complete(message);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$handle$4(int i) {
            if (i > 0) {
                return (int) Math.log(i);
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class ResolverEntry {
        private final AtomicInteger failures;
        private final Resolver resolver;

        @Generated
        public ResolverEntry(Resolver resolver, AtomicInteger atomicInteger) {
            this.resolver = resolver;
            this.failures = atomicInteger;
        }

        ResolverEntry(Resolver resolver) {
            this(resolver, new AtomicInteger(0));
        }

        public String toString() {
            return this.resolver.toString();
        }
    }

    public ExtendedResolver() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.resolvers = copyOnWriteArrayList;
        this.lbStart = new AtomicInteger();
        this.retries = 3;
        this.timeout = DEFAULT_TIMEOUT;
        copyOnWriteArrayList.addAll((Collection) ResolverConfig.getCurrentConfig().servers().stream().map(new Function() { // from class: org.xbill.DNS.ExtendedResolver$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ExtendedResolver.ResolverEntry lambda$new$0;
                lambda$new$0 = ExtendedResolver.lambda$new$0((InetSocketAddress) obj);
                return lambda$new$0;
            }
        }).collect(Collectors.toList()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ResolverEntry lambda$new$0(InetSocketAddress inetSocketAddress) {
        SimpleResolver simpleResolver = new SimpleResolver(inetSocketAddress);
        simpleResolver.setTimeout(DEFAULT_RESOLVER_TIMEOUT);
        return new ResolverEntry(simpleResolver);
    }

    public ExtendedResolver(String[] strArr) {
        this.resolvers = new CopyOnWriteArrayList();
        this.lbStart = new AtomicInteger();
        this.retries = 3;
        this.timeout = DEFAULT_TIMEOUT;
        for (String str : strArr) {
            SimpleResolver simpleResolver = new SimpleResolver(str);
            simpleResolver.setTimeout(DEFAULT_RESOLVER_TIMEOUT);
            this.resolvers.add(new ResolverEntry(simpleResolver));
        }
    }

    @Override // org.xbill.DNS.Resolver
    public CompletionStage<Message> sendAsync(Message message) {
        return new Resolution(this, message).startAsync();
    }

    public String toString() {
        return "ExtendedResolver of " + this.resolvers;
    }
}

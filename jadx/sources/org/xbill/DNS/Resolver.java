package org.xbill.DNS;

import j$.time.Duration;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.BiFunction;

/* loaded from: classes5.dex */
public interface Resolver {
    void setTimeout(Duration duration);

    default Duration getTimeout() {
        return Duration.b(10L);
    }

    default Message send(Message message) {
        try {
            return sendAsync(message).toCompletableFuture().get(getTimeout().i(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException(e);
        } catch (ExecutionException e2) {
            if (e2.getCause() instanceof IOException) {
                throw ((IOException) e2.getCause());
            }
            throw new IOException(e2.getCause());
        } catch (TimeoutException e3) {
            throw new SocketTimeoutException(e3.getMessage());
        }
    }

    default CompletionStage<Message> sendAsync(Message message) {
        final CompletableFuture completableFuture = new CompletableFuture();
        sendAsync(message, new ResolverListener() { // from class: org.xbill.DNS.Resolver.1
            @Override // org.xbill.DNS.ResolverListener
            public void receiveMessage(Object obj, Message message2) {
                completableFuture.complete(message2);
            }

            @Override // org.xbill.DNS.ResolverListener
            public void handleException(Object obj, Exception exc) {
                completableFuture.completeExceptionally(exc);
            }
        });
        return completableFuture;
    }

    @Deprecated
    default Object sendAsync(Message message, final ResolverListener resolverListener) {
        final Object obj = new Object();
        sendAsync(message).handleAsync(new BiFunction() { // from class: org.xbill.DNS.Resolver$$ExternalSyntheticLambda0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj2, Object obj3) {
                Object lambda$sendAsync$0;
                lambda$sendAsync$0 = Resolver.lambda$sendAsync$0(ResolverListener.this, obj, (Message) obj2, (Throwable) obj3);
                return lambda$sendAsync$0;
            }
        });
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ Object lambda$sendAsync$0(ResolverListener resolverListener, Object obj, Message message, Throwable th) {
        Exception exc;
        if (th != null) {
            if (th instanceof Exception) {
                exc = (Exception) th;
            } else {
                exc = new Exception(th);
            }
            resolverListener.handleException(obj, exc);
            return null;
        }
        resolverListener.receiveMessage(obj, message);
        return null;
    }
}

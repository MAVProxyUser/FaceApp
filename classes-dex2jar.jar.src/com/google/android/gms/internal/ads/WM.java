package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@yh
final class wm<T>
  implements xm<T>
{
  private final T a;
  private final ym b;
  
  wm(T paramT)
  {
    this.a = paramT;
    this.b = new ym();
    this.b.a();
  }
  
  public final void a(Runnable paramRunnable, Executor paramExecutor)
  {
    this.b.a(paramRunnable, paramExecutor);
  }
  
  public final boolean cancel(boolean paramBoolean)
  {
    return false;
  }
  
  public final T get()
  {
    return (T)this.a;
  }
  
  public final T get(long paramLong, TimeUnit paramTimeUnit)
  {
    return (T)this.a;
  }
  
  public final boolean isCancelled()
  {
    return false;
  }
  
  public final boolean isDone()
  {
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
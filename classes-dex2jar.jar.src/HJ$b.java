import libcore.io.Memory;
import sun.misc.Unsafe;

final class HJ$b
  extends HJ.d
{
  HJ$b(Unsafe paramUnsafe)
  {
    super(paramUnsafe);
  }
  
  public final void a(long paramLong, byte paramByte)
  {
    Memory.pokeByte(paramLong, paramByte);
  }
  
  public final void a(Object paramObject, long paramLong, byte paramByte)
  {
    if (HJ.a())
    {
      HJ.a(paramObject, paramLong, paramByte);
      return;
    }
    HJ.b(paramObject, paramLong, paramByte);
  }
  
  public final void a(Object paramObject, long paramLong, double paramDouble)
  {
    a(paramObject, paramLong, Double.doubleToLongBits(paramDouble));
  }
  
  public final void a(Object paramObject, long paramLong, float paramFloat)
  {
    a(paramObject, paramLong, Float.floatToIntBits(paramFloat));
  }
  
  public final void a(Object paramObject, long paramLong, boolean paramBoolean)
  {
    if (HJ.a())
    {
      HJ.b(paramObject, paramLong, paramBoolean);
      return;
    }
    HJ.c(paramObject, paramLong, paramBoolean);
  }
  
  public final void a(byte[] paramArrayOfByte, long paramLong1, long paramLong2, long paramLong3)
  {
    Memory.pokeByteArray(paramLong2, paramArrayOfByte, (int)paramLong1, (int)paramLong3);
  }
  
  public final boolean c(Object paramObject, long paramLong)
  {
    if (HJ.a()) {
      return HJ.i(paramObject, paramLong);
    }
    return HJ.j(paramObject, paramLong);
  }
  
  public final float d(Object paramObject, long paramLong)
  {
    return Float.intBitsToFloat(a(paramObject, paramLong));
  }
  
  public final double e(Object paramObject, long paramLong)
  {
    return Double.longBitsToDouble(b(paramObject, paramLong));
  }
  
  public final byte f(Object paramObject, long paramLong)
  {
    if (HJ.a()) {
      return HJ.g(paramObject, paramLong);
    }
    return HJ.h(paramObject, paramLong);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/HJ$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
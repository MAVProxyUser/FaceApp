import io.faceapp.ui.misc.c.a;

public final class pwa$c$e
  extends pwa.c
{
  private final c.a a;
  
  public pwa$c$e(c.a parama)
  {
    super(null);
    this.a = parama;
  }
  
  public final c.a a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof e))
      {
        paramObject = (e)paramObject;
        if (oXa.a(this.a, ((e)paramObject).a)) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public int hashCode()
  {
    c.a locala = this.a;
    int i;
    if (locala != null) {
      i = locala.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("NetworkError(error=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pwa$c$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import java.util.List;

public final class WHa$b$c
  extends WHa.b
{
  private final List<HHa.b> d;
  private final HHa.a e;
  private final boolean f;
  
  public WHa$b$c(List<? extends HHa.b> paramList, HHa.a parama, boolean paramBoolean)
  {
    super(paramList, parama, paramBoolean, null);
    this.d = paramList;
    this.e = parama;
    this.f = paramBoolean;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof c))
      {
        paramObject = (c)paramObject;
        if ((oXa.a(this.d, ((c)paramObject).d)) && (oXa.a(this.e, ((c)paramObject).e)))
        {
          int i;
          if (this.f == ((c)paramObject).f) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0) {
            break label72;
          }
        }
      }
      return false;
    }
    label72:
    return true;
  }
  
  public int hashCode()
  {
    Object localObject = this.d;
    int i = 0;
    int j;
    if (localObject != null) {
      j = localObject.hashCode();
    } else {
      j = 0;
    }
    localObject = this.e;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    int k = this.f;
    int m = k;
    if (k != 0) {
      m = 1;
    }
    return (j * 31 + i) * 31 + m;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Purchase(tutorialPages=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", trialPage=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(", trialMode=");
    localStringBuilder.append(this.f);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/WHa$b$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
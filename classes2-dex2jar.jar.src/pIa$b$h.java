public final class pIa$b$h
  extends pIa.b
{
  private final Rja a;
  
  public pIa$b$h(Rja paramRja)
  {
    super(null);
    this.a = paramRja;
  }
  
  public final Rja a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof h))
      {
        paramObject = (h)paramObject;
        if (oXa.a(this.a, ((h)paramObject).a)) {}
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
    Rja localRja = this.a;
    int i;
    if (localRja != null) {
      i = localRja.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("LayoutsNewPhotoSelected(imageDesc=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pIa$b$h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
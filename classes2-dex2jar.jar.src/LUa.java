import io.faceapp.ui.misc.c;
import io.faceapp.ui.misc.c.a;

public abstract interface lua
  extends sla, jta<lua.c>, c
{
  public abstract void g(String paramString);
  
  public abstract QQa<lua.b> getViewActions();
  
  public abstract void i();
  
  public abstract void k();
  
  public static final class a
  {
    public static void a(lua paramlua, c.a parama, Object paramObject)
    {
      oXa.b(parama, "model");
      paramlua.a(new lua.c.c(parama));
    }
  }
  
  public static abstract class b
  {
    public static final class a
      extends lua.b
    {
      public static final a a = new a();
      
      private a()
      {
        super();
      }
    }
    
    public static final class b
      extends lua.b
    {
      public static final b a = new b();
      
      private b()
      {
        super();
      }
    }
    
    public static final class c
      extends lua.b
    {
      public static final c a = new c();
      
      private c()
      {
        super();
      }
    }
    
    public static final class d
      extends lua.b
    {
      public static final d a = new d();
      
      private d()
      {
        super();
      }
    }
  }
  
  public static abstract class c
  {
    public static final class a
      extends lua.c
    {
      private final String a;
      private final String b;
      
      public a(String paramString1, String paramString2)
      {
        super();
        this.a = paramString1;
        this.b = paramString2;
      }
      
      public final String a()
      {
        return this.a;
      }
      
      public final String b()
      {
        return this.b;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof a))
          {
            paramObject = (a)paramObject;
            if ((oXa.a(this.a, ((a)paramObject).a)) && (oXa.a(this.b, ((a)paramObject).b))) {}
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
        String str = this.a;
        int i = 0;
        int j;
        if (str != null) {
          j = str.hashCode();
        } else {
          j = 0;
        }
        str = this.b;
        if (str != null) {
          i = str.hashCode();
        }
        return j * 31 + i;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Content(imageUrl=");
        localStringBuilder.append(this.a);
        localStringBuilder.append(", userName=");
        localStringBuilder.append(this.b);
        localStringBuilder.append(")");
        return localStringBuilder.toString();
      }
    }
    
    public static final class b
      extends lua.c
    {
      public static final b a = new b();
      
      private b()
      {
        super();
      }
    }
    
    public static final class c
      extends lua.c
    {
      private final c.a a;
      
      public c(c.a parama)
      {
        super();
        this.a = parama;
      }
      
      public final c.a a()
      {
        return this.a;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this != paramObject) {
          if ((paramObject instanceof c))
          {
            paramObject = (c)paramObject;
            if (oXa.a(this.a, ((c)paramObject).a)) {}
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
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lua.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
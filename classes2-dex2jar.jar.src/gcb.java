import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.PARAMETER})
public @interface gcb {}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/gcb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
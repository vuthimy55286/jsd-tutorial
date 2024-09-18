package tut04.Assessment;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

    @Retention(RetentionPolicy.RUNTIME)
    public @interface Important {
        // Defines the level of importance, defaulting to "Critical"
        String value() default "Critical";
}

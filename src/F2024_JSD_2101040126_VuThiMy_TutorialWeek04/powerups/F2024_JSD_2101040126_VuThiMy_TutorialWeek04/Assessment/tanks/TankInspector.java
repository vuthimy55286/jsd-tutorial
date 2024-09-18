package F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups.F2024_JSD_2101040126_VuThiMy_TutorialWeek04.Assessment.tanks;


import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class TankInspector {

        private Class<?> tankClass;

        public TankInspector() {
            try {
                // Attempt to load the Tank class
                tankClass = Class.forName("F2024_JSD_2101040125_VuBinhMinh_TutorialWeek04.tanks.Tank");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Unable to find the Tank class.", e);
            }
        }

        public void analyzeClassName() {
            String className = tankClass.getSimpleName();
            System.out.println("Class name: " + className);

            if (Character.isUpperCase(className.charAt(0))) {
                System.out.println("The class name adheres to PascalCase convention.");
            } else {
                System.out.println("The class name does not adhere to PascalCase convention.");
            }
        }

        public void analyzePackageName() {
            String packageName = tankClass.getPackage().getName();
            System.out.println("Package name: " + packageName);

            if (packageName.equals(packageName.toLowerCase())) {
                System.out.println("The package name is properly formatted (all lowercase).");
            } else {
                System.out.println("The package name should be in all lowercase.");
            }
        }

        public void analyzeFieldNames() {
            Field[] fields = tankClass.getDeclaredFields();
            for (Field field : fields) {
                String fieldName = field.getName();
                System.out.println("Field name: " + fieldName);

                if (Character.isLowerCase(fieldName.charAt(0))) {
                    System.out.println("The field name follows camelCase convention.");
                } else {
                    System.out.println("The field name does not follow camelCase convention.");
                }
            }
        }

        public void analyzeMethodNames() {
            Method[] methods = tankClass.getDeclaredMethods();
            for (Method method : methods) {
                String methodName = method.getName();
                System.out.println("Method name: " + methodName);

                if (Character.isLowerCase(methodName.charAt(0))) {
                    System.out.println("The method name follows camelCase convention.");
                } else {
                    System.out.println("The method name does not follow camelCase convention.");
                }
            }
        }

        public static void main(String[] args) {
            TankInspector inspector = new TankInspector();
            inspector.analyzeClassName();
            inspector.analyzePackageName();
            inspector.analyzeFieldNames();
            inspector.analyzeMethodNames();
        }
    }

}

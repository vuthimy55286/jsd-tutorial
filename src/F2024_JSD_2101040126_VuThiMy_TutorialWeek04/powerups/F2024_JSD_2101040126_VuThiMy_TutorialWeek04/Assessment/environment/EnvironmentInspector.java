package F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups.F2024_JSD_2101040126_VuThiMy_TutorialWeek04.Assessment.environment;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

    public class EnvironmentInspector {
        private Class<?> clazz;

        public EnvironmentInspector(String className) {
            try {
                clazz = Class.forName("tut04.environments." + className);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Unable to find class: " + className, e);
            }
        }

        public void checkClassName() {
            String className = clazz.getSimpleName();
            System.out.println("Class name: " + className);

            if (Character.isUpperCase(className.charAt(0))) {
                System.out.println("Class name adheres to PascalCase convention.");
            } else {
                System.out.println("Class name does not adhere to PascalCase convention.");
            }
        }

        public void checkPackageName() {
            String packageName = clazz.getPackage().getName();
            System.out.println("Package name: " + packageName);

            if (packageName.equals(packageName.toLowerCase())) {
                System.out.println("Package name is correctly formatted (all lowercase).");
            } else {
                System.out.println("Package name should be all lowercase.");
            }
        }

        public void checkFieldNames() {
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                String fieldName = field.getName();
                System.out.println("Field name: " + fieldName);

                if (Character.isLowerCase(fieldName.charAt(0))) {
                    System.out.println("Field name follows camelCase convention.");
                } else {
                    System.out.println("Field name does not follow camelCase convention.");
                }
            }
        }

        public void checkMethodNames() {
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                String methodName = method.getName();
                System.out.println("Method name: " + methodName);

                if (Character.isLowerCase(methodName.charAt(0))) {
                    System.out.println("Method name follows camelCase convention.");
                } else {
                    System.out.println("Method name does not follow camelCase convention.");
                }
            }
        }

        public void showImportantAnnotations() {
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(Important.class)) {
                    Important annotation = method.getAnnotation(Important.class);
                    System.out.println(method.getName() + " is marked as important: " + annotation.value());
                }
            }

            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                if (field.isAnnotationPresent(Important.class)) {
                    Important annotation = field.getAnnotation(Important.class);
                    System.out.println(field.getName() + " is marked as important: " + annotation.value());
                }
            }
        }

        public static void main(String[] args) {
            String[] classNames = {
                    "Environment",
                    "BrickWall",
                    "Ice",
                    "SteelWall",
                    "Trees",
                    "Water"
            };

            for (String className : classNames) {
                System.out.println("Inspecting class: " + className);
                EnvironmentInspector inspector = new EnvironmentInspector(className);
                inspector.checkClassName();
                inspector.checkPackageName();
                inspector.checkFieldNames();
                inspector.checkMethodNames();
                inspector.showImportantAnnotations();
                System.out.println();
            }
        }
    }

}

package F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups.F2024_JSD_2101040126_VuThiMy_TutorialWeek04.Assessment.powerups;

import F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups.F2024_JSD_2101040126_VuThiMy_TutorialWeek04.Assessment.Important;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class PowerUpInspector {
        private Class<?> clazz;

        public PowerUpInspector(String className) {
            try {
                clazz = Class.forName(className);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Unable to locate class: " + className, e);
            }
        }

        public void analyzeClassName() {
            String className = clazz.getSimpleName();
            System.out.println("Class name: " + className);

            if (Character.isUpperCase(className.charAt(0))) {
                System.out.println("Class name adheres to PascalCase format.");
            } else {
                System.out.println("Class name does not adhere to PascalCase format.");
            }
        }

        public void analyzePackageName() {
            String packageName = clazz.getPackage().getName();
            System.out.println("Package name: " + packageName);

            if (packageName.equals(packageName.toLowerCase())) {
                System.out.println("Package name is properly formatted (all lowercase).");
            } else {
                System.out.println("Package name should be in lowercase.");
            }
        }

        public void analyzeFieldNames() {
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                String fieldName = field.getName();
                System.out.println("Field name: " + fieldName);

                if (Character.isLowerCase(fieldName.charAt(0))) {
                    System.out.println("Field name follows camelCase format.");
                } else {
                    System.out.println("Field name does not follow camelCase format.");
                }
            }
        }

        public void analyzeMethodNames() {
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                String methodName = method.getName();
                System.out.println("Method name: " + methodName);

                if (Character.isLowerCase(methodName.charAt(0))) {
                    System.out.println("Method name follows camelCase format.");
                } else {
                    System.out.println("Method name does not follow camelCase format.");
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
                    "tut04.powerups.PowerUps",
                    "tut04.powerups.Helmet",
                    "tut04.powerups.Shovel",
                    "tut04.powerups.Star",
                    "tut04.powerups.Timer",
                    "tut04.powerups.Tank",
                    "tut04.powerups.Grenade"
            };

            for (String className : classNames) {
                System.out.println("Analyzing class: " + className);
                PowerUpInspector inspector = new PowerUpInspector(className);
                inspector.analyzeClassName();
                inspector.analyzePackageName();
                inspector.analyzeFieldNames();
                inspector.analyzeMethodNames();
                inspector.showImportantAnnotations();
                System.out.println();
            }
        }
    }

}

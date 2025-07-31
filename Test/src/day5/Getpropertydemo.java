package day5;

class Getpropertydemo {
    public static void main(String[] args) {
        String userHome = System.getProperty("user.home");
        String javaVersion = System.getProperty("java.version");
        String javaHome = System.getProperty("java.home");
        String classPath = System.getProperty("java.class.path");
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userDir = System.getProperty("user.dir");

        System.out.println("The user home directory is " + userHome);
        System.out.println("The java version is " + javaVersion);
        System.out.println("The Java Home directory is " + javaHome);
        System.out.println("The class path is set to " + classPath);
        System.out.println("The Operating System is " + osName);
        System.out.println("The user name is " + userName);
        System.out.println("The working directory is " + userDir);
    }
}
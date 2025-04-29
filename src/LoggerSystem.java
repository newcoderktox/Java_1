abstract class Logger{
    abstract void log (String message);
}
class ConsoleLogger extends Logger{
    @Override
    void log (String message){
        System.out.println("Hello " + message);
    }
}
class FileLogger extends Logger{
    String filePath;

    public FileLogger(String filePath){
        this.filePath = filePath;
    }
    @Override
    void log (String message){
        System.out.println("The " + message+ " is saved!");
    }

}
public class LoggerSystem {
    public static void main(String [] args){
        ConsoleLogger a = new ConsoleLogger();
        FileLogger b = new FileLogger("C:\\Users\\Nisa\\Desktop\\Java");
        Logger c = new ConsoleLogger();
        Logger d = new FileLogger("C:\\Users\\Nisa\\Desktop\\C");

        a.log("a");
        b.log("b");
        c.log("c");
        d.log("d");
    }
}
